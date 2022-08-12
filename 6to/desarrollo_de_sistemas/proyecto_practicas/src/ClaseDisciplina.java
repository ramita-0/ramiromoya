import java.time.LocalDateTime;

public class ClaseDisciplina {
    private Disciplina disciplina;
    private LocalDateTime fechaHora;

    public ClaseDisciplina(Disciplina disciplina, LocalDateTime fechaHora) {
        this.disciplina = disciplina;
        this.fechaHora = fechaHora;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
