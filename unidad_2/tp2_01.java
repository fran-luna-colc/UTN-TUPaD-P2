/*
1. Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.
*/
package utn.tupad.p2;

import java.util.Scanner;

public class tp2_01 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el año: ");
        int tiempo = scanner.nextInt();
        
        if ((tiempo % 4 == 0 && tiempo % 100 != 0) ||( tiempo % 400 == 0)) {
                System.out.println("El año " + tiempo + " es bisiesto");

        } else {
            System.out.println("El año " + tiempo + " no es bisiesto");
                        }
        }
}
