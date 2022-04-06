package com.company;

public class Pedido {
    private Plato plato;
    private Persona persona;
    private String fechaCreacionPedido;
    private boolean entregado;
    private String horaEntrega;

    public Pedido(Plato plato, Persona persona, String fechaCreacionPedido, String horaEntrega){
        this.plato = plato;
        this.persona = persona;
        this.fechaCreacionPedido = fechaCreacionPedido;
        this.horaEntrega = horaEntrega;
        this.entregado = false;
    }


    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }


    public Plato getPlato() {
        return plato;
    }
    public Persona getPersona() {
        return persona;
    }
    public boolean getEntregado(){
        return entregado;
    }
    public String getHoraEntrega() {
        return horaEntrega;
    }
}
