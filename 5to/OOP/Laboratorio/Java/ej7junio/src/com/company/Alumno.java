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

    public void getCurso(){
        System.out.println(curso);
    }
    public void getNotas(){
        System.out.println(notas);
    }

    //setea todas las notas que necesite de una
    public void setNotas(HashMap <String,ArrayList<Float>> notas){
        this.notas = notas;
    }

    //agrega notas individualmente
    public void agregarNota (String nombre, float nota){
        notas.get(nombre).add(nota);
    }

    //devuelve la menor nota de X materia
    public void menorNota(String materia) {
        float menor = notas.get(materia).get(0);
        for (float nota : notas.get(materia)){
            if (nota < menor){
                menor = nota;
            }
        }
        System.out.println(menor);
    }

    //devuelve la mayor nota de X materia
    public void mayorNota(String materia) {
        float mayor = notas.get(materia).get(0);
        for (float nota : notas.get(materia)){
            if (nota > mayor){
                mayor = nota;
            }
        }
        System.out.println(mayor);
    }

    //promedia notas de X materia
    public void promedioNotas(String materia){
        float total = 0f;
        for (float nota : notas.get(materia)){
            total += nota;
        }
        total /= notas.get(materia).size();
        System.out.println(total);
    }

    //agrega X materia
    public void agregarMateria(String materia){
        ArrayList<Float> floats = new ArrayList<>();
        notas.put(materia,floats);
    }
}
