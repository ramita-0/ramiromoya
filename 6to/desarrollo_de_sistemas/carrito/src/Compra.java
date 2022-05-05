import java.util.HashMap;

public class Compra {
    private HashMap<Producto, Integer> productos;
    private float precioFinal;
    private int tarjetaBancaria;
    private Cliente clienteComprador;

    public Compra(HashMap<Producto, Integer> productos, float precioFinal, int tarjetaBancaria, Cliente clienteComprador) {
        this.productos = productos;
        this.precioFinal = precioFinal;
        this.tarjetaBancaria = tarjetaBancaria;
        this.clienteComprador = clienteComprador;
    }

    public void agregarProducto(Producto producto, int cantidad){
        this.productos.put(producto, cantidad);
    }

    public void restarUnProducto(Producto producto){

        int cantidadActual = this.productos.get(producto);
        if(cantidadActual - 1 >= 1) {
            int nuevaCantidad = cantidadActual - 1;
            this.productos.put(producto, nuevaCantidad);
        }
    }

    public void sumarUnProducto(Producto producto){

        int cantidadActual = this.productos.get(producto);
        int nuevaCantidad = cantidadActual + 1;

        this.productos.put(producto, nuevaCantidad);
    }

    public HashMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public int getTarjetaBancaria() {
        return tarjetaBancaria;
    }

    public void setTarjetaBancaria(int tarjetaBancaria) {
        this.tarjetaBancaria = tarjetaBancaria;
    }

    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    public void setClienteComprador(Cliente clienteComprador) {
        this.clienteComprador = clienteComprador;
    }
}
