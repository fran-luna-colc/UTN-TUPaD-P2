/*
12. Modificación de un array de precios y visualización de resultados.

        System.out.println("¿Que valor quiere alterar de esos 5 precios?");
        int num = scanner.nextInt();
        
        System.out.println("¿Por cuanto quiere modificar ese valor?");
        double modif = scanner.nextDouble();
        

*/
package utn.tupad.p2;

import java.util.Scanner;

public class tp2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] preciosOriginales =  {199.99, 299.5, 149.75, 399.0, 89.99};
        
        for (int i = 0; i < preciosOriginales.length; i++) {
            double preciosOriginale = preciosOriginales[i];
            System.out.println("Precio: $"+preciosOriginale);
        }
        
        preciosOriginales [2] = 123.86;

        System.out.println("Precios modificados:");
        for (int i = 0; i < preciosOriginales.length; i++) {
            double preciosOriginale = preciosOriginales[i];
            System.out.println("Precio: $"+preciosOriginale);
        }

    }
        
}
