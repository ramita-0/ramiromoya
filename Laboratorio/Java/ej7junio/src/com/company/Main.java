package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("rama",17, 45012930, 113456446, "casa","4cstc");
        HashMap<String, ArrayList<Float>> notas = new HashMap<>();
        ArrayList<Float> notasNumericas = new ArrayList<>();
        notasNumericas.add(3.5f);
        notasNumericas.add(4.7f);
        notasNumericas.add(8.9f);
        notas.put("Ingles", notasNumericas);
        alumno1.setNotas(notas);
        alumno1.menorNota("Ingles");

    }
}
