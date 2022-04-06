package com.company;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {
    Artista artista1 = new Artista("Jose", "Martinez", "12/6/03");
    Artista artista2 = new Artista("Martin", "Trias", "12/6/03");
    Artista artista3 = new Artista("Matias", "Gnz", "12/6/03");
    Artista artista4 = new Artista("Mariano", "Garcia", "12/6/03");
    Artista artista5 = new Artista("Laura", "Mesa", "12/6/03");

    Autor autor1 = new Autor("Jose","Timbales", "1/4/4", "Argentina");
    Autor autor2 = new Autor("Tirri","Timbales", "1/4/4", "Peru");
    Autor autor3 = new Autor("Mariana","", "1/4/4", "Tierra de Messi");
    Autor autor4 = new Autor("Jose","Timbales", "1/4/4");
    Autor autor5 = new Autor("Jose","Timbales", "1/4/4");

    // falta testear

    @org.junit.jupiter.api.Test
    void getCanciones() {
    }

    @org.junit.jupiter.api.Test
    void getArtistasParticipantes() {
    }

    @org.junit.jupiter.api.Test
    void artistasMasInfluyente() {
    }
}