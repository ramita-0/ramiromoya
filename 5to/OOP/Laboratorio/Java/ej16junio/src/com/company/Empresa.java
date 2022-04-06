package com.company;

class Empresa extends Vivienda {
    public String razonSocial;

    public Empresa (String direccion, String nombreOwner, int dniOwner, String razonSocial){
        super (direccion, nombreOwner, dniOwner);
        this.direccion = direccion;
        this.nombreOwner = nombreOwner;
        this.dniOwner = dniOwner;
        this.razonSocial = razonSocial;
    }

    public void setKwhEmpresa (float kwh){
        this.kwh = kwh;
    }


}
