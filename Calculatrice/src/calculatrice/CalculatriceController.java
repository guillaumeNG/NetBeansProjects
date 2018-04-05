/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Guillaume.N
 */
public class CalculatriceController extends Controller{

    @FXML
    private TextField affichage;
    private int operande;
    private String operateur;

    /**
     * instanciation de la classe CalculatriceController
     */
    public void onButtClic(ActionEvent event) {

        //...récupération d'une référence au bouton cliqué
        Button boutonClic = (Button) event.getSource(); // ...(Button)-->convertit l'objet en bouton
        System.out.println(boutonClic.getText());

        //...récupération texte du bouton cliqué
        String texteBouton = boutonClic.getText();

        //...affichage existant
        String affichageExistant = affichage.getText();

        //...mise à jour de l'affichage
        affichage.setText(affichageExistant + texteBouton);

    }//fin methode onClic

    public void onClicOperateur(ActionEvent event) {
        //...mémorisation de l'opérande
        operande = Integer.valueOf(affichage.getText());

        //...mémorisation de l'opérateur & récupération d'une référence au bouton cliqué
        Button boutonClic = (Button) event.getSource();

        //...Texte bouton cliqué
        String texteBouton = boutonClic.getText();
        operateur = texteBouton;

        //...mise à zero de l'affichage
        affichage.setText("");

    }//Fin methode onClicOperateur

    public void onCalcul(ActionEvent event) {

        if (operateur.equals("+")) {

            int resultat = operande + Integer.valueOf(affichage.getText());//calcul addition et conversion du resultat en un entier
            //...Mise à zero de l'opérande et l'opérateur
            operateur = null;
            operande = 0;
            //...Affichage du résultat
            affichage.setText(String.valueOf(resultat));

        } else if (operateur.equals("-")) {

            int resultat = operande - Integer.valueOf(affichage.getText());
            //...Mise à zero de l'opérande et l'opérateur
            operateur = null;
            operande = 0;
            //...Affichage du résultat
            affichage.setText(String.valueOf(resultat));

        } else if (operateur.equals("x")) {

            int resultat = operande * Integer.valueOf(affichage.getText());
            //...Mise à zero de l'opérande et l'opérateur
            operateur = null;
            operande = 0;
            //...Affichage du résultat
            affichage.setText(String.valueOf(resultat));

        } else if (operateur.equals("÷")) {
            if (Integer.valueOf(affichage.getText()) != 0) {

                int resultat = operande / Integer.valueOf(affichage.getText());
                //...Mise à zero de l'opérande et l'opérateur
                operateur = null;
                operande = 0;
                //...Affichage du résultat
                affichage.setText(String.valueOf(resultat));
            } else {
               affichage.setText("calcul impossible..!!!");
            }
        }
    }//Fin methode onCalcul
    
    public void onClear(ActionEvent event){
        affichage.setText("");
        
//        this.mainApplication.ouvreFenetre();
    }//Fin methode onClear
    
}//class controller


