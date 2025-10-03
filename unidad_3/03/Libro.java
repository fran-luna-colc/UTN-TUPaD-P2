
package tp3_03;


public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnio() {
        return anioPublicacion;
    }    
    
    public void setAnio (int anioPublicacion) {
        if (anioPublicacion >= 0){
            this.anioPublicacion = anioPublicacion;
            System.out.println("El año de publicación es "+ anioPublicacion);
        } else {
            System.out.println("Error al ingresar un año.");
        }
    }
}
