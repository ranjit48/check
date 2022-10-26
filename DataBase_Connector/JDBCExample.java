package DataBase_Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost/world";
   static final String USER = "root";
   static final String PASS = "ranjit";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("DELETING TABLES FORM DATABASE");          
       //  String sql = "DROP TABLE EMP5;";
      //   stmt.executeUpdate(sql);
         System.out.println("Table Deleted Sucessfully");
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   } 
}