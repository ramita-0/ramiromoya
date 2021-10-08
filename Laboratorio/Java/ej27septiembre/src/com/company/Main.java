package com.company;

public class Main {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Producto p = new Producto(0, "Fideos Marolio", 67, 34);
        Producto p1 = new Producto(1, "Fideos Vicente", 82, 56);
        System.out.println(p.precioConDescuento());

    }
}
