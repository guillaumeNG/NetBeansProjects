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
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CompteBancaire compteA = new CompteBancaire("A123");
        CompteBancaire compteB = new CompteBancaire("B123");
        
        compteA.deposerArgent(100);
        compteB.deposerArgent(50);
        System.out.println("solde du compte A : " + compteA.getSolde());
        System.out.println("solde du compte B : " + compteB.getSolde());
        
        compteB.retirerArgent(10);
        compteA.retirerArgent(-100);// test si le solde peut etre negatif
        
        System.out.println("solde du compte A : " + compteA.getSolde());
        System.out.println("solde du compte B : " + compteB.getSolde());
        
        compteA.transfererArgent(50, compteB);
        compteB.transfererArgent(1500, compteA);
        
        System.out.println("solde du compte A : " + compteA.getSolde());
        System.out.println("solde du compte B : " + compteB.getSolde());
        
        
    }
    
}
