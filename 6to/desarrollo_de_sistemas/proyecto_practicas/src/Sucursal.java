import java.util.ArrayList;

public class Sucursal {
    private int id;
    private String direccion;
    private ArrayList<Personal> personalArrayList;
    private ArrayList<Profesor> profesores;
    private ArrayList<Disciplina> disciplinas;

    public Sucursal(String direccion) {
        this.direccion = direccion;
        this.personalArrayList = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (club.getDisciplinas().contains(disciplina)) {
            this.disciplinas.add(disciplina);
            return;
        }
        club.agregarDisciplina(disciplina);
        this.disciplinas.add(disciplina);
    }

}
