package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner opcion = new Scanner(System.in);
        Scanner editorialDescuentos = new Scanner(System.in);
        HashSet<Integer> descuentos = new HashSet<>();
        ArrayList<Libro> libros = new ArrayList<Libro>();
        System.out.println("///// Bienvienido al Sistema de la Libreria ///// ");
        System.out.println("\n Referencia para las editoriales:\n 1-Kapelusz | 2- Sudamericana | 3- Atlantida | 4-ElAteneo | 5-Interzona | 6-Sur y Alianza");
        System.out.println("\nIngrese las editoriales con descuento, x para terminar");
        while (true){
            if (editorialDescuentos.hasNextInt()){
                descuentos.add(editorialDescuentos.nextInt());
            }
            else if (editorialDescuentos.hasNext()){
                String x = editorialDescuentos.nextLine();
                if (x.equals("x")){
                    break;
                }
                else{
                    System.out.println("error");
                }
            }
        }
        while (true){

            System.out.println("\n -Se vendio algun libro? y/n    -Ingrese 'h' para ver las referencias!~");
            String yn = opcion.nextLine();
            if (yn.equals("y")) {
                Scanner ingreseNombre = new Scanner(System.in);
                Scanner ingreseEditorial = new Scanner(System.in);
                Scanner ingresePrecio = new Scanner(System.in);
                System.out.println("Ingrese nombre, editorial (usar referencia) y precio del libro");
                String nombre = ingreseNombre.nextLine();
                int editorial = ingreseEditorial.nextInt();
                while(true){
                    if(editorial >=1 && editorial <=6) break;
                    else{
                        System.out.println("No existe esa editorial");
                        editorial = ingreseEditorial.nextInt();
                    }
                }
                float precio = ingresePrecio.nextFloat();
                Libro libro = new Libro(nombre, editorial, precio);
                libros.add(libro);
            }
            else if (yn.equals("h")) System.out.println("\n 1- Kapelusz | 2- Sudamericana | 3- Atlantida | 4- ElAteneo | 5- Interzona | 6- Sur y Alianza");

            else if (yn.equals("n")){
                ArrayList<String> array = new ArrayList<>();
                array.add("Kapelusz");
                array.add("Sudamericana");
                array.add("Atlantida");
                array.add("ElAteneo");
                array.add("Interzona");
                array.add("Sur y Alianza");
                HashMap<String,Integer> mapaeditoriales = new HashMap<>();
                HashMap<String,Float> mapaeditorialesPrecio = new HashMap<>();
                for (String a : array){
                    mapaeditoriales.put(a,0);
                    mapaeditorialesPrecio.put(a, (float) 0);
                }
                for (Libro libro : libros){
                    int x = libro.getEditorial();
                    float precio = libro.getPrecio();
                    String editorial = array.get(x-1);
                    int y = mapaeditoriales.get(editorial);
                    mapaeditoriales.put(editorial,y+1);
                    mapaeditorialesPrecio.put(editorial,mapaeditorialesPrecio.get(editorial) + precio);
                }
                int maxed = 0;
                for (String editorial : mapaeditoriales.keySet()){
                    int este = mapaeditoriales.get(editorial);
                    if (este > maxed){
                        maxed = este;
                    }
                }

                ArrayList<String> editorialesConMayoresVentas = new ArrayList<>();
                for (String editorial : mapaeditoriales.keySet()){
                    int este = mapaeditoriales.get(editorial);
                    if (maxed == este){
                        editorialesConMayoresVentas.add(editorial);
                    }
                }
                System.out.println(mapaeditoriales);
                for (String a : editorialesConMayoresVentas){
                    System.out.println(a);
                }
                break;
            }
            else System.out.println("error");
        }
    }
}
