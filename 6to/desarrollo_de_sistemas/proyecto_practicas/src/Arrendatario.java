public class Arrendatario extends Persona {
    // chequear estos atributos
    private String razonSocial;
    private String actividad;
    private String precioActividad;
    private int cantidadAlumnos;

    public Arrendatario(String nombre, String apellido, int dni, String razonSocial, String actividad, String precioActividad, int cantidadAlumnos) {
        super(nombre, apellido, dni);
        this.razonSocial = razonSocial; // puede ser null, si es que usamos este atributo al final
        this.actividad = actividad;
        this.precioActividad = precioActividad;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public Arrendatario(String nombre, String apellido, int dni, String actividad, String precioActividad, int cantidadAlumnos) {
        super(nombre, apellido, dni);
        this.razonSocial = null;
        this.actividad = actividad;
        this.precioActividad = precioActividad;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getPrecioActividad() {
        return precioActividad;
    }

    public void setPrecioActividad(String precioActividad) {
        this.precioActividad = precioActividad;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public void agregarAlumno(int cantidad) {
        this.cantidadAlumnos += cantidad;
    }

    public void descontarAlumno(int cantidad) {
        this.cantidadAlumnos -= cantidad;
    }
}
