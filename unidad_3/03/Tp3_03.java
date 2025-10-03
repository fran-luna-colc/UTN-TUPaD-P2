/*
3. Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.
*/
package tp3_03;

public class Tp3_03 {

    public static void main(String[] args) {
        
        Libro lib = new Libro();
        

        lib.setAnio(-5404);
        
        lib.setAnio(2025);
    }
    
}
