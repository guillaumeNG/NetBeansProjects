/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class PaysDbManager {

    private Connection cn;

    public PaysDbManager(Connection cn) {
        this.cn = cn;
    }

    //...methode pour insertion de données dans la table pays
    public void insert(String nomPays) throws SQLException {

        String sql = "INSERT INTO pays (nom_pays) VALUES ( ? )";

        PreparedStatement statement = cn.prepareStatement(sql);
        statement.setString(1, nomPays);

        //Execution de la requette
        statement.executeUpdate();

    }//fin methode insert

    public String listeDesPays() throws SQLException {
        String sql = "SELECT * FROM pays";
        Statement stm = cn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        StringBuilder sb = new StringBuilder();

        // tant qu'non est pas à la fin.
        while (rs.next()) {
           
            sb.append(rs.getString("id_pays"));
            sb.append(" : ");
            sb.append(rs.getString("nom_pays"));
            sb.append("\n");

        }
        return sb.toString();
    }

    public List<PaysDTO> listeDesPaysPourListview() throws SQLException {
    
        String sql = "SELECT * FROM pays";
        Statement stm = cn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        List<PaysDTO> liste = new ArrayList<PaysDTO>();

        // tant qu'non est pas à la fin.
        while (rs.next()) {

            PaysDTO pays = new PaysDTO();
            pays.setId(rs.getInt("id_pays"));
            pays.setNom(rs.getString("nom_pays"));

            //Ajout du pays à la liste
            liste.add(pays);
        }
        return liste;
    }
    
    public void supprimer(PaysDTO pays) throws SQLException{
       String sql = "DELETE FROM pays WHERE id_pays = ? ";
       
       PreparedStatement stm =cn.prepareStatement(sql);
       stm.setInt(1, pays.getId());
       stm.executeUpdate();
       
        
        
    }
    
}//Fin classe PaysDbManager

