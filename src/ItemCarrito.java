

public class ItemCarrito {
     private String nombre;
    private int cantidad;
    private double precio;

    public ItemCarrito(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }

    public double getTotal() {
        return cantidad * precio;
    }
}
