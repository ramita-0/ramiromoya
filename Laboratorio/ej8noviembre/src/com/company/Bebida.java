package com.company;

public abstract class Bebida {

    private String nombre;
    private float coeficientePositividad;
    private float coeficienteNegatividad;


    public Bebida(String nombre, float coeficientePositividad, float coeficienteNegatividad){
        this.nombre = nombre;
        this.coeficientePositividad = coeficientePositividad;
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    public Bebida(String nombre){
        this.nombre = nombre;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public void setCoeficientePositividad(float coeficientePositividad) {
        this.coeficientePositividad = coeficientePositividad;
    }

    public float getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }

    public void setCoeficienteNegatividad(float coeficienteNegatividad) {
        this.coeficienteNegatividad = coeficienteNegatividad;
    }
}
