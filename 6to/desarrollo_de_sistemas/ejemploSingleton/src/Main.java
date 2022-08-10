public class Main {
    public static void main(String[] args) {
        Impresora i = Impresora.getInstance("hp");
        System.out.println(i.getModelo());

        Impresora i2 = Impresora.getInstance("epson");

        System.out.println("impresora 1:" + i.getModelo());
        System.out.println("impresora 2:" + i2.getModelo());
        // se pueden instanciar mas de un objeto, solo que no va a cambiarle las propiedades?
        // si es otro objeto, como sabe q ya existe otro del mismo tipo?
    }
}
