package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Album {
    private String nombreAlbum;
    ArrayList<Cancion> canciones;

    public Album(String nombreAlbum, ArrayList<Cancion> canciones){
        this.nombreAlbum = nombreAlbum;
        this.canciones = canciones;
    }

    public void printPrecioCanciones(){
        System.out.println(this.getNombreAlbum());
        for (Cancion cancionActual : canciones){
            System.out.println(cancionActual.getNombre() + " | " + cancionActual.getPrecio());
        }
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
}
