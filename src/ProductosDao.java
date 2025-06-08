import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductosDao {
    private final conexion dbConnection;

    public ProductosDao(conexion dbConnection) {
        this.dbConnection = dbConnection;
    }

    public boolean RegistrarProductos(Productos pro) {
        
        if (pro == null || pro.getNombre() == null || pro.getNombre().trim().isEmpty()) {
            System.out.println("Error: El producto o su nombre no puede ser nulo o vacío.");
            return false;
        }
        if (pro.getPrecio() < 0) {
            System.out.println("Error: El precio no puede ser negativo.");
            return false;
        }
        if (pro.getStock() < 0) {
            System.out.println("Error: El stock no puede ser negativo.");
            return false;
        }

        try (Connection connection = dbConnection.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO producto (id_producto, Nombre, Descripción, Precio, stock) VALUES (?, ?, ?, ?, ?)")) {

            if (connection == null) {
                System.out.println("Error: No se pudo establecer la conexión a la base de datos.");
                return false;
            }

            preparedStatement.setInt(1, pro.getId());
            preparedStatement.setString(2, pro.getNombre());
            preparedStatement.setString(3, pro.getDescripción());
            preparedStatement.setDouble(4, pro.getPrecio());
            preparedStatement.setInt(5, pro.getStock());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Producto registrado exitosamente: " + pro.getNombre());
                return true;
            } else {
                System.out.println("No se insertó ningún producto.");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar en la base de datos: " + e.getMessage());
            return false;
        }
    }
} 