package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAlimenticioTest {

    // no se por que me da error el testing, creo que debe haber un problema con la libreria de JUnit
    // pero el codigo creo que esta correcto

    @Test
    void calcularPrecioFinal() {
        ProductoDeSuper p1 = new ProductoPerecedero("asd","china",123,23,6,3,5);

        // nunca deberia ser 0 el descuento ya que todos los objetos creados tendrian una constante de descuento, pero como lo hice mal
        // contemplo esta situacion :)
        float costo = p1.getCosto();
        float precioFinal = p1.calcularPrecioFinal();

        assertTrue(precioFinal > costo);
        //si el descuento pudiese ser de 0 este testing daria problemas
        assertFalse(precioFinal <= p1.getCosto());
    }
}