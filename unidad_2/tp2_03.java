/*

*/
package utn.tupad.p2;

import java.util.Scanner;


public class tp2_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresar la edad del usuario:");
            int edad = scanner.nextInt();
            
            if (edad >= 60){
                System.out.println("El usuario es un adulto mayor.");
            } else if (edad >= 18 && edad <= 59) {
                System.out.println("El usuario es un adulto.");
            } else if (edad >= 12 && edad <= 17) {
                System.out.println("El usuario es un adolescente.");
            } else if (edad >= 0 && edad <= 11) { 
                System.out.println("El usuario es un niño.");
            } else {
                System.out.println("Eror valor incorrecto.");
            }
        }
}