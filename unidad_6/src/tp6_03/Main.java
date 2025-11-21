/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_03;

/**
 *
 * @author franc
 */
public class Main {
    public static void main(String[] args) {

        Universidad uni = new Universidad("UNLaM");

        //1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("1", "Ana", "Matemática");
        Profesor p2 = new Profesor("2", "Carlos", "Informática");
        Profesor p3 = new Profesor("3", "Laura", "Física");

        // 2. Agregar profesores y cursos a la universidad.
        Curso c1 = new Curso("123", "Álgebra");
        Curso c2 = new Curso("456", "Programación 1");
        Curso c3 = new Curso("789", "Programación 2");
        Curso c4 = new Curso("987", "Física I");
        Curso c5 = new Curso("654", "Física II");

        // Agregados
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        uni.asignarProfesorACurso("123", "1");
        uni.asignarProfesorACurso("456", "2");
        uni.asignarProfesorACurso("789", "2");
        uni.asignarProfesorACurso("987", "3");
        uni.asignarProfesorACurso("654", "3");

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("-Profesores-");
        uni.listarProfesores();

        System.out.println("-Cursos-");
        uni.listarCursos();
        
        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.

        System.out.println("\nCambio de profesor de 789");
        uni.asignarProfesorACurso("789", "3");

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\nEliminado de curso 123");
        uni.eliminarCurso("123");

        // 7. Remover un profesor y dejar profesor = null,
        System.out.println("\nEliminado de profesor de 2");
        uni.eliminarProfesor("2");

        // 8. Mostrar un reporte: cantidad de cursos por profesor
        System.out.println("\n-Reporte final-");
        uni.listarProfesores();
    }
}