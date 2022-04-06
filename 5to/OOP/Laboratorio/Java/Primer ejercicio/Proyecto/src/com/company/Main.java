package com.company;

public class Main {

    public static void main(String[] args) {
        Persona p = new Persona();

        String n = p.getNombre();
        int edad = p.getEdad();

        System.out.println(n);
        System.out.println(edad);

        p.setNombre("tyler");

        edad=p.setEdad(80);
        System.out.println(n);
        System.out.println(edad);
    }
}
