package com.company;

public class Copia {
    private String estado;
    private Libro libro;

    public Copia(String estado, Libro libro) {
        this.estado = estado;
        this.libro = libro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
