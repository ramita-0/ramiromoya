import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nombre;
    private ArrayList<Socio> socios;
    private boolean pileta;
    private ArrayList<Andarivel> andariveles;

    public Disciplina(int id, String nombre, ArrayList<Socio> socios, boolean esPileta, ArrayList<Andarivel> andariveles) {
        this.id = id;
        this.nombre = nombre;
        this.socios = socios;
        this.pileta = esPileta;
        this.andariveles = andariveles;
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

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public boolean isPileta() {
        return pileta;
    }

    public void setPileta(boolean pileta) {
        this.pileta = pileta;
    }

    public ArrayList<Andarivel> getAndariveles() {
        return andariveles;
    }

    public void setAndariveles(ArrayList<Andarivel> andariveles) {
        this.andariveles = andariveles;
    }

    public void agregarSocio(Socio socio) {
        // checkear que no exista ya
        this.socios.add(socio);
    }

    public void borrarSocio(Socio socio) {
        this.socios.remove(socio);
    }

    public void agregarAndarivel(int numeroAndarivel) {
        this.andariveles.add(new Andarivel(numeroAndarivel));
    }

}
