package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        System.out.println("///// Bienvienido al Sistema de la Libreria ///// ");
        boolean check = true;
        while(check == true){
            System.out.println("\n\n -Se vendio algun libro? y/n");
            String yn = opcion.nextLine();
            if (yn.equals("y")){
                Scanner ingreseNombre = new Scanner(System.in);
                Scanner ingreseEditorial = new Scanner(System.in);
                Scanner ingresePrecio = new Scanner(System.in);
                System.out.println("Ingrese nombre, editorial y precio del libro");
                String nombre = ingreseNombre.nextLine();
                String editorial = ingreseEditorial.nextLine();
                float precio = ingresePrecio.nextFloat();
                Libro libro = new Libro(nombre, editorial, precio);
            }
            else check = false;

        }
    }
}
