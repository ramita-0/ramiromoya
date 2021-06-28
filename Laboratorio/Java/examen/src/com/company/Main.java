package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jose", 232323, 2323566);
        Cliente c2 = new Cliente("Pedro", 1234, 11232);
        Cliente c3 = new Cliente("Marian", 11111, 6566665);
        Banco bancoRio = new Banco("Banco Rio");

        ArrayList<Cliente> visitas = new ArrayList<>();
        visitas.add(c1);
        visitas.add(c2);
        visitas.add(c3);
        visitas.add(c1);
        visitas.add(c3);


        bancoRio.agregarVisitas(visitas);
        HashSet<Integer> cbusBancoRio = new HashSet<>();
        cbusBancoRio = bancoRio.cbusDeClientesVisitantes(visitas);
        bancoRio.printCbus(cbusBancoRio);
    }
}
