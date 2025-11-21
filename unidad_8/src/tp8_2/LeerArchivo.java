/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author franc
 */

public class LeerArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("texto.txt");
            Scanner sc = new Scanner(archivo);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe");
        }
    }
}

