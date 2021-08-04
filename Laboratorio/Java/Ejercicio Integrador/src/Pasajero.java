public class Pasajero {
    private String nombre;
    private String apellido;
    private TarjetaEquis tarjeta;

    public Pasajero(String nombre, String apellido, TarjetaEquis tarjeta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
    }

    public float getSaldoTarjeta(){
        return this.tarjeta.getSaldo();
    }

    public void cargarTarjeta(float monto){
        float nuevoSaldo = this.tarjeta.getSaldo() + monto;
        this.tarjeta.setSaldo(nuevoSaldo);
    }

    public TarjetaEquis getTarjeta() {
        return tarjeta;
    }
}
