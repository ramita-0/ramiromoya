import java.util.ArrayList;

public class UnidadAdministrativa extends Base {
    private ArrayList<Base> bases;

    public UnidadAdministrativa(String nombre, ArrayList<Base> bases) {
        super(nombre);
        this.bases = bases;
    }

    public ArrayList<Base> getBases() {
        return bases;
    }

    public void setBases(ArrayList<Base> bases) {
        this.bases = bases;
    }

    public void addBase(Base base) {
        this.bases.add(base);
    }

    public String getAllBasesNames() {
        // todo recursivo
        for (Base baseactual:this.bases){
            baseactual.getAllBasesNames();

        }
    }
}
