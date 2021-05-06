package com.company;

public class Main {

    public static void main(String[] args) {
        persona p1=new persona();
        p1.datosDefault();

        String nombreP1 = p1.getNombre();
        int edadP1 = p1.getEdad();
        int dniP1 = p1.getDni();
        int telP1 = p1.getTel();
        String dirP1 = p1.getDir();

        System.out.println(telP1);
    }
}
