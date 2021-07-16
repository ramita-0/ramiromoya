package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Deposito {
    private HashMap<String,Integer> stock;
    private HashMap<String,Float> precioStock;

    public Deposito(){
        this.stock = new HashMap<String,Integer>();
        this.precioStock = new HashMap<String, Float>();
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }
    public HashMap<String, Float> getPrecioStock() {
        return precioStock;
    }

    public void agregarActualizarProducto(Producto producto){
        if (!this.stock.containsKey(producto.getNombre())){
            this.stock.put(producto.getNombre(), producto.getCantidad());
            this.precioStock.put(producto.getNombre(), producto.getPrecioUnitario());
        }
        else {
            int stockActual = this.stock.get(producto.getNombre());
            stockActual += producto.getCantidad();
            this.stock.put(producto.getNombre(), stockActual);
            this.precioStock.put(producto.getNombre(), producto.getPrecioUnitario());
        }
    }

    public void printStock(){
        for (String key : this.stock.keySet()){
            System.out.println(key + " " + this.stock.get(key));
        }
    }

    public void printValorStock(){
        float precioTotal = 0;
        for (String key : this.stock.keySet()){
            float cantidad = this.stock.get(key);
            float precioUnidad = this.precioStock.get(key);
            float multiplicacion = cantidad * precioUnidad;
            precioTotal = precioTotal + multiplicacion;
        }
        System.out.println("\nValor del stock: $" + precioTotal);
    }

    public void printProductosSinStock(){
        for ( String key : this.stock.keySet()){
            if (this.stock.get(key) == 0){
                System.out.println(key);
            }
        }
    }

    public void printStockProducto(String nombreProducto){
        if (this.stock.containsKey(nombreProducto)){
            System.out.println(this.stock.get(nombreProducto) + " Unidades");
        }
        else {
            System.out.println("\nNo se encontro dicho producto. Intentelo de nuevo");
        }
    }

    public void printPrecioProductos(){
        for ( String key : this.precioStock.keySet()){
            System.out.println(key + " " + this.precioStock.get(key));
        }
    }

    public void printProductosConStockMenorAquince(){
        for ( String key : this.stock.keySet()){
            if ( this.stock.get(key) < 15){
                System.out.println( key );
            }
        }
    }

    public void descontarStockProducto(String nombre, int cantidad){
        if (this.stock.containsKey(nombre)){
            int stockActual = this.stock.get(nombre);
            stockActual = stockActual - cantidad;
            this.stock.put(nombre, stockActual);
        }
        else {
            System.out.println("No existe ese producto en el deposito");
        }
    }
}

