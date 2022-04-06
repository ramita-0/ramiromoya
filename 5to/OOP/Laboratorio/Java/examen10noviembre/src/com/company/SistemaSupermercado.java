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

                //ej de serializado
                serializarObjeto(producto);

                //ej de deserializado
                deserializarObjeto(serializarObjeto(producto));
            }
        }
    }

    //falta importar las librerias de jackson
    public static String serializarObjeto(ProductoDeSuper producto){

        ObjectMapper mapper = new ObjectMapper();

        HashMap<String,Object> mapASerializar = new HashMap<>();
        mapASerializar.put("productos vendidos", producto);

        String objetoJSON = null;

        try {
            objetoJSON = mapper.writeValueAsString(mapASerializar);

        }catch (com.fasterxml.jackson.core.JsonProcessingException e){
            e.printStackTrace();
        }

        System.out.println(objetoJSON);
        return objetoJSON;
    }

    //falta importar las librerias de jackson
    public static Object deserializarObjeto(String objetoJSON){
        ObjectMapper mapper = new ObjectMapper();
        HashMap objeto = null;

        try {
            objeto = mapper.readValue(objetoJSON, HashMap.class);

        }catch (com.fasterxml.jackson.core.JsonProcessingException e){
            e.printStackTrace();
        }

        return objeto;
    }

    public HashSet<String> productosAptosParaHipertensos(){
        // plantearia agregar un atributo a esta clase que sea un set de ProductosNoPerecederos asi cuando ingresas un nuevo objeto de tipo NoPerecedero, si cumple
        // con la condicion de mg de sodio se agrega a ese set, siento que esta solucion es media pesada para lo que se podria hacer realmente

        HashSet<String> productosNoPerecederos = new HashSet<>();

        for (ProductoDeSuper productoActual: this.productosALaVenta){
            if (productoActual.getClass().getName().equals("ProductoNoPerecedero")) {
                // casteo el objeto a ProductoNoPerecedero
                ProductoNoPerecedero productoCasteado = (ProductoNoPerecedero) productoActual;
                if (productoCasteado.getMgDeSodio() <= 1500) {
                    productosNoPerecederos.add(productoCasteado.getNombre());
                }
            }
        }
        return productosNoPerecederos;
    }

    public HashMap<Integer,Float> productosRefrigerantesConGranCapacidad(){

        HashMap<Integer,Float> productosRefrigerantesConGranCapacidad = new HashMap<>();
        //capacidad >= 300lts, origen argentino y

        for (ProductoDeSuper productoActual: this.productosALaVenta){
            if (productoActual.getClass().getName().equals("ProductoDeRefrigeracion")){
                ProductoDeRefrigeracion productoCasteado = (ProductoDeRefrigeracion) productoActual;
                if (productoCasteado.getLitrosDeCapacidad() >= 300 && productoCasteado.getOrigen().equals("Argentino")){
                    productosRefrigerantesConGranCapacidad.put(productoCasteado.getCodigo(), productoCasteado.getLitrosDeCapacidad());
                }
            }
        }
        return productosRefrigerantesConGranCapacidad;
    }
}
