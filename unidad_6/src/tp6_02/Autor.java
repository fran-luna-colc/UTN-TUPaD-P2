/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_02;

/**
 *
 * @author franc
 */
public class Autor {
    
    
    //atributos 
    private String id;
    private String nombre;      
    private String nacionalidad;

    // Constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " | Nacionalidad: " + nacionalidad + " | ID: " + id);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

}