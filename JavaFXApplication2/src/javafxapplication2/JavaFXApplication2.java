/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrateur
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage secondStage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
       Scene scene = new Scene(root);// nouvelle scène 
       scene.getStylesheets().add(getClass().getResource("appConversion.css").toString());//charge le fichier css
        
        secondStage.setTitle("Conversion euro-dollars!");//Titre de la fenêtre
        secondStage.setScene(scene);//affiche la scene par lecture du fichier FXML
        secondStage.show();
     
        
       
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
