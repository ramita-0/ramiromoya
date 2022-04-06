package com.company;
public class Persona {
    private String nombre;
    private int edad;

    public Persona(){
        nombre ="pedro";
        edad =35;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int nuevaEdad){
        edad=nuevaEdad;
    }
}