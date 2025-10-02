/*
2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.
*/
package utn.tupad.p2;

import java.util.Scanner;


public class tp2_02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el primer número:");
        int a = scanner.nextInt();
        
        System.out.println("Ingresar el segundo número:");
        int b = scanner.nextInt();
        
        System.out.println("Ingresar el tercer número:");
        int c = scanner.nextInt();
        
        if (a > b && a > c) {
            System.out.println("El primer número es el mayor");
        } else if ( b > a && b > c) {
            System.out.println("El segundo número es el mayor");
        } else
            System.out.println("El tercer número es el mayor");
                
    }
}