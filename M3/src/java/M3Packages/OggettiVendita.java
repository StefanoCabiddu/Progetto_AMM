/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3Packages;

/**
 *
 * @author Stefano
 */
public class OggettiVendita {
    
    int id;
    private String Nome;
    private String Foto;
    private int QuantitàDisponibile;
    private double Prezzo;
    private Venditori venditore;

    public OggettiVendita(String Nome, String Foto, Integer NumeroPezzi, Double Prezzo) {
        this.Nome = Nome;
        this.Foto = Foto;
        this.Prezzo = Prezzo;
        this.QuantitàDisponibile = NumeroPezzi;
    }

    public OggettiVendita() {
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Foto
     */
    public String getFoto() {
        return Foto;
    }

    /**
     * @param Foto the Foto to set
     */
    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    /**
     * @return the QuantitàDisponibile
     */
    public int getQuantitàDisponibile() {
        return QuantitàDisponibile;
    }

    /**
     * @param QuantitàDisponibile the QuantitàDisponibile to set
     */
    public void setQuantitàDisponibile(int QuantitàDisponibile) {
        this.QuantitàDisponibile = QuantitàDisponibile;
    }

    /**
     * @return the Prezzo
     */
    public double getPrezzo() {
        return Prezzo;
    }

    /**
     * @param Prezzo the Prezzo to set
     */
    public void setPrezzo(double Prezzo) {
        this.Prezzo = Prezzo;
    }

    /**
     * @return the venditore
     */
    public Venditori getVenditore() {
        return venditore;
    }

    /**
     * @param venditore the venditore to set
     */
    public void setVenditore(Venditori venditore) {
        this.venditore = venditore;
    }
    


    
}
