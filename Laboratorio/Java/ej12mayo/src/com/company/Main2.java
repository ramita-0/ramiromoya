package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<Float> numeros = new ArrayList<Float>();
        ArrayList<Float> numeros2 = new ArrayList<Float>();
        HashSet<Float> setNumeros1 = new HashSet<>();
        HashSet<Float> setNumeros2 = new HashSet<>();
        boolean check = true;

        System.out.println("Ingrese numeros para su primer Array, x para terminar\n");
        while (true){
            if (scanner.hasNextFloat()){
                numeros.add(scanner.nextFloat());
            }
            else if (scanner.hasNext()){
                String x = scanner.nextLine();
                if (x.equals("x")){
                    break;
                }
                else{
                    System.out.println("error");
                }
            }
        }
        for (float num : numeros){
            setNumeros1.add(num);
        }

        System.out.println("Ingrese numeros para su segundo Array, x para terminar\n");
        while (true){
            if (scanner2.hasNextFloat()){
                numeros2.add(scanner2.nextFloat());
            }
            else if (scanner2.hasNext()){
                String x = scanner2.nextLine();
                if (x.equals("x")){
                    break;
                }
                else{
                    System.out.println("error");
                }
            }
        }
        for (float num : numeros2){
            setNumeros2.add(num);
        }

        for (float num : setNumeros1){
            if (!setNumeros2.contains(num)){
                check = false;
            }
        }
        for (float num : setNumeros2){
            if (!setNumeros1.contains(num)){
                check = false;
            }
        }

        if (check == false){
            System.out.println("No contienen los mismos numeros");
        }
        else {
            System.out.println("Contienen los mismos numeros");
        }
    }
}