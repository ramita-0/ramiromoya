import java.util.Date;

public abstract class Empleado extends Persona {

    public Empleado(int id, String nombre, String apellido, int dni, String direccion, String telefono, Date fechaNacimiento, String mail) {
        super(id, nombre, apellido, dni, direccion, telefono, fechaNacimiento, mail);
    }
}
