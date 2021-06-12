package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> numeros = new ArrayList<Float>();
        System.out.println("Ingrese numeros, x para salir\n");
        while (true){
            if (scanner.hasNextFloat()){
                numeros.add(scanner.nextFloat());
            }
            else if (scanner.hasNext()){
                String x = scanner.nextLine();
                if (x.equals("x")){
                    System.out.println(numeros);
                    break;
                }
                else{
                    System.out.println("error");
                }
            }
        }
        HashSet<Float>setNumeros = new HashSet<>();
        for (int i=0; i<numeros.size(); i++){
            setNumeros.add(numeros.get(i));
        }
        System.out.println(setNumeros);
    }
}

