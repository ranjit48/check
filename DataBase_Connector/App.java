package DataBase_Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String [] args){
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "ranjit");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( "select * from city;");
        while(rs.next()){
             System.out.println(rs.getString(1) + " || "+ rs.getString(2) + " || " + rs.getString(3) + " || " + rs.getString(4) + " || " );
        }
        con.close();

      } catch (Exception e) {
        System.out.println(e);
      }    
    }

    
}
