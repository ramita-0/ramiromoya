package com.company;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ramiro", "Moya", 11000000, "25/07/2003", "L-M-X-J-V");
        empleado.asiste(1, 7, "8:00");
        empleado.asiste(2,7,"8:03");
        empleado.asiste(3,7,"8:01");

        Empleado empleado2 = new Empleado("Jose", "Tripodi", 1100001, "12/01/2004", "L-M-X-J-V");
        empleado2.asiste(1, 7, "8:06");
        empleado2.asiste(3, 7, "8:00");
        empleado2.asiste(4, 7, "8:02");
        empleado2.asiste(5, 7, "8:30");

        Sistema sistema = new Sistema();
        sistema.registrarEmpleado(empleado);
        sistema.registrarEmpleado(empleado2);

        sistema.printAsistenciaEmpleadosDeterminadoMes(7);
    }
}
