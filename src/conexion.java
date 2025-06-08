import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conexion {
        public static Connection connect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/Integrador"; 
            String usuario = "root";  
            String clave = "";        

            connection = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos: " + e.getMessage());
        }
        return connection;
    }
}
