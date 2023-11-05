package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Main {
    
        // Atributos de conexión
    private Connection conectar = null;
    private final String usuario = "root";
    private final String contrasena = "1234";
    private final String db = "catalogo_pelicula";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final Statement st = null;
    private final ResultSet rs = null;
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;
    
    public Connection establecerConeccion(){
     
        try{
            this.conectar = DriverManager.getConnection(cadena,usuario, contrasena);
            JOptionPane.showMessageDialog(null, "se conecto correctamente");
        }catch(Exception e){
            System.out.println(e);
        }
        return this.conectar;
    }
    
    public static void main(String[] args)throws SQLException{
        
        Main app = new Main();
        app.establecerConeccion();
        
    }
    
}
