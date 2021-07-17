package com.company;

public class Pedido {
    private String nombrePlato;
    private String cliente;
    private String fechaCreacionPedido;
    private boolean entregado;
    private String horaEntrega;

    public Pedido(String nombrePlato, String cliente, String fechaCreacionPedido, String horaEntrega){
        this.nombrePlato = nombrePlato;
        this.cliente = cliente;
        this.fechaCreacionPedido = fechaCreacionPedido;
        this.horaEntrega = horaEntrega;
        this.entregado = false;
    }
}
