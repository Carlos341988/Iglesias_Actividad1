package interfaces;

import peliculas.Pelicula;


public interface DAOPelicula {
    
    public void agregar(Pelicula pelicula);
    public void buscar(Pelicula pelicula);
    public void modificar(Pelicula pelicula);
    public void eliminar(Pelicula pelicula);
}
