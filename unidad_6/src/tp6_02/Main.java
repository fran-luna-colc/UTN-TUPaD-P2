/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_02;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String[] args) {

        // 1. Creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Pepito");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A1", "Roberto", "Argentina");
        Autor a2 = new Autor("A2", "Jose", "España");
        Autor a3 = new Autor("A3", "John", "Canada");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("ISBN01", "Aviones aereos", 1949, a1);
        biblioteca.agregarLibro("ISBN02", "Autitos", 1944, a1);
        biblioteca.agregarLibro("ISBN03", "Playas exoticas", 1967, a2);
        biblioteca.agregarLibro("ISBN04", "Fauna exotica", 1864, a3);
        biblioteca.agregarLibro("ISBN05", "Guia de pesca deportiva", 1870, a3);

        // 4. Listar todos los libros con su información y la del autor.
        System.out.println("\nListado completo de libros:");
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\nBuscando libro ISBN03...");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN03");
        if (buscado != null) buscado.mostrarInfo();

        // 6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\nLibros del año 1944:");
        biblioteca.filtrarLibrosPorAnio(1944);

        //7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\nEliminando libro ISBN02...");
        biblioteca.eliminarLibro("ISBN02");

        System.out.println("\nListado actualizado:");
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.s
        System.out.println("\nAutores en la biblioteca:");
        biblioteca.mostrarAutoresDisponibles();
    }
}