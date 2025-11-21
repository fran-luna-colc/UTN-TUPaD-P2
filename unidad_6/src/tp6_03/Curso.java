/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_03;

/**
 *
 * @author franc
 */
public class Curso {

    private String codigo;        
    private String nombre;        
    private Profesor profesor;     // relación  N a 1

    //constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Setter
    public void setProfesor(Profesor p) {
        // si ya esta el profesor, lo saca de la lista1
        if (this.profesor != null) {
            Profesor viejo = this.profesor;
            this.profesor = null;         // evita que haya un bucle 
            viejo.eliminarCurso(this);
        }

        // asigna un nuevo profesor
        this.profesor = p;

        // sincroniza del otro lado
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    //información del curso
    public void mostrarInfo() {
        System.out.println("Curso: " + nombre +
                " | Código: " + codigo +
                " | Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }

    // Getters
    public String getCodigo() {
        return codigo; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public Profesor getProfesor() { 
        return profesor; 
    }
    
}