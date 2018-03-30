/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancaire;

/**
 *
 * @author Administrateur
 */
public class CompteEpargne extends CompteBancaire{
    protected double tauxInteretAnnuel;
    
    
    
    
    public CompteEpargne(String numCompte, double tauxInteret) {
        super(numCompte);
        tauxInteretAnnuel = tauxInteret;
    }
    
    public void servirInteret(){
        //calcul du nouveau solde + conversion du resultat en entier
        solde = (int)(solde * (1+ tauxInteretAnnuel));
    }

    //getters et setters pour la classe compteEpargne
    public double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public void setTauxInteretAnnuel(double tauxInteretAnnuel) {
        this.tauxInteretAnnuel = tauxInteretAnnuel;
    }
    
    
}// Fin classe CompteEpargne
