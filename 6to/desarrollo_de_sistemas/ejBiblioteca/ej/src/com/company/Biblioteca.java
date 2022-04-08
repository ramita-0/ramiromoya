package com.company;

public class Biblioteca {
    private ArrayList<Copia> copias;
    private ArrayLis<Prestamo> prestamos;


    public Biblioteca(ArrayList<Copia> copias, ArrayLis<Prestamo> prestamos) {
        this.copias = copias;
        this.prestamos = prestamos;
    }

    public ArrayList<Copia> getCopias() {
        return copias;
    }

    public void setCopias(ArrayList<Copia> copias) {
        this.copias = copias;
    }

    public ArrayLis<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayLis<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}
