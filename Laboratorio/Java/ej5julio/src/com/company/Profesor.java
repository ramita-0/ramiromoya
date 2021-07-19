package com.company;

class Profesor extends Persona {
    private int descuento;

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
        this.descuento = 20; //todos los profesores tendran el mismo descuento
    }


    public String toString(){
        return this.getNombre() + " " + this.getApellido();
    }


    public int getDescuento() {
        return descuento;
    }
}
