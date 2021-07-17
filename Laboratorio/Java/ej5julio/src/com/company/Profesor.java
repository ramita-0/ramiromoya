package com.company;

public class Profesor {
    private String nombre;
    private String apellido;
    private int descuento;

    public Profesor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.descuento = 20; //todos los profesores tendran el mismo descuento
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDescuento() {
        return descuento;
    }
}
