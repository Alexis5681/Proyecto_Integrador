

public class VistaProductos extends javax.swing.JFrame {


    public VistaProductos() {
        initComponents();
        
        Buscar.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        public void insertUpdate(javax.swing.event.DocumentEvent e) { updateSearch(); }
        public void removeUpdate(javax.swing.event.DocumentEvent e) { updateSearch(); }
        public void changedUpdate(javax.swing.event.DocumentEvent e) { updateSearch(); }

    private void updateSearch() {
        String buscar = Buscar.getText().toLowerCase();
        filtrarProduc(buscar);
    }
   }    );
        
        
        
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR) );
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR) );
        carrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR) );
        
        enlace1.setText("<html><a style='text-decoration: underline; color: blue;'>Detalle del Producto</a></html>");
        enlace1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        enlace2.setText("<html><a style='text-decoration: underline; color: blue;'>Detalle del Producto</a></html>");
        enlace2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        enlace3.setText("<html><a style='text-decoration: underline; color: blue;'>Detalle del Producto</a></html>");
        enlace3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        enlace4.setText("<html><a style='text-decoration: underline; color: blue;'>Detalle del Producto</a></html>");
        enlace4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        enlace5.setText("<html><a style='text-decoration: underline; color: blue;'>Detalle del Producto</a></html>");
        enlace5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        enlace6.setText("<html><a style='text-decoration: underline; color: blue;'>Detalle del Producto</a></html>");
        enlace6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        
        rsscalelabel.RSScaleLabel.setScaleLabel(fondin, "src/imagenes/amarillo.jfif");
        rsscalelabel.RSScaleLabel.setScaleLabel(logito, "src/imagenes/LOGO.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(logito1, "src/imagenes/LOGO.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel17, "src/imagenes/negro.jfif");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel19, "src/imagenes/LOGO.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel12, "src/imagenes/cetirizina.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel9, "src/imagenes/vick.png");

        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel10, "src/imagenes/bronco.png");
     

        rsscalelabel.RSScaleLabel.setScaleLabel(pago1, "src/imagenes/pagin.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel14, "src/imagenes/vap.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(redes, "src/imagenes/redes.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(carrito, "src/imagenes/carrito.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel26, "src/imagenes/dex.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel27, "src/imagenes/panadol.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel12, "src/imagenes/libe.png");
        
        filtrarProduc("");
    }


    
    @SuppressWarnings("unchecked")
    
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
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spinBro = new javax.swing.JSpinner();
        butBronco = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        enlace1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spinLib = new javax.swing.JSpinner();
        enlace2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        butLib = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        enlace3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        spinAbri = new javax.swing.JSpinner();
        butAbri = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        enlace4 = new javax.swing.JLabel();
        spinVick = new javax.swing.JSpinner();
        jLabel28 = new javax.swing.JLabel();
        butVICK = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        spinDex = new javax.swing.JSpinner();
        spinPana = new javax.swing.JSpinner();
        enlace5 = new javax.swing.JLabel();
        enlace6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        butDex = new javax.swing.JButton();
        butPana = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();
        butbos = new javax.swing.JButton();
        carrito = new javax.swing.JLabel();
        fondin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1280, 800));

        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 2134));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 2134));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 1820, 360, 280));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 330, 320));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1070, 330, 320));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 500, 330, 320));

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

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 330, 320));

        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1070, 330, 320));

        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 1070, 330, 320));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Broncoxan Dilat Jarabe");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 840, 250, 60));
        jPanel1.add(spinBro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 860, 70, 30));

        butBronco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butBronco.setText("Comprar");
        butBronco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBroncoActionPerformed(evt);
            }
        });
        jPanel1.add(butBronco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 970, 120, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Precio: 43.00");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 910, -1, -1));

        enlace1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enlace1.setText("Ver Producto");
        enlace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlace1MouseClicked(evt);
            }
        });
        jPanel1.add(enlace1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 910, 140, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Jarabe Dextrometorfano 15mg/5ml");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1410, 350, 60));
        jPanel1.add(spinLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 1460, 70, 30));

        enlace2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enlace2.setText("Ver Producto");
        enlace2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlace2MouseClicked(evt);
            }
        });
        jPanel1.add(enlace2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1500, 140, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Precio: 41.00");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 1500, -1, -1));

        butLib.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butLib.setText("Comprar");
        butLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLibActionPerformed(evt);
            }
        });
        jPanel1.add(butLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 1550, 120, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setText("Jarabe Libera 2.5mg/5ml");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1400, 340, 60));

        enlace3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enlace3.setText("Ver Producto");
        enlace3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlace3MouseClicked(evt);
            }
        });
        jPanel1.add(enlace3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 920, 140, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("Precio: 24.90");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 920, -1, -1));
        jPanel1.add(spinAbri, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 860, 70, 30));

        butAbri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butAbri.setText("Comprar");
        butAbri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbriActionPerformed(evt);
            }
        });
        jPanel1.add(butAbri, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 970, 120, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setText("Vick Vaporub");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 840, 190, 60));

        enlace4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enlace4.setText("Ver Producto");
        enlace4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlace4MouseClicked(evt);
            }
        });
        jPanel1.add(enlace4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 920, 140, 20));
        jPanel1.add(spinVick, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 870, 70, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 0, 0));
        jLabel28.setText("Precio: 9.90");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 920, -1, -1));

        butVICK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butVICK.setText("Comprar");
        butVICK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVICKActionPerformed(evt);
            }
        });
        jPanel1.add(butVICK, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 980, 120, 40));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel29.setText("Abrilar EA 575 Jarabe");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 840, 250, 60));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel30.setText("Panadol para niños - Frasco 15ml");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 1400, 340, 60));
        jPanel1.add(spinDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1470, 70, 30));
        jPanel1.add(spinPana, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1460, 70, 30));

        enlace5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enlace5.setText("Ver Producto");
        enlace5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlace5MouseClicked(evt);
            }
        });
        jPanel1.add(enlace5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1510, 140, 20));

        enlace6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enlace6.setText("Ver Producto");
        enlace6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlace6MouseClicked(evt);
            }
        });
        jPanel1.add(enlace6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 1510, 140, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("Precio: 19.90");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1510, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 0, 0));
        jLabel32.setText("Precio: 14.50");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1510, -1, -1));

        butDex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butDex.setText("Comprar");
        butDex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDexActionPerformed(evt);
            }
        });
        jPanel1.add(butDex, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1560, 120, 40));

        butPana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butPana.setText("Comprar");
        butPana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPanaActionPerformed(evt);
            }
        });
        jPanel1.add(butPana, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 1560, 120, 40));

        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 810, 70));

        butbos.setText("Buscar");
        butbos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butbosActionPerformed(evt);
            }
        });
        jPanel1.add(butbos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 363, 80, 30));

        carrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carritoMouseClicked(evt);
            }
        });
        jPanel1.add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 290, 90, 70));

        fondin.setMinimumSize(new java.awt.Dimension(1920, 1900));
        jPanel1.add(fondin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 2130));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1901, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void agregarProductoAlCarrito(String nombre, int cantidad, double precio) {
        ItemCarrito item = new ItemCarrito(nombre, cantidad, precio);
        CarritoCompartido.listaCarrito.add(item);

        javax.swing.JOptionPane.showMessageDialog(this, "Producto añadido al carrito.");

    }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    MiSalud m1 = new MiSalud();
    m1.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void enlace1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlace1MouseClicked
    
    }//GEN-LAST:event_enlace1MouseClicked

    private void enlace2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlace2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enlace2MouseClicked

    private void enlace3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlace3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enlace3MouseClicked

    private void enlace4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlace4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enlace4MouseClicked

    private void enlace5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlace5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enlace5MouseClicked

    private void enlace6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlace6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enlace6MouseClicked

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void butbosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butbosActionPerformed
    String buscar = Buscar.getText().toLowerCase();
    filtrarProduc(buscar);
    }//GEN-LAST:event_butbosActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    VistaCarrito vc = new VistaCarrito ();
    vc.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void butVICKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVICKActionPerformed
    int cantidad = (Integer) spinVick.getValue();
    agregarProductoAlCarrito("Vick Vaporub", cantidad, 9.90);
    }//GEN-LAST:event_butVICKActionPerformed

    private void butAbriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbriActionPerformed
    int cantidad = (Integer) spinAbri.getValue();
     agregarProductoAlCarrito("Abrilar EA 575 Jarabe", cantidad, 24.90);
    }//GEN-LAST:event_butAbriActionPerformed

    private void butBroncoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBroncoActionPerformed
    int cantidad = (Integer) spinBro.getValue();
     agregarProductoAlCarrito("Broncoxan Dilat Jarabe", cantidad, 43.00);   
    }//GEN-LAST:event_butBroncoActionPerformed

    private void butDexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDexActionPerformed
    int cantidad = (Integer) spinDex.getValue();
     agregarProductoAlCarrito("Jarabe Dextrometorfano", cantidad, 19.90);   
    }//GEN-LAST:event_butDexActionPerformed

    private void butPanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPanaActionPerformed
    int cantidad = (Integer) spinPana.getValue();
     agregarProductoAlCarrito("Panadol para niños", cantidad, 14.50);  
    }//GEN-LAST:event_butPanaActionPerformed

    private void butLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLibActionPerformed
    int cantidad = (Integer) spinLib.getValue();
    agregarProductoAlCarrito("Jarabe Libera", cantidad, 41.00);  
    }//GEN-LAST:event_butLibActionPerformed

    private void carritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carritoMouseClicked
    VistaCarrito vp = new VistaCarrito();
    vp.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_carritoMouseClicked

    private void filtrarProduc(String buscar) {


        if (buscar.isEmpty() || jLabel16.getText().toLowerCase().contains(buscar)) {
        jLabel16.setVisible(true);
        jLabel14.setVisible(true);
        jLabel28.setVisible(true);
        
        butVICK.setVisible(true);
        enlace4.setVisible(true);
        spinVick.setVisible(true);
    } else {
        jLabel16.setVisible(false);
        jLabel14.setVisible(false);
        jLabel28.setVisible(false);
       
        butVICK.setVisible(false);
        enlace4.setVisible(false);
        spinVick.setVisible(false);
    }

    if (buscar.isEmpty() || jLabel29.getText().toLowerCase().contains(buscar)) {
        jLabel29.setVisible(true);
        jLabel9.setVisible(true);
        jLabel15.setVisible(true);
        
        butAbri.setVisible(true);
        enlace3.setVisible(true);
        spinAbri.setVisible(true);
    } else {
        jLabel29.setVisible(false);
        jLabel9.setVisible(false);
        jLabel15.setVisible(false);
       
        butAbri.setVisible(false);
        enlace3.setVisible(false);
        spinAbri.setVisible(false);
    }

    if (buscar.isEmpty() || jLabel1.getText().toLowerCase().contains(buscar)) {
        jLabel1.setVisible(true);
        jLabel10.setVisible(true);
        jLabel7.setVisible(true);
    
        butBronco.setVisible(true);
        enlace1.setVisible(true);
        spinBro.setVisible(true);
    } else {
        jLabel1.setVisible(false);
        jLabel10.setVisible(false);
        jLabel7.setVisible(false);
      
        butBronco.setVisible(false);
        enlace1.setVisible(false);
        spinBro.setVisible(false);
    }

    if (buscar.isEmpty() || jLabel13.getText().toLowerCase().contains(buscar)) {
        jLabel13.setVisible(true);
        jLabel12.setVisible(true);
        jLabel11.setVisible(true);
      
        butLib.setVisible(true);
        enlace2.setVisible(true);
        spinLib.setVisible(true);
    } else {
        jLabel13.setVisible(false);
        jLabel12.setVisible(false);
        jLabel11.setVisible(false);
    
        butLib.setVisible(false);
        enlace2.setVisible(false);
        spinLib.setVisible(false);
    }

    if (buscar.isEmpty() || jLabel30.getText().toLowerCase().contains(buscar)) {
        jLabel30.setVisible(true);
        jLabel27.setVisible(true);
        jLabel32.setVisible(true);
       
        butPana.setVisible(true);
        enlace6.setVisible(true);
        spinPana.setVisible(true);
    } else {
        jLabel30.setVisible(false);
        jLabel27.setVisible(false);
        jLabel32.setVisible(false);
     
        butPana.setVisible(false);
        enlace6.setVisible(false);
        spinPana.setVisible(false);
    }

    if (buscar.isEmpty() || jLabel8.getText().toLowerCase().contains(buscar)) {
        jLabel8.setVisible(true);
        jLabel26.setVisible(true);
        jLabel31.setVisible(true);
        
        butDex.setVisible(true);
        enlace5.setVisible(true);
        spinDex.setVisible(true);
    } else {
        jLabel8.setVisible(false);
        jLabel26.setVisible(false);
        jLabel31.setVisible(false);
     
        butDex.setVisible(false);
        enlace5.setVisible(false);
        spinDex.setVisible(false);
    }
}

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
                new VistaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JButton butAbri;
    private javax.swing.JButton butBronco;
    private javax.swing.JButton butDex;
    private javax.swing.JButton butLib;
    private javax.swing.JButton butPana;
    private javax.swing.JButton butVICK;
    private javax.swing.JButton butbos;
    private javax.swing.JLabel carrito;
    private javax.swing.JLabel enlace1;
    private javax.swing.JLabel enlace2;
    private javax.swing.JLabel enlace3;
    private javax.swing.JLabel enlace4;
    private javax.swing.JLabel enlace5;
    private javax.swing.JLabel enlace6;
    private javax.swing.JLabel fondin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logito;
    private javax.swing.JLabel logito1;
    private javax.swing.JLabel pago1;
    private javax.swing.JLabel redes;
    private javax.swing.JSpinner spinAbri;
    private javax.swing.JSpinner spinBro;
    private javax.swing.JSpinner spinDex;
    private javax.swing.JSpinner spinLib;
    private javax.swing.JSpinner spinPana;
    private javax.swing.JSpinner spinVick;
    // End of variables declaration//GEN-END:variables
}
