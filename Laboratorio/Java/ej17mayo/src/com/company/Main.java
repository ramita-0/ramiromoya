package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("///// Bienvienido al Sistema de la Libreria ///// ");
        while(true){
            System.out.println("\n\n -Se vendio algun libro? y/n");
            String yn = scanner.nextLine();
            if (yn.equals("y")){
                System.out.println("Ingrese nombre, editorial y precio del libro");
                String nombre = scanner.nextLine();
                String editorial = scanner.nextLine();
                float precio = scanner.nextFloat();
                Libro libro = new Libro(nombre, editorial, precio);
            }
            else if (yn.equals("n")) break;
            else System.out.println("Respuesta incorrecta");
        }
    }
}
