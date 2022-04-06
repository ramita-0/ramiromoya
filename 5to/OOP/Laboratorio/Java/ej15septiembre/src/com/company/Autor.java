package com.company;

public class Autor extends Artista{
    private String nacionalidad;

    public Autor(String nombre, String apellido, String fechaNacimiento, String nacionalidad){
        super(nombre, apellido, fechaNacimiento);
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
