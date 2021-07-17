
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    private static final String SERVIDOR = "localhost";
    private static final String PUERTO = "1433";
    private static final String NOMBREBD = "BD1Ropa";
    private static final String USUARIO = "sa";
    private static final String PW = "1234";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public Connection obtenerConexion() {
        try {
            String connectionUrl = "jdbc:sqlserver://" + SERVIDOR + ":" + PUERTO
                    + "; Databasename= " + NOMBREBD + "; user = " + USUARIO + "; password= "
                    + PW + ";";
            Class.forName(DRIVER);
            return (DriverManager.getConnection(connectionUrl));
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    
    public void close(Connection conn) {
        try {
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

   
}
