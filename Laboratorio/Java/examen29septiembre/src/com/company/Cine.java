package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cine {
    private String nombre;
    private String direccion;
    private ArrayList<Sala> salas;
    private HashMap<Visitante, Integer> cantidadVisitasPorVisitante;

    public Cine(String nombre, String direccion, ArrayList<Sala> salas){
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = salas;
        this.cantidadVisitasPorVisitante = new HashMap<>();
    }

    public HashSet<Integer> visitantes(){
        HashSet<Integer> ids = new HashSet<>();
        for (Sala sala : salas){
            for (Visitante visitante : sala.getHistorialVisitantes()){
                ids.add(visitante.getId());
            }
        }
        return ids;
    }

    public int cantidadTotalDeVisitantes(){
        return visitantes().size();
    }

    public void agregarVisitante(){
        for (Sala sala : this.salas){
            for (Visitante visitante : sala.getCantidadVisitasVisitante().keySet()){
                if (cantidadVisitasPorVisitante.containsKey(visitante)){
                    int nuevoValor = this.cantidadVisitasPorVisitante.get(visitante) + sala.getCantidadVisitasVisitante().get(visitante);
                    this.cantidadVisitasPorVisitante.put(visitante, nuevoValor);
                }

                else{
                    this.cantidadVisitasPorVisitante.put(visitante, 1);
                }
            }
        }
    }

    public HashMap<Visitante, Integer> visitantesConCantidadDevisitas(){
        return this.cantidadVisitasPorVisitante;
    }

    public static String informeActual(Cine cine){
        String informe = "";
        for (Sala sala : cine.salas){
             informe = "Sala: " + sala.getNumero() + "\n" +
                    "Cantidad asientos: " + sala.getCantAsientos() + "\n" +
                    "Capacidad maxima permitida: " + sala.getCantAsientos() + "\n" +
                    "Cantidad de visitantes presentes: " + sala.getVisitantesPresentes() + "\n" +
                    "Cantidad de asientos disponibles: " + sala.asientosDisponibles() + "\n" + "\n";
        }
        return informe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public HashMap<Visitante, Integer> getCantidadVisitasPorVisitante() {
        return cantidadVisitasPorVisitante;
    }

    public void setCantidadVisitasPorVisitante(HashMap<Visitante, Integer> cantidadVisitasPorVisitante) {
        this.cantidadVisitasPorVisitante = cantidadVisitasPorVisitante;
    }
}

