package interfaces;

import DAO.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import peliculas.Pelicula;


public class DAOPeliculaImplementacion implements DAOPelicula{
    
     Main main = new Main();
     
     public DAOPeliculaImplementacion(){}
     

    @Override
    public void agregar(Pelicula pelicula) {
       //Implementamos un try-catch
        try{
            Connection conectar = this.main.establecerConeccion();
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO peliculas(idPelicula, pelicula) VALUES(?,?)");
            insertar.setInt(1, pelicula.getIdPelicula());
            insertar.setString(2,pelicula.getPelicula());
            insertar.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    @Override
    public void buscar(Pelicula pelicula) {
       try{
            
            Connection conectar = main.establecerConeccion();
            
            PreparedStatement buscar = conectar.prepareStatement("select* from peliculas where idPelicula= ?");
            buscar.setInt(1, pelicula.getIdPelicula());
            ResultSet consulta = buscar.executeQuery();
            
            if(consulta.next()){
                pelicula.setIdPelicula(Integer.parseInt(consulta.getString("idPelicula")));
                pelicula.setPelicula(consulta.getString("pelicula"));
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void modificar(Pelicula pelicula) {
        try{
            
            Connection conectar = main.establecerConeccion();
            
            PreparedStatement modificar = conectar.prepareStatement("update peliculas set pelicula= ? where idPelicula= ?");
            
            modificar.setString(1, pelicula.getPelicula());
            modificar.setInt(2, pelicula.getIdPelicula());
            modificar.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void eliminar(Pelicula pelicula) {
       try{
            
            Connection conectar = main.establecerConeccion();
            
            PreparedStatement eliminar = conectar.prepareStatement("delete from peliculas where idPelicula= ?");
            eliminar.setInt(1, pelicula.getIdPelicula());
            eliminar.executeUpdate();
                    
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
