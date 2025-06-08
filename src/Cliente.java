
public class Cliente {
  private String nombre;
  private String apellido;  
  private String DNI;
  private String gmail;
  private String contraseña;
  private String direccion;

    public Cliente(String nombre, String apellido, String DNI, String gmail, String contraseña, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.gmail = gmail;
        this.contraseña = contraseña;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
  
}


