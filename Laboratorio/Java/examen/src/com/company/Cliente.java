package com.company;

class Cliente extends Persona {
    public int cbu;

    public Cliente(String nombre, int dni, int cbu) {
        super(nombre, dni);
        this.cbu = cbu;
    }

    public int getCbu() {
        return cbu;
    }
}
