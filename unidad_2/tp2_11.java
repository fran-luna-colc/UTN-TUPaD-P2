/*
11. Cálculo de descuento especial usando variable global.
*/
package utn.tupad.p2;

import java.util.Scanner;


public class tp2_11 {
    
    static double descuentoFijo = 0.10;
    
    static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado= (precio*descuentoFijo);
        return descuentoAplicado;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingre el precio del producto:");
        double precio = scanner.nextDouble();

        double descuento = calcularDescuentoEspecial(precio);
        
        System.out.println("El descuento aplicado es de:" + descuento );
        
        System.out.println("El precio final con descuento es:" + (precio - descuento));
        
    }
        
}
