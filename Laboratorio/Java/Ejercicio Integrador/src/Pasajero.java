import java.util.ArrayList;

public class Pasajero {
    private String nombre;
    private String apellido;
    private TarjetaEquis tarjeta;

    public Pasajero(String nombre, String apellido, TarjetaEquis tarjeta)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
    }

    public void cargarTarjeta(float monto)
    {
        float nuevoSaldo = this.tarjeta.getSaldo() + monto;
        this.tarjeta.setSaldo(nuevoSaldo);
    }

    public float ultimoMontoAbonadoPorPasajero()
    {
        ArrayList<Viaje> viajes = this.tarjeta.getViajes();
        Viaje ultimoViaje = viajes.get(viajes.size() - 1);
        float monto = ultimoViaje.getPrecio();
        return monto;
    }

    public TarjetaEquis getTarjeta()
    {
        return tarjeta;
    }
    public float getSaldoTarjeta()
    {
        return this.tarjeta.getSaldo();
    }

    public String toString(){
        String strings = "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\n\nViajes realizados:";

        for (Viaje viaje : this.getTarjeta().getViajes()){
            // faltaria implementacion de un buen funcionamiento del getSaldo
            String string = ("hora: " + viaje.getHora() + " | fecha: " + viaje.getFecha() + " | precio: " + viaje.getPrecio() + " | saldo: " + this.tarjeta.getSaldo());
            strings = strings + "\n" + string;
        }
        return strings;
    }
}
