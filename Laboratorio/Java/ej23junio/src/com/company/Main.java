package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner nombreProducto = new Scanner(System.in);
        Scanner cantidadProducto = new Scanner(System.in);
        Scanner precioProducto = new Scanner(System.in);
        Deposito deposito = new Deposito();

        System.out.println("\nControl de stock de productos alimenticios");
        System.out.println("1- Ingresar producto");
        System.out.println(" 2- Descontar producto");
        System.out.println("  3- Mostrar todo el stock");
        System.out.println("   4- Mostrar valor deposito");
        System.out.println("    5- Mostrar productos sin stock");
        System.out.println("     6- Mostrar stock de un producto");
        System.out.println("      7- Mostrar stock de productos con <15 unidades");
        System.out.println("       0- exit");

        //faltan mejoras del UI
        while (true){
            int input = scanner.nextInt();
            if (input == 0){
                break;
            }

            else if (input == 1){
                System.out.println("\n Ingrese nombre, cantidad y precio del producto");
                String nombre = nombreProducto.nextLine();
                int cantidad = cantidadProducto.nextInt();
                float precio = precioProducto.nextFloat();
                Producto producto = new Producto(nombre, cantidad, precio);
                deposito.agregarActualizarProducto(producto);
            }

            else if (input == 2){
                System.out.println("\n Ingrese el nombre y cantidad del producto a descontar");
                String nombre = nombreProducto.nextLine();
                int cantidad = cantidadProducto.nextInt();
                deposito.descontarStockProducto(nombre, cantidad);
            }

            else if (input == 3){
                deposito.printStock();
            }

            else if (input == 4){
                deposito.printValorStock();
            }

            else if (input == 5){
                deposito.printProductosSinStock();
            }

            else if (input == 6){
                System.out.println("\n Ingrese el nombre del producto que quiere revisar");
                String nombre = nombreProducto.nextLine();
                deposito.printStockProducto(nombre);
            }

            else if (input == 7){
                deposito.printProductosConStockMenorAquince();
            }

            else if (input == 8){
                deposito.printPrecioProductos();
            }

            else {
                System.out.println("error");
            }
        }
    }
}
