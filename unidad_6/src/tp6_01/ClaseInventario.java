/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_01;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class ClaseInventario {
    
    private ArrayList<ClaseProducto> productos = new ArrayList<>();

  
    public void agregarProducto(ClaseProducto p){
        this.productos.add(p);
    }

    public void listarProductos(){
        for (ClaseProducto p : productos) {
            p.mostrarInfo();
        }
    }
            
          
    public ClaseProducto buscarProductoPorId(String id){
        for (ClaseProducto p : productos) {
            if (p.getId().equalsIgnoreCase(id)){
                return p;
            }
            
        }
        return null;
    }
    
            

    public void eliminarProducto(String id) {
        ClaseProducto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
        }
    }
                  
    public void actualizarStock(String id, int nuevaCantidad) {
        ClaseProducto actualizado = buscarProductoPorId(id);
        if (actualizado != null) {
            actualizado.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para el producto con ID " + id);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
            System.out.println("Productos en la categoría " + categoria + ":");
        for (ClaseProducto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }
    

    public int obtenerTotalStock() {
        int total = 0;
        for (ClaseProducto p : productos) {
            total += p.getCantidad();
        }
        return total; 
    }
   
            
            
     
    public ClaseProducto obtenerProductoConMayorStock(){
        ClaseProducto mayor = null;
        int mayorActual = -1;
        for (ClaseProducto producto : productos) {
            if(producto.getCantidad() > mayorActual){
                mayorActual = producto.getCantidad();
                mayor = producto;
            }
        }
        return mayor;
    }
    
            
            
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("Productos entre $" + min + " y $" + max + ":");
        for (ClaseProducto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) { 
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }

}