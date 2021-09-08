package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(persona.toString());

        Persona.imprimir(persona);

        Cantante cantante = new Cantante("elvis", "presley", 45, "Elvis Presley");

        Cancion cancion = new Cancion("a", 1300);
        Cancion cancion2 = new Cancion("b", 500);
        Cancion cancion3 = new Cancion("c", 3100);
        Cancion cancion4 = new Cancion("d", 2250);
        Cancion cancion5 = new Cancion("e", 1220);
        Cancion cancion6 = new Cancion("f", 1110);
        Cancion cancion7 = new Cancion("g", 995);
        Cancion cancion8 = new Cancion("g", 875);

        ArrayList<Cancion> cancionesAlbum1 = new ArrayList<>();
        cancionesAlbum1.add(cancion);
        cancionesAlbum1.add(cancion2);

        ArrayList<Cancion> cancionesAlbum2 = new ArrayList<>();
        cancionesAlbum2.add(cancion3);
        cancionesAlbum2.add(cancion4);
        cancionesAlbum2.add(cancion5);

        ArrayList<Cancion> cancionesAlbum3 = new ArrayList<>();
        cancionesAlbum3.add(cancion6);
        cancionesAlbum3.add(cancion7);

        ArrayList<Cancion> cancionesAlbum4 = new ArrayList<>();
        cancionesAlbum4.add(cancion8);

        Album album1 = new Album("album1", cancionesAlbum1);
        Album album2 = new Album("album2", cancionesAlbum2);
        Album album3 = new Album("album3", cancionesAlbum3);
        Album album4 = new Album("album4", cancionesAlbum4);

        cantante.agregarAlbum(album1);
        cantante.agregarAlbum(album2);
        cantante.agregarAlbum(album3);
        cantante.agregarAlbum(album4);

        cantante.mostrarPrecioCanciones();

        Disquera disquera = new Disquera("Blue Records");
        disquera.agregarCantante(cantante);

        disquera.printCantantesMasDeTresAlbums();
        disquera.printDiscografiaTodosLosCantantes();

        disquera.printDatosConDiscografia();

    }
}
