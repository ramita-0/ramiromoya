package com.company;

import java.util.HashSet;

public class Sistema {
    private HashSet<Empleado> empleados;

    public Sistema(){
        this.empleados = new HashSet<>();
    }

    public void registrarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void printAsistenciaEmpleadosDeterminadoMes(int mes){
        for (Empleado empleado : this.empleados){
            System.out.println(empleado.getNombre() + " " + empleado.getApellido());
            empleado.printAsistencia(mes);

        }
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }
}
