import java.time.LocalDate;
import java.util.Date;

public class Profesor extends Empleado {
    // todo este atributo se repite
    private LocalDate fechaVencimientoCertificadoMedico;

    public Profesor(int id, String nombre, String apellido, int dni, String direccion, String telefono, Date fechaNacimiento, String mail, LocalDate fechaVencimientoCertificadoMedico) {
        super(id, nombre, apellido, dni, direccion, telefono, fechaNacimiento, mail);
        this.fechaVencimientoCertificadoMedico = fechaVencimientoCertificadoMedico;
    }

    public LocalDate getFechaVencimientoCertificadoMedico() {
        return fechaVencimientoCertificadoMedico;
    }

    public void setFechaVencimientoCertificadoMedico(LocalDate fechaVencimientoCertificadoMedico) {
        this.fechaVencimientoCertificadoMedico = fechaVencimientoCertificadoMedico;
    }

    //todo esta funcion se repite
    public boolean checkVencimientoCertificadoMedico() {
        if (this.fechaVencimientoCertificadoMedico.isBefore(LocalDate.now())) return true;
        return false;
    }
}
