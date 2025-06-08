
import javax.swing.table.DefaultTableModel;



public class VistaCarrito extends javax.swing.JFrame {


    public VistaCarrito() {
        initComponents();
        cargarTabla();
             
        
        
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR) );
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR) );
     
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel33, "src/imagenes/blanco.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(fondin, "src/imagenes/amarillo.jfif");
        rsscalelabel.RSScaleLabel.setScaleLabel(logito, "src/imagenes/LOGO.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(logito1, "src/imagenes/LOGO.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel17, "src/imagenes/negro.jfif");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel19, "src/imagenes/LOGO.png");
    
        rsscalelabel.RSScaleLabel.setScaleLabel(pago1, "src/imagenes/pagin.png");
        
        

    }


    
    @SuppressWarnings("unchecked")
    
     private void cargarTabla() {
         DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0); 

    for (ItemCarrito item : CarritoCompartido.listaCarrito) {
        Object[] fila = {
            item.getNombre(),
            item.getCantidad(),
            item.getPrecio(),
            item.getTotal()
        };
        modelo.addRow(fila);
    }
    double total = CarritoCompartido.calcularTotalCarrito();
    jTextField1.setText("TOTAL A PAGAR = S/ " + String.format("%.2f", total));
    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        logito = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        redes = new javax.swing.JLabel();
        pago1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        logito1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        fondin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1280, 800));

        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 2134));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 2134));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 1820, 360, 280));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Carrito");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Inicio");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, -1, -1));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Productos");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, -1));

        jLabel5.setText("|");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 30, -1));

        jLabel6.setText("|");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 20, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MiSalud");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1840, 60, 30));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1830, 60, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Siguenos:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 1840, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("@2025 MiSalud. Todos los derechos reservados.\n");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1970, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Términos de Servicio");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2010, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("*  Política de Privacidad");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 2010, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("¡Medicamentos que te cambiaran la vida!");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Medios de Pago");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 1840, -1, -1));
        jPanel1.add(redes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 1880, 180, 190));
        jPanel1.add(pago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 1890, 210, 130));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1780, 1890, 350));
        jPanel1.add(logito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 230, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Resumen del Pedido: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Total"
            }
        ));
        jTable1.setRowHeight(70);
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 980, 760));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1250, 540, 80));

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 1210, 1040));

        fondin.setMinimumSize(new java.awt.Dimension(1920, 1900));
        jPanel1.add(fondin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 2130));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1901, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    VistaProductos vp = new VistaProductos();
    vp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    MiSalud m1 = new MiSalud();
    m1.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    VistaCarrito vc = new VistaCarrito();
    vc.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed


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
            java.util.logging.Logger.getLogger(MiSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCarrito().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logito;
    private javax.swing.JLabel logito1;
    private javax.swing.JLabel pago1;
    private javax.swing.JLabel redes;
    // End of variables declaration//GEN-END:variables
}
