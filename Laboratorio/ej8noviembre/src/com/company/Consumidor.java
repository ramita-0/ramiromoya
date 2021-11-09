package com.company;

import java.util.HashMap;

public class Consumidor {

    HashMap<Bebida, Integer> bebidasConsumidas;

    public Consumidor(){
        this.bebidasConsumidas = new HashMap<>();
    }

    public void consumir(Bebida bebida){

        if (this.bebidasConsumidas.containsKey(bebida)){
            //contiene bebida
            this.bebidasConsumidas.put(bebida, this.bebidasConsumidas.get(bebida) + 1);
        }
        else{
            //no contiene bebida
            this.bebidasConsumidas.put(bebida, 1);
        }
    }








    public HashMap<Bebida, Integer> getBebidasConsumidas() {
        return bebidasConsumidas;
    }

    public void setBebidasConsumidas(HashMap<Bebida, Integer> bebidasConsumidas) {
        this.bebidasConsumidas = bebidasConsumidas;
    }
}
