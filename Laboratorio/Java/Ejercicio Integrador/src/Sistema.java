import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
    private ArrayList<Pasajero> pasajerosPresentes;
    private ArrayList<Pasajero> historialPasajeros;
    public int linea;

    public Sistema(int linea)
    {
        this.pasajerosPresentes = new ArrayList<Pasajero>();
        this.historialPasajeros = new ArrayList<Pasajero>();
        this.linea = linea;
    }

    public boolean realizarViaje(Viaje viaje, Pasajero pasajero)
    {
        System.out.println("Costo del viaje: " + viaje.getPrecio() + "$");

        if (pasajero.getTarjeta().seSuperaElSaldoNegativo(viaje)){
            System.out.println("Saldo insuficiente");
            return false;
        }

        else {
            float nuevoSaldo = pasajero.getTarjeta().getSaldo() - viaje.getPrecio();
            pasajero.getTarjeta().setSaldo(nuevoSaldo);
            System.out.println("\nBienvenido!");
            System.out.println("Saldo restante: " + pasajero.getSaldoTarjeta());
            return true;
        }
    }

    public void subePasajero(Pasajero pasajero, Viaje viaje, Sistema linea)
    {
        if (realizarViaje(viaje, pasajero)){
            linea.pasajerosPresentes.add(pasajero);
            pasajero.getTarjeta().getViajes().add(viaje);
            linea.historialPasajeros.add(pasajero);
        }
    }

    public void bajaPasajero(Pasajero pasajero)
    {
        this.pasajerosPresentes.removeIf(pasajeroActual -> pasajeroActual.equals(pasajero));
    }

    public void printHistorial()
    {
        System.out.println(getHistorialPasajeros());
    }

    public ArrayList<Pasajero> getHistorialPasajeros() {
        return historialPasajeros;
    }

    public ArrayList<Pasajero> getPasajerosPresentes()
    {
        return pasajerosPresentes;
    }
}
