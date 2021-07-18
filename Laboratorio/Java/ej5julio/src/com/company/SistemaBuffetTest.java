package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        sistema.registrarPedidoAlumno(plato, alumno, "15:00", "18:00");
        sistema.registrarPedidoAlumno(plato1, alumno1, "12:00", "14:00");
        sistema.registrarPedidoProfesor(plato, profesor, "13:00", "13:40");
        sistema.registrarPedidoProfesor(plato1, profesor1, "17:00", "18:00");

    }

    @Test
    void probandoDeleteProfesor() {
        assert(sistema.checkExistenciaProfesor(profesor));
        sistema.deleteProfesor("Alfredo", "Perez");
        assert(!sistema.checkExistenciaProfesor(profesor));
    }

    @org.junit.jupiter.api.Test
    void printPedidosRegistrados() {
        sistema.printPedidosRegistrados();
    }
}