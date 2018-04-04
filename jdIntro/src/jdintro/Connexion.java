
package jdintro;
import java.sql.*;

public class Connexion {

   public static void main(String[] args) {

      try {
         // --- Facultatif avec JDBC4 et donc JAVA 7
//         Class.forName("org.gjt.mm.mysql.Driver");
         Connection lcnx = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cours", "root", "");
         lcnx.close();
      }

      catch (SQLException e) {
           System.out.println(e.getMessage());
      }

//      System.out.println(lcnx);

   } /// main

} /// class
