package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class SistemaBuffet {
    private ArrayList<Profesor> profesores;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Plato> platos;
    private ArrayList<Pedido> pedidos;

    public SistemaBuffet(){
        this.profesores = new ArrayList<Profesor> ();
        this.alumnos = new ArrayList<Alumno>();
        this.platos = new ArrayList<Plato>();
        this.pedidos = new ArrayList<Pedido>();
    }

    public boolean checkExistenciaAlumno(Alumno alumno){
        return this.alumnos.stream().anyMatch(esteAlumno -> esteAlumno.getNombre().equals(alumno.getNombre()) && esteAlumno.getApellido().equals(alumno.getApellido()) && esteAlumno.getDivision().equals(alumno.getDivision()));
    }
    public void registrarAlumno(Alumno alumno){
        boolean check = checkExistenciaAlumno(alumno);

        if ( !check ){
            this.alumnos.add(alumno);
            System.out.println("Registrado con exito!\n");
        }

        else {
            System.out.println("El alumno ya se encuentra registrado en el sistema!\n");
        }
    }
    public void deleteAlumno(String nombre, String apellido, String curso){
        Alumno alumno = new Alumno(nombre, apellido, curso);
        boolean check = checkExistenciaAlumno(alumno);

        if ( check ){
            this.alumnos.removeIf(esteAlumno -> esteAlumno.getNombre().equals(nombre) && esteAlumno.getApellido().equals(apellido) && esteAlumno.getDivision().equals(curso));
            System.out.println("Eliminado con exito!\n");
        }

        else {
            System.out.println("Ese alumno no existe\n");
        }
    }

    public boolean checkExistenciaProfesor(Profesor profesor){
        return this.profesores.stream().anyMatch(esteProfe -> esteProfe.getNombre().equals(profesor.getNombre()) && esteProfe.getApellido().equals(profesor.getApellido()));
    }
    public void registrarProfesor(Profesor profesor){
        boolean check = checkExistenciaProfesor(profesor);

        if ( !check ){
            this.profesores.add(profesor);
            System.out.println("Registrado con exito!\n");
        }

        else {
            System.out.println("El profesor ya se encuentra registrado en el sistema!\n");
        }
    }
    public void deleteProfesor(String nombre, String apellido){
        Profesor profesor = new Profesor(nombre, apellido);
         boolean check = checkExistenciaProfesor(profesor);

         if ( check ){
             this.profesores.removeIf(esteProfe -> esteProfe.getNombre().equals(nombre) && esteProfe.getApellido().equals(apellido));
             System.out.println("Eliminado con exito!\n");
         }

         else {
             System.out.println("Ese profesor no existe\n");
         }
    }

    public boolean checkExistenciaPlato(Plato plato){
        return this.platos.stream().anyMatch(estePlato -> estePlato.getNombre().equals(plato.getNombre()));
    }
    public void registrarPlato(Plato plato){
        boolean check = checkExistenciaPlato(plato);

        if ( !check ){
            this.platos.add(plato);
            System.out.println("Registrado con exito!\n");
        }

        else {
            System.out.println("El plato ya se encuentra registrado en el sistema!\n");
        }
    }
    public void deletePlato(String nombre){
        Plato plato = new Plato(nombre, 0);
        boolean check = checkExistenciaPlato(plato);

        if ( check ){
            this.platos.removeIf(estePlato -> estePlato.getNombre().equals(plato.getNombre()));
            System.out.println("Eliminado con exito!\n");
        }

        else {
            System.out.println("Ese plato no existe\n");
        }
    }

    //bug: si ingreso un numero de pedido cuando no se encuentra el mismo, crashea el programa
    public void registrarPedido(Plato plato, Persona persona, String fechaCreacionPedido, String horaEntrega){
        Pedido pedido = new Pedido(plato, persona, fechaCreacionPedido, horaEntrega);
        this.pedidos.add(pedido);
        System.out.println("Se agrego el pedido con exito!\n");
    }
    public void cerrarPedido(int input){
        Pedido pedido = this.pedidos.get(input);
        pedido.setEntregado(true);
        this.pedidos.removeIf(estePedido -> estePedido.getEntregado());
    }

    public void printAlumnosRegistrados(){
        int num = 0;
        for ( Alumno x : this.alumnos){
            System.out.println(num + "- " + x.getNombre() + " " + x.getApellido() + " " + x.getDivision());
            num++;
        }
    }
    public void printProfesoresRegistrados(){
        int num = 0;
        for ( Profesor x : this.profesores){
            System.out.println(num + "- " + x.getNombre() + " " + x.getApellido());
            num++;
        }
    }
    public void printPlatosRegistrados(){
        int num = 0;
        for ( Plato x : this.platos){
            System.out.println(num + "- " + x.getNombre() + " $" + x.getPrecio());
            num++;
        }
    }
    public void printPedidosRegistrados(){
        int num = 0;
        for ( Pedido x : this.pedidos){
            System.out.println(num + "- " + x.getPersona().toString() + " " + x.getPlato().getPrecio() + "$ " + x.getHoraEntrega() + "hs");
            num++;
        }
    }


    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    public ArrayList<Plato> getPlatos() {
        return platos;
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
