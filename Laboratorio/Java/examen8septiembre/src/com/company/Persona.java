package com.company;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){
        this.nombre = "nombreDefault";
        this.apellido = "apellidoDefault";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        String string = ("Nombre: " + this.getNombre() + "\n" + "Apellido: " + this.getApellido() + "\n" + "Edad: " + this.getEdad());
        return string;
    }

    static void imprimir(Persona persona){
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());
    }
}
