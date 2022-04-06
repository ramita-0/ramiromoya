package com.company;
import java.util.Scanner;

public class Producto {
    private String nombre;
    private float precio;

    public String getNombre(){
        return this.nombre;
    }
    public float getPrecio(){
        return this.precio;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setPrecio(float nuevoPrecio){
        this.precio = nuevoPrecio;
    }
}
