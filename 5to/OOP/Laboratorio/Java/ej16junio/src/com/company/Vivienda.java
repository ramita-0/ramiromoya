package com.company;

public class Vivienda {
    public String direccion;
    public String nombreOwner;
    public int dniOwner;
    public float kwh;

    public Vivienda (String direccion, String nombreOwner, int dniOwner){
        this.direccion = direccion;
        this.nombreOwner = nombreOwner;
        this.dniOwner = dniOwner;
    }

    public int getDniOwner() {
        return dniOwner;
    }
    public float getKwh() {
        return kwh;
    }

    public void setKwhVivienda (float kwh){
        this.kwh = kwh;
    }
}
