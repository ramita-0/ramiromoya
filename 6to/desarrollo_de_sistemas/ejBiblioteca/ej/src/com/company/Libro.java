package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Libro {
    private String nombre;
    private Date anio;
    private ArrayList<Autor> autores;
    private String categoria;
    private String editorial;


    public Libro(String nombre, Date anio, ArrayList<Autor>autores, String categoria, String editorial){
        this.nombre = nombre;
        this.anio = anio;
        this.autores = autores;
        this.categoria = categoria;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
