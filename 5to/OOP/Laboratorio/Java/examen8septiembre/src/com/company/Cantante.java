package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Cantante extends Persona{
    private String nombreArtistico;
    private HashSet<Album> albums;

    public Cantante(String nombre, String apellido, int edad, String nombreArtistico){
        super(nombre,apellido,edad);
        this.nombreArtistico = nombreArtistico;
        this.albums = new HashSet<Album>();
    }

    public void mostrarPrecioCanciones(){
        System.out.println(("Nombre: " + this.getNombre() + "\n" + "Apellido: " + this.getApellido() + "\n" + "Edad: " + this.getEdad()) + "\n" + "Nombre Artistico: " + this.getNombreArtistico() + "\n");
        for (Album albumActual : albums){
            albumActual.printPrecioCanciones();
        }
    }

    public void printDiscografia(){
        for (Album album : albums) {
            System.out.println(album.getNombreAlbum());
            for (Cancion cancion : album.canciones) {
                System.out.println(" -" + cancion.getNombre());
            }
        }
    }

    public void agregarAlbum(Album album){
        this.albums.add(album);
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public HashSet<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(HashSet<Album> albums) {
        this.albums = albums;
    }
}
