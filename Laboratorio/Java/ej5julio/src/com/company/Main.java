package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerStrings = new Scanner(System.in);
        Scanner scannerInts = new Scanner(System.in);
        Scanner scannerFloats = new Scanner(System.in);
        SistemaBuffet sistema = new SistemaBuffet();

        System.out.println("Bienvenido al sistema del Buffet!");
        System.out.println("1- Registrar cliente o plato");
        System.out.println("2- Eliminar plato o cliente");
        System.out.println("3- Crear pedido");
        System.out.println("4- Finalizar pedido");
        System.out.println("5- Salir\n");

        while(true){
            System.out.println(sistema.getPedidos());
            int input = scannerInts.nextInt();

            if ( input == 1 ){
                System.out.println("1- Registrar alumno");
                System.out.println("2- Registrar profesor");
                System.out.println("3- Registrar plato\n");
                input = scannerInts.nextInt();

                if ( input == 1 ){
                    //registrar alumno
                    System.out.println("Ingrese nombre, apellido y division (formato 1A, 2B, 5C, etc)");
                    String nombre = scannerStrings.nextLine();
                    String apellido = scannerStrings.nextLine();
                    String division = scannerStrings.nextLine();
                    Alumno alumno = new Alumno(nombre, apellido, division);
                    sistema.checkExistenciaAlumno(alumno);
                    sistema.registrarAlumno(alumno);
                }

                else if ( input == 2 ){
                    //registrar profe
                    System.out.println("Ingrese nombre y apellido del profesor");
                    String nombre = scannerStrings.nextLine();
                    String apellido = scannerStrings.nextLine();
                    Profesor profesor = new Profesor(nombre, apellido);
                    sistema.checkExistenciaProfesor(profesor);
                    sistema.registrarProfesor(profesor);
                }

                else if ( input == 3 ){
                    //registrar plato
                    System.out.println("Ingrese nombre y precio del plato");
                    String nombre = scannerStrings.nextLine();
                    float precio = scannerFloats.nextFloat();
                    Plato plato = new Plato(nombre, precio);
                    sistema.checkExistenciaPlato(plato);
                    sistema.registrarPlato(plato);
                }

                else {
                    System.out.println("error");
                }
            }

            else if ( input == 2 ){
                System.out.println("1- Eliminar alumno");
                System.out.println("2- Eliminar profesor");
                System.out.println("3- Eliminar plato\n");
                input = scannerInts.nextInt();

                if ( input == 1 ){
                    System.out.println("Ingrese nombre, apellido y division (formato 1A, 2B, 5C, etc)");
                    String nombre = scannerStrings.nextLine();
                    String apellido = scannerStrings.nextLine();
                    String division = scannerStrings.nextLine();
                    sistema.deleteAlumno(nombre, apellido, division);
                }

                else if ( input == 2 ){
                    System.out.println("Ingrese nombre y apellido del profesor");
                    String nombre = scannerStrings.nextLine();
                    String apellido = scannerStrings.nextLine();
                    sistema.deleteProfesor(nombre, apellido);
                }

                else if (input == 3 ){
                    System.out.println("Ingrese nombre del plato");
                    String nombre = scannerStrings.nextLine();
                    sistema.deletePlato(nombre);
                }

                else {
                    System.out.println("error");
                }
            }

            else if ( input == 3 ){
                System.out.println("1- Alumno");
                System.out.println("2- Profesor\n");
                input = scannerInts.nextInt();

                if ( input == 1 ){
                    System.out.println("Que va a pedir?");
                    sistema.printPlatosRegistrados();
                    input = scannerInts.nextInt();
                    ArrayList<Plato> platos = sistema.getPlatos();
                    Plato plato = platos.get(input);

                    System.out.println("\nQue alumno hace el pedido?");
                    sistema.printAlumnosRegistrados();
                    ArrayList<Alumno> alumnos = sistema.getAlumnos();
                    input = scannerInts.nextInt();
                    Alumno alumno = alumnos.get(input);
                    String nombreAlumno = (alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getDivision());
                    System.out.println("\nIngrese hora actual");
                    String horaActual = scannerStrings.nextLine();

                    System.out.println("\nIngrese hora de entrega");
                    String horaEntrega = scannerStrings.nextLine();

                    sistema.registrarPedidoAlumno(plato, alumno, horaActual, horaEntrega);
                }

                else if ( input == 2 ){
                    //registrar pedido profesor
                }

                else {
                    System.out.println("error");
                }
            }

            else if ( input == 4 ){
                sistema.printPedidosRegistrados();
                input = scannerInts.nextInt();

            }

            else if ( input == 5 ){

            }

            else {
                System.out.println("error");
            }
        }
    }
}
