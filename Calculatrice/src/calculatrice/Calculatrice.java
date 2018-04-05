/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

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
public class Calculatrice extends Application {

    private Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.mainStage = primaryStage;

       ouvreFenetre("Calculatrice.fxml");
    }//Fin methode start

    /**
     * methode qui permet d'ouvrir n'importe quelle fenêtre
     * @param fxml
     * @throws IOException 
     */
    
    //....methode ouverture plusieurs fenêtres
    public void ouvreFenetre(String fxml) throws IOException {
        FXMLLoader loader = FXMLLoader.load(getClass().getResource(fxml));
        Parent root = loader.load();
        
        //...Récuperation du contrôleur
        Controller ctrl = loader.getController();
        ctrl.setApplication(this);
        
        Scene scene = new Scene(root);

        //...attache une scene à un théâtre
        this.mainStage.setScene(scene);
        this.mainStage.show();
    }//Fin methode ouvreFenetre

}//Fin classe Calculatrice

