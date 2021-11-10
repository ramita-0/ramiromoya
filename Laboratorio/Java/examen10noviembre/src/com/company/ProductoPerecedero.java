package com.company;

public class ProductoPerecedero extends ProductoAlimenticio {

    private float temperaturaMinimaDeFrio;

    public ProductoPerecedero(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, float descuento, float temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse, descuento);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }




    public float getTemperaturaMinimaDeFrio() {
        return temperaturaMinimaDeFrio;
    }

    public void setTemperaturaMinimaDeFrio(float temperaturaMinimaDeFrio) {
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }
}