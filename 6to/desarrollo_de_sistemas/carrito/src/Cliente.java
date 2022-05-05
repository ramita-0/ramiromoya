import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
    private String nombre;
    private String direccionEnvio;
    private String direccionCobro;
    private String mail;
//    private ArrayList<Integer> tarjetasBancarias;
    private int tarjeta;
    private float descuento;
    private String tipo;

    public Cliente(String nombre, String direccionEnvio, String direccionCobro, String mail, int tarjeta, float descuento, String tipo) {
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.direccionCobro = direccionCobro;
        this.mail = mail;
        this.tarjeta = tarjeta;
        this.descuento = descuento;
        this.tipo = tipo;
    }

    public void realizarCompra(Compra compra, int tarjeta) {

        HashMap<Producto, Integer> productosCompra = compra.getProductos();

        float valorTotalCompra = 0;
        for(Producto productoActual: productosCompra.keySet()) {

            float precioProductoActual = productoActual.getPrecio();
            int cantidadProductoActual = productosCompra.get(productoActual);

            float valorTotalItemCompra = precioProductoActual * cantidadProductoActual;
            valorTotalCompra += valorTotalItemCompra;
        }
        compra.setPrecioFinal(valorTotalCompra);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionCobro() {
        return direccionCobro;
    }

    public void setDireccionCobro(String direccionCobro) {
        this.direccionCobro = direccionCobro;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTarjetasBancarias() {
        return tarjeta;
    }

    public void setTarjetasBancarias(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
