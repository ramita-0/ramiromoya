package com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper{

    private int cantDiasParaVencerse;
    public static float descuento;

    public ProductoAlimenticio(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, float descuento){
        super(nombre, origen, codigo, costo);
        this.cantDiasParaVencerse = cantDiasParaVencerse;
        ProductoAlimenticio.descuento = descuento;
    }

    public float calcularGananciaObtenida(){
        float ganancia = 0;

        if (this.getCantDiasParaVencerse() <= 90){
            ganancia = (float) (this.getCosto() * 0.1);
        }

        else{
            ganancia = (float) (this.getCosto() * 0.25);
        }
        return ganancia;
    }

    public float calcularPrecioFinal(){
        return (float) this.getCosto() + this.calcularGananciaObtenida() + descuento;
    }

    public String tipoDeProducto(){
        return "Producto Alimenticio";
    }






    public int getCantDiasParaVencerse() {
        return cantDiasParaVencerse;
    }

    public void setCantDiasParaVencerse(int cantDiasParaVencerse) {
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }
}
