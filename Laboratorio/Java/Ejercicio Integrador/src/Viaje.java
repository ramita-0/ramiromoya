public class Viaje {
    private String fecha;
    private String hora;
    private float precio;

    public Viaje(String fecha, String hora, float precio){
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
}

