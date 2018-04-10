/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guillaume.N
 */
public class ConnexionBD {
    
     public static Connection getConnexion() throws SQLException {
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
           return cn;
        }
    
     
    
}//Fin classe
