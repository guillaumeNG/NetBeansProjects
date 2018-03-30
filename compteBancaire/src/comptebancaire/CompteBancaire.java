/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancaire;

/**
 *
 * @author Guillaume N.
 */
public class CompteBancaire {

    protected String numCompte;
    protected int solde;
//    private Banque banque;
//    private Personne client;
//    private int montant;

    public CompteBancaire(String numCompte, int solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }//Fin constructeur1

    public CompteBancaire(String numCompte) {
        this.numCompte = numCompte;
    }//Fin constructeur2

    public String getNumCompte() {
        return numCompte;
    }

    public int getSolde() {
        return solde;
    }

    public boolean deposerArgent(int montant) {
        if (montant > 0) {
            solde = solde + montant;
            return true;
        } else {
            return false;
        }
    }//Fin methode deposerArgent

    public boolean retirerArgent(int montant) {
        if (montant > 0 && solde >= montant) {
            solde = solde - montant;
            return true;
        } else {
            return false;
        }
    }//Fin methode retirerArgent

    public boolean transfererArgent(int montant, CompteBancaire compteDestination) {
        if (retirerArgent(montant)) {
            if (compteDestination.deposerArgent(montant)) {//depôt dans un autre compte
                return true;
            } else {
                deposerArgent(montant);
                return false;
            }
        } else {
            return false;
        }
    }                                     
}//Fin classe CompteBancaire





//    public void deposerArgent(){
//       System.out.println("Je dépose sur mon compte bancaire la somme de : " + montant);
//      solde = solde + montant;
//   }//Fin methode deposerArgent
//   
//    public void retirerArgent(){
//       System.out.println("Je retire sur mon compte bancaire la somme de : " + montant);
//       solde = solde - montant;
//   }//Fin methode retirerArgent
//   
//     public void transfererArgent(){
//       System.out.println("Je transfert sur mon compte bancaire la somme de : " + montant);
//       
//   }//Fin methode transfererArgent

