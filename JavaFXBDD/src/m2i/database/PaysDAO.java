/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guillaume.N
 */
public class PaysDAO {

    private Connection cn;

    public PaysDAO(Connection cn) {
        this.cn = cn;

    }

    /**
     * Recherche d'une ligne dans la base de données retounre une instance de
     * personDTO
     *
     * @param id
     * @return
     */
    public PaysDTO findOneById(int id) throws SQLException {
        String sql = "SELECT * FROM pays WHERE id_pays = ?";
        PreparedStatement stm = cn.prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet rs = stm.executeQuery();

        PaysDTO pays = new PaysDTO();
        if (rs.next()) {
            pays.setId(rs.getInt("id_pays"));
            pays.setNom(rs.getString("nom_pays"));
          
        }
        return pays;
    }

     public List<PaysDTO> findAll() throws SQLException{
       List<PaysDTO> countryList = new ArrayList<>(); 
       String sql = "SELECT * FROM PAYS";
       Statement stm = cn.createStatement();
       ResultSet rs =stm.executeQuery(sql);
       
       while (rs.next()){
           PaysDTO pays = new PaysDTO();
           pays.setId(rs.getInt("id_pays"));
           pays.setNom(rs.getString("nom_pays"));
           
           countryList.add(pays);
           
       }
       
       return countryList;
        
    }//Fin methode findAll
}
