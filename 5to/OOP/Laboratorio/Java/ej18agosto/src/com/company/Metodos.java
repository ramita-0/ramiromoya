package com.company;

public class Metodos {

    static void areaCirculo(Display display, double radio){
        double radioDisplay = display.getAreaRadio();
        double area = Math.PI * radioDisplay * radio;
        System.out.println(area);
    }
    static void areaEsfera(double radio){
        double area = 4 * Math.PI * radio * radio;
        System.out.println(area);

    }
    static void areaCuadrado(double lado){
        double area = lado * lado;
        System.out.println(area);
    }
    static void areaCubo(double lado){
        double area = 6 * lado * lado;
        System.out.println(area);
    }
    static void areaTriangulo(double base, double altura){
        double area = (base * altura) / 2;
        System.out.println(area);
    }

}
