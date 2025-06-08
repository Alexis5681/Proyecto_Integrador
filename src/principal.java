import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.border.Border;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Graphics;


/**
 *
 * @author alexi
 */
public class principal extends javax.swing.JFrame {

conexion con = new conexion();

    public principal() {
        initComponents();
        ENLACE.setText("<html><a style='text-decoration: underline; color: blue;'>Registrate aquí</a></html>");
        ENLACE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BOTON1.setBorder(new RoundedBorder(20));
        BOTON1.setContentAreaFilled(false);
        BOTON1.setOpaque(false);
        BOTON1.setOpaque(true);
        BOTON1.setBackground(new java.awt.Color(255, 255, 255));
        BOTON3.setBorder(new RoundedBorder(20));
        BOTON3.setContentAreaFilled(false);
        BOTON3.setOpaque(false);
        BOTON3.setOpaque(true);
        BOTON3.setBackground(new java.awt.Color(220, 220, 220));
        
        
        this.setLocationRelativeTo(this);

        rsscalelabel.RSScaleLabel.setScaleLabel(imagencita,"src/imagenes/login1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imagen1,"src/imagenes/amarillo.jfif");
        rsscalelabel.RSScaleLabel.setScaleLabel(blanco,"src/imagenes/blanco.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(LOGO,"src/imagenes/LOGO.png");

 
    }

 
    @SuppressWarnings("unchecked")

    
private int verificarCredenciales(String gmail, String contraseña) {

    if (Admin.esAdmin(gmail, contraseña)) {
        return 2; 
    }

   
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        conn = con.connect();
        String sql = "SELECT * FROM usuarios WHERE Gmail = ? AND Contraseña = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, gmail);
        ps.setString(2, contraseña);

        rs = ps.executeQuery();
        if (rs.next()) {
            return 1; 
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al verificar usuario: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    return 0; 
}

    public class RoundedBorder implements Border {
    private int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(radius, radius, radius, radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}
    

  
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TEXTO1 = new javax.swing.JTextField();
        TEXTO2 = new javax.swing.JTextField();
        BOTON1 = new javax.swing.JButton();
        BOTON2 = new javax.swing.JButton();
        imagencita = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        BOTON3 = new javax.swing.JButton();
        ENLACE = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        blanco = new javax.swing.JLabel();
        imagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("CONTRASEÑA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, 150, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("INICIAR SESIÓN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 280, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("GMAIL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 90, 70));

        TEXTO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTO1ActionPerformed(evt);
            }
        });
        getContentPane().add(TEXTO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 450, 50));

        TEXTO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTO2ActionPerformed(evt);
            }
        });
        getContentPane().add(TEXTO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 720, 450, 50));

        BOTON1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BOTON1.setText("REGISTRO");
        BOTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON1ActionPerformed(evt);
            }
        });
        getContentPane().add(BOTON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 160, 50));

        BOTON2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BOTON2.setText("LOGIN ");
        BOTON2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON2ActionPerformed(evt);
            }
        });
        getContentPane().add(BOTON2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 850, 150, 50));
        getContentPane().add(imagencita, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 270, 200));
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 190, 140));

        BOTON3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BOTON3.setText("LOGEARSE");
        BOTON3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON3ActionPerformed(evt);
            }
        });
        getContentPane().add(BOTON3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 150, 50));

        ENLACE.setText("Registrate aquí");
        ENLACE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENLACEMouseClicked(evt);
            }
        });
        getContentPane().add(ENLACE, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 930, 110, 20));

        jLabel5.setText("¿No tienes una cuenta? ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 930, 140, -1));

        blanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blanco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        blanco.setDoubleBuffered(true);
        blanco.setFocusCycleRoot(true);
        getContentPane().add(blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 720, 750));

        imagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TEXTO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTO1ActionPerformed

    private void TEXTO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTO2ActionPerformed

    private void BOTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON1ActionPerformed
    Registro s1 = new Registro();
    s1.setLocation(this.getLocation());
    s1.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_BOTON1ActionPerformed

    private void BOTON2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON2ActionPerformed
    
    String gmail = TEXTO1.getText();
    String contraseña = TEXTO2.getText(); 

    if (gmail.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese su Gmail y Contraseña.");
        return;
    }

    int tipoUsuario = verificarCredenciales(gmail, contraseña);
    
    switch (tipoUsuario) {
        case 0 -> JOptionPane.showMessageDialog(this, "Gmail o Contraseña incorrectos.");
        case 2 -> {
            JOptionPane.showMessageDialog(this, "Bienvenido, Administrador.");
            VistaAdmin ap = new VistaAdmin();         
            ap.setVisible(true);
            this.dispose();
        }
        default -> {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");
            MiSalud i1 = new MiSalud();
            i1.setVisible(true);
            this.dispose();
        }
    }


      

    }//GEN-LAST:event_BOTON2ActionPerformed

    private void BOTON3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON3ActionPerformed

    }//GEN-LAST:event_BOTON3ActionPerformed

    private void ENLACEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENLACEMouseClicked
    Registro r1 = new Registro();
    r1.setLocation(this.getLocation());
    r1.setVisible(true);         
    this.dispose(); 
    }//GEN-LAST:event_ENLACEMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON1;
    private javax.swing.JButton BOTON2;
    private javax.swing.JButton BOTON3;
    private javax.swing.JLabel ENLACE;
    private javax.swing.JLabel LOGO;
    private javax.swing.JTextField TEXTO1;
    private javax.swing.JTextField TEXTO2;
    private javax.swing.JLabel blanco;
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagencita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
