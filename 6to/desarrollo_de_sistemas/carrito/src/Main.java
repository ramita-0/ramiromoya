import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> tarjetasTest = new ArrayList<>();
//        tarjetasTest.add(1123);
//        tarjetasTest.add(313211);
//        Cliente c = new Cliente("jose", "asd1", "asd2", "asd@gmail.com", tarjetasTest);

        Cliente cliente = new Cliente("jose", "asd1", "asd2", "asd@gmail.com", 12332, 32, "VIP");

        Producto p1 = new Producto("pan", 30, "pan bimbo");
        Producto p2 = new Producto("mermelada", 80, "mermelada arcor");

        HashMap<Producto, Integer> productosTest = new HashMap<>();
        productosTest.put(p1, 5);
        productosTest.put(p2, 1);

        Compra compra = new Compra(productosTest, 0, cliente.getTarjetasBancarias(), cliente);

        compra.restarUnProducto(p1);
        compra.sumarUnProducto(p1);

        cliente.realizarCompra(compra, cliente.getTarjetasBancarias());

        System.out.println(compra.getPrecioFinal());
    }
}