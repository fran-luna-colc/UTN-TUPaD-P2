/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_03;

/**
 *
 * @author franc
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Pepito", 250000));
        empleados.add(new EmpleadoTemporal("Roberto", 100, 1500));
        empleados.add(new EmpleadoTemporal("Carlos", 60, 1200));

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " - Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta Permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
    }
}
