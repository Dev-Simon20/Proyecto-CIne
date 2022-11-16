
package ProyectoCine;

public class Pelicula {
    String titulo;
    String duracion;
    int edadmin;
    String director;

    public Pelicula(String titulo, String duracion, int edadmin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadmin = edadmin;
        this.director = director;
    }
    
    public void Datos(){
    
         System.out.println("Titulo: "+this.titulo+"Edad Minima: "+this.edadmin);
         System.out.println("Duracion: "+this.duracion+"Director: "+this.director);
    
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEdadmin() {
        return edadmin;
    }
    
    
}
