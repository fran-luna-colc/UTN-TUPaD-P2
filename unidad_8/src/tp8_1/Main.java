/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8_1;

/**
 *
 * @author franc
 */
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("pepito", "pepito@hotmail.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Monitor", 12000));

        System.out.println("Total pedido: " + pedido.calcularTotal());

        pedido.setEstado("Preparando");

        TarjetaCredito tc = new TarjetaCredito();

        double totalConDescuento = tc.aplicarDescuento(pedido.calcularTotal());
        tc.procesarPago(totalConDescuento);
    }
}
