/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;


public class Empleado {
    
    private int id; // Identificador único del empleado.
    private String nombre; // Nombre completo.
    private String puesto; // Cargo que desempeña.
    private double salario; // Salario actual
    public static int totalEmpleados; // Contador global de empleados creados.
    
    
    // Constructores 1 y 2
    

    public Empleado(int id,String nombre,String puesto, double salario) {
        this.id=id;
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto){
        id= 1002 ;  //automatico
        this.nombre=nombre;
        this.puesto=puesto;
        salario=2500.00; //fijo
        totalEmpleados++;
    }
    
    // 3 Métodos sobrecargados

    /**
     *
     * @param salario
     * @return
     */
    
    public double actualizarSalario(double salario){ //porcentaje de aumento de 50%
        return salario+(salario*0.5);
    }
    
    public double actualizarSalario(){ // cantidad fija a aumentar de 1000
        return salario + 1000; 
    }    
    
    // 4 Método toString()
    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    // 5 Método estatico
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    // 6 Encapsulamiento en los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }    
}
