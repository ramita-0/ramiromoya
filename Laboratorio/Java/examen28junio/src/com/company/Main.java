package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jose", 232323, 2323566);
        Cliente c2 = new Cliente("Pedro", 1234, 11232);
        Cliente c3 = new Cliente("Marian", 11111, 6566665);
        Banco bancoRio = new Banco("Banco Rio");

        bancoRio.agregarVisitas(c1);
        bancoRio.agregarVisitas(c2);
        bancoRio.agregarVisitas(c3);
        bancoRio.agregarVisitas(c1);
        bancoRio.agregarVisitas(c2);
        bancoRio.agregarVisitas(c1);
        bancoRio.agregarVisitas(c1);

        bancoRio.printCbus();
        bancoRio.printVisitasPorCbu();
    }
}
