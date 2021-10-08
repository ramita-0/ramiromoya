package com.company;

public class Producto {
    private int codigo;
    private String nombre;
    private float precio;
    private int cantidad;
    private static float descuento;

    public Producto(int codigo, String nombre, float precio, int cantidad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        descuento = 30;
    }

    public float precioConDescuento(){
        return (this.getPrecio() * 30) / 100;
    }

    public static void imprimirInformacion(Producto producto){
        System.out.println("\n");
        System.out.println("#" + producto.getCodigo() + " " +
                producto.getNombre() + " $" +
                producto.getPrecio() + " " +
                producto.getCantidad() + "u " +
                descuento + "%");
    }

    //getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static float getDescuento() {
        return descuento;
    }

    public static void setDescuento(float descuento) {
        Producto.descuento = descuento;
    }
}
