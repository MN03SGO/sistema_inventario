package paneles;

import controladores.dao_categoria;
import Jdialog.categoria.nueva_catego;
import javax.swing.SwingUtilities;

public class categoria extends javax.swing.JPanel {

    dao_categoria dao_Catego = new dao_categoria();

    public categoria() {
        initComponents();
        this.setLocation(1616, 870);
    }

    private javax.swing.ImageIcon getIcon(String resourcePath) {
        java.net.URL location = getClass().getResource(resourcePath);
        return location != null ? new javax.swing.ImageIcon(location) : null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_buscadorCatego = new javax.swing.JTextField();
        btn_buscarCatego = new RSMaterialComponent.RSButtonMaterialIconUno();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_filtra = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_NuevaCategoria = new RSMaterialComponent.RSButtonMaterialDos();
        btn_EditarCategoria = new RSMaterialComponent.RSButtonMaterialDos();
        btn_EliminarCategoria = new RSMaterialComponent.RSButtonMaterialDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        btn_buscarCatego.setText("Nuevo cliente");
        btn_buscarCatego.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btn_buscarCatego.setRound(30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog.bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gestión de Categorías");

        jLabel5.setFont(new java.awt.Font("Dialog.bold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Administre las categorias de productos del sistema de inventario central");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("FILTRAR POR TEXTO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activos", "Inactivos" }));
        jComboBox1.setBorder(null);

        btn_NuevaCategoria.setBorder(null);
        btn_NuevaCategoria.setForeground(new java.awt.Color(0, 112, 192));
        btn_NuevaCategoria.setText("Nueva categoria");
        btn_NuevaCategoria.setBorderPainted(false);
        btn_NuevaCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NuevaCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_NuevaCategoria.setEffectButton(RSMaterialComponent.RSButtonMaterialDos.EFFECTBUTTON.RAISED);
        btn_NuevaCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NuevaCategoria.setOpaque(true);
        btn_NuevaCategoria.setRequestFocusEnabled(false);
        btn_NuevaCategoria.setRolloverEnabled(false);
        btn_NuevaCategoria.setRound(25);
        btn_NuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevaCategoriaActionPerformed(evt);
            }
        });

        btn_EditarCategoria.setBorder(null);
        btn_EditarCategoria.setForeground(new java.awt.Color(0, 112, 192));
        btn_EditarCategoria.setText("Editar");
        btn_EditarCategoria.setBorderPainted(false);
        btn_EditarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EditarCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_EditarCategoria.setEffectButton(RSMaterialComponent.RSButtonMaterialDos.EFFECTBUTTON.RAISED);
        btn_EditarCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_EditarCategoria.setOpaque(true);
        btn_EditarCategoria.setRequestFocusEnabled(false);
        btn_EditarCategoria.setRolloverEnabled(false);
        btn_EditarCategoria.setRound(25);

        btn_EliminarCategoria.setBackground(new java.awt.Color(255, 44, 0));
        btn_EliminarCategoria.setBorder(null);
        btn_EliminarCategoria.setForeground(new java.awt.Color(227, 56, 23));
        btn_EliminarCategoria.setText("Eliminar");
        btn_EliminarCategoria.setBorderPainted(false);
        btn_EliminarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EliminarCategoria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_EliminarCategoria.setEffectButton(RSMaterialComponent.RSButtonMaterialDos.EFFECTBUTTON.RAISED);
        btn_EliminarCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_EliminarCategoria.setOpaque(true);
        btn_EliminarCategoria.setRequestFocusEnabled(false);
        btn_EliminarCategoria.setRolloverEnabled(false);
        btn_EliminarCategoria.setRound(25);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(txt_buscadorCatego, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_filtra, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(btn_NuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_EditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_EliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscadorCatego, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevaCategoriaActionPerformed
        nueva_catego dialog = new nueva_catego((java.awt.Frame)SwingUtilities.getWindowAncestor(this),true);
        
        
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_btn_NuevaCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialDos btn_EditarCategoria;
    private RSMaterialComponent.RSButtonMaterialDos btn_EliminarCategoria;
    private RSMaterialComponent.RSButtonMaterialDos btn_NuevaCategoria;
    private RSMaterialComponent.RSButtonMaterialIconUno btn_buscarCatego;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_buscadorCatego;
    private javax.swing.JTextField txt_filtra;
    // End of variables declaration//GEN-END:variables
}
