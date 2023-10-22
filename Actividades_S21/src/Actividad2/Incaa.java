package Actividad2;

import java.util.ArrayList;
import java.util.List;


public class Incaa {
    
    private List<Pelicula> peliculas;

    public Incaa() {
        this.peliculas = new ArrayList<>();
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Pelicula traerPelicula(int idPelicula){
        Pelicula peli = null;
        int i = 0;
        boolean encontrado = false;
        
        while(i<peliculas.size()){
            if(peliculas.get(i).getIdPelicula() == idPelicula){
                peli = peliculas.get(i);
                encontrado = true;
            }
            i++;
        }
        return peli;
    }
    
    public boolean agregarPelicula(String pelicula)throws Exception{
       for(int i =0; i<peliculas.size();i++){
           if(getPeliculas().get(i).getPelicula().equalsIgnoreCase(pelicula)){
               throw new Exception("La pelicula ya existe");
           }
       }
        int id = 1;
            if(peliculas.size()>0){
                id = peliculas.get(peliculas.size()-1).getIdPelicula()+1;
            }
       
            Pelicula peli = new Pelicula(id, pelicula);
       
       return peliculas.add(peli);
        
    }
        
    
    
    
}
