package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Tienda {
    private HashMap<Producto, Integer> historialVenta;

    public Tienda(){
        this.historialVenta = new HashMap<>();
    }

    public void registrarVenta(Producto producto){
        if (historialVenta.containsKey(producto)){
            historialVenta.put(producto, historialVenta.get(producto) + 1);
            producto.setCantidad(producto.getCantidad() - 1);
        }
        else{
            historialVenta.put(producto, 1);
            producto.setCantidad(producto.getCantidad() - 1);

        }
    }

    public HashSet<Producto> masDeCincoVentas(){
        HashSet<Producto> masDeCincoVentas = new HashSet<>();

        for (Producto productoActual : historialVenta.keySet()){
            if (historialVenta.get(productoActual) > 5){
                masDeCincoVentas.add(productoActual);
            }
        }
        return masDeCincoVentas;
    }

    public HashSet<String> nombreProductosVendidos(){
        HashSet<String> nombres = new HashSet<>();
        for (Producto productoActual : historialVenta.keySet()){
            nombres.add(productoActual.getNombre());
        }
     return nombres;
    }

    public HashMap<Producto, Integer> getHistorialVenta() {
        return historialVenta;
    }
}
