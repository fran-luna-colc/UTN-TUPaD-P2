/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_03;

/**
 *
 * @author franc
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;                 
    private String nombre;             
    private String especialidad;      
    private List<Curso> cursos;        // relacion de cursos  1 a N

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();   // Inicializar la lista
    }

    // agrega un curso
    public void agregarCurso(Curso c) {
        
        // condicional para agregar curso a la  lista de profesores
        if (!cursos.contains(c)) {
            cursos.add(c);                 
        }

        // condicional para  Sincronizar lado del curso
        if (c.getProfesor() != this) {
            c.setProfesor(this);           // El curso también debe tener este profesor
        }
    }

    // elimina el curso y lo elimina del curso
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);          
        }

        // lo saca del curso
        if (c.getProfesor() == this) {
            c.setProfesor(null);     
        }
    }

    // muestra los cursos que da
    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");

        for (Curso c : cursos) {
            System.out.println(" - " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    // Información general
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre +" | Especialidad: " + especialidad +" | Cursos asignados: " + cursos.size());
    }

    //Getters
    public String getId() { 
        return id; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public List<Curso> getCursos() { 
        return cursos; 
    }
}