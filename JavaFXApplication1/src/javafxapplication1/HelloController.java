/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrateur
 */
public class HelloController {

    @FXML
    Label myLabel;
    @FXML
    TextField nameTextField;

    public void onClick(ActionEvent event) {
        myLabel.setText("Hello " + nameTextField.getText());
        nameTextField.setText("");

    }
}
