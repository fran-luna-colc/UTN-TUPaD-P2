/*
5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
*/
package utn.tupad.p2;

import java.util.Scanner;


public class tp2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        int acumulador = 0;        
        while (contador != 0) {
            
            System.out.println("Ingresar un número:");
            contador = scanner.nextInt();
            
            if (contador % 2 == 0) {
                acumulador += contador;
            }
        }
        System.out.println("La suma de los números pares es:" + acumulador);
    }
}
