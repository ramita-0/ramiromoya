package com.company;

import java.util.ArrayList;

public class Lector {
    private int DiasDeMulta;
    private ArrayList<Libro> librosEnPosesion;


    public Lector(int diasDeMulta, ArrayList<Libro> librosEnPosesion) {
        this.DiasDeMulta = diasDeMulta;
        this.librosEnPosesion = librosEnPosesion;
    }

    public int getDiasDeMulta() {
        return DiasDeMulta;
    }

    public void setDiasDeMulta(int diasDeMulta) {
        DiasDeMulta = diasDeMulta;
    }

    public ArrayList<Libro> getLibrosEnPosesion() {
        return librosEnPosesion;
    }

    public void setLibrosEnPosesion(ArrayList<Libro> librosEnPosesion) {
        this.librosEnPosesion = librosEnPosesion;
    }
}
