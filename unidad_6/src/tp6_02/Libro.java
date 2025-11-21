/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_02;

/**
 *
 * @author franc
 */
public class Libro {

    private String isbn;               
    private String titulo;        
    private int anioPublicacion;   
    private Autor autor;      //relación con autor

    //Constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    //Metodo
    public void mostrarInfo() {
        System.out.println("--Información de Libro--");
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("Autor: " + autor.getNombre());
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor; 
    }
}
