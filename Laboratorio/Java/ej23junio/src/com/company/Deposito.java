package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Deposito {
    private HashMap<String,Integer> stock;

    public Deposito(){
        this.stock = new HashMap<String,Integer>();
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public void agregarActualizarProducto(Producto producto){
        if (!this.stock.containsKey(producto.getNombre())){
            this.stock.put(producto.getNombre(), producto.getCantidad());
        }
        else {
            int stock = this.stock.get(producto.getNombre());
            stock += producto.getCantidad();
        }

    }

    public void printStock(){
        for (String key : this.stock.keySet()){
            System.out.println(key + " " + this.stock.get(key));
        }
    }
    public void printValorStock(HashSet<Producto> productos){
        float precioTotal = 0;
        for (Producto producto : productos){
            precioTotal += producto.getCantidad() * producto.getPrecioUnitario();
        }
        System.out.println("\nValor del stock: $" + precioTotal);
    }
    public void printProductosSinStock(HashSet<Producto> productos){
        for (Producto producto : productos){
            System.out.println("");
            if (producto.getCantidad() == 0){
                System.out.println(producto.getNombre());
            }
        }
    }
    public void printStockProducto(HashMap<String,Integer> stock, String nombreProducto){
        if (stock.containsKey(nombreProducto)){
            System.out.println(stock.get(nombreProducto));
        }
        else {
            System.out.println("\nNo se encontro dicho producto. Intentelo de nuevo");
        }
    }

    public void descontarStockProducto(HashSet<Producto> productos, String nombre, int cantidad){
        System.out.println("\n Ingrese el nombre y cantidad del producto a descontar");
        for (Producto producto : productos){
            boolean found = false;
            if (producto.getNombre().equals(nombre)){
                producto.descontarStock(producto, cantidad);
                found = true;
            }
            if (!found){
                System.out.println("\nNo se encontro dicho producto. Intentelo de nuevo");
            }
        }
    }
}

