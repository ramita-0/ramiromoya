package com.company;

public abstract class ProductoElectrico extends ProductoDeSuper {

    private int cantDiasDeGarantia;
    public static float recargoPorEnvio;

    public ProductoElectrico(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia, float recargoPorEnvio) {
        super(nombre, origen, codigo, costo);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
        ProductoElectrico.recargoPorEnvio = recargoPorEnvio;
    }

    public float calcularGananciaObtenida(){
        float ganancia = 0;

        if (this.getCantDiasDeGarantia() == 365){
            ganancia = (float) (this.getCosto() * 0.45);
        }

        else if (this.getCantDiasDeGarantia() <= 60){
            ganancia = (float) (this.getCosto() * 0.15);
        }
        return ganancia;
    }

    public float calcularPrecioFinal(){
        return (float) this.getCosto() + this.calcularGananciaObtenida() + recargoPorEnvio;
    }

    public String tipoDeProducto(){
        return "Producto Electrico";
    }










    public int getCantDiasDeGarantia() {
        return cantDiasDeGarantia;
    }

    public void setCantDiasDeGarantia(int cantDiasDeGarantia) {
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

}
