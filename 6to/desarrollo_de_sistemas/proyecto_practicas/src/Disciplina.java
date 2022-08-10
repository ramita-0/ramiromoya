import java.util.ArrayList;

// todo definir si hacemos la herencia de pileta o la hacemos aparte

public class Disciplina {
    private String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Profesor> profesores;

    public Disciplina(String nombre) {
        this.nombre = nombre;
        this.socios = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void agregarSocio(Socio socio) {
        // checkear que no exista ya
        this.socios.add(socio);
    }

    public void agregarProfesor(Profesor profesor) {
        // checkear que no exista ya
        this.profesores.add(profesor);
    }

    public void eliminarProfesor(Profesor profesor) {
        // el metodo seguro es mas complejo
        this.profesores.remove(profesor);
    }
}
