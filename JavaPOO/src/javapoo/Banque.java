/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

/**
 *
 * @author Guillaume N.
 */
public class Banque {

    private String nomBanque;
    private Adresse adresseBanque;
    private CompteBancaire compteBancaire;
    private Personne client;

    public Banque(String nomBanque, Adresse adresseBanque) {
        this.nomBanque = nomBanque;
        this.adresseBanque = adresseBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public Adresse getAdresseBanque() {
        return adresseBanque;
    }

    public void setAdresseBanque(Adresse adresseBanque) {
        this.adresseBanque = adresseBanque;
    }

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(CompteBancaire compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

   

}//Fin class Banque
