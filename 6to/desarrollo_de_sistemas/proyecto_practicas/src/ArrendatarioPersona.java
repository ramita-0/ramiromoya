import java.util.Date;

public class ArrendatarioPersona extends Arrendatario {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private Date fechaNacimiento;

    public ArrendatarioPersona(int id, String actividad, float precioACobrar, String telefono, String mail, String nombre, String apellido, int dni, String direccion, Date fechaNacimiento) {
        super(id, actividad, precioACobrar, telefono, mail);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
