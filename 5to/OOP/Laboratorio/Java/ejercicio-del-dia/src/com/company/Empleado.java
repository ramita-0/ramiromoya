package com.company;

import java.util.ArrayList;
import java.util.HashMap;


public class Empleado extends Persona{
    private String diasLaborales;
    private ArrayList<Asistencia> asistencia;

    public Empleado(String nombre, int telefono, String fechaNacimiento, String diasLaborales) {
        super(nombre, telefono, fechaNacimiento);
        this.diasLaborales = diasLaborales;
        this.asistencia = new ArrayList<Asistencia>();
    }

    public void agregarAsistencia(int dia, int mes, String hora){
        Asistencia asistencia = new Asistencia(dia, mes, hora);
        this.asistencia.add(asistencia);
    }

    public int returnPorcentajeAsistencia_totalDiasAsistidos(int numeroMes){
        int totalDiasAsistidos = 0;

        for (Asistencia diaAsistido : this.asistencia){
            if (diaAsistido.getMes() == numeroMes){
                totalDiasAsistidos ++;
            }
        }

        return totalDiasAsistidos;
    }

    public float returnPorcentajeAsistencia_porcentajeAsistido(int numeroMes){

        int totalDiasAsistidos = this.returnPorcentajeAsistencia_totalDiasAsistidos(numeroMes);

        HashMap<Integer,Integer> diasMeses = new HashMap<>();
        diasMeses.put(1,31);
        diasMeses.put(2,28);
        diasMeses.put(3,31);
        diasMeses.put(4,30);
        diasMeses.put(5,31);
        diasMeses.put(6,30);
        diasMeses.put(7,31);
        diasMeses.put(8,31);
        diasMeses.put(9,30);
        diasMeses.put(10,31);
        diasMeses.put(11,30);
        diasMeses.put(12,31);

        int cantidadDiasMesActual = diasMeses.get(numeroMes);
        float porcentajeAsistido = (totalDiasAsistidos * 100f) / cantidadDiasMesActual;
        return(porcentajeAsistido);
    }

    public float returnPorcentajeAsistencia(int numeroMes){
        return returnPorcentajeAsistencia_porcentajeAsistido(numeroMes);
    }

    public void printPorcentajeAsistencia(int numeroMes){
        System.out.println(returnPorcentajeAsistencia(numeroMes) + "%");
    }
}
