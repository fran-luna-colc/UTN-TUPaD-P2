/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_01;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Estudiante {
    Scanner scanner = new Scanner(System.in);
    
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo(){
        System.out.println("El nombre completo del estudiante es "+nombre+" "+apellido+" es estudiante de "+curso+" y su nota es de "+calificacion);
    }
    
    void subirCalificacion(){
        System.out.println("¿En cuanto aumento la nota?");
        calificacion += 1;
        //calificacion += scanner.nextDouble();
        System.out.println("La nota ahora es:"+calificacion);
    }
    
    void bajarCalificacion(){
        System.out.println("¿En cuanto bajo la nota?");
        calificacion -= 1;
        //calificacion -= scanner.nextDouble();
        System.out.println("La nota ahora es:"+calificacion);
    }
    
}
