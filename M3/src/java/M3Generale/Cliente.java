/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Generale;

import static Costanti.Costanti.*;
import M3Packages.OggettiVendita;
import M3Packages.OggettiVenditaFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Stefano95
 */
@WebServlet(name = "Cliente", urlPatterns = {"/Cliente"})
public class Cliente extends HttpServlet {

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
        
        HttpSession session = request.getSession(false);
        
        if(session != null)
       {
       
        Enumeration<String> attributes = session.getAttributeNames();
        
        boolean isCustomerPresent = false;
        
            while (attributes.hasMoreElements())
            {
              String name = (String) attributes.nextElement();
              
              if(name.equals(CLIENTE))
              {
                  isCustomerPresent = true;
                  break;
              }
            }
            
        if(isCustomerPresent)
        {
            Boolean isCustomer = (Boolean)session.getAttribute(CLIENTE);
            if(isCustomer != null && isCustomer == true)
           {                
             OggettiVenditaFactory factory =  new OggettiVenditaFactory();        
             List<OggettiVendita> items = factory.getOggettiVenditaList(); 

             request.setAttribute(OGGETTI_VENDITA, items);
           
            }
        }
        
        request.getRequestDispatcher(PAGINA_CLIENTE).forward(request, response);
       }
        
        request.getRequestDispatcher(PAGINA_LOGIN).forward(request, response);
           
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
