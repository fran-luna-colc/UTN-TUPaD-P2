
package tp4;


public class Tp4 {

    public static void main(String[] args) {
    
        Empleado empleado1 = new Empleado(1001, "Juan", "Vendedor", 2700);
        
        System.out.println("Total empleados: "+Empleado.mostrarTotalEmpleados()); // 1 empleado
        
        
        Empleado empleado2 = new Empleado("Felipe", "Seguridad");
        Empleado empleado3 = new Empleado(1003, "Pedro", "Supervisor", 3000);
        
        System.out.println("Total empleados: "+Empleado.mostrarTotalEmpleados()); // 3 empleados
        
        System.out.println(empleado1+"\n"+empleado2+"\n"+empleado3);
        
        System.out.println("-------Nuevos salarios-------");
        
        double nuevoSalario = empleado1.actualizarSalario(); //empleado1.salario
        empleado1.setSalario(nuevoSalario);
        
        double nuevoSalario2 = empleado2.actualizarSalario(nuevoSalario);
        empleado2.setSalario(nuevoSalario);
        
        System.out.println(empleado1+"\n"+empleado2+"\n"+empleado3);
        
        
    }
}
