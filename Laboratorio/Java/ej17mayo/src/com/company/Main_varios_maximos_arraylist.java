package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_varios_maximos_arraylist {

    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        ArrayList<Libro>libros = new ArrayList<Libro>();
        System.out.println("///// Bienvienido al Sistema de la Libreria ///// ");
        System.out.println("\n Referencia para las editoriales:\n 1-Kapelusz | 2- Sudamericana | 3- Atlantida | 4-ElAteneo | 5-Interzona | 6-Sur y Alianza");
        while(true){

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
                int uno = 0;
                int dos = 0;
                int tres = 0;
                int cuatro = 0;
                int cinco = 0;
                int seis = 0;
                for (int i = 0; i<libros.size(); i++){
                    if (libros.get(i).getEditorial() == 1) uno++;
                    else if (libros.get(i).getEditorial() == 2) dos++;
                    else if (libros.get(i).getEditorial() == 3) tres++;
                    else if (libros.get(i).getEditorial() == 4) cuatro++;  //ventas de cada editorial
                    else if (libros.get(i).getEditorial() == 5) cinco++;
                    else if (libros.get(i).getEditorial() == 6) seis++;
                }
                ArrayList<Integer>ventas = new ArrayList<Integer>();
                ventas.add(uno);
                ventas.add(dos);
                ventas.add(tres);
                ventas.add(cuatro);
                ventas.add(cinco);
                ventas.add(seis);
                int mayor = ventas.get(0);
                for (int i = 0; i<ventas.size(); i++){
                    if (ventas.get(i) > mayor){
                        mayor = ventas.get(i);
                    }
                }
                //en caso de igualdad de ventas
                ArrayList<Integer>comparacioniguales = new ArrayList<Integer>();
                for (int i = 0; i<ventas.size(); i++){
                    if (mayor == ventas.get(i)){
                        comparacioniguales.add(i+1);
                    }
                }
                System.out.println("Ventas por editorial: \n Kapelusz: " + uno + "\n Sudamericana: " + dos + "\n Atlantida: " + tres + "\n ElAteneo: " + cuatro + "\n Interzona: " + cinco + "\n Sur y Alianza: " + seis);
                System.out.println("\nEditorial/es con mayores ventas en el dia: ");
                for (int i = 0; i<comparacioniguales.size(); i++){
                    if (comparacioniguales.get(i) == 1) System.out.println("   -Kapelusz");
                    else if (comparacioniguales.get(i) == 2) System.out.println("   -Sudamericana");
                    else if (comparacioniguales.get(i) == 3) System.out.println("   -Atlantida");
                    else if (comparacioniguales.get(i) == 4) System.out.println("   -ElAteneo");
                    else if (comparacioniguales.get(i) == 5) System.out.println("   -Interzona");
                    else if (comparacioniguales.get(i) == 6) System.out.println("   -Sur y Alianza");
                }
                break;
            }
            else System.out.println("error");
        }
    }
}
