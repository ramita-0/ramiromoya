package com.company;

class Alumno extends Persona {
    private String division;

    public Alumno (String nombre, String apellido, String division){
        super(nombre, apellido);
        this.division = division;
    }


    public String toString(){
        return this.getNombre() + " " + this.getApellido() + " " + this.getDivision();
    }


    public String getDivision() {
        return division;
    }
}
