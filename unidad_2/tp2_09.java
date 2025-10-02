/*
9. Composición de funciones para calcular costo de envío y total de compra.
*/
package utn.tupad.p2;

import java.util.Scanner;


public class tp2_09 {
    
    static double calcularCostoEnvio(double peso, String zona){ 
        double costoEnvio = 0;
        if (zona.equals("Internacional")) {
            costoEnvio = 10*peso;
        } else if (zona.equals("Nacional")) {
            costoEnvio = 5* peso;
        } else {
            System.out.println("Error al refererice a la zona");
        }
        return costoEnvio;
    }        
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double total = costoEnvio + precioProducto;
        return total;
    }
        

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el peso del paquete:");
        double peso =  scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Ingresar la zona de envío (Nacional/Internacional):");
        String zona = scanner.nextLine();
        
        System.out.println("Ingresar el precio del producto:");
        double precio = scanner.nextDouble();
        
        double costoEnv= calcularCostoEnvio(peso,zona);
        System.out.println("El costo de envío es:" + costoEnv);
        System.out.println("El total a pagar es:" +calcularTotalCompra(precio,costoEnv) );
    }
      
}
