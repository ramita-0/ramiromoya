package com.company;

public class Persona {
    public String nombre;
    public int dni;

    public Persona(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
}
