/*
10. Actualización de stock a partir de venta y recepción de productos.
*/
package utn.tupad.p2;

import java.util.Scanner;

public class tp2_10 {
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        
        int nuevoStock= stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el stock actual:");
        int stockActual =  scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingresar la cantidad vendida:");
        int cantidadVendida = scanner.nextInt();
        
        System.out.println("Ingresar la cantidad recibida:");
        int stockActualizado = scanner.nextInt();
        
        System.out.println("El nuevo stock del producto es:" + actualizarStock(stockActual,cantidadVendida, stockActualizado)   );
        
    }
        
}
