package com.company;

import java.util.HashMap;

public class Empleado extends Persona{
    private String diasQueDebeAsistir;
    private HashMap<Integer, HashMap<Integer, String>> asistencia;

    public Empleado(String nombre, String apellido, int telefono, String fechaNacimiento, String diasQueDebeAsistir){
        super(nombre, apellido, telefono, fechaNacimiento);
        this.diasQueDebeAsistir = diasQueDebeAsistir;
        this.asistencia = new HashMap<>();
    }

    public void asiste(int dia, int mes, String hora){
        HashMap<Integer, String> inner = this.asistencia.get(mes);
        if (inner == null) inner = new HashMap<>();
        inner.put(dia, hora);
        this.asistencia.put(mes, inner);
    }

    public void printAsistencia(){
        System.out.println(this.asistencia);
    }

    public float returnPorcentajeAsistido(int mes){
        // bastante croto esto la verdad, pido disculpas jaajajajaja
        HashMap<Integer, Integer> diasDeCadaMes = new HashMap<>();
        diasDeCadaMes.put(1,31);
        diasDeCadaMes.put(2,28);
        diasDeCadaMes.put(3,31);
        diasDeCadaMes.put(4,30);
        diasDeCadaMes.put(5,31);
        diasDeCadaMes.put(6,30);
        diasDeCadaMes.put(7,31);
        diasDeCadaMes.put(8,31);
        diasDeCadaMes.put(9,30);
        diasDeCadaMes.put(10,31);
        diasDeCadaMes.put(11,30);
        diasDeCadaMes.put(12,31);

        HashMap<Integer, String> dias = this.asistencia.get(mes);
        int size = dias.size();
        float porcentaje = (size * 100)/31;

        return porcentaje;
    }

    public void printAsistencia(int mes){
        System.out.println(this.returnPorcentajeAsistido(mes) + "%");
    }

    public String getDiasQueDebeAsistir() {
        return diasQueDebeAsistir;
    }

    public void setDiasQueDebeAsistir(String diasQueDebeAsistir) {
        this.diasQueDebeAsistir = diasQueDebeAsistir;
    }

    public HashMap<Integer, HashMap<Integer, String>> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(HashMap<Integer, HashMap<Integer, String>> asistencia) {
        this.asistencia = asistencia;
    }
}
