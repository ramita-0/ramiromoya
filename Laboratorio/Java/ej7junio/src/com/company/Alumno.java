package com.company;
import java.util.ArrayList;
import java.util.HashMap;

class Alumno extends Persona {
    private String curso;
    private HashMap <String,ArrayList<Float>> notas;

    public Alumno(String nombre, int edad, int dni, int telefono, String domicilio, String curso){
        super(nombre, edad, dni, telefono, domicilio);
        this.curso = curso;
    }
    public void setNotas(HashMap <String,ArrayList<Float>> notas){
        this.notas = notas;
    }
    public void agregarNotas (String nombre, float nota){
        notas.get(nombre).add(nota);
    }
    public void menorNota(String materia) {
        float menor = notas.get(materia).get(0);
        for (float nota : notas.get(materia)){
            if (nota < menor){
                menor = nota;
            }
        }
        System.out.println(menor);
    }
}
