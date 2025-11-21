/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_01;

import java.util.ArrayList;
/**
 *
 * @author franc
 */
public class Tp6_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClaseInventario inventario = new ClaseInventario();
        
        // Crear los productos
        ClaseProducto p1 = new ClaseProducto("P01", "Pan", 500, 50, CategoriaProducto.ALIMENTOS);
        ClaseProducto p2 = new ClaseProducto("P02", "Televisor", 2500, 10, CategoriaProducto.ELECTRONICA);
        ClaseProducto p3 = new ClaseProducto("P03", "Remera", 1500, 30, CategoriaProducto.ROPA);
        ClaseProducto p4 = new ClaseProducto("P04", "Silla", 2800, 20, CategoriaProducto.HOGAR);
        ClaseProducto p5 = new ClaseProducto("P05", "Yerba Mate", 1200, 100, CategoriaProducto.ALIMENTOS);
        
        // meter los productos dentro del arraylist de inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // === 3️⃣ Listar todos los productos ===
        System.out.println("=== LISTA DE PRODUCTOS ===");
        inventario.listarProductos();

        // === 4️⃣ Buscar un producto por su ID ===
        System.out.println("\n=== BUSCAR PRODUCTO (P03) ===");
        ClaseProducto encontrado = inventario.buscarProductoPorId("P03");
        if (encontrado != null) encontrado.mostrarInfo();

        // === 5️⃣ Filtrar productos por categoría ===
        System.out.println("\n=== PRODUCTOS EN CATEGORÍA ALIMENTOS ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // === 6️⃣ Eliminar un producto y volver a listar ===
        System.out.println("\n=== ELIMINAR PRODUCTO P02 ===");
        inventario.eliminarProducto("P02");
        inventario.listarProductos();

        // === 7️⃣ Actualizar el stock de un producto existente ===
        System.out.println("\n=== ACTUALIZAR STOCK ===");
        inventario.actualizarStock("P01", 80);

        // === 8️⃣ Mostrar el total de unidades en stock ===
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // === 9️⃣ Mostrar el producto con mayor stock ===
        System.out.println("\nProducto con mayor stock:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        // === 🔟 Filtrar productos por rango de precio ===
        System.out.println("\n=== PRODUCTOS ENTRE $1000 y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // === 🔟 Mostrar todas las categorías disponibles ===
        System.out.println("\n=== CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
