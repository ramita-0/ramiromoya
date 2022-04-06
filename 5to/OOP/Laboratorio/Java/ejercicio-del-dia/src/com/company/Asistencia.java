package com.company;

public class Asistencia {
    private int dia;
    private int mes;
    private String hora;

    public Asistencia(int dia, int mes, String hora){
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
