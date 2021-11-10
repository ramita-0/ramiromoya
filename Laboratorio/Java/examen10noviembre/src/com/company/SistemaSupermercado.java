package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SistemaSupermercado {

    private String nombre;
    private HashSet<ProductoDeSuper> productosALaVenta;
    private ArrayList<ProductoDeSuper> productosVendidos;

    public SistemaSupermercado(String nombre){
        this.nombre = nombre;
        this.productosALaVenta = new HashSet<>();
        this.productosVendidos = new ArrayList<>();
    }

    public int inputMenu(){
        System.out.println("Que producto ha vendido?\n");
        System.out.println("1- Producto perecedero");
        System.out.println("2- Producto no perecedero");
        System.out.println("3- Producto de calefaccion\n");
        System.out.println("4- Producto de refrigeracion\n");


        Scanner scanner = new Scanner(System.in);
        int input = 0;

        try{
            input = scanner.nextInt();
            if(input >= 1 && input <= 4){

            }
            else{
                System.out.println("opcion incorrecta");
                inputMenu();
            }
        }catch(InputMismatchException e){
            System.out.println("ingrese un numero");
            inputMenu();
        }
        return input;
    }

    public void agregarProductoVendido(){
        int input = inputMenu();

        //creo un scanner por cada tipo porque si mezclo los .next(tipoDeDato) con varios tipos de dato se bugea
        Scanner scannerStrings = new Scanner(System.in);
        Scanner scannerInts = new Scanner(System.in);
        Scanner scannerFloats = new Scanner(System.in);

        switch(input) {
            //creamos objeto ProductoPerecedero
            case 1: {

                //falta hacer un sout preguntando cada dato y hacer una excepcion por si metes algo que no va, no me alcanza el tiempo sino
                String nombre = scannerStrings.nextLine();
                String origen = scannerStrings.nextLine();
                int codigo = scannerInts.nextInt();
                float costo = scannerFloats.nextFloat();
                int cantDiasParaVencerse = scannerInts.nextInt();
                float descuento = scannerFloats.nextFloat();
                float temperaturaMinimaDeFrio = scannerFloats.nextFloat();

                ProductoDeSuper producto = new ProductoPerecedero(nombre, origen, codigo, costo, cantDiasParaVencerse, descuento, temperaturaMinimaDeFrio);
                this.productosVendidos.add(producto);
            }

            //creamos objeto ProductoNoPerecedero
            case 2: {

                //falta hacer un sout preguntando cada dato y hacer una excepcion por si metes algo que no va, no me alcanza el tiempo sino
                String nombre = scannerStrings.nextLine();
                String origen = scannerStrings.nextLine();
                int codigo = scannerInts.nextInt();
                float costo = scannerFloats.nextFloat();
                int cantDiasParaVencerse = scannerInts.nextInt();
                float descuento = scannerFloats.nextFloat();
                float mgDeSodio = scannerFloats.nextFloat();

                ProductoDeSuper producto = new ProductoNoPerecedero(nombre, origen, codigo, costo, cantDiasParaVencerse, descuento, mgDeSodio);
                this.productosVendidos.add(producto);
            }

            //creamos objeto ProductoElectrico
            case 3: {

                //falta hacer un sout preguntando cada dato y hacer una excepcion por si metes algo que no va, no me alcanza el tiempo sino
                String nombre = scannerStrings.nextLine();
                String origen = scannerStrings.nextLine();
                int codigo = scannerInts.nextInt();
                float costo = scannerFloats.nextFloat();
                int cantDiasDeGarantia = scannerInts.nextInt();
                float recargoPorEnvio = scannerFloats.nextFloat();
                float wattsDePotenciaMax = scannerFloats.nextFloat();

                ProductoDeSuper producto = new ProductoDeCalefaccion(nombre, origen, codigo, costo, cantDiasDeGarantia, recargoPorEnvio, wattsDePotenciaMax);
                this.productosVendidos.add(producto);
            }
            case 4: {

                //falta hacer un sout preguntando cada dato y hacer una excepcion por si metes algo que no va, no me alcanza el tiempo sino
                String nombre = scannerStrings.nextLine();
                String origen = scannerStrings.nextLine();
                int codigo = scannerInts.nextInt();
                float costo = scannerFloats.nextFloat();
                int cantDiasDeGarantia = scannerInts.nextInt();
                float recargoPorEnvio = scannerFloats.nextFloat();
                float litrosDeCapacidad = scannerFloats.nextFloat();

                ProductoDeSuper producto = new ProductoDeRefrigeracion(nombre, origen, codigo, costo, cantDiasDeGarantia, recargoPorEnvio, litrosDeCapacidad);
                this.productosVendidos.add(producto);
            }
        }
    }

    //falta importar las librerias de jackson
    public void serializarObjetos(){

        //hago el metodo para serializar todos los vendidos, se podria buscar un objeto en especifico igualmente
        //tendria q hacerlo estatico pero como lo hice no puedo porque tengo q acceder al array del objeto SistemaSuepermercado
        ObjectMapper mapper = new ObjectMapper();

        HashMap<String,Object> mapASerializar = new HashMap<>();
        mapASerializar.put("productos vendidos", this.productosVendidos);

        String objetoJSON = mapper.writeValueAsString(mapASerializar);
        System.out.println(objetoJSON);
    }

}
