
public class Admin {
    int id;
    String gmail;
    String contraseña;
    
    private static final Admin[] ADMIN_LIST = {
        new Admin(1, "Alexis123@gmail.com", "123"),
        new Admin(2, "Luis123@gmail.com", "123")
    };
            
    public Admin(int id, String gmail, String contraseña) {
        this.id = id;
        this.gmail = gmail;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public String getGmail() {
        return gmail;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public static boolean esAdmin(String gmail, String contraseña) {
        for (Admin admin : ADMIN_LIST) {
            if (admin.getGmail().equals(gmail) && admin.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }
    
}
