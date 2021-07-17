package com.company;

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
            System.out.println(sistema.getAlumnos());
            System.out.println(sistema.getProfesores());
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
                    sistema.registarAlumno(alumno);
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
                }

                else {
                    System.out.println("error");
                }
            }

            else if ( input == 2 ){
                System.out.println("1- Eliminar alumno");
                System.out.println("2- Eliminar profesor");
                System.out.println("3- Eliminar plato");
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

                }

                else {
                    System.out.println("error");
                }
            }

            else if ( input == 3 ){

            }

            else if ( input == 4 ){

            }

            else if ( input == 5 ){

            }

            else {
                System.out.println("error");
            }
        }
    }
}
