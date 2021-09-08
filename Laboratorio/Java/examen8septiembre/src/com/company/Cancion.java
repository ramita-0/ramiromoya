package com.company;

public class Cancion {
    private String nombre;
    private float precio;

    public Cancion(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
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

    static void precioMinimoCancion(){
        System.out.println("Precio minimo por cancion: $500");
    }
}
