package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
    private String nombre;
    HashSet<Album> albums;

    public Sistema(String nombre){
        this.nombre = nombre;
        this.albums = new HashSet<>();
    }

    public void agregarAlbum(Album album){
        this.albums.add(album);
    }

    public ArrayList<Cancion> cancionesEscritasPorAutoresDeNacionalidadX(String nacionalidad){
        ArrayList<Cancion> canciones = new ArrayList<>();

        for (Album albumActual : this.albums){
            for (Cancion cancionActual : albumActual.getCanciones()){
                for (Autor autorActual : cancionActual.getAutores()){
                    if (autorActual.getNacionalidad().equals(nacionalidad)){
                        canciones.add(cancionActual);
                    }
                }
            }
        }
        return canciones;
    }

    public HashSet<Album> getAlbums() {
        return albums;
    }
}
