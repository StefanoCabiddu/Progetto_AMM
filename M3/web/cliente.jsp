<%-- 
    Document   : cliente
    Created on : 30-set-2016, 15.33.06
    Author     : Stefano95
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ECommerceArco</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="HTML,AMM,TIRO CON L'ARCO,CLIENTE">
        <meta name="description" content="Pagina relativa alla merce venduta">
        <meta name="author" content="Stefano Cabiddu">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        
        <div id="container"> 
            
            <!--Sezione titolo-->
            
            <div id="header">
        
        <h1>Articoli in vendita</h1>
            </div>
            
             
          <!--Sezione navigazione-->  

            
        <div id="navigazione">
        
            <!--Sezione che presenta dei link in modo che cliccandoci si possa viaggiare tra le pagine del sito-->

            <a href="login.html">Login</a> 

            <a href="descrizione.html">DescrizioneSito</a> 
    
        </div>
            
            <!--Sezione contenuto-->
            
            <div id="content">
            
        <p>Ecco gli articoli che potete trovare su questo sito</p>
        
            
        
        <!--Tabella che contiene gli oggetti in vendita, la prima riga funge da 
            intestazione della stessa mentre tutte le altre mostrano gli oggetti 
            in vendita-->
        
        <c:choose>
            
        
         <c:when test="${IsCustomer == null || IsCustomer==false}">
                    <div id="errorMessage">
                        <p>Utente non autorizzato all'accesso dei contenuti della pagina<p>
                  </div>
               </c:when>
        
          
            <c:otherwise> 
                  
        
        <table>
    <tr>
        <th>nome dell'oggetto</th>
        <th>foto descrittiva</th>
        <th>quantità di pezzi disponibili</th>
        <th>prezzo</th>
        <th>link per il carrello</th>
   </tr>
   
   <c:forEach var="o" items="${SellingItems}">
                           <c:if test="${o.quantitàDisponibile > 0}">
                               <tr>
                                   <td>${o.nome}</td>
                                   <td><img src="${o.foto}"></td>
                                   <td>${o.quantitàDisponibile}</td>
                                   <td>${o.prezzo}€</td>
                                   <td><a href="acquista.html?ObjectSaleId=${o.id}"></td>
                               </tr>
                         </c:if>
                       </c:forEach>
   </table>
        
        </div>
         
</c:otherwise> 
            
            </c:choose>
            
            <!--Sezione "precisazione"-->
            
            <div id="paglioni">
            
        <p>*Esistono anche i paglioni che ora non sono disponibili in magazzino</p>
            
            </div>
            
            <!--Link utili-->
            
            <div id="sidebar">
                
                <p>Link utili Federazione Italiana di Tiro con l'arco:</p>
                
                <p> <a href="http://www.fitarco-italia.org/">SitoFitarco</a> </p> 
                
                <p> <a href="https://it.wikipedia.org/wiki/Federazione_Italiana_Tiro_con_l'arco">InfoFitarco</a> </p> 
                    
                <p> <a href="http://www.ianseo.net/index.php?option=com_content&view=article&id=81&Itemid=170">EventiFitarco</a> </p> 
                
                <p> <a href="https://www.facebook.com/fitarco.italia">SocialFitarco</a> </p>
                
            </div>
            
            <div id="clear"></div>
           
            <!--Sezione informazioni-->
        
        <div id="footer">
                <p>Sito realizzato da Stefano Cabiddu</p>
                <p>Per ogni domanda mandare una mail a:
                    stefcabiddu@gmail.com
                </p>
                
            </div>
        
        </div>
        
    </body>    
        
</html>