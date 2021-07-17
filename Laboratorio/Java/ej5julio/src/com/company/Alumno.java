package com.company;

public class Alumno {
    private String nombre;
    private String apellido;
    private String division;

    public Alumno (String nombre, String apellido, String division){
        this.nombre = nombre;
        this.apellido = apellido;
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDivision() {
        return division;
    }
}
