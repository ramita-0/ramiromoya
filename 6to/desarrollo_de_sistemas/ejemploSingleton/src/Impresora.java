public class Impresora {
    private String modelo;
    private static Impresora instancia;

    private Impresora(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static Impresora getInstance(String modelo) {
        if (instancia == null) {
            instancia = new Impresora(modelo);
        }
        else {
            System.out.println("Ya existe una impresora");
        }
        return instancia;
    }
}
