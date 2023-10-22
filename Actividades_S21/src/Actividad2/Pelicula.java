package Actividad2;


public class Pelicula {
    //Generamos los atributos
    private int idPelicula;
    private String pelicula;
    
    
    //generamos constructor
    public Pelicula(int idPelicula, String pelicula) {
        this.idPelicula = idPelicula;
        this.pelicula = pelicula;
    }
    //generamos los getters
    public int getIdPelicula() {
        return idPelicula;
    }

    public String getPelicula() {
        return pelicula;
    }
    // generamos los setters
    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "\n Pelicula{" + "idPelicula=" + idPelicula + ", pelicula=" + pelicula + '}';
    }
    
    
    
}
