

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alexi
 */
public class VistaAdmin extends javax.swing.JFrame {


    public VistaAdmin() {
        initComponents();
        cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cliente.setOpaque(true);
        
        cliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        


    cliente.addMouseListener(new java.awt.event.MouseAdapter() {
        
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        cliente.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY, 2, true));
        cliente.setBackground(new java.awt.Color(230, 230, 230)); 
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        cliente.setBorder(null); 
        cliente.setBackground(null); 
    }
});
        cliente1.addMouseListener(new java.awt.event.MouseAdapter() {
        
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        cliente1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY, 2, true));
        cliente1.setBackground(new java.awt.Color(230, 230, 230)); 
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        cliente1.setBorder(null); 
        cliente1.setBackground(null); 
    }
});
    cliente2.addMouseListener(new java.awt.event.MouseAdapter() {
        
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        cliente2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY, 2, true));
        cliente2.setBackground(new java.awt.Color(230, 230, 230)); 
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        cliente2.setBorder(null); 
        cliente2.setBackground(null); 
    }
});
    cliente3.addMouseListener(new java.awt.event.MouseAdapter() {
        
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        cliente3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY, 2, true));
        cliente3.setBackground(new java.awt.Color(230, 230, 230)); 
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        cliente3.setBorder(null); 
        cliente3.setBackground(null); 
    }
});
    

        
        rsscalelabel.RSScaleLabel.setScaleLabel(FONDO, "src/imagenes/image.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(LOGITO, "src/imagenes/LOGO.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(cliente, "src/imagenes/client.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(cliente1, "src/imagenes/purchase.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(cliente2, "src/imagenes/sale.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(cliente3, "src/imagenes/product.jpg");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGITO = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cliente1 = new javax.swing.JLabel();
        cliente2 = new javax.swing.JLabel();
        cliente3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(LOGITO, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 320, 230));

        cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteMouseClicked(evt);
            }
        });
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 180, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ver Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, -1, -1));

        cliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliente1MouseClicked(evt);
            }
        });
        getContentPane().add(cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 730, 180, 120));

        cliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliente2MouseClicked(evt);
            }
        });
        getContentPane().add(cliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 460, 180, 120));

        cliente3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliente3MouseClicked(evt);
            }
        });
        getContentPane().add(cliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 180, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Ver Productos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Editar Productos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 600, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Agregar Productos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 860, -1, -1));
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseClicked
    VerClientes v1 = new VerClientes();
    v1.setLocation(this.getLocation());
    v1.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_clienteMouseClicked

    private void cliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliente1MouseClicked
    AgregarPro ap = new AgregarPro ();
    ap.setLocation(this.getLocation());
    ap.setVisible(true);
    this.dispose();
        
    }//GEN-LAST:event_cliente1MouseClicked

    private void cliente2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliente2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cliente2MouseClicked

    private void cliente3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliente3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cliente3MouseClicked

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
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel LOGITO;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel cliente1;
    private javax.swing.JLabel cliente2;
    private javax.swing.JLabel cliente3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
