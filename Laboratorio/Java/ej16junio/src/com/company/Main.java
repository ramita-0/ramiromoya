package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ints = new Scanner(System.in);
        Scanner strings = new Scanner(System.in);
        Scanner floats = new Scanner(System.in);
        HashSet<Vivienda> casas = new HashSet<Vivienda>();
        HashSet<Empresa> empresas = new HashSet<Empresa>();
        String direccion;
        String nombre;
        String razon;
        int DNI;
        int answer;

        //Ingreso de datos de duenios de domicilios o empresas;
        System.out.println ("\nVa a ingresar un domicilio o una empresa? \n1- Domicilio    2- Empresa    3- Exit");
        while (true){
            answer = ints.nextInt();

            if (answer == 1){
                System.out.println ("\nIngrese direccion, nombre y DNI");
                direccion = strings.nextLine();
                nombre = strings.nextLine();
                DNI = ints.nextInt();
                Vivienda domicilio = new Vivienda(direccion, nombre, DNI);
                casas.add(domicilio);
            }

            else if (answer == 2){
                System.out.println ("\nIngrese direccion, nombre, DNI y razon social");
                direccion = strings.nextLine();
                nombre = strings.nextLine();
                DNI = ints.nextInt();
                razon = strings.nextLine();
                Empresa empresa = new Empresa(direccion, nombre, DNI, razon);
                empresas.add(empresa);
            }

            else if (answer == 3){
                break;
            }

            else{
                System.out.println("-error-");
            }
            System.out.println ("\nVa a ingresar un domicilio o una empresa?");
        }

        //Asignacion de KWH a diversos usuarios registrados en el sistema;
        System.out.println("\n-Asignacion de KWH-");
        System.out.println("Domicilio o empresa? \n1- Domicilio    2- Empresa    3- Exit");
        while (true) {
            answer = ints.nextInt();

            if (answer == 1) {
                System.out.println("Ingrese DNI del duenio que quiere asignarle su consumo mensual");
                DNI = ints.nextInt();
                for (Vivienda casa : casas) {
                    if (casa.getDniOwner() == DNI) {
                        System.out.println("Ingrese los kwh");
                        float kwh = casa.getKwh();
                        if (kwh == 0){
                            float kwhIngreso = floats.nextFloat();
                            casa.setKwhVivienda(CalculoKWH.tarifaVivienda(kwhIngreso));
                        }
                        else {
                            System.out.println("Ya se le asigno su consumo mensual a dicha persona");
                        }
                    }
                }
            }

            else if (answer == 2){
                System.out.println("Ingrese DNI del duenio que quiere asignarle su consumo mensual");
                DNI = ints.nextInt();
                for (Empresa empresa : empresas) {
                    if (empresa.getDniOwner() == DNI) {
                        float kwh = empresa.getKwh();
                        if (kwh == 0){
                            float kwhIngreso = floats.nextFloat();
                            empresa.setKwhVivienda(CalculoKWH.tarifaVivienda(kwhIngreso));
                        }
                        else {
                            System.out.println("Ya se le asigno su consumo mensual a dicha persona");
                        }
                    }
                }
            }

            else if (answer == 3){
                break;
            }

            else {
                System.out.println("-error-");
            }
            System.out.println("\nDomicilio o empresa?");
        }
    }
}