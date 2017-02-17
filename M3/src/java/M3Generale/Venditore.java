/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Generale;

import M3Packages.OggettiVendita;
import M3Packages.OggettiVenditaFactory;
import M3Packages.UtenteFactory;
import M3Packages.Venditori;
import Util.Util;
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
import static Costanti.Costanti.VENDITORE;
import static Costanti.Costanti.OGGETTI_VENDITA;
import static Costanti.Costanti.PAGINA_LOGIN;
import static Costanti.Costanti.NOME_UTENTE;
import static Costanti.Costanti.PAGINA_VENDITORE;
import static Costanti.Costanti.AGGIORNAMENTO_OGGETTO;

/**
 *
 * @author Stefano95
 */
@WebServlet(name = "Venditore", urlPatterns = {"/Venditore"})
public class Venditore extends HttpServlet {

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
            throws ServletException, IOException
    {
            
         HttpSession session = request.getSession(false);
         
          if(session != null)
       {
           
           
       UtenteFactory utentefactory = UtenteFactory.getInstance();
       OggettiVenditaFactory oggetti = OggettiVenditaFactory.getInstance();
         
          Enumeration<String> attributes = session.getAttributeNames();
          
          boolean isVendorPresent = false;
          
          while (attributes.hasMoreElements())
            {
              String name = (String) attributes.nextElement();
              
              if(name.equals(VENDITORE))
              {
                  isVendorPresent = true;
                  break;
              }
            }
          
           if(isVendorPresent)
           {
               Boolean isVendor = (Boolean)session.getAttribute(VENDITORE);
               if(isVendor != null && isVendor == true)
              {
                  String username = (String)session.getAttribute(NOME_UTENTE);
                  Venditori venditore = utentefactory.getVenditore(username);
                  
                  OggettiVendita oggettovendita = new OggettiVendita();
                  oggettovendita.setNome("");
                  oggettovendita.setFoto("");
                  
                  if( request.getParameter("Submit") != null )
                   {
                       
                       Integer objectId = Util.tryParseInt(request.getParameter("objectId"));
                       
                       String Nome = request.getParameter("nomeArticolo");
                       String Foto = request.getParameter("descArticolo");
                       Integer NumeroPezzi = Util.tryParseInt(request.getParameter("numpezzi"));
                       Double Prezzo = Util.tryParseDouble(request.getParameter("prezzo"));
                       
                       if(  Nome != null &&
                            Foto != null &&   
                            NumeroPezzi != null &&
                            Prezzo != null 
                           )
                           {
                           OggettiVendita nuovoOggetto = new OggettiVendita(Nome, Foto, NumeroPezzi, Prezzo);
                           
                           if(objectId != null)
                           {
                                nuovoOggetto.setId(objectId);
                                oggetti.updateSellingObjectList(nuovoOggetto);
                           }
                           else
                            oggetti.addToSellingObjectList(nuovoOggetto);
                           
                        List<OggettiVendita> objects = oggetti.getOggettiVendita(venditore.getId()); 
                         
                        request.setAttribute(OGGETTI_VENDITA, objects);
                       
                       
                            
                      request.getRequestDispatcher(PAGINA_VENDITORE).forward(request, response);
                       
                       }
                       
                   }
                      
                   else if( (request.getParameter("Update") != null) && (request.getParameter("objectSaleId") != null) )
                   {
                       // Carica la form con i campi dell'oggetto
                     //  int objectSaleId= request.getParameter("objectSaleId");
                       Integer objectSaleId = Util.tryParseInt( request.getParameter("objectSaleId"));
                       
                        oggettovendita = oggetti.getObjectSaleById(objectSaleId);
                       
                       request.setAttribute(AGGIORNAMENTO_OGGETTO,oggettovendita );
                       
                   }
                  
                  else if( (request.getParameter("AddItem") != null) && (request.getParameter("objectSaleId") != null) )
                   {
                       // Carica la form con i campi dell'oggetto
                     //  int objectSaleId= request.getParameter("objectSaleId");
                       Integer objectSaleId = Util.tryParseInt( request.getParameter("objectSaleId"));
                       
                      
                       
                        oggettovendita = oggetti.getObjectSaleById(objectSaleId);
                       
                        oggetti.AddItemOfObjectSale(oggettovendita);
                       
                 List<OggettiVendita> items = oggetti.getOggettiVendita(venditore.getId()); 

                 request.setAttribute(OGGETTI_VENDITA, items);
                            
                         request.getRequestDispatcher(PAGINA_VENDITORE).forward(request, response);
                       
                   }
                  
                  else if( (request.getParameter("Remove") != null) && (request.getParameter("objectSaleId") != null) )
                    {
                     
                     // Carica la form con i campi dell'oggetto
                     //  int objectSaleId= request.getParameter("objectSaleId");
                       Integer objectSaleId = Util.tryParseInt( request.getParameter("objectSaleId"));
                       OggettiVenditaFactory.removeObjectSaleById(objectSaleId);
                       
                      
                    List<OggettiVendita> items = oggetti.getOggettiVendita(venditore.getId()); 

                       request.setAttribute(OGGETTI_VENDITA, items);
                        
                        request.getRequestDispatcher(PAGINA_VENDITORE).forward(request, response);
                  
              }  
              }
           }
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
