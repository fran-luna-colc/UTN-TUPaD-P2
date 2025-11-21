/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */


public class Biblioteca {

    private String nombre;
    private List<Libro> libros;          //Colección

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); // Inicializamos la lista
    }


    //Metodos
    
    //Agrega un libro mediante los parametros dados
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
    }


    // da la lista de libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
            System.out.println();
        }
    }

    // buscar libros por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }


    // elimina libro mediante ISBN
    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("No se encontró el libro.");
        }
    }


    // da la cantidad de libros en total
    public int obtenerCantidadLibros() {
        return libros.size();
    }


    //  filtra libros por el año
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    // lista todos los autores
    public void mostrarAutoresDisponibles() {
        List<String> autoresMostrados = new ArrayList<>();

        System.out.println("Autores disponibles en la biblioteca:");
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();

            if (!autoresMostrados.contains(nombreAutor)) {
                System.out.println("- " + nombreAutor);
                autoresMostrados.add(nombreAutor);
            }
        }
    }
}