package com.company;

public class BebidaAlcoholica extends Bebida {

    private float cantidadAlcohol;

    public BebidaAlcoholica(String nombre, float cantidadAlcohol) {
        super(nombre);
        this.cantidadAlcohol = cantidadAlcohol;
        this.setCoeficientePositividad(0);
        this.setCoeficienteNegatividad(this.cantidadAlcohol * 10);
    }








    public float getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(float cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }
}
