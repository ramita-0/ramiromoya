package com.company;

public class Prestamo {
    private Date diaInicialPrestamo;
    private Lector poseedor;
    private Copia copia;

    public Prestamo(Date diaInicialPrestamo, Lector poseedor, Copia copia) {
        this.diaInicialPrestamo = diaInicialPrestamo;
        this.poseedor = poseedor;
        this.copia = copia;
    }

    public Date getDiaInicialPrestamo() {
        return diaInicialPrestamo;
    }

    public void setDiaInicialPrestamo(Date diaInicialPrestamo) {
        this.diaInicialPrestamo = diaInicialPrestamo;
    }

    public Lector getPoseedor() {
        return poseedor;
    }

    public void setPoseedor(Lector poseedor) {
        this.poseedor = poseedor;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }
}
