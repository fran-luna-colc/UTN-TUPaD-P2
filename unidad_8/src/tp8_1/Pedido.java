/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
public class Pedido implements Pagable {

    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;  
    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambió a estado: " + nuevoEstado);
    }
}