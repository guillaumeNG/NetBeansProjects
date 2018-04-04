/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package jdintro;

import java.sql.*;
/**
 *
 * @author Administrateur
 */
public class Insert {

    public static void main(String[] args) {

        try {
            // --- Connexion
            String lsDSN = "jdbc:mysql://127.0.0.1:3306/cours";
            Connection lcnxx = DriverManager.getConnection(lsDSN, "root", "");

            // --- INSERT
            String lsSQL = "INSERT INTO pays(idPays, nomPays) VALUES(?,?)";

            // --- Creation de l'objet "commande SQL"
            PreparedStatement lpst = lcnxx.prepareStatement(lsSQL);

            // --- Valorisation du ou des parametre(s)
            // --- Les valeurs pourraient etre saisies au clavier
            lpst.setInt(1, 1);
            lpst.setString(2, "France");
            
            
            // --- Execution de la requete
            int liAffecte = lpst.executeUpdate();
            System.out.println(liAffecte + " enregistrement ajouté");

            lpst.close();
            lcnxx.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    } /// main

}
