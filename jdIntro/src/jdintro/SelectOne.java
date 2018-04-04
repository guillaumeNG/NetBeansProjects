package jdintro;

import java.sql.*;

public class SelectOne {

    public static void main(String[] args) {

        try {
            // --- Connexion
            String lsDSN = "jdbc:mysql://127.0.0.1:3306/cours";
            Connection cn = DriverManager.getConnection(lsDSN, "root", "");

            // --- SELECT
            String lsSQL = "SELECT * FROM pays WHERE idPays= 1";

            // --- Creation de l'objet "commande SQL"
            PreparedStatement lpst = cn.prepareStatement(lsSQL);

            // --- Valorisation du ou des parametre(s)
            // --- Les valeurs pourraient etre saisies au clavier

            // --- Execution de la requete
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                System.out.println(lrs.getString("idPays") + "-" + lrs.getString("nomPays"));
            } else {
                System.out.println("Aucun résultat!!!");
            }

            lrs.close();
            lpst.close();
            cn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    } /// main
}///classe
