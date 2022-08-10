import java.util.ArrayList;

public class Sucursal {
    // todo definir la utilizacion del nombre
    private String nombre;
    private String direccion;
    private ArrayList<Personal> personalArrayList;
    private ArrayList<Profesor> profesores;
    private ArrayList<Disciplina> disciplinas;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.personalArrayList = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Personal> getPersonalArrayList() {
        return personalArrayList;
    }

    public void setPersonalArrayList(ArrayList<Personal> personalArrayList) {
        this.personalArrayList = personalArrayList;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    // estan bien estos metodos? o con los seters alcanza? es medio incomodo con los seters ya que labura con arrays directamente.
    public void agregarPersonal(Personal personal) {
        // check que no este ya anadido
        this.personalArrayList.add(personal);
    }

    public void eliminarPersonal(Personal personal) {
        // el metodo seguro es mas complejo
        this.personalArrayList.remove(personal);
    }

    public void agregarProfesor(Profesor profesor) {
        // check que no este ya anadido
        this.profesores.add(profesor);
    }

    public void eliminarProfesor(Profesor profesor) {
        // el metodo seguro es mas complejo
        this.profesores.remove(profesor);
    }

    public void agregarDisciplina(Club club, Disciplina disciplina) {
        // todo definir si lo haremos de esta manera
        if (club.getDisciplinas().contains(disciplina)) {
            this.disciplinas.add(disciplina);
            return;
        }
        club.agregarDisciplina(disciplina);
        this.disciplinas.add(disciplina);
    }
}
