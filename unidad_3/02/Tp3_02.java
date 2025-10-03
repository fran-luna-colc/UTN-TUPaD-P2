/*
2. Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
verificar los cambios.
*/
package tp3_02;

public class Tp3_02 {

    public static void main(String[] args) {
        
        Mascota mas = new Mascota();
        
        mas.nombre = "Lola";
        mas.especie = "perro";
        mas.edad = 5;
        
        mas.mostrarInfor();
        mas.cumplirAnios();
        mas.cumplirAnios();
        mas.mostrarInfor();
    }
    
}
