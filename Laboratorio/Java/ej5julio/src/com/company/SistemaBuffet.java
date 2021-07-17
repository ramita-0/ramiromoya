package com.company;

import java.util.HashSet;

public class SistemaBuffet {
    private HashSet<Profesor> profesores;
    private HashSet<Alumno> alumnos;
    private HashSet<Plato> platos;

    public SistemaBuffet(){
        this.profesores = new HashSet<Profesor>();
        this.alumnos = new HashSet<Alumno>();
        this.platos = new HashSet<Plato>();
    }

    //no funcionan los delete de los metodos
    public boolean checkExistenciaAlumno(Alumno alumno){
        boolean check = false;
        for ( Alumno x : this.alumnos ){
            if ( x.getNombre().equals(alumno.getNombre()) && x.getApellido().equals(alumno.getApellido()) && x.getDivision().equals(alumno.getDivision())){
                check = true;
            }
        }
        return check;
    }
    public void registarAlumno(Alumno alumno){
        boolean check = checkExistenciaAlumno(alumno);

        if ( !check ){
            this.alumnos.add(alumno);
        }

        else {
            System.out.println("El alumno ya se encuentra registrado en el sistema!\n");
        }
    }
    public void deleteAlumno(String nombre, String apellido, String curso){
        Alumno alumno = new Alumno(nombre, apellido, curso);
        boolean check = checkExistenciaAlumno(alumno);

        if ( check ){
            this.alumnos.remove(alumno);
            System.out.println("Eliminado con exito!\n");
        }

        else {
            System.out.println("Ese alumno no existe\n");
        }
    }

    //no funcionan los delete de los metodos
    public boolean checkExistenciaProfesor(Profesor profesor){
        boolean check = false;
        for ( Profesor x : this.profesores ){
            if ( x.getNombre().equals(profesor.getNombre()) && x.getApellido().equals(profesor.getApellido()) ){
                check = true;
            }
        }
        return check;
    }
    public void registrarProfesor(Profesor profesor){
        boolean check = checkExistenciaProfesor(profesor);

        if ( !check ){
            this.profesores.add(profesor);
        }

        else {
            System.out.println("El profesor ya se encuentra registrado en el sistema!\n");
        }
    }
    public void deleteProfesor(String nombre, String apellido){
        Profesor profesor = new Profesor(nombre, apellido);
         boolean check = checkExistenciaProfesor(profesor);

         if ( check ){
             this.profesores.remove(profesor);
             System.out.println("Eliminado con exito!\n");
         }

         else {
             System.out.println("Ese profesor no existe\n");
         }
    }

    //terminar los metodos de los platos
    public boolean checkExistenciaPlato(Plato plato){
        boolean check = false;
        if ( this.platos.size() == 0 ){
            this.platos.add(plato);
        }

        else {
            for ( Plato x : this.platos ){
                if ( x.getNombre().equals(plato.getNombre())){
                    System.out.println("Ya se encuentra el plato en el sistema!");
                    check = true;
                }

                else {
                    this.platos.add(plato);
                    System.out.println("Se registro con exito!");
                }
            }
        }
        return check;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }
    public HashSet<Profesor> getProfesores() {
        return profesores;
    }
    public HashSet<Plato> getPlatos() {
        return platos;
    }
}
