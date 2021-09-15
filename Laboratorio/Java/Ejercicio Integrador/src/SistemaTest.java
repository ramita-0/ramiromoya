import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    TarjetaEquis sube = new TarjetaEquis(0, -30);
    Pasajero p = new Pasajero("a", "b", sube);
    Sistema linea11 = new Sistema(11);
    Viaje viaje = new Viaje("12-2", "12", 40);

    @Test
    public boolean realizarViaje(Viaje viaje, Pasajero pasajero) {
        System.out.println("Costo del viaje: " + viaje.getPrecio() + "$");

        if (p.getTarjeta().seSuperaElSaldoNegativo(viaje)){
            System.out.println("Saldo insuficiente");
            return false;
        }

        else {
            float nuevoSaldo = p.getTarjeta().getSaldo() - viaje.getPrecio();
            p.getTarjeta().setSaldo(nuevoSaldo);
            System.out.println("\nBienvenido!");
            System.out.println("Saldo restante: " + p.getSaldoTarjeta());
            return true;
        }
    }

    @Test
    public void subePasajero() {
        if (realizarViaje(viaje, p)){
            linea11.getPasajerosPresentes().add(p);
            p.getTarjeta().getViajes().add(viaje);
            linea11.getHistorialPasajeros().add(p);
        }

        assertTrue(linea11.getPasajerosPresentes().contains(p));
    }

    @Test
    public void bajaPasajero() {
    }

    @Test
    public void printHistorial() {
    }

    @Test
    public void getHistorial() {
    }

    @Test
    public void getPasajerosPresentes() {
    }
}