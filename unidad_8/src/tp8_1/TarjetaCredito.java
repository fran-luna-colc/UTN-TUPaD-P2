/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_1;

/**
 *
 * @author franc
 */
public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con tarjeta crédito: " + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% off
    }
}