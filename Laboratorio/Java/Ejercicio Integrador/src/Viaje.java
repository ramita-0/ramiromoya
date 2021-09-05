public class Viaje {
    private String fecha;
    private String hora;
    private float precio;

    public Viaje(String fecha, String hora, float precio)
    {
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }
    public float getPrecio()
    {
        return precio;
    }
    public String getHora() {
        return hora;
    }

    @Override
    public String toString(){
        String string = ("hora: " + this.hora + " | fecha: " + this.fecha + " | precio: " + this.precio);
        return string;
    }
}

