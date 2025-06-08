
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alexi
 */
public class Registro extends javax.swing.JFrame {
conexion con  = new conexion();

    public Registro() {
        initComponents();
        BOTON4.setBorder(new Registro.RoundedBorder(20));
        BOTON4.setContentAreaFilled(false);
        BOTON4.setOpaque(false);
        BOTON4.setOpaque(true);
        BOTON4.setBackground(new java.awt.Color(255, 255, 255));
        BOTON3.setBorder(new Registro.RoundedBorder(20));
        BOTON3.setContentAreaFilled(false);
        BOTON3.setOpaque(false);
        BOTON3.setOpaque(true);
        BOTON3.setBackground(new java.awt.Color(220, 220, 220));
        rsscalelabel.RSScaleLabel.setScaleLabel(imagen2,"src/imagenes/amarillo.jfif");
        rsscalelabel.RSScaleLabel.setScaleLabel(BLANCO,"src/imagenes/blanco.png");
    }


    @SuppressWarnings("unchecked")
    
        private void guardarEnBaseDeDatos(Cliente cliente) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
      
        try {
            connection = conexion.connect();
            if (connection != null) {
                String sql = "INSERT INTO usuarios (DNI, Nombres, Apellidos , Gmail, Contraseña, Dirección) VALUES (?, ?, ?, ?, ?, ?)";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, DNI.getText());
                preparedStatement.setString(2, NOM.getText());
                preparedStatement.setString(3, APE.getText());
                preparedStatement.setString(4, GMAIL.getText()); 
                preparedStatement.setString(5, CONTRA.getText());
                preparedStatement.setString(6, DIRE.getText());
                
                preparedStatement.executeUpdate(); 
                System.out.println("Datos guardados en la base de datos para el cliente " + NOM.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar en la base de datos: " + e.getMessage());
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        APE = new javax.swing.JTextField();
        DNI = new javax.swing.JTextField();
        CONTRA = new javax.swing.JTextField();
        GMAIL = new javax.swing.JTextField();
        DIRE = new javax.swing.JTextField();
        NOM = new javax.swing.JTextField();
        BOT2 = new javax.swing.JButton();
        BOTON3 = new javax.swing.JButton();
        BOTON4 = new javax.swing.JButton();
        BLANCO = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 1020));
        setPreferredSize(new java.awt.Dimension(870, 1020));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nombres:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 130, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 130, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Gmail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 100, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("DNI:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 130, 90));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("REGISTRO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 210, 130));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 130, 90));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 150, 90));

        APE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APEActionPerformed(evt);
            }
        });
        getContentPane().add(APE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 480, 40));
        getContentPane().add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 480, 40));
        getContentPane().add(CONTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 480, 40));

        GMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GMAILActionPerformed(evt);
            }
        });
        getContentPane().add(GMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 480, 40));

        DIRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIREActionPerformed(evt);
            }
        });
        getContentPane().add(DIRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, 480, 40));

        NOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMActionPerformed(evt);
            }
        });
        getContentPane().add(NOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 480, 40));

        BOT2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        BOT2.setText("REGISTRARSE");
        BOT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOT2ActionPerformed(evt);
            }
        });
        getContentPane().add(BOT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 860, 180, 70));

        BOTON3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BOTON3.setText("REGISTRARSE");
        BOTON3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON3ActionPerformed(evt);
            }
        });
        getContentPane().add(BOTON3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 160, 50));

        BOTON4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BOTON4.setText("LOGEARSE");
        BOTON4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON4ActionPerformed(evt);
            }
        });
        getContentPane().add(BOTON4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 150, 50));
        getContentPane().add(BLANCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 780, 860));

        imagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    
    private void GMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GMAILActionPerformed

    private void DIREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DIREActionPerformed

    private void NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMActionPerformed

    private void APEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APEActionPerformed

    private void BOT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOT2ActionPerformed
        
        
       String dni = DNI.getText();
       String nombre = NOM.getText();
       String apellido = APE.getText();
       String gmail = GMAIL.getText();
       String contraseña = CONTRA.getText();
       String direccion = DIRE.getText();
       
       if (DNI.getText().isEmpty() || NOM.getText().isEmpty() || APE.getText().isEmpty() || GMAIL.getText().isEmpty() || CONTRA.getText().isEmpty() || DIRE.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "Complete todos los espacios faltantes");
       } else {
           
       JOptionPane.showMessageDialog(null, "Registro exitoso");    
       Cliente nuevocliente = new Cliente(nombre, apellido, dni, gmail, contraseña, direccion);

        guardarEnBaseDeDatos(nuevocliente);
        
     principal p1 = new principal();
     p1.setLocation(this.getLocation());
     p1.setVisible(true);
     this.dispose();
       }   
    }//GEN-LAST:event_BOT2ActionPerformed

    private void BOTON3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTON3ActionPerformed

    private void BOTON4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON4ActionPerformed
    principal p1 = new principal();
     p1.setVisible(true);
     this.dispose();    
    }//GEN-LAST:event_BOTON4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APE;
    private javax.swing.JLabel BLANCO;
    private javax.swing.JButton BOT2;
    private javax.swing.JButton BOTON3;
    private javax.swing.JButton BOTON4;
    private javax.swing.JTextField CONTRA;
    private javax.swing.JTextField DIRE;
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField GMAIL;
    private javax.swing.JTextField NOM;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
