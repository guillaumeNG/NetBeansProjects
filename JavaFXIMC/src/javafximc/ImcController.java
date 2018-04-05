/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafximc;

import fr.m2i.imc.model.ImcCalculator;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Guillaume.N
 */
public class ImcController {

    // @FXML permet de faire la liaison avec un fichier fxml
    @FXML
    private TextField masse;    
    @FXML
    private TextField taille;
    @FXML
    private Label resultat;

    //...création du gestionnaire d'évenenment sur le bouton (signature : ActionEvent)
    /**
     * réagit au clic sur le bouton calulIMC
     *
     * @param event
     */
    public void onCalculIMC(ActionEvent event) {
        //...récupération et conversion de la saisie de l'utilisateur
        double masseEnChiffre = Double.valueOf(masse.getText());
        double tailleEnMetres = Double.valueOf(taille.getText());
       
        //...instanciation d'un  ImcCalculator
        ImcCalculator imcCalculator = new ImcCalculator(masseEnChiffre, tailleEnMetres);
        resultat.setText("Votre IMC est de : " + imcCalculator.getImc() + " \n" + imcCalculator.traduireImc());
        
    }
    
}
