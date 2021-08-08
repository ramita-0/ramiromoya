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
}
