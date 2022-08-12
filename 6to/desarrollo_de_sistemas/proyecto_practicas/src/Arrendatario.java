public abstract class Arrendatario {
    private int id;
    private String actividad;
    private float precioACobrar;
    private String telefono;
    private String mail;

    public Arrendatario(int id, String actividad, float precioACobrar, String telefono, String mail) {
        this.id = id;
        this.actividad = actividad;
        this.precioACobrar = precioACobrar;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public float getPrecioACobrar() {
        return precioACobrar;
    }

    public void setPrecioACobrar(float precioACobrar) {
        this.precioACobrar = precioACobrar;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
