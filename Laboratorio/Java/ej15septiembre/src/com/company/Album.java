package com.company;

import java.util.*;

public class Album {
    private String nombre;
    private HashSet<Cancion> canciones;

    public Album(String nombre, HashSet<Cancion> canciones){
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public HashSet<Artista> getArtistasParticipantes(Album album){
        HashSet<Artista> artistasParticipantes = new HashSet<>();

        for (Cancion cancionActual : album.getCanciones()){
            artistasParticipantes.addAll(cancionActual.getArtistas());
        }

        return artistasParticipantes;
    }

    //aplicar alta cohesion
    public ArrayList<Artista> artistasMasInfluyente(Album album){
        HashMap<Artista, Integer> aparicionesPorCancion = new HashMap<>();

        for (Cancion cancionActual : album.getCanciones()){

            for (Artista artistaActual : cancionActual.getArtistas()){

                if (aparicionesPorCancion.containsKey(artistaActual)){
                    aparicionesPorCancion.put(artistaActual, aparicionesPorCancion.get(artistaActual) + 1);
                }

                else{
                    aparicionesPorCancion.put(artistaActual, 1);
                }
            }
        }

        int max = Collections.max(aparicionesPorCancion.values());
        ArrayList<Artista> artistasMasInfluyentes = new ArrayList<>();

        for (Artista artistaActual : aparicionesPorCancion.keySet()){
            if (aparicionesPorCancion.get(artistaActual).equals(max)){
                artistasMasInfluyentes.add(artistaActual);
            }
        }

        return artistasMasInfluyentes;
    }
}
