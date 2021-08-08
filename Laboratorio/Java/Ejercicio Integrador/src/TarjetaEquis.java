import java.util.ArrayList;

public class TarjetaEquis {
    private float saldo;
    private float saldoNegativoMaximo;
    private int numeroId;
    private ArrayList <Viaje> viajes;

    public TarjetaEquis(int numeroId, float saldoNegativoMaximo)
    {
        this.saldo = 0;
        this.numeroId = numeroId;
        this.saldoNegativoMaximo = saldoNegativoMaximo;
        this.viajes = new ArrayList<Viaje>();
    }

    public boolean seSuperaElSaldoNegativo(Viaje viaje)
    {
        if (this.saldo - viaje.getPrecio() < this.saldoNegativoMaximo) {
            return true;
        }

        else return false;
    }

    public float getSaldo()
    {
        return saldo;
    }
    public ArrayList<Viaje> getViajes()
    {
        return viajes;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }
}
