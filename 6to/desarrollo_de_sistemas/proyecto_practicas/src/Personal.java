import java.util.ArrayList;
import java.util.Date;

public class Personal extends Empleado {
    // todo elegir bien el nombre de la variable de los trabajos que realiza en el lugar
    private ArrayList<String> laburos;

    public Personal(int id, String nombre, String apellido, int dni, String direccion, String telefono, Date fechaNacimiento, String mail, ArrayList<String> laburos) {
        super(id, nombre, apellido, dni, direccion, telefono, fechaNacimiento, mail);
        this.laburos = laburos;
    }

    public ArrayList<String> getLaburos() {
        return laburos;
    }

    public void setLaburos(ArrayList<String> laburos) {
        this.laburos = laburos;
    }

    public void agregarLaburo(String laburo) {
        this.laburos.add(laburo);
    }
}
