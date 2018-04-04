/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrateur
 */
public class ConversionControlller {
    
    @FXML
    public TextField montantEuros;
    @FXML
    public TextField montantDollars;
    
    public void Conversion(ActionEvent event) {
        double tauxConversion = 1.227;
        double result = Double.valueOf(montantEuros.getText()) * tauxConversion;//double.valueof()convertie en double(ce contenu)
       montantDollars.setText(String.valueOf(result));
    }
    
}
