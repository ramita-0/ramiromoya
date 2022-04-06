package com.company;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Empleado> empleados;

    public Sistema(){
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void printListadoEmpleadosAsistencia(int numeroMes){
        String datos = "";

        for (Empleado empleadoActual : this.empleados){
            datos = datos + "\nNombre: " + empleadoActual.getNombre() + "  |  Asistencia: " + empleadoActual.returnPorcentajeAsistencia(numeroMes) + "%";
        }

        System.out.println(datos);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

}
