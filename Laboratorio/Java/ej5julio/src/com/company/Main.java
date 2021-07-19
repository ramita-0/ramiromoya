package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerStrings = new Scanner(System.in);
        Scanner scannerInts = new Scanner(System.in);
        Scanner scannerFloats = new Scanner(System.in);
        SistemaBuffet sistema = new SistemaBuffet();
        System.out.println("-----Bienvenido al sistema del Buffet!-----");

        while(true){
            System.out.println("1- Registrar cliente o plato");
            System.out.println("2- Eliminar plato o cliente");
            System.out.println("3- Crear pedido");
            System.out.println("4- Finalizar pedido");
            System.out.println("5- Salir\n");
            int input = scannerInts.nextInt();

            if ( input == 1 ){
                System.out.println("\n1- Registrar alumno");
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
                System.out.println("\n1- Eliminar alumno");
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
                System.out.println("\n1- Alumno");
                System.out.println("2- Profesor\n");
                input = scannerInts.nextInt();

                if ( input == 1 ){
                    System.out.println("Que va a pedir?");
                    sistema.printPlatosRegistrados();
                    input = scannerInts.nextInt();
                    ArrayList<Plato> platos = sistema.getPlatos();
                    Plato plato = platos.get(input);

                    System.out.println("\nQuien hace el pedido?");
                    sistema.printAlumnosRegistrados();
                    ArrayList<Alumno> alumnos = sistema.getAlumnos();
                    input = scannerInts.nextInt();
                    Alumno alumno = alumnos.get(input);

                    System.out.println("\nIngrese hora actual");
                    String horaActual = scannerStrings.nextLine();

                    System.out.println("\nIngrese hora de entrega");
                    String horaEntrega = scannerStrings.nextLine();

                    sistema.registrarPedido(plato, alumno, horaActual, horaEntrega);
                }

                else if ( input == 2 ){
                    System.out.println("Que va a pedir");
                    sistema.printPlatosRegistrados();
                    input = scannerInts.nextInt();
                    ArrayList<Plato> platos = sistema.getPlatos();
                    Plato plato = platos.get(input);

                    System.out.println("Quien hace el pedido?");
                    sistema.printProfesoresRegistrados();
                    ArrayList<Profesor> profesores = sistema.getProfesores();
                    input = scannerInts.nextInt();
                    Profesor profesor = profesores.get(input);

                    //calculo de valor total por descuento
                    float porcentajeAdescontar = (plato.getPrecio() * profesor.getDescuento()) / 100;
                    plato.setPrecio(plato.getPrecio() - porcentajeAdescontar);

                    System.out.println("\nIngrese hora actual");
                    String horaActual = scannerStrings.nextLine();

                    System.out.println("\nIngrese hora de entrega");
                    String horaEntrega = scannerStrings.nextLine();

                    sistema.registrarPedido(plato, profesor, horaActual, horaEntrega);
                }

                else {
                    System.out.println("error");
                }
            }

            else if ( input == 4 ){
                System.out.println("\nIngrese el numero de pedido a cerrar");
                sistema.printPedidosRegistrados();
                input = scannerInts.nextInt();
                sistema.cerrarPedido(input);
            }

            else if ( input == 5 ){
                break;
            }

            else {
                System.out.println("error");
            }
        }
    }
}
