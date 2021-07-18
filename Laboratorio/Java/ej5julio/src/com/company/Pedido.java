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

    public Plato getPlato() {
        return plato;
    }
    public Persona getPersona() {
        return persona;
    }
    public String getFechaCreacionPedido() {
        return fechaCreacionPedido;
    }
    public boolean getEntregado(){
        return entregado;
    }
    public String getHoraEntrega() {
        return horaEntrega;
    }
}
