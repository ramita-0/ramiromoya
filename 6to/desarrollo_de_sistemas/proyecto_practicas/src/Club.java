import java.util.ArrayList;

public class Club {
    private int id;
    private String nombre;
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Socio> socios;
    private ArrayList<Disciplina> disciplinas;

    public Club(int id, String nombre, ArrayList<Sucursal> sucursales, ArrayList<Socio> socios, ArrayList<Disciplina> disciplinas) {
        this.id = id;
        this.nombre = nombre;
        this.sucursales = sucursales;
        this.socios = socios;
        this.disciplinas = disciplinas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void agregarSucursal(Sucursal sucursal) {
        // checkear que no exista ya
        this.sucursales.add(sucursal);
    }

    public void borrarSucursal(String direccionSucursal) {
        // el metodo si no me equivoco es mas complejo
        this.sucursales.remove(direccionSucursal);
    }

    public void agregarSocio(Socio socio) {
        // checkear que no exista ya, podemos usar un hashset??
        this.socios.add(socio);
    }

    public void eliminarSocio(int dni) {
        // eliminar socio
    }

    public void agregarDisciplina(Disciplina disciplina) {
        // checkear que no exista ya
        this.disciplinas.add(disciplina);
    }
}
