package com.company;

import java.util.HashSet;

class Hijo extends Persona {
    private String escuela;
    private String juegoFavorito;

    public Hijo(String nombre, int edad, int dni, int telefono, String domicilio, String escuela, String juegoFavorito){
        super(nombre, edad, dni, telefono, domicilio);
        this.escuela = escuela;
        this.juegoFavorito = juegoFavorito;
    }

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
}
