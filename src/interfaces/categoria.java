
package interfaces;

import ventanas_secundarias.guardar_NuevaCategoria;

public class categoria extends javax.swing.JFrame {

    public categoria() {
        initComponents();
        this.setLocation(1616, 870);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        filtrar_texto_categoria = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        busqueda_categoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_NuevaCategoria = new RSMaterialComponent.RSButtonMaterialDos();
        btn_NuevoCliente = new RSMaterialComponent.RSButtonMaterialDos();
        btn_EditarCategoria = new RSMaterialComponent.RSButtonMaterialDos();
        btn_EliminarCategoria = new RSMaterialComponent.RSButtonMaterialDos();
        opciones = new paneles.PanelRound();
        btn_inicio = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_categoria = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_clientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_entradas = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_salidas = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_salir = new RSMaterialComponent.RSButtonMaterialIconDos();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btn_provedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Dialog.bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("SISTEMA DE");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filtrar_texto_categoria.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog.bold", 1, 18)); // NOI18N
        jLabel4.setText("Gestión de Categorías");

        jLabel5.setFont(new java.awt.Font("Dialog.bold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Administre las categorias de productos del sistema de inventario central");

        jLabel6.setText("FILTRAR POR TEXTO");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setText("ESTADO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activos", "Inactivos" }));
        jComboBox1.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_NuevaCategoria.setBorder(null);
        btn_NuevaCategoria.setForeground(new java.awt.Color(0, 112, 192));
        btn_NuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N
        btn_NuevaCategoria.setText("Nueva categoria");
        btn_NuevaCategoria.setBorderPainted(false);
        btn_NuevaCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NuevaCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_NuevaCategoria.setEffectButton(RSMaterialComponent.RSButtonMaterialDos.EFFECTBUTTON.RAISED);
        btn_NuevaCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NuevaCategoria.setOpaque(true);
        btn_NuevaCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N
        btn_NuevaCategoria.setRequestFocusEnabled(false);
        btn_NuevaCategoria.setRolloverEnabled(false);
        btn_NuevaCategoria.setRound(25);
        btn_NuevaCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N

        btn_NuevoCliente.setBorder(null);
        btn_NuevoCliente.setForeground(new java.awt.Color(0, 112, 192));
        btn_NuevoCliente.setText("Nuevo cliente");
        btn_NuevoCliente.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_NuevoCliente.setEffectButton(RSMaterialComponent.RSButtonMaterialDos.EFFECTBUTTON.RAISED);
        btn_NuevoCliente.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoClienteActionPerformed(evt);
            }
        });

        btn_EditarCategoria.setBorder(null);
        btn_EditarCategoria.setForeground(new java.awt.Color(0, 112, 192));
        btn_EditarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N
        btn_EditarCategoria.setText("Editar");
        btn_EditarCategoria.setBorderPainted(false);
        btn_EditarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EditarCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_EditarCategoria.setEffectButton(RSMaterialComponent.RSButtonMaterialDos.EFFECTBUTTON.RAISED);
        btn_EditarCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_EditarCategoria.setOpaque(true);
        btn_EditarCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N
        btn_EditarCategoria.setRequestFocusEnabled(false);
        btn_EditarCategoria.setRolloverEnabled(false);
        btn_EditarCategoria.setRound(25);
        btn_EditarCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N

        btn_EliminarCategoria.setBorder(null);
        btn_EliminarCategoria.setForeground(new java.awt.Color(0, 112, 192));
        btn_EliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N
        btn_EliminarCategoria.setText("Eliminar");
        btn_EliminarCategoria.setBorderPainted(false);
        btn_EliminarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EliminarCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_EliminarCategoria.setEffectButton(RSMaterialComponent.RSButtonMaterialDos.EFFECTBUTTON.RAISED);
        btn_EliminarCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_EliminarCategoria.setOpaque(true);
        btn_EliminarCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N
        btn_EliminarCategoria.setRequestFocusEnabled(false);
        btn_EliminarCategoria.setRolloverEnabled(false);
        btn_EliminarCategoria.setRound(25);
        btn_EliminarCategoria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_globales/addX16.png"))); // NOI18N

        javax.swing.GroupLayout filtrar_texto_categoriaLayout = new javax.swing.GroupLayout(filtrar_texto_categoria);
        filtrar_texto_categoria.setLayout(filtrar_texto_categoriaLayout);
        filtrar_texto_categoriaLayout.setHorizontalGroup(
            filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtrar_texto_categoriaLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jSeparator2))
            .addGroup(filtrar_texto_categoriaLayout.createSequentialGroup()
                .addGroup(filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtrar_texto_categoriaLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(busqueda_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_NuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(filtrar_texto_categoriaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(filtrar_texto_categoriaLayout.createSequentialGroup()
                                    .addGroup(filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(filtrar_texto_categoriaLayout.createSequentialGroup()
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_NuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_EditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_EliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(143, 143, 143))))
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        filtrar_texto_categoriaLayout.setVerticalGroup(
            filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtrar_texto_categoriaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busqueda_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filtrar_texto_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        opciones.setBackground(new java.awt.Color(13, 32, 52));

        btn_inicio.setBackground(new java.awt.Color(13, 32, 52));
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_DashboardPrincipal/homeX32.png"))); // NOI18N
        btn_inicio.setText("INICIO");
        btn_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inicio.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        btn_categoria.setBackground(new java.awt.Color(13, 32, 52));
        btn_categoria.setText("CATEGORIA");
        btn_categoria.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CARD_MEMBERSHIP);
        btn_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categoriaActionPerformed(evt);
            }
        });

        btn_clientes.setBackground(new java.awt.Color(13, 32, 52));
        btn_clientes.setText("CLIENTES");
        btn_clientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);

        btn_entradas.setBackground(new java.awt.Color(13, 32, 52));
        btn_entradas.setText("ENTRADAS");
        btn_entradas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CALL_MADE);

        btn_salidas.setBackground(new java.awt.Color(13, 32, 52));
        btn_salidas.setText("SALIDAS");
        btn_salidas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CALL_MISSED);

        btn_salir.setBackground(new java.awt.Color(13, 32, 52));
        btn_salir.setText("SALIR");
        btn_salir.setBackgroundHover(new java.awt.Color(153, 0, 0));
        btn_salir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog.bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_provedor.setBackground(new java.awt.Color(13, 32, 52));
        btn_provedor.setText("PROVEEDOR");
        btn_provedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NAVIGATION);

        jLabel3.setFont(new java.awt.Font("Dialog.bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("INVENTARIO");
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)))
            .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(btn_provedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addComponent(btn_salidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(btn_clientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(btn_inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(btn_categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(btn_entradas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_entradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_salidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(filtrar_texto_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filtrar_texto_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_categoriaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_NuevoClienteActionPerformed

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialDos btn_EditarCategoria;
    private RSMaterialComponent.RSButtonMaterialDos btn_EliminarCategoria;
    private RSMaterialComponent.RSButtonMaterialDos btn_NuevaCategoria;
    private RSMaterialComponent.RSButtonMaterialDos btn_NuevoCliente;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_categoria;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_clientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_entradas;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_inicio;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_provedor;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_salidas;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_salir;
    private javax.swing.JTextField busqueda_categoria;
    private javax.swing.JPanel filtrar_texto_categoria;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private paneles.PanelRound opciones;
    // End of variables declaration//GEN-END:variables
}
