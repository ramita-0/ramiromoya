package com.company;

public class ProductoNoPerecedero extends ProductoAlimenticio {

    private float mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, float descuento, float mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse, descuento);
        this.mgDeSodio = mgDeSodio;
    }


    public float getMgDeSodio() {
        return mgDeSodio;
    }

    public void setMgDeSodio(float mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }
}