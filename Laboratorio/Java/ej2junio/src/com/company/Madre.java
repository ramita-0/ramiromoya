package com.company;

import java.util.HashSet;

class Madre extends Persona {
    private String empresa;
    private HashSet<Hijo> hijos;

    public Madre(String nombre, int edad, int dni, int telefono, String domicilio, String empresa, HashSet<Hijo> hijos) {
        super(nombre, edad, dni, telefono, domicilio);
        this.empresa = empresa;
        this.hijos = hijos;
    }

    public HashSet<Hijo> getHijos() {
        return hijos;
    }
}
