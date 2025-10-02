/*
7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.
*/
package utn.tupad.p2;

import java.util.Scanner;


public class tp2_07 {
 public static void main(String[] args) { 
     
            Scanner scanner = new Scanner(System.in);
            int num;
            System.out.println("Ingresar un número entre 0 y 10");
            do {
                num = scanner.nextInt();
                if (num < 0 || num > 10) {
                    System.out.println("Error, ingresar un número entre 0 y 10");
                }
  
            } while (num < 0 || num > 10 );

            System.out.println("Nota guardada correctamente.");
        }
        
}
