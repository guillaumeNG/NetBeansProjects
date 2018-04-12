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
public class PersonDAO {

    private Connection cn;
    private PaysDAO paysDAO;

    public PersonDAO(Connection cn) {
        this.cn = cn;
        //permet la récupération du pays lié à une personne sélectionnée
        this.paysDAO = new PaysDAO(cn);

    }

    /**
     * Recherche d'une ligne dans la base de données retounre une instance de
     * personDTO
     *
     * @param id
     * @return
     */
    public PersonDTO findOneById(int id) throws SQLException {
        String sql = "SELECT * FROM persons WHERE person_id = ?";
        PreparedStatement stm = cn.prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet rs = stm.executeQuery();

        PersonDTO person = new PersonDTO();
        
        if (rs.next()) {
            getOneEntity( rs);
        }
        return person;
    }

    private PersonDTO getOneEntity( ResultSet rs) throws SQLException {
        PersonDTO person = new PersonDTO();
        
        person.setId(rs.getInt("person_id"));
        person.setFirstname(rs.getString("first_name"));
        person.setName(rs.getString("name"));
        PaysDTO pays = paysDAO.findOneById(rs.getInt("pays_id"));
        person.setPays(pays);
        return person;
    }
    
    public List<PersonDTO> findAll() throws SQLException{
       List<PersonDTO> personList = new ArrayList<>(); 
       String sql = "SELECT * FROM PERSONS";
       Statement stm = cn.createStatement();
       ResultSet rs =stm.executeQuery(sql);
       
       while (rs.next()){
           personList.add(getOneEntity(rs));
       }
       
       return personList;
        
    }//Fin methode findAll

}//Fin classe PersonneDTO
