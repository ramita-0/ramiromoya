package com.company;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona (String nombre, int edad, int dni, int telefono, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getDni(){
        return dni;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

}

