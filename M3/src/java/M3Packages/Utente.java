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
public abstract class Utente {
    /* Attributi */
    protected int id;
    protected String Nome;
    protected String Cognome;
    protected String Username;
    protected String Password;
    protected double Saldo;
    
    /* Costruttore */
    public Utente()
    {
        id = 0;
        Nome = "";
        Cognome = "";
        Username="";
        Password="";
        Saldo=0;
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
     * @return the Cognome
     */
    public String getCognome() {
        return Cognome;
    }

    /**
     * @param Cognome the Cognome to set
     */
    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Saldo
     */
    public double getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
}
