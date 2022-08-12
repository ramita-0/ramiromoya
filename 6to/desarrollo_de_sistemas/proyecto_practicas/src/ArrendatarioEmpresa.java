public class ArrendatarioEmpresa extends Arrendatario {
    private String nombreEmpresa;
    private String razonSocial;

    public ArrendatarioEmpresa(int id, String actividad, float precioACobrar, String telefono, String mail, String nombreEmpresa, String razonSocial) {
        super(id, actividad, precioACobrar, telefono, mail);
        this.nombreEmpresa = nombreEmpresa;
        this.razonSocial = razonSocial;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
