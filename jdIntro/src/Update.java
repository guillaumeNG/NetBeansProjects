
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrateur
 */
public class Update {

    public static void main(String[] args) {

        try {
            // --- Connexion
            String lsDSN = "jdbc:mysql://127.0.0.1:3306/cours";
            Connection lcnxx = DriverManager.getConnection(lsDSN, "root", "");

            // --- UPDATE
            String lsSQL = "UPDATE pays SET nomPays = \"Espagne\" WHERE idPays = ?" ;

            // --- Creation de l'objet "commande SQL"
            PreparedStatement lpst = lcnxx.prepareStatement(lsSQL);

            // --- Valorisation du ou des parametre(s)
            // --- Les valeurs pourraient etre saisies au clavier
            
            lpst.setInt(1,1);
            
            int liAffecte = lpst.executeUpdate();
            System.out.println(liAffecte + " enregistrement modfié");

            lpst.close();
            lcnxx.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }///Main
}///Classe
