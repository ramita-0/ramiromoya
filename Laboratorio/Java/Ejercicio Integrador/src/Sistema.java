import java.util.ArrayList;

public class Sistema {
    private ArrayList<Pasajero> pasajerosPresentes;
    private ArrayList<Pasajero> historialPasajeros;
    public int linea;

    public Sistema(int linea){
        this.pasajerosPresentes = new ArrayList<Pasajero>();
        this.historialPasajeros = new ArrayList<Pasajero>();
        this.linea = linea;
    }

    public void subePasajero(Pasajero pasajero){
        this.pasajerosPresentes.add(pasajero);
        this.historialPasajeros.add(pasajero);
    }

    public void seBajaPasajero(Pasajero pasajero){
        this.pasajerosPresentes.removeIf(pasajeroActual -> pasajeroActual.equals(pasajero));
    }

    public void pasajerosQueSeHanSubidoAlgunaVez(){
        this.historialPasajeros.add(pasajero);
    }
}
