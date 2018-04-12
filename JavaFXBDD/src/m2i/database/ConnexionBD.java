/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.tools.ShellFunctions;

/**
 *
 * @author Guillaume.N
 */
public class ConnexionBD {
    
    private static String utilisateur;
    private static String mdp;
    private static Connection cn;
    
     public static Connection getConnexion() throws SQLException {
        if (cn == null){
            try {
                String infosConnexion = getInfosConnexion();
                cn = DriverManager.getConnection(infosConnexion, utilisateur, mdp);
            } catch (IOException ex) {
                Logger.getLogger(ConnexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
           return cn;
        }
    
     public static String getInfosConnexion() throws IOException{
         StringBuilder sb = new StringBuilder();
         
          Properties prop = new Properties();
          FileInputStream in = new FileInputStream("app.properties");
          prop.load(in);
          in.close();
          
          //...Récupération des infos utilisateur
          utilisateur = prop.getProperty("utilisateur").toString();
          mdp = prop.getProperty("mdp").toString();
          
          //...Constitution de la chaine de connexion à partir des propriétés
          sb.append("jdbc:mysql://");
          sb.append(prop.getProperty("serveur").toString());
          sb.append(":");
            sb.append(prop.getProperty("port").toString());
          sb.append("/");
          sb.append(prop.getProperty("bdd").toString());
          
          return sb.toString();
          
          
    
         
       
     }
     
   
}//Fin classe
