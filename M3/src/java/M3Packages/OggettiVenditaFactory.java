/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Packages;

import M3Generale.Venditore;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stefano
 */
public class OggettiVenditaFactory {
    
    private static OggettiVenditaFactory oggettivendita;
    public static OggettiVenditaFactory getInstance() {
        if (oggettivendita == null) {
            oggettivendita = new OggettiVenditaFactory();
        }
        return oggettivendita;
    }

    public static void removeObjectSaleById(Integer objectSaleId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public  void updateSellingObjectList(OggettiVendita nuovoOggetto) {
        listaOggettiVendita.add(nuovoOggetto);
    }
    
    private ArrayList<OggettiVendita> listaOggettiVendita = new ArrayList<OggettiVendita>();
    
    
    public OggettiVenditaFactory() {
        
        OggettiVendita oggettivendita1 = new OggettiVendita();
        oggettivendita1.setId(0);
        oggettivendita1.setNome("W & W RISER INNO CXT");
        oggettivendita1.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_10603.jpg");
        oggettivendita1.setQuantitàDisponibile(50);
        oggettivendita1.setPrezzo(639.99);
        listaOggettiVendita.add(oggettivendita1);
        
        OggettiVendita oggettivendita2 = new OggettiVendita();
        oggettivendita2.setId(1);
        oggettivendita2.setNome("HOYT LIMBS GRAND PRIX 720");
        oggettivendita2.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_105708-1000.jpg");
        oggettivendita2.setQuantitàDisponibile(40);
        oggettivendita2.setPrezzo(289.99); 
        listaOggettiVendita.add(oggettivendita2);
       
        
        OggettiVendita oggettivendita3 = new OggettiVendita();
        oggettivendita3.setId(2);
        oggettivendita3.setNome("PARADOX DRAGONA PER ARCO");
        oggettivendita3.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_535878.jpg");
        oggettivendita3.setQuantitàDisponibile(100);
        oggettivendita3.setPrezzo(9.99);
        listaOggettiVendita.add(oggettivendita3);
        
        OggettiVendita oggettivendita4 = new OggettiVendita();
        oggettivendita4.setId(3);
        oggettivendita4.setNome("NEET FARETRA PELLE NT-2300 BASKET WEAVE");
        oggettivendita4.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_60740.jpg");
        oggettivendita4.setQuantitàDisponibile(10);
        oggettivendita4.setPrezzo(99.99);
        listaOggettiVendita.add(oggettivendita4);
        
        OggettiVendita oggettivendita5 = new OggettiVendita();
        oggettivendita5.setId(4);
        oggettivendita5.setNome("EASTON PARABRACCIO DELUXE OVAL");
        oggettivendita5.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_111629-1000.jpg");
        oggettivendita5.setQuantitàDisponibile(30);
        oggettivendita5.setPrezzo(9.99);
        listaOggettiVendita.add(oggettivendita5);
        
        OggettiVendita oggettivendita6 = new OggettiVendita();
        oggettivendita6.setId(5);
        oggettivendita6.setNome("CAVALIER PATELLA MASTER CORDOVAN");
        oggettivendita6.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_50340.jpg");
        oggettivendita6.setQuantitàDisponibile(20);
        oggettivendita6.setPrezzo(64.99);
        listaOggettiVendita.add(oggettivendita6);
        
        OggettiVendita oggettivendita7 = new OggettiVendita();
        oggettivendita7.setId(6);
        oggettivendita7.setNome("BAREMAX PATELLA ARCO NUDO LIGHT");
        oggettivendita7.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_53M318.jpg");
        oggettivendita7.setQuantitàDisponibile(30);
        oggettivendita7.setPrezzo(19.49);
        listaOggettiVendita.add(oggettivendita7);
        
        OggettiVendita oggettivendita8 = new OggettiVendita();
        oggettivendita8.setId(7);
        oggettivendita8.setNome("SEBASTIEN FLUTE LATEX STRECH BAND");
        oggettivendita8.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_79785.jpg");
        oggettivendita8.setQuantitàDisponibile(100);
        oggettivendita8.setPrezzo(9.99);
        listaOggettiVendita.add(oggettivendita8);
        
        OggettiVendita oggettivendita9 = new OggettiVendita();
        oggettivendita9.setId(8);
        oggettivendita9.setNome("CARTEL 433003 BOTTONE SUPRA");
        oggettivendita9.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_30000000.jpg");
        oggettivendita9.setQuantitàDisponibile(100);
        oggettivendita9.setPrezzo(6.99);
        listaOggettiVendita.add(oggettivendita9);
        
        OggettiVendita oggettivendita10 = new OggettiVendita();
        oggettivendita10.setId(9);
        oggettivendita10.setNome("BEITER CLICKER BLACK BLADE");
        oggettivendita10.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_31301.jpg");
        oggettivendita10.setQuantitàDisponibile(100);
        oggettivendita10.setPrezzo(12.99);
        listaOggettiVendita.add(oggettivendita10);
        
        OggettiVendita oggettivendita11 = new OggettiVendita();
        oggettivendita11.setId(10);
        oggettivendita11.setNome("SPIGAREST 2 MAGNETICO");
        oggettivendita11.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_32335.jpg");
        oggettivendita11.setQuantitàDisponibile(100);
        oggettivendita11.setPrezzo(6.99);
        listaOggettiVendita.add(oggettivendita11);
        
        OggettiVendita oggettivendita12 = new OggettiVendita();
        oggettivendita12.setId(11);
        oggettivendita12.setNome("FIVICS SQUADRETTA CARBON");
        oggettivendita12.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_111282-1000.jpg");
        oggettivendita12.setQuantitàDisponibile(30);
        oggettivendita12.setPrezzo(26.99);
        listaOggettiVendita.add(oggettivendita12);
        
        OggettiVendita oggettivendita13 = new OggettiVendita();
        oggettivendita13.setId(12);
        oggettivendita13.setNome("SHOCQ VALIGIA PER ARCO RICURVO");
        oggettivendita13.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_111249-1000.jpg");
        oggettivendita13.setQuantitàDisponibile(30);
        oggettivendita13.setPrezzo(32.99);
        listaOggettiVendita.add(oggettivendita13);
        
        OggettiVendita oggettivendita14 = new OggettiVendita();
        oggettivendita14.setId(13);
        oggettivendita14.setNome("WINNER'S CONTROL CABLE 8125 BLACK/SILVER");
        oggettivendita14.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_42308.jpg");
        oggettivendita14.setQuantitàDisponibile(20);
        oggettivendita14.setPrezzo(51.99);
        listaOggettiVendita.add(oggettivendita14);
        
        OggettiVendita oggettivendita15 = new OggettiVendita();
        oggettivendita15.setId(14);
        oggettivendita15.setNome("SHIBUYA DIOTTRA CON FIBRA OTTICA PIN RED 12 MM");
        oggettivendita15.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_100674-1024.jpg");
        oggettivendita15.setQuantitàDisponibile(20);
        oggettivendita15.setPrezzo(14.99);
        listaOggettiVendita.add(oggettivendita15);
        
        OggettiVendita oggettivendita16 = new OggettiVendita();
        oggettivendita16.setId(15);
        oggettivendita16.setNome("SHIBUYA MIRINO RICURVO ULTIMA CARBON 520");
        oggettivendita16.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_20431.jpg");
        oggettivendita16.setQuantitàDisponibile(10);
        oggettivendita16.setPrezzo(239.99);
        listaOggettiVendita.add(oggettivendita16);
        
        OggettiVendita oggettivendita17 = new OggettiVendita();
        oggettivendita17.setId(16);
        oggettivendita17.setNome("GAS PRO BAREBOW PESO 250");
        oggettivendita17.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_24538.jpg");
        oggettivendita17.setQuantitàDisponibile(30);
        oggettivendita17.setPrezzo(12.99);
        listaOggettiVendita.add(oggettivendita17);
        
        OggettiVendita oggettivendita18 = new OggettiVendita();
        oggettivendita18.setId(17);
        oggettivendita18.setNome("EXE KIT STABILIZZAZIONE EVO-X CARBON");
        oggettivendita18.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_24933.jpg");
        oggettivendita18.setQuantitàDisponibile(10);
        oggettivendita18.setPrezzo(89.99);
        listaOggettiVendita.add(oggettivendita18);
        
        OggettiVendita oggettivendita19 = new OggettiVendita();
        oggettivendita19.setId(18);
        oggettivendita19.setNome("SPIN WING 2-00");
        oggettivendita19.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_78630.jpg");
        oggettivendita19.setQuantitàDisponibile(60);
        oggettivendita19.setPrezzo(14.99);
        listaOggettiVendita.add(oggettivendita19);
        
        OggettiVendita oggettivendita20 = new OggettiVendita();
        oggettivendita20.setId(19);
        oggettivendita20.setNome("CARBON EXPRESS ASTA MAXIMA BLUE STREAK");
        oggettivendita20.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_108251-1000.jpg");
        oggettivendita20.setQuantitàDisponibile(30);
        oggettivendita20.setPrezzo(179.99);
        listaOggettiVendita.add(oggettivendita20);
        
        OggettiVendita oggettivendita21 = new OggettiVendita();
        oggettivendita21.setId(20);
        oggettivendita21.setNome("CROSS-X SET 12 COCCHE PIN");
        oggettivendita21.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_537428.jpg");
        oggettivendita21.setQuantitàDisponibile(100);
        oggettivendita21.setPrezzo(7.99);
        listaOggettiVendita.add(oggettivendita21);
        
        OggettiVendita oggettivendita22 = new OggettiVendita();
        oggettivendita22.setId(21);
        oggettivendita22.setNome("CARTEL ESTRATTORE ARROW PULLER MIDAS");
        oggettivendita22.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_106650-1000.jpg");
        oggettivendita22.setQuantitàDisponibile(100);
        oggettivendita22.setPrezzo(5.99);
        listaOggettiVendita.add(oggettivendita22);
        
        OggettiVendita oggettivendita23 = new OggettiVendita();
        oggettivendita23.setId(22);
        oggettivendita23.setNome("TOPHAT PROTECTOR BR 2 SET 12 PUNTE PER PREDATOR II");
        oggettivendita23.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_90045.jpg");
        oggettivendita23.setQuantitàDisponibile(50);
        oggettivendita23.setPrezzo(15.99);
        listaOggettiVendita.add(oggettivendita23);
        
        OggettiVendita oggettivendita24 = new OggettiVendita();
        oggettivendita24.setId(23);
        oggettivendita24.setNome("NEET T-RBS CARICHINO PER RICURVI");
        oggettivendita24.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_57090000.jpg");
        oggettivendita24.setQuantitàDisponibile(30);
        oggettivendita24.setPrezzo(25.99);
        listaOggettiVendita.add(oggettivendita24);
        
        OggettiVendita oggettivendita25 = new OggettiVendita();
        oggettivendita25.setId(24);
        oggettivendita25.setNome("SEBASTIEN FLUTE BOWSTANDS AXIOM ALU MAGNETIC");
        oggettivendita25.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_59595.jpg");
        oggettivendita25.setQuantitàDisponibile(30);
        oggettivendita25.setPrezzo(15.99);
        listaOggettiVendita.add(oggettivendita25);
        
        OggettiVendita oggettivendita26 = new OggettiVendita();
        oggettivendita26.setId(25);
        oggettivendita26.setNome("J.V.D. BERSAGLIO FITA 60 CM.");
        oggettivendita26.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_80010000.jpg");
        oggettivendita26.setQuantitàDisponibile(1000);
        oggettivendita26.setPrezzo(0.72);
        listaOggettiVendita.add(oggettivendita26);
        
        OggettiVendita oggettivendita27 = new OggettiVendita();
        oggettivendita27.setId(26);
        oggettivendita27.setNome("J.V.D. RICAMBI BERSAGLIO 9-10 FITA 40CM 100 PZ");
        oggettivendita27.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_109800-1000.jpg");
        oggettivendita27.setQuantitàDisponibile(30);
        oggettivendita27.setPrezzo(6.99);
        listaOggettiVendita.add(oggettivendita27);
        
        OggettiVendita oggettivendita28 = new OggettiVendita();
        oggettivendita28.setId(27);
        oggettivendita28.setNome("AVALON CAVALLETTO PORTAPAGLIONE 4 GAMBE");
        oggettivendita28.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_59507.jpg");
        oggettivendita28.setQuantitàDisponibile(10);
        oggettivendita28.setPrezzo(80.99);
        listaOggettiVendita.add(oggettivendita28);
        
        OggettiVendita oggettivendita29 = new OggettiVendita();
        oggettivendita29.setId(28);
        oggettivendita29.setNome("REFO BATTIFRECCIA ESPANSO 80X80 TRIPLO STRATO");
        oggettivendita29.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_81065.jpg");
        oggettivendita29.setQuantitàDisponibile(10);
        oggettivendita29.setPrezzo(69.99);
        listaOggettiVendita.add(oggettivendita29);
        
        OggettiVendita oggettivendita30 = new OggettiVendita();
        oggettivendita30.setId(29);
        oggettivendita30.setNome("J.V.D. RETE BATTIFRECCIA EXTRA STRONG VERDE 4 METRI");
        oggettivendita30.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_102923-1016.jpg");
        oggettivendita30.setQuantitàDisponibile(20);
        oggettivendita30.setPrezzo(149.99);
        listaOggettiVendita.add(oggettivendita30);
        
        OggettiVendita oggettivendita31 = new OggettiVendita();
        oggettivendita31.setId(30);
        oggettivendita31.setNome("MINOX OPTICS BINOCOLO - 8x44 - MX 62195");
        oggettivendita31.setFoto("http://www.disport.it/m4n/media/image/prodotti/a_4007450621959.jpg");
        oggettivendita31.setQuantitàDisponibile(5);
        oggettivendita31.setPrezzo(610.99);
        listaOggettiVendita.add(oggettivendita31);
        
    }
    
    public ArrayList<OggettiVendita> getOggettiVenditaList()
    {
        return listaOggettiVendita;
    }
    
    public  List<OggettiVendita> getOggettiVendita(int VenditoreId)
    {
        ArrayList <OggettiVendita> items = new ArrayList <OggettiVendita>();
        for(OggettiVendita ov : listaOggettiVendita)
        {
    
            if(ov.getVenditore() != null && ov.getVenditore().getId() == VenditoreId)
             items.add(ov);
        }
        
        return items;
    }

    public void addToSellingObjectList(OggettiVendita nuovoOggetto) {
        listaOggettiVendita.add(nuovoOggetto);
    }
    
    public OggettiVendita getObjectSaleById(int id) 
    {
       
         if( id < 1)
            return null;
               
        for(OggettiVendita o: listaOggettiVendita)
        {
            if(o.getId()== id)
            {
                //trovato
                return o;
            }
        }
        
        return null;
    }
    
        public boolean AddItemOfObjectSale(OggettiVendita nuovoOggetto) {
        return true;
            }
}
