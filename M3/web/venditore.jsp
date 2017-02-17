<%-- 
    Document   : venditore
    Created on : 7-dic-2016, 13.23.02
    Author     : Stefano95
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>ECommerceArco</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="HTML,AMM,TIRO CON L'ARCO,VENDITORE">
        <meta name="description" content="Pagina aggiunta oggetti">
        <meta name="author" content="Stefano Cabiddu">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="container"> 
            
            <div id="header">
                
                <h1>Inserisci un nuovo oggetto</h1>
                
            </div>
            
       <!--Sezione che presenta dei link in modo che cliccandoci si possa viaggiare 
       tra le pagine del sito-->
            
                        <div id="navigazione">
        
                <a href="descrizione.html">DescrizioneSito</a> 
                
                <a href="login.html">Login</a> 
        
        </div>
       
       <!--Form che permette al venditore di inserire un nuovo oggetto nella 
        tabella, ho usato il metodo post perchè sto gestendo più tipi di dati 
        che hanno una lunghezza diversa tra di loro-->
        
        <!--Contenuto pagina-->
        
        <section>
               
            <h2>Pagina Venditore</h2>
          <c:choose>            
                <c:when test="${IsVendor == null || IsVendor==false}">
                    <div id="errorMessage">
                        <p>Utente non autenticato o non autorizzato all'accesso dei contenuti della pagina<p>
                  </div>
               </c:when>
                
              <c:otherwise>
                  
                  <div id="main-form">
                   <form method="get" action="venditore.html">
                   </form>
                 </div>
                         
                          <h3>Oggetti attualmente in vendita:</h3>     
          <table id="articoli">
                <tr>
                    <th id="h-art">Articolo</th>
                    <th id="h-img">Foto</th>                
                    <th id="h-num">Pezzi disponibili</th>
                    <th id="h-price">Prezzo</th>
                     </tr>
                
                
                <c:forEach var="o" items="${SellingItems}">
                  <c:choose>
                    <c:when test="${o.quantitàDisponibile > 0}">
                        <tr>
                            
                            <td>${o.nome}</td>
                            <td><img src=${o.foto}></td>
                            <td>${o.quantitàDisponibile}</td>
                            <td>${o.prezzo}€</td>
                            <td> 
                                
                                </tr>
                  </c:when>
                  <c:otherwise>
                      <div class="removed">
                      <tr>
                            <td>${o.nome}</td>
                            <td><img src=${o.foto}></td>
                            <td>${o.quantitàDisponibile}</td>
                            <td>${o.prezzo}€</td>
                            <td> 
                                
                                </tr>
                      </div>
                  </c:otherwise>
                  </c:choose>
                  </c:forEach>
          
          </table>
              </c:otherwise>
                                
              
             
         
                
          </c:choose>
            
        </section>
        
        <div id="sidebar">
                
                <p>Link utili Federazione Italiana di Tiro con l'arco:</p>
                
                <p> <a href="http://www.fitarco-italia.org/">SitoFitarco</a> </p> 
                
                <p> <a href="https://it.wikipedia.org/wiki/Federazione_Italiana_Tiro_con_l'arco">InfoFitarco</a> <p> 
                    
                <p> <a href="http://www.ianseo.net/index.php?option=com_content&view=article&id=81&Itemid=170">EventiFitarco</a> </p> 
                
                <p> <a href="https://www.facebook.com/fitarco.italia">SocialFitarco</a> </p>
                
            </div> 
        
        <div id="clear"></div>
            

            
            <div id="footer">
                <p>Sito realizzato da Stefano Cabiddu</p>
                <p>Per ogni domanda mandare una mail a:
                    stefcabiddu@gmail.com
                </p>
                
            </div>
            
        </div>
        
    </body>
</html>        
