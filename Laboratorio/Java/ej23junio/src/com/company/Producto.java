package com.company;

public class Producto {
    private String nombre;
    private int cantidad;
    private float precioUnitario;

    public Producto(String nombre, int cantidad, float precioUnitario){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void descontarStock(Producto producto, int cantidad){
        int x = producto.getCantidad() - cantidad;
        producto.setCantidad(x);
    }
}
