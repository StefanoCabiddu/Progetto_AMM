/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Packages;

import java.util.ArrayList;

/**
 *
 * @author Stefano
 */
public class UtenteFactory {
    
    private static UtenteFactory utenti;
    public static UtenteFactory getInstance() {
        if (utenti == null) {
            utenti = new UtenteFactory();
        }
        return utenti;
    }
    
    private ArrayList<Utente> listaClienti = new ArrayList<Utente>();
    
    private ArrayList<Utente> listaVenditori = new ArrayList<Utente>();
    
        private UtenteFactory() {
        
        Clienti cliente1 = new Clienti();
        cliente1.setId(0);
        cliente1.setNome("Harry");
        cliente1.setCognome("Potter");
        cliente1.setUsername("PotterHarry");
        cliente1.setPassword("Mercurio");
        cliente1.setSaldo(1500);
        listaClienti.add(cliente1);
        
        
        
        Clienti cliente2 = new Clienti();
        cliente2.setId(1);
        cliente2.setNome("Ron");
        cliente2.setCognome("Weasley");
        cliente2.setUsername("WeasleyRon");
        cliente2.setPassword("Venere");
        cliente2.setSaldo(1500);
        listaClienti.add(cliente2);
        
        
        Clienti cliente3 = new Clienti();
        cliente3.setId(2);
        cliente3.setNome("Hermione");
        cliente3.setCognome("Granger");
        cliente3.setUsername("GrangerHermione");
        cliente3.setPassword("Terra");
        cliente3.setSaldo(1500);
        listaClienti.add(cliente3);
        
        Clienti cliente4 = new Clienti();
        cliente4.setId(3);
        cliente4.setNome("Neville");
        cliente1.setCognome("Paciock");
        cliente1.setUsername("PaciockNeville");
        cliente1.setPassword("Marte");
        cliente1.setSaldo(1500);
        listaClienti.add(cliente4);
        
        Clienti cliente5 = new Clienti();
        cliente5.setId(4);
        cliente5.setNome("Remus");
        cliente5.setCognome("Lupin");
        cliente5.setUsername("LupinRemus");
        cliente5.setPassword("Giove");
        cliente5.setSaldo(1500);
        listaClienti.add(cliente5);
        
        Venditori venditore1 = new Venditori();
        venditore1.setId(6);
        venditore1.setNome("Ginny");
        venditore1.setCognome("Weasley");
        venditore1.setUsername("WeasleyGinny");
        venditore1.setPassword("HarryPotter");
        venditore1.setSaldo(1500);
        listaVenditori.add(venditore1);
        
        Venditori venditore2 = new Venditori();
        venditore2.setId(7);
        venditore2.setNome("Fred");
        venditore2.setCognome("Weasley");
        venditore2.setUsername("WeasleyFred");
        venditore2.setPassword("GeorgeWeasley");
        venditore2.setSaldo(1500);
        listaVenditori.add(venditore2);
        
        Venditori venditore3 = new Venditori();
        venditore3.setId(8);
        venditore3.setNome("George");
        venditore3.setCognome("Weasley");
        venditore3.setUsername("WeasleyGeorge");
        venditore3.setPassword("FredWeasley");
        venditore3.setSaldo(1500);
        listaVenditori.add(venditore3);
        
        Venditori venditore4 = new Venditori();
        venditore4.setId(9);
        venditore4.setNome("Albus");
        venditore4.setCognome("Silente");
        venditore4.setUsername("SilenteAlbus");
        venditore4.setPassword("Sambuco");
        venditore4.setSaldo(1500);
        listaVenditori.add(venditore4);
        
        Venditori venditore5 = new Venditori();
        venditore5.setId(10);
        venditore5.setNome("Cedric");
        venditore5.setCognome("Diggory");
        venditore5.setUsername("DiggoryCedric");
        venditore5.setPassword("ChoChang");
        venditore5.setSaldo(1500);
        listaVenditori.add(venditore5);
        
    }
    
     public ArrayList<Utente> getClienteList()
    {
        return listaClienti;
    }
    
    public Utente getCliente(int id)
    {
        for(Utente u : listaClienti)
        {
            if(u.id == id)
                return u;
        }
        
        return null;
    }
    
    public ArrayList<Utente> getVenditoreList()
    {
        return listaVenditori;
    }
    
    public Venditori getVenditore(int id)
    {
        for(Utente u : listaVenditori)
        {
            if(u.id == id)
                return (Venditori) u;
        }
        
        return null;
    }
    
        public Venditori getVenditore(String nome)
    {
        for(Utente u : listaVenditori)
        {
            if(u.Nome == nome)
                return (Venditori) u;
        }
        
        return null;
    }
    
    public ArrayList<Utente> getUserList() 
    {
        ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
        
        listaUtenti.addAll(listaClienti);
        listaUtenti.addAll(listaVenditori);
        
        return listaUtenti;
    }
}

