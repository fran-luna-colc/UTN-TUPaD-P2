
package tp3_02;


public class Mascota {
    
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfor() {
        System.out.println("El nombre de la mascota es "+nombre+", es un "+especie+" y tiene "+edad+" años.");
    }
    
    int cumplirAnios() {
        edad += 1;
        System.out.println("Al cumplir un año más, tiene ahora "+edad+" años.");
        return edad;
    }
    
    
}
