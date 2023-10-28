package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Catalogo_Conexion {
    
    //Generamos los atributos de la conexion
    private Connection conectar = null;
    private final String usuario = "root";
    private final String contraseña = "1234";
    private final String db = "catalogo_peliculas";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final Statement st = null;
    private final ResultSet rs = null;
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;
    
     public Connection establecerConexion(){
        try{
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "La conexion se concreto exitosamente");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "La conexion no pudo concretarse" + e.toString());
        }
        return conectar;
    }
     
    public void agregarPelicula(){
        
        Connection catalogo = establecerConexion();
        
        if(catalogo != null){
            try{
                //Generamos un objeto statement para las consultas sql
                Statement statement = catalogo.createStatement();
                //Generamos la consulta insert para agregar datos en la tabla carrera
                String query = "INSERT INTO peliculas(idPelicula, pelicula)VALUES(5, 'Esperando la carroza')";
                //Ejecutamos la consulta
                statement.executeUpdate(query);
                System.out.println("Pelicula agregada correctamente");
                //Finalizamos el statement y la conexion
                statement.close();
                catalogo.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void actualizarPelicula(){
        Connection catalogo = establecerConexion();
        
        if(catalogo != null){
            try{
                //Al igual que con el metodo agregar, generamos el objeto Statement
                Statement statement = catalogo.createStatement();
                //Generamos la consulta
                String query = "UPDATE peliculas SET pelicula = 'No te metas con Zohan' WHERE idPelicula = " + 4;
                //Corremos la consulta
                statement.executeUpdate(query);
                System.out.println("Pelicula actualizada con exito");
                //finalizamos el statement y la conexion
                statement.close();
                catalogo.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void traerPelicula(){
        
        Connection catalogo = establecerConexion();
        
        if(catalogo != null){
            try{
                //Como en los metodos anteriores, generamos el statement
                Statement statement = catalogo.createStatement();
                //Ejecutamos la consulta Select para obtener datos en la tabla "peliculas"
                ResultSet resulSet = statement.executeQuery("SELECT* FROM peliculas");
                //Recorremos los resultados de la consulta
                while(resulSet.next()){
                    //Obtenemos valores de las columnas por nombre y por id
                    int id = resulSet.getInt("idPelicula");
                    String pelicula = resulSet.getString("pelicula");
                    
                    //imprimimos los valores de cada fila
                    System.out.println("IdPelicula: " + id + " Pelicula: " + pelicula);   
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void eliminarPelicula(){
        Connection catalogo = establecerConexion();
        
        if(catalogo != null){
            try{
                //Generamos el statement
                Statement statement = catalogo.createStatement();
                //generamos la consulta para eliminar
                String query = "DELETE FROM peliculas WHERE idPelicula = " + 5;
                statement.executeUpdate(query);
                //imprimimos que se pudo eliminar la pelicula
                System.out.println("Pelicula eliminada con exito");
                //damos por finalizado el statement y la conexion
                statement.close();
                catalogo.close();
                        
            }catch(Exception e){
                e.printStackTrace();
            }
        }    
        
    }
    
}
