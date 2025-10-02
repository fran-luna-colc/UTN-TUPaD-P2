/*
13. Impresión recursiva de arrays antes y después de modificar un elemento.
*/
package utn.tupad.p2;


public static void mostrarProducto (double[] precios, int indice) {
    if ( indice == precios.length){
        return;
    }
    System.out.println("Precio: $" + precios[indice]);
    mostrarProducto(precios, indice + 1);
}

public class tp2_13 {
    public static void main(String[] args) {

        double[] preciosOriginales =  {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios:");
        mostrarProducto(preciosOriginales, 0);

        preciosOriginales [2] = 123.86;

        System.out.println("Precios modificados:");
        mostrarProducto(preciosOriginales, 0);
        }
}
