package com.company;

public class BebidaAzucarada extends Bebida {

    private float cantidadAzucarEnGramos;

    public BebidaAzucarada(String nombre, float cantidadAzucarEnGramos) {
        super(nombre);
        this.cantidadAzucarEnGramos = cantidadAzucarEnGramos;
        this.setCoeficientePositividad(1);
        this.setCoeficienteNegatividad(this.cantidadAzucarEnGramos * 10);
    }









    public float getCantidadAzucarEnGramos() {
        return cantidadAzucarEnGramos;
    }

    public void setCantidadAzucarEnGramos(float cantidadAzucarEnGramos) {
        this.cantidadAzucarEnGramos = cantidadAzucarEnGramos;
    }
}
