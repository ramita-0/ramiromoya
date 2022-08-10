import java.util.ArrayList;

// todo hacer toda la parte de pagos y deudas

public class Club {
    private String nombre;
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Socio> socios;
    private ArrayList<Disciplina> disciplinas;
    // todo definir los arrays de Personas en club
    // creo que deberia tener tambien a los profesores o solo un array de Persona, ya que si elimino una sucursal pierdo
    // todos los datos de los profesores, o no?

    public Club(String nombre) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
        this.socios = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
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

    public void borrarSucursal(Sucursal sucursal) {
        // el metodo si no me equivoco es mas complejo
        this.sucursales.remove(sucursal);
    }

    public void agregarSocio(Socio socio) {
        // checkear que no exista ya
        this.socios.add(socio);
    }

    public void agregarDisciplina(Disciplina disciplina) {
        // checkear que no exista ya
        this.disciplinas.add(disciplina);
    }
}
