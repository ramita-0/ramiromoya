import java.util.ArrayList;

public class Profesor extends Persona {
    // todo el profesor puede estar en varias disciplinas? si es asi, no le debe de corresponder una sucursal al profesor?
    // ya que si la disciplina es del club, no se si podes saber de cual sucursal es el profesor.
    // chequear esto
    private ArrayList<Disciplina> disciplinas;

    public Profesor(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.disciplinas = new ArrayList<>();
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void agregarDisciplina(Disciplina disciplina) {
        // chequear que no la tenga ya agregada
        this.disciplinas.add(disciplina);
    }
}
