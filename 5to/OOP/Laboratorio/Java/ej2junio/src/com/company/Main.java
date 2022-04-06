package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

	    Hijo hijo = new Hijo("Jose", 21, 45012930, 113456544, "casa", "poli", "monopoly");
        Hijo hijo2 = new Hijo("Pedro", 20, 45012930, 113456544, "casa", "poli", "monopoly");
        Hijo hijo3 = new Hijo("Tyler", 19, 45012930, 113456544, "casa", "poli", "monopoly");
        Hijo hijo4 = new Hijo("Guadalupe", 17, 45012930, 113456544, "casa", "poli", "monopoly");
        HashSet<Hijo> hijos = new HashSet<>();
        hijos.add(hijo);
        hijos.add(hijo2);
        hijos.add(hijo3);
        hijos.add(hijo4);
        Madre madre = new Madre("Maria", 56, 18405830, 113454345, "casa", "poli", hijos);
        for (Hijo x : madre.getHijos()){
            if (x.getEdad() < 18){
                System.out.println(x.getNombre());
            }
        }
    }
}
