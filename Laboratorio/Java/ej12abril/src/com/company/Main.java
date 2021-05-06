package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int edad;
        int dni;
        int telefono;
        String direccion;

        System.out.println("Ingrese un nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese una edad");
        edad = scanner.nextInt();
        System.out.println("Ingrese un DNI");
        dni = scanner.nextInt();
        System.out.println("Ingrese un telefono");
        telefono = scanner.nextInt();
        System.out.println("Ingrese una direccion");
        //por algun motivo si no duplico la linea 24 no anda (?)
        direccion = scanner.nextLine();
        direccion = scanner.nextLine();

        Persona p1 = new Persona (nombre, edad, dni, telefono, direccion);

        System.out.println("Datos actuales! \n");
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println(p1.getDni());
        System.out.println(p1.getTelefono());
        System.out.println(p1.getDireccion());
        System.out.println("\n Quiere cambiar un dato? Si es asi, ingrese 'v', de lo contrario ingrese 'f'");
        String respuesta = scanner.nextLine();

        if (respuesta.equals("v")) {
            System.out.printf("Que quiere modificar? \n");
            respuesta = scanner.nextLine();
            if (respuesta.equals("nombre")){
                System.out.println("Ingrese un nuevo nombre \n");
                p1.setNombre(scanner.nextLine());
            }
            else if (respuesta.equals("edad")){
                System.out.println("Ingrese una nueva edad \n");
                p1.setEdad(scanner.nextInt());
            }
            else if (respuesta.equals("dni")){
                System.out.println("Ingrese un nuevo dni \n");
                p1.setDni(scanner.nextInt());
            }
            else if (respuesta.equals("telefono")){
                System.out.println("Ingrese un nuevo telefono \n");
                p1.setTelefono(scanner.nextInt());
            }
            else if (respuesta.equals("direccion")){
                System.out.println("Ingrese una nueva direccion \n");
                p1.setDireccion(scanner.nextLine());
            }
            System.out.println("\n Datos actuales! \n");
            System.out.println(p1.getNombre());
            System.out.println(p1.getEdad());
            System.out.println(p1.getDni());
            System.out.println(p1.getTelefono());
            System.out.println(p1.getDireccion());
        }
    }
}
