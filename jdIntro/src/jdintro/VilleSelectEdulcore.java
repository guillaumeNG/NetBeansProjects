
package jdintro;

import java.sql.*;

public class VilleSelectEdulcore {

   public static void main(String[] args) {

      StringBuilder lsbContenu = new StringBuilder("");

      // --- Code
      try {
         Connection lcnx = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cours", "root", "");

         Statement lstSQL = lcnx.createStatement();
         ResultSet lrs    = lstSQL.executeQuery("SELECT * FROM pays");
         while(lrs.next()) {
            lsbContenu.append(lrs.getString(1));
            lsbContenu.append("-");
            lsbContenu.append(lrs.getString(2));
            lsbContenu.append("\n");
         }

         lrs.close();
         lstSQL.close();
         lcnx.close();
      }

      catch(SQLException e) { 
         lsbContenu.append("SQL ? ");
         lsbContenu.append(e.getMessage());
      }

      System.out.println(lsbContenu.toString());

   } /// main

} /// class
