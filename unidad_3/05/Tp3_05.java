/*
5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia),
recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
*/
package tp4_05;


public class Tp4_05 {


    public static void main(String[] args) {
        
        NaveEspacial nV= new NaveEspacial();
        
        nV.nombre="Cohete";
        nV.combustible=50;

        
        nV.despegar();
        nV.mostrarEstado();
        nV.avanzar(20);
        nV.recargarCombustible(30);
        nV.mostrarEstado();
        nV.avanzar(40);
        nV.recargarCombustible(10);
        nV.avanzar(20);
        nV.mostrarEstado();
        
    }
    
}
