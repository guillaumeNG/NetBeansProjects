/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbdd;

import java.net.URL;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Optional;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import m2i.database.ConnexionBD;
import m2i.database.PaysDTO;
import m2i.database.PaysDbManager;

/**
 *
 * @author Administrateur
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField paysTextField;
    @FXML
    private Label resultat;
    @FXML
    private ListView<PaysDTO> paysListView;

    private PaysDbManager manager;

    PaysDTO paysSelectionne;

    @FXML
    private void onValider(ActionEvent event) {
        //récupération de la saisie de l'ustilisateur
        String nomPays = paysTextField.getText();
        //Validation de la saisie
        if (nomPays.trim().equals("")){
             Alert warning = new Alert(AlertType.WARNING);
        warning.setTitle("Attention opération délicate");
        warning.setHeaderText("voulez vous vraiment soumettre un champs vide ? ");
        warning.setContentText("cette opération est impossible !!!");

        warning.show();

            return;
        }

        try {
            
            if (paysSelectionne == null) {

                //...Execution de la methode d'insertion
                manager.insert(nomPays);
                //...Message de succès
                resultat.setText("insertion réussie !");
            } else {
                //Execution de la methode de modification
                //modfication de paysDTO en fonction de la saisie de l'utilisateur
                paysSelectionne.setNom(nomPays);
                manager.modif(paysSelectionne);

                //Message de succès
                resultat.setText("modification OK !");

                //désactiver la selection
                paysSelectionne = null;
            }

            //vider le champs texte
            paysTextField.setText("");

            afficheListePays();

        } catch (SQLException ex) {

            //...Message d'erreur en cas d'Echec
            resultat.setText("impossible d'inserer un nouveau pays !");
            System.out.println(ex.getMessage());

        }
    }//Fin methode onValider

    @FXML
    private void onSuppression(ActionEvent event) {
        Alert confirmation = new Alert(AlertType.CONFIRMATION);
        confirmation.setTitle("Attention opération délicate");
        confirmation.setHeaderText("Voulez vous vraiment supprimer ce pays ");
        confirmation.setContentText("cette opération est irréversible ");

        Optional<ButtonType> resultat = confirmation.showAndWait();

        if (resultat.get() == ButtonType.OK) {
            supprime();

        }
    }//Fin methode onSuppression

    private void supprime() {
        try {
            if (paysSelectionne != null) {
                //suppresion du pays
                manager.supprimer(paysSelectionne);
                //Miseà jour de l'affichage des pays (liste)
                afficheListePays();
                //mise à null du pays sélectionnée
                paysSelectionne = null;

            }//Fin try

        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class
                    .getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }//Fin Catch
    }

    private void afficheListePays() throws SQLException {
        //création d'une liste observable
        ObservableList<PaysDTO> PaysObservable;

        //affection des données de la liste
        PaysObservable = FXCollections.observableArrayList(manager.listeDesPaysPourListview());

        //liaison entre la listView et les données
        paysListView.setItems(PaysObservable);
    }//Fin methode afficheListePays

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            //Création d'une instance de PaysManager
            manager = new PaysDbManager(ConnexionBD.getConnexion());
            afficheListePays();

            //Récupération du modèle de sélection
            MultipleSelectionModel<PaysDTO> model = paysListView.getSelectionModel();

            //Définition d'un écouteur d'évènement
            model.selectedItemProperty().addListener(new ChangeListener<PaysDTO>() {
                @Override
                public void changed(ObservableValue<? extends PaysDTO> observable, PaysDTO oldValue, PaysDTO newValue) {
                    if (newValue != null) {
                        System.out.println(newValue.getNom());
                        paysSelectionne = newValue;
                        paysTextField.setText(newValue.getNom());
                    }
                }

            });

        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin methode initialize

}//Fin Classe FXMLDOC
