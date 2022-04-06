package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SistemaBuffetTest {
    private Alumno alumno;
    private Alumno alumno1;
    private Profesor profesor;
    private Profesor profesor1;
    private Plato plato;
    private Plato plato1;
    private SistemaBuffet sistema;

    @BeforeEach
    void setUp() {

        sistema = new SistemaBuffet();
        alumno = new Alumno("Ramiro", "Moya", "5c");
        alumno1 = new Alumno("Nahu", "Ourthe", "6c");
        profesor = new Profesor("Alfredo", "Perez");
        profesor1 = new Profesor("Claudio", "Vaccalluzzo");
        plato = new Plato("Bocadillos", 300);
        plato1 = new Plato("Salame", 60);
        sistema.registrarAlumno(alumno);
        sistema.registrarAlumno(alumno1);
        sistema.registrarProfesor(profesor);
        sistema.registrarProfesor(profesor1);
        sistema.registrarPedido(plato, alumno, "15:00", "18:00");
        sistema.registrarPedido(plato1, alumno1, "12:00", "14:00");
        sistema.registrarPedido(plato, profesor, "13:00", "13:40");
        sistema.registrarPedido(plato1, profesor1, "17:00", "18:00");
    }

    @Test
    void probandoDeleteProfesor() {
        sistema.getPedidos();
        sistema.printPedidosRegistrados();
        System.out.println(" ");
        sistema.cerrarPedido(2);
        System.out.println(" ");
        sistema.getPedidos();
        sistema.printPedidosRegistrados();
    }

    @org.junit.jupiter.api.Test
    void printPedidosRegistrados() {
    }
}