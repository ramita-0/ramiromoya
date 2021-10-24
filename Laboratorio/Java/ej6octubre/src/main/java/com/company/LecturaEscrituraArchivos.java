package com.company;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class LecturaEscrituraArchivos {


    public static void escrituraArchivo(AccesoBaseDeDatos base){

        File archivo = new File("src/main/java/com/company/ejemplo.txt");

        try{

            FileWriter archivoAEscribir = new FileWriter(archivo);
            BufferedWriter escritura = new BufferedWriter(archivoAEscribir);

            escritura.write(base.getDatos(base.seleccionarTodo()));
            escritura.close();
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void lecturaArchivo(){
        File archivo = new File("src/main/java/com/company/ejemplo.txt");

        try{

            FileReader archivoALeer = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(archivoALeer);
            String linea = lectura.readLine();

            while(linea != null){

                System.out.println(linea);
                linea = lectura.readLine();
            }
            lectura.close();
        }

        catch (IOException io){
            io.printStackTrace();
        }
    }
}
