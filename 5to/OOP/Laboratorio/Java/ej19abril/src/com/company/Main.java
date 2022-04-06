package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float precioParcial = 0;
        while (true) {
            Producto producto = new Producto();
            Scanner scannerNombre = new Scanner(System.in);
            Scanner scannerPrecio = new Scanner(System.in);
            System.out.println("Introduzca nombre del producto, para finalizar el proceso ingrese '<'");
            producto.setNombre(scannerNombre.nextLine());
            if (producto.getNombre().equals("<")) break;
            System.out.println("Introduzca el precio del producto");
            producto.setPrecio(scannerPrecio.nextFloat());
            precioParcial += producto.getPrecio();
            System.out.println("Subtotal: " + precioParcial);
        }
        System.out.println("Total: " + precioParcial);
    }
}
