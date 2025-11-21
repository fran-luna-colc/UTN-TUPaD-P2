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

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }


    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);

        if (c == null || p == null) {
            System.out.println("Curso o profesor no encontrado.");
            return;
        }

        c.setProfesor(p);
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }


    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);

        if (c != null) {
            if (c.getProfesor() != null) {
                c.setProfesor(null);      // saca la relación
            }
            cursos.remove(c);
            System.out.println("Curso eliminado.");
        }
    }

    // Elimina al profesor
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);

        if (p != null) {
            // saca la relación
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }

            profesores.remove(p);
            System.out.println("Profesor eliminado.");
        }
    }
}