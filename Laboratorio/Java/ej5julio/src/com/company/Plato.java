package com.company;

public class Plato {
    private String nombre;
    private float precio;

    public Plato(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
}
