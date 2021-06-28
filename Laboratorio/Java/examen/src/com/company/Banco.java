package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Banco {
    public String nombreBanco;
    public ArrayList<Cliente> visitas;

    public Banco(String nombreBanco){
        this.nombreBanco = nombreBanco;
    }

    //le hice el metodo agregarVisitas para que el banco pueda ser creado antes o despues de haber ingresado personas, entonces
    //la persona puede crear el banco al principio, y mas adelante agregarle las visitas, para que no este obligada a hacerlo de entrada
    public void agregarVisitas(ArrayList<Cliente> visitas){
        this.visitas = visitas;
    }

    public HashSet<Integer> cbusDeClientesVisitantes(ArrayList<Cliente> visitas){
        HashSet<Integer> cbus = new HashSet<Integer>();
        for(Cliente cliente : visitas){
            cbus.add(cliente.getCbu());
        }
        return cbus;
    }
    public void printCbus(HashSet<Integer> cbus){
        for(int i : cbus){
            System.out.println(i);
        }
    }
}
