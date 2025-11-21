/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_2;
import java.util.Scanner;
/**
 *
 * @author franc
 */

public class ConvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: la cadena no es un número válido");
        }
    }
}
