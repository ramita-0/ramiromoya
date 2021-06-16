package com.company;

import java.util.HashSet;

public class Libro {
    private String nombre;
    private int editorial;
    private float precio;
    //constructor
    public Libro(String nombre, int editorial, float precio){
        this.nombre = nombre;
        this.editorial = editorial;
        this.precio = precio;
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }
    public int getEditorial() {
        return this.editorial;
    }
    public float getPrecio() {
        return this.precio;
    }

    static HashSet<Integer> descuentos(int x){
        HashSet<Integer> off = new HashSet<>();
        off.add(x);
        return off;
    }
}
