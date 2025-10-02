/*
4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
*/
package utn.tupad.p2;

import java.util.Scanner;

public class tp2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el precio de un producto:");
        double producto = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingresar la categoría (A, B o C) del producto:");
        char cat = scanner.nextLine().charAt(0);
        
        switch (cat) {
            case 'A':
                System.out.println("El descuente aplicado sera del 10%.");
                System.out.println("El valor sera:" + (producto - (producto*0.1)));
                break;
            case 'B':
                System.out.println("El descuente aplicado sera del 15%.");
                System.out.println("El valor sera:" + (producto - (producto*0.15)));
                break;
            case 'C':
                System.out.println("El descuente aplicado sera del 20%.");
                System.out.println("El valor sera:" + (producto - (producto*0.20)));
                break;
            default:
                System.out.println("Categoría no valida.");
        }
    }
}
