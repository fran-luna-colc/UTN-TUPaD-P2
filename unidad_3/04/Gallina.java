
package tp3_04;

public class Gallina {
    
    int idGallina;
    int edad;
    int huevosPuestos;
    
    void ponerHuevos() {
        huevosPuestos++;
        System.out.println("Se han puesto "+huevosPuestos+" huevos.");
    }
    
    void envejecer() {
        edad++;
        System.out.println("La gallina de "+(edad-1)+" años, ahora tiene "+edad+" años.");
    }
    
    void mostrarEstado() {
        System.out.println("La gallina número "+idGallina+" de "+edad+" años, puso "+huevosPuestos+" huevos.");
    }
    
}
