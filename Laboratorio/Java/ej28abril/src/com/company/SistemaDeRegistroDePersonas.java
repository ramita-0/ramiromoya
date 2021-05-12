package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {
    private ArrayList<Persona> personas;
    private Scanner ints;
    private Scanner strings;

    SistemaDeRegistroDePersonas(){
        this.personas = new ArrayList<>();
        this.ints = new Scanner(System.in);
        this.strings = new Scanner(System.in);
    }

    public void iniciarSistema(){
        System.out.println("\n---- Bienvenido al sistema ABM! ----");
        System.out.println("");
        while(true){
            System.out.println("- Ingrese 1 para dar de alta una persona");
            System.out.println("- Ingrese 2 para dar de baja una persona");
            System.out.println("- Ingrese 3 para modificar los datos de una persona");
            System.out.println("- Ingrese 4 para ver las personas mayores de edad en el sistema");
            System.out.println("- Ingrese 5 para ver todas las personas registradas en el sistema");
            System.out.println("- Ingrese 6 para salir del sistema");
            int input = ints.nextInt();
            if (input == 1) this.altaPersona();
            else if (input == 2) this.bajaPersona();
            else if (input == 3) this.modificarPersona();
            else if (input == 4) this.mostrarMayores();
            else if (input == 5) this.listadoPersonas();
            else if (input == 6){
                System.out.println("bye!");
                break;
            }
        }
    }
    public void altaPersona() {
        System.out.println("\nIngrese los datos de la persona en el siguiente orden");
        System.out.println("Nombre, edad, dni, telefono, direccion");
        String nNombre = strings.nextLine();
        int nEdad = ints.nextInt();
        int nDni = ints.nextInt();
        int nTel = ints.nextInt();
        String nDir = strings.nextLine();
        Persona persona = new Persona(nNombre, nEdad, nDni, nTel, nDir);
        this.personas.add(persona);
    }
    public void bajaPersona(){
        System.out.println("\n- Ingrese el DNI de la persona a dar de baja");
        int input = ints.nextInt();
        for (int i = 0; i < personas.size(); i++){
            if (input == this.personas.get(i).getDni()){
                personas.remove(i);
            }
            else System.out.println("No se encontro una persona con dicho DNI");
        }
    }
    public void modificarPersona(){
        String question = "a";
        System.out.println("Ingrese el numero de DNI de la persona que quiere modificar");
        while(true){
            int input = ints.nextInt();
            String stringInput = "a";
            boolean seHicieronCambios = false;
            int posPersona = 0;
            for (int i = 0; i < personas.size(); i++){
                if (input == this.personas.get(i).getDni()){
                    posPersona = i;
                    System.out.println("Ingrese el tipo de dato que quiere modificar (nombre, edad, dni, telefono, direccion)");
                    System.out.println("    -Una vez que quiera dejar de modificar datos ingrese 'exit'");
                    while(true){
                        stringInput = strings.nextLine();
                        if (stringInput.equals("nombre")){
                            this.personas.get(posPersona).setNombre(strings.nextLine());
                            seHicieronCambios = true;
                        }
                        else if (stringInput.equals("edad")){
                            this.personas.get(posPersona).setEdad(ints.nextInt());
                            seHicieronCambios = true;
                        }
                        else if (stringInput.equals("dni")){
                            this.personas.get(posPersona).setDni(ints.nextInt());
                            seHicieronCambios = true;
                        }
                        else if (stringInput.equals("telefono")){
                            this.personas.get(posPersona).setTel(ints.nextInt());
                            seHicieronCambios = true;
                        }
                        else if (stringInput.equals("direccion")){
                            this.personas.get(posPersona).setDir(strings.nextLine());
                            seHicieronCambios = true;
                        }
                        else if (stringInput.equals("exit")){
                            System.out.println("Saliendo de la modificacion de datos...");
                            seHicieronCambios = true;
                            i = personas.size();
                            break;

                        }
                        else System.out.println("Dato incorrecto!");
                    }
                }
                else{
                    System.out.println("No se encontro una persona con dicho DNI");
                    System.out.println("Buscar otro DNI? y/n");
                    while(true){
                        question = strings.nextLine();
                        if (question.equals("y")){
                            System.out.println("Ingrese otro DNI");
                            break;
                        }
                        else if (question.equals("n")) break;
                        else System.out.println("Respuesta incorrecta");
                    }
                }
            }
            if (question.equals("n") || seHicieronCambios == true) break;
        }
    }
    public void mostrarMayores(){
        for (int i=0; i<personas.size(); i++){
            if (personas.get(i).getEdad() >= 18){
                System.out.println("");
                System.out.println("    *" + personas.get(i).getNombre());
            }
        }
    }
    public void listadoPersonas(){
        for (int i=0; i<personas.size(); i++){
            System.out.println("");
            System.out.println("    *Nombre: " + personas.get(i).getNombre());
            System.out.println("        -Edad: " + personas.get(i).getEdad());
            System.out.println("        -DNI: " + personas.get(i).getDni());
            System.out.println("        -Telefono: " + personas.get(i).getTel());
            System.out.println("        -Direccion: " + personas.get(i).getDir());
        }
        System.out.println("");
    }
}
