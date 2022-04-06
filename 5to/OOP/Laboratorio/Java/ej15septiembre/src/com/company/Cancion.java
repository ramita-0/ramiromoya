package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Cancion {
    private String titulo;
    private HashSet<Artista> artistas;
    private HashSet<Autor> autores;

    public Cancion(String titulo, HashSet<Artista> artistas, HashSet<Autor> autores){
        this.titulo = titulo;
        this.artistas = artistas;
        this.autores = autores;
    }

    public HashSet<Artista> getArtistas() {
        return artistas;
    }

    public HashSet<Autor> getAutores() {
        return autores;
    }
}
