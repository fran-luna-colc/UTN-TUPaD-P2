/*
4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad,
huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
mostrar su estado.
*/
package tp3_04;


public class Tp3_04 {


    public static void main(String[] args) {
        
        Gallina gallina1 = new Gallina();
        
        gallina1.idGallina = 101;
        gallina1.edad = 2;
        gallina1.huevosPuestos = 4;
        
        gallina1.mostrarEstado();
        
        gallina1.envejecer();
        gallina1.ponerHuevos();
        
        gallina1.mostrarEstado();
        
        Gallina gallina2 = new Gallina();
        
        gallina2.idGallina = 102;
        gallina2.edad = 1;
        gallina2.huevosPuestos = 2;
        
        gallina2.mostrarEstado();

        gallina2.envejecer();
        gallina2.ponerHuevos();
        
        gallina2.mostrarEstado();

    }
    
}
