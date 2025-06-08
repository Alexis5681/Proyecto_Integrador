
public class Productos {

private int id;
private String Nombre;
private String descripción;
private double precio;
private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Productos(int id, String Nombre, String descripción, double precio, int stock) {
        this.id = id;
        this.Nombre = Nombre;
        this.descripción = descripción;
        this.precio = precio;
        this.stock = stock;
    }
    
}
