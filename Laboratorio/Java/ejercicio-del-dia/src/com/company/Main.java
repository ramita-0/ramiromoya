package com.company;

public class Main {

    public static void main(String[] args) {

        Sistema oficina1 = new Sistema();

        Empleado personaTest = new Empleado("Ramiro Moya", 11335454, "25-7-03", "L-M-MX-J-V");
        Empleado personaTest2 = new Empleado("Martin Goiburu", 11323231, "26-1-03", "L-M-MX-J-V");

        oficina1.agregarEmpleado(personaTest);
        oficina1.agregarEmpleado(personaTest2);

        personaTest.agregarAsistencia(1,1,"12:05");
        personaTest.agregarAsistencia(2,1,"12:05");
        personaTest.agregarAsistencia(3,1,"12:05");

        personaTest2.agregarAsistencia(1,1,"12:05");
        personaTest2.agregarAsistencia(2,1,"12:05");
        personaTest2.agregarAsistencia(3,1,"12:05");
        personaTest2.agregarAsistencia(4,1,"12:05");
        personaTest2.agregarAsistencia(5,1,"12:05");

        personaTest.printPorcentajeAsistencia(1);
        personaTest2.printPorcentajeAsistencia(1);

        oficina1.printListadoEmpleadosAsistencia(1);

    }
}
