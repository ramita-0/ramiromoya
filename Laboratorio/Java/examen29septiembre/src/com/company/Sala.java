package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sala {
    private int numero;
    private int cantAsientos;
    private HashSet<Visitante> historialVisitantes;
    private ArrayList<Visitante> visitantesPresentes;
    private HashMap<Integer, Integer> preferenciaAsientos;
    private HashMap<Visitante, Integer> cantidadVisitasVisitante;

    public Sala(int numero, int cantAsientos){
        this.numero = numero;
        this.cantAsientos = cantAsientos;
        this.historialVisitantes = new HashSet<>();
        this.visitantesPresentes = new ArrayList<>();
        this.preferenciaAsientos = new HashMap<>();
        this.cantidadVisitasVisitante = new HashMap<>();
    }

    public static int maxPersonasPorSala(){
        int max = 50;
        return max;
    }

    public void agregarPreferenciaAsiento(int asiento){
        if (this.preferenciaAsientos.containsKey(asiento)){
            int nuevoValor = this.preferenciaAsientos.get(asiento) + 1;
            this.preferenciaAsientos.put(asiento, nuevoValor);
        }

        else {
            this.preferenciaAsientos.put(asiento, 1);
        }
    }

    public HashMap<Integer, Integer> nroDeAsientosConCantidadDePreferencias(){
        return this.preferenciaAsientos;
    }

    public void agregarVisitaSala(Visitante visitante){
        if (this.cantidadVisitasVisitante.containsKey(visitante)){
            int nuevoValor = this.cantidadVisitasVisitante.get(visitante) + 1;
            this.cantidadVisitasVisitante.put(visitante, nuevoValor);
        }

        else {
            this.cantidadVisitasVisitante.put(visitante, 1);
        }
    }

    public HashMap<Visitante, Integer> visitantesConCantidadDeVisitas(){
        return this.cantidadVisitasVisitante;
    }

    public void agregarVisitante(Visitante visitante){
        this.visitantesPresentes.add(visitante);
        this.historialVisitantes.add(visitante);
    }

    public boolean estaLlena(){
        return this.visitantesPresentes.size() >= maxPersonasPorSala();
    }

    public boolean hayInfiltrados(){
        return this.visitantesPresentes.size() > maxPersonasPorSala();
    }

    public int asientosDisponibles(){
        if (estaLlena()){
            return 0;
        }

        else if (hayInfiltrados()){
            return 0;
        }

        else{
            return maxPersonasPorSala() - this.visitantesPresentes.size();
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public HashSet<Visitante> getHistorialVisitantes() {
        return historialVisitantes;
    }

    public void setHistorialVisitantes(HashSet<Visitante> historialVisitantes) {
        this.historialVisitantes = historialVisitantes;
    }

    public ArrayList<Visitante> getVisitantesPresentes() {
        return visitantesPresentes;
    }

    public void setVisitantesPresentes(ArrayList<Visitante> visitantesPresentes) {
        this.visitantesPresentes = visitantesPresentes;
    }

    public HashMap<Integer, Integer> getPreferenciaAsientos() {
        return preferenciaAsientos;
    }

    public void setPreferenciaAsientos(HashMap<Integer, Integer> preferenciaAsientos) {
        this.preferenciaAsientos = preferenciaAsientos;
    }

    public HashMap<Visitante, Integer> getCantidadVisitasVisitante() {
        return cantidadVisitasVisitante;
    }

    public void setCantidadVisitasVisitante(HashMap<Visitante, Integer> cantidadVisitasVisitante) {
        this.cantidadVisitasVisitante = cantidadVisitasVisitante;
    }
}
