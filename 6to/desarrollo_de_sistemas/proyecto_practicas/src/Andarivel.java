import java.util.ArrayList;

public class Andarivel {
    private int numero;
    private ClaseDisciplina clase;

    public Andarivel(int numero, ClaseDisciplina clase) {
        this.numero = numero;
        this.clase = clase;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ClaseDisciplina getClase() {
        return clase;
    }

    public void setClase(ClaseDisciplina clase) {
        this.clase = clase;
    }
}
