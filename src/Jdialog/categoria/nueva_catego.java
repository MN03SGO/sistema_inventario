
package Jdialog.categoria;

import constructores.Categorias;
import controladores.dao_categoria;
import javax.swing.JOptionPane;

public class nueva_catego extends javax.swing.JDialog {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(nueva_catego.class.getName());

    Categorias ct = new Categorias();
    dao_categoria daoCT= new dao_categoria();
    
    public nueva_catego(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    
    public void limpiar_campos(){
       
        id_nuevaCatego.setText("");
        nombre_nuevaCatego.setText("");
        estado_nuevaCatego.setSelectedIndex(0);
        
        nombre_nuevaCatego.requestFocus();


    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        id_nuevaCatego = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre_nuevaCatego = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        estado_nuevaCatego = new javax.swing.JComboBox<>();
        btn_saveNewCatego = new javax.swing.JButton();
        exit_NewCatego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog.bold", 1, 14)); // NOI18N
        jLabel1.setText("Nueva categoria");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog.bold", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Dialog.bold", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog.bold", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");

        estado_nuevaCatego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pendiente", "Revision", "Inexistente" }));

        btn_saveNewCatego.setText("Guardar");
        btn_saveNewCatego.addActionListener(this::btn_saveNewCategoActionPerformed);

        exit_NewCatego.setBackground(new java.awt.Color(204, 0, 0));
        exit_NewCatego.setForeground(new java.awt.Color(255, 255, 255));
        exit_NewCatego.setText("Cancelar");
        exit_NewCatego.addActionListener(this::exit_NewCategoActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_nuevaCatego)
                            .addComponent(nombre_nuevaCatego)
                            .addComponent(estado_nuevaCatego, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_saveNewCatego)
                        .addGap(18, 18, 18)
                        .addComponent(exit_NewCatego)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_nuevaCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre_nuevaCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estado_nuevaCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saveNewCatego)
                    .addComponent(exit_NewCatego))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_NewCategoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_NewCategoActionPerformed
        limpiar_campos();
    }//GEN-LAST:event_exit_NewCategoActionPerformed

    private void btn_saveNewCategoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveNewCategoActionPerformed
        String nombre = nombre_nuevaCatego.getText().trim();
        boolean estado = (estado_nuevaCatego.getSelectedIndex() == 0);
        
        if(nombre.isEmpty()){
         JOptionPane.showMessageDialog(null, "Por favor ingrese el nomnbre de la categoria");
         return;
        }
        ct.setNombre_categoria(nombre);
        ct.setEstado(estado);
        
        if(daoCT.insertar_categoria(ct)){
            JOptionPane.showMessageDialog(this, "Categoría ingresada exitosamente.");
            limpiar_campos();        

        } else 
        {
            JOptionPane.showMessageDialog(this, "Error al ingresar categoría.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_saveNewCategoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                nueva_catego dialog = new nueva_catego(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_saveNewCatego;
    private javax.swing.JComboBox<String> estado_nuevaCatego;
    private javax.swing.JButton exit_NewCatego;
    private javax.swing.JTextField id_nuevaCatego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombre_nuevaCatego;
    // End of variables declaration//GEN-END:variables
}
