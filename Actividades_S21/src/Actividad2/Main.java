package Actividad2;
import Actividad2.Incaa;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        
        Incaa inca = new Incaa();
        
        try {
            inca.agregarPelicula("Shrek");
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e.getMessage());
        }
        try {
            inca.agregarPelicula("Blade");
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e.getMessage());
        }
        try {
            inca.agregarPelicula("Jurasick park");
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e.getMessage());
        }
        try {
            inca.agregarPelicula("Rocky");
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e.getMessage());
        }
        try {
            inca.agregarPelicula("Star wars");
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e.getMessage());
        }
        
        try {
            inca.agregarPelicula("Shrek");
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e.getMessage());
        }
        
        System.out.println(inca.getPeliculas());
        
        
        System.out.println("/n ************************************************************/n");
        
        System.out.println(inca.traerPelicula(2));
        System.out.println(inca.traerPelicula(4));
        
    }
    
}
