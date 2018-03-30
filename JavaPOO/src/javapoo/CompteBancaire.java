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
public class CompteBancaire {
    private String numCompte;
    private int solde;
    private Banque banque;
    private Personne client;
    private int montant;
  
    
    public CompteBancaire(String numCompte, int solde, Banque banque, Personne client) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.banque = banque;
        this.client = client;
    }//Fin constructeur

    
    // getters et setters
    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Personne getClient() {
        return client;
    }

    public void setClient(Personne client) {
        this.client = client;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

   
    
    
    public void deposerArgent(){
       System.out.println("Je dépose sur mon compte bancaire la somme de : " + montant);
      solde = solde + montant;
   }//Fin methode deposerArgent
   
    public void retirerArgent(){
       System.out.println("Je retire sur mon compte bancaire la somme de : " + montant);
       solde = solde - montant;
   }//Fin methode retirerArgent
   
     public void transfererArgent(){
       System.out.println("Je transfert sur mon compte bancaire la somme de : " + montant);
       
   }//Fin methode transfererArgent
   
   
   
    
   

    
}//Fin classe CompteBancaire
