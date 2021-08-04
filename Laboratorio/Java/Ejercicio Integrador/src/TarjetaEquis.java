import java.util.ArrayList;

public class TarjetaEquis {
    private float saldo;
    private float ultimoMontoAbonado;
    private float saldoNegativoMaximo;
    private int numeroId;
    private ArrayList <Viaje> viajes;

    public TarjetaEquis(int numeroId, float saldoNegativoMaximo){
        this.saldo = 0;
        this.numeroId = numeroId;
        this.saldoNegativoMaximo = saldoNegativoMaximo;
        this.viajes = new ArrayList<Viaje>();
    }

    public void cargarTarjeta(float monto){
        this.saldo += monto;
    }

    public void realizarViaje(Viaje viaje){
        this.viajes.add(viaje);
    }

    public float ultimoMontoAbonado(float monto){
        this.ultimoMontoAbonado = monto;
    }
}
