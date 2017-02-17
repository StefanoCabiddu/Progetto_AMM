/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Generale;

import M3Packages.Clienti;
import M3Packages.OggettiVendita;
import M3Packages.OggettiVenditaFactory;
import M3Packages.Utente;
import M3Packages.UtenteFactory;
import M3Packages.Venditori;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static Costanti.Costanti.VENDITORE;
import static Costanti.Costanti.CLIENTE;
import static Costanti.Costanti.OGGETTI_VENDITA;

/**
 *
 * @author Stefano
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(true);
        
        if(request.getParameter("submit") != null)
        {
            // Preleva i dati inviati
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");
            
            ArrayList<Utente> listaUtenti = UtenteFactory.getInstance().getUserList();
            for(Utente u : listaUtenti)
            {
                if(u.getUsername().equals(username) &&
                   u.getPassword().equals(password))
                {
                    session.setAttribute("loggedIn",true);
                    
                    if(u instanceof Clienti) 
                    {
                        session.setAttribute(CLIENTE, true);
                        session.setAttribute("Cliente", u);
                        session.removeAttribute(VENDITORE);
                        session.removeAttribute("Venditore");
                        //request.setAttribute("venditore", UtenteFactory.getInstance().getVenditoreList());
                        
                        OggettiVenditaFactory factory =  new OggettiVenditaFactory();        
                        List<OggettiVendita> items = factory.getOggettiVenditaList(); 

                        request.setAttribute(OGGETTI_VENDITA, items);
                        
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);
                    }
                    if(u instanceof Venditori) 
                    {
                        session.setAttribute(VENDITORE, true);
                        session.setAttribute("Venditore", u);
                        session.removeAttribute(CLIENTE);
                        session.removeAttribute("Cliente");
                        //request.setAttribute("cliente", UtenteFactory.getInstance().getClienteList());
                        
                       OggettiVenditaFactory factory =  new OggettiVenditaFactory();        
                      List<OggettiVendita> items = factory.getOggettiVenditaList(); 

                        request.setAttribute(OGGETTI_VENDITA, items);
                        request.getRequestDispatcher("venditore.jsp").forward(request, response);
                    }                
                }
            }
        }
                request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
