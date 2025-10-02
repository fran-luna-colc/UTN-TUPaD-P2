/*
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
*/
package utn.tupad.p2;

import java.util.Scanner;


public class tp2_08 {
    
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal;
        precioFinal = precioBase+(precioBase*impuesto)-(descuento*precioBase);
        return precioFinal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el precio base del producto:");
        double precioBase = scanner.nextDouble();
        
        System.out.println("Ingresar el porcentaje del impuesto sobre el producto:");
        double impuesto = scanner.nextDouble();
        
        System.out.println("Ingresar el porcentaje del descuento sobre el producto:");
        double descuento = scanner.nextDouble();
        
        double precio = calcularPrecioFinal( precioBase,impuesto,descuento);
        
        System.out.println("El precio final fue " + precio);

    } 
     

}
