package com.company;

import java.util.HashSet;

public class Disquera {
    private String nombreDisquera;
    HashSet<Cantante> cantantes;

    public Disquera(String nombreDisquera){
        this.nombreDisquera = nombreDisquera;
        this.cantantes = new HashSet<Cantante>();
    }

    public void agregarCantante(Cantante cantante){
        this.cantantes.add(cantante);
    }

    public void printCantantesMasDeTresAlbums(){
        for (Cantante cantante : this.cantantes){
            if (cantante.getAlbums().size() > 3){
                System.out.println(cantante.getNombreArtistico());
            }
        }
    }

    public void printDiscografiaTodosLosCantantes(){
        for (Cantante cantanteActual : this.cantantes){
            cantanteActual.printDiscografia();
        }
    }

    public void printDatosConDiscografia(){
        for (Cantante cantanteActual : this.cantantes){
            System.out.println(("Nombre: " + cantanteActual.getNombre() + "\n" + "Apellido: " + cantanteActual.getApellido() + "\n" + "Edad: " + cantanteActual.getEdad() + "\n" + "Nombre Artistico: " + cantanteActual.getNombreArtistico()));
            cantanteActual.printDiscografia();
        }
    }

    public String getNombreDisquera() {
        return nombreDisquera;
    }

    public void setNombreDisquera(String nombreDisquera) {
        this.nombreDisquera = nombreDisquera;
    }

    public HashSet<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(HashSet<Cantante> cantantes) {
        this.cantantes = cantantes;
    }
}
