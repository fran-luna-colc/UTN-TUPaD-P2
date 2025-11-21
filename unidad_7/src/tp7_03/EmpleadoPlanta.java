/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_03;

/**
 *
 * @author franc
 */
public class EmpleadoPlanta extends Empleado {
    private double salarioFijo;

    public EmpleadoPlanta(String nombre, double salarioFijo) {
        super(nombre);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSueldo() {
        return salarioFijo;
    }
}
