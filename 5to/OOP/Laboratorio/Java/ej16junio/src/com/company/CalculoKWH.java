package com.company;

public class CalculoKWH {

    static public float tarifaVivienda (float kwh){
        return kwh * 2;
    }
    static public float tarifaEmpresa (float kwh){
        return kwh * 3;
    }
}
