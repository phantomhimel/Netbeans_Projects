package databaseconnection;
import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) throws ClassNotFoundException{

        try {
            
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String URL = "jdbc:sqlserver://localhost:1433;databaseName=JavaConnection;user=sa;password=123";
             Connection balerConnection = null;
             balerConnection=DriverManager.getConnection(URL);
             System.out.println("Connected");
             
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
        }
    }
    
}
