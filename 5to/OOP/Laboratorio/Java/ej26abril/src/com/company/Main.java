package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        float precioParcial = 0;
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerFloat = new Scanner(System.in);
        ArrayList<String> nombreProductos = new ArrayList<String>();
        ArrayList<Float> precioProductos = new ArrayList<Float>();
        IniciarSistema sistema = new IniciarSistema();
        Producto producto = new Producto();
        float subtotal = 0;
        while (true){
            sistema.texto();
            float input = scannerFloat.nextFloat();
            if (input == 1){
                sistema.registrarProducto();
                nombreProductos.add(scannerString.nextLine());
                precioProductos.add(scannerFloat.nextFloat());
            }
            else if (input == 2){
                for (int i = 0; i < nombreProductos.size(); i++){
                    subtotal += precioProductos.get(i);
                    System.out.println(nombreProductos.get(i) + " $" + precioProductos.get(i));
                }
                System.out.println("SUBTOTAL $" + subtotal);
            }
            else if (input == 3){
                System.out.println("-Total- \n" + "$" + subtotal);
                break;
            }
        }
    }
}