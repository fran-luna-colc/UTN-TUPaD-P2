
package tp4_05;


public class NaveEspacial {
    String nombre;
    int combustible;
    int posicion=0;
    
    void despegar(){
        if (combustible > 0 ){
            System.out.println("La nave Espacial ha despegado.");
        } else{
            System.out.println("No hay combustible para despegar.");
        }
    }
            
    int[] avanzar(int distancia){
        

        if (combustible>0){
            combustible -= distancia;
            posicion += distancia;
            System.out.println("La nave avanzo "+distancia+" y ahora le queda "+combustible+" de combustible.");
        }else {
            System.out.println("La nave no puede avanzar por que no tiene combustible.");
        }
        
        int[] recorrido = {combustible, posicion};
        return recorrido;
    }
            
    int recargarCombustible(int cantidad){
        combustible += cantidad;
        System.out.println("La nave recargo "+combustible+" de combustible.");
        return combustible;
    } 
            
    void mostrarEstado(){
        System.out.println("La nave "+nombre+" tiene "+combustible+" combustible y avanzo "+posicion+" años luz.");
    }
}
