
import java.util.ArrayList;
import java.util.List;

public class CarritoCompartido {
     public static List<ItemCarrito> listaCarrito = new ArrayList<>();
     public static double calcularTotalCarrito() {
        double total = 0.0;
        for (ItemCarrito item : listaCarrito) {
            total += item.getTotal();
        }
        return total;
    }
}
