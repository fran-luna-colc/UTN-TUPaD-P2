/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_02;

/**
 *
 * @author franc
 */
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[] {
            new Circulo(3),
            new Rectangulo(4, 6),
            new Circulo(5)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + " - Área: " + f.calcularArea());
        }
    }
}