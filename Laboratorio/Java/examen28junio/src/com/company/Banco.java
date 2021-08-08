package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Banco {
    public String nombreBanco;
    public ArrayList<Cliente> visitas;

    public Banco(String nombreBanco)
    {
        this.nombreBanco = nombreBanco;
        this.visitas = new ArrayList<>();
    }

    //le hice el metodo agregarVisitas para que el banco pueda ser creado antes o despues de haber ingresado personas, entonces
    //la persona puede crear el banco al principio, y mas adelante agregarle las visitas, para que no este obligada a hacerlo de entrada
    public void agregarVisitas(Cliente cliente)
    {
        this.visitas.add(cliente);
    }

    public HashSet<Integer> cbusDeClientesVisitantes()
    {
        HashSet<Integer> cbus = new HashSet<>();

        for (Cliente cliente : this.visitas)
        {
            cbus.add(cliente.getCbu());
        }

        return cbus;
    }

    public void printCbus()
    {
        System.out.println(this.cbusDeClientesVisitantes());
    }

    public HashMap<Integer,Integer> returnVisitasPorCbu()
    {
        HashMap<Integer,Integer> visitas = new HashMap<>();

        for (Cliente cliente : this.visitas)
        {
            visitas.put(cliente.getCbu(), 0);
        }

        for (Cliente cliente : this.visitas)
        {
            int cbuActual = cliente.getCbu();
            visitas.put(cbuActual, visitas.get(cbuActual) + 1);
        }

        return visitas;
    }
    public void printVisitasPorCbu()
    {
        HashMap<Integer,Integer> map = returnVisitasPorCbu();

        for (Integer key : map.keySet())
        {
            System.out.println("CBU: " + key + "  Visitas: " + map.get(key));
        }
    }
}
