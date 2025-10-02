/*
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
*/
package utn.tupad.p2;

import java.util.Scanner;

public class tp2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Ingresar un número:");
            num = scanner.nextInt();
            if (num > 0) {
                positivos += 1;
            } else if (num < 0) {
                negativos += 1;
            }else {
                ceros += 1;
            }
        }
        
        System.out.println("De 10 números, hubo:\n Positivos:"+positivos+"\n Negativos:"+negativos+"\n ceros:"+ceros);
    }
}
