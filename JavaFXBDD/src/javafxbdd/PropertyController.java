package javafxbdd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Converters.IntegerToStringConverter;
import com.mysql.jdbc.StringUtils;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import m2i.database.ConnexionBD;
import m2i.database.PersonDAO;
import m2i.database.PersonDTO;

/**
 * FXML Controller class
 *
 * @author Administrateur
 */
public class PropertyController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField firstnameTextField;
    @FXML
    private Label greetingLabel;
    @FXML
    private TextField ageTextField;
    private PersonDTO person = new PersonDTO();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Définition d'une propriété de type String
        SimpleStringProperty nameProperty = new SimpleStringProperty("Mandela");
        SimpleStringProperty firstnameProperty = new SimpleStringProperty("Nelson");
        SimpleStringProperty greetProperty = new SimpleStringProperty();
        SimpleIntegerProperty ageProperty = new SimpleIntegerProperty(30);
        
        
        
        
        try {
            PersonDAO dao = new PersonDAO(ConnexionBD.getConnexion());
            person = dao.findOneById(1);
        } catch (SQLException ex) {
            Logger.getLogger(PropertyController.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Liaison enttre le champs de texte et la propriété
        nameTextField.textProperty().bindBidirectional(person.getNameProperty());
        firstnameTextField.textProperty().bindBidirectional(person.getFirstnameProperty());
        
        ageTextField.textProperty().bindBidirectional(ageProperty, new IntegerToStringConverter());
        
        
        greetingLabel.textProperty().bind(greetProperty);

        //Gestion de la modification du nom
        
        ChangeListener<String> nameChangeListener = new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                greetProperty.set("Hello" + firstnameProperty.get() + " " + nameProperty.get());
            }

        };
        
        nameProperty.addListener(nameChangeListener);
        firstnameProperty.addListener(nameChangeListener);
        
    }//Fin methode initialize 

}//Fin classe PropertyController
