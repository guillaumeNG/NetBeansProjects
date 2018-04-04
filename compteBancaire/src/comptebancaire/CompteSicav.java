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
public class CompteSicav extends CompteEpargne{

    public CompteSicav(String numCompte, double tauxInteret) {
        super(numCompte, tauxInteret);
    }

    @Override
    public boolean deposerArgent(int montant) {
        //droits d'entrée de 5
        montant -= 5;
        return super.deposerArgent(montant); 
    }
    
    
    
}
