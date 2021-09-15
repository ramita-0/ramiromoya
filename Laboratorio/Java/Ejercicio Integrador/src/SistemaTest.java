import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {

    @org.junit.jupiter.api.Test
    public void realizarViaje() {
    }

    @org.junit.jupiter.api.Test
    public void subePasajero() {
        TarjetaEquis sube = new TarjetaEquis(1, -30);
        Pasajero p = new Pasajero("x", "x", sube);
        Viaje v = new Viaje("2/3/21", "12:03", 21);
        Sistema linea12 = new Sistema(11);

        linea12.subePasajero(p, v, linea12);

    }

    @org.junit.jupiter.api.Test
    public void bajaPasajero() {
    }

    @org.junit.jupiter.api.Test
    public void printHistorial() {
    }

    @org.junit.jupiter.api.Test
    public void getHistorial() {
    }

    @org.junit.jupiter.api.Test
    public void getPasajerosPresentes() {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void testRealizarViaje() {
    }

    @org.junit.jupiter.api.Test
    public void testSubePasajero() {
    }

    @org.junit.jupiter.api.Test
    public void testBajaPasajero() {
    }

    @org.junit.jupiter.api.Test
    public void testPrintHistorial() {
    }

    @org.junit.jupiter.api.Test
    public void testGetHistorial() {
    }

    @org.junit.jupiter.api.Test
    public void testGetPasajerosPresentes() {
    }

    @Test
    public void testRealizarViaje1() {
    }

    @Test
    public void testSubePasajero1() {
    }

    @Test
    public void testBajaPasajero1() {
    }

    @Test
    public void testPrintHistorial1() {
    }

    @Test
    public void testGetHistorial1() {
    }

    @Test
    public void testGetPasajerosPresentes1() {
    }
}