public class Main {
    public static void main(String[] args) {
        Calculo calculo1 = new CalculoLargaDistancia();

        Envio e = new Envio(calculo1);
        System.out.println(e.formaEnvio.calcularEnvio());
    }
}
