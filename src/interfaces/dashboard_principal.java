
package interfaces;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class dashboard_principal extends javax.swing.JFrame {
    private JPanel panelContenido;
    
    
    CardLayout vista_catego;
    paneles.categoria categoria = new paneles.categoria();
    
    public dashboard_principal() {
    initComponents();

    this.setSize(1409, 773);
    this.setLocationRelativeTo(null);

    vista_catego = (CardLayout) PanelVista_principal.getLayout();
    PanelVista_principal.add(categoria, "categoria");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        PanelVista_principal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSButtonMaterialIconDos1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        rSButtonMaterialIconDos2 = new RSMaterialComponent.RSButtonMaterialIconDos();
        rSButtonMaterialIconDos3 = new RSMaterialComponent.RSButtonMaterialIconDos();
        rSButtonMaterialIconDos4 = new RSMaterialComponent.RSButtonMaterialIconDos();
        rSButtonMaterialIconDos5 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jSeparator1 = new javax.swing.JSeparator();
        rSButtonMaterialIconDos6 = new RSMaterialComponent.RSButtonMaterialIconDos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        PanelVista_principal.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(PanelVista_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1205, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PanelVista_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(13, 32, 52));

        jLabel1.setFont(new java.awt.Font("Dialog.bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE");

        jLabel2.setFont(new java.awt.Font("Dialog.bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVENTARIO");

        rSButtonMaterialIconDos1.setBackground(new java.awt.Color(13, 32, 52));
        rSButtonMaterialIconDos1.setText("INICIO");
        rSButtonMaterialIconDos1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);

        rSButtonMaterialIconDos2.setBackground(new java.awt.Color(13, 32, 52));
        rSButtonMaterialIconDos2.setText("CATEGORIA");
        rSButtonMaterialIconDos2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CARD_MEMBERSHIP);
        rSButtonMaterialIconDos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconDos2ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconDos3.setBackground(new java.awt.Color(13, 32, 52));
        rSButtonMaterialIconDos3.setText("ENTRADAS");
        rSButtonMaterialIconDos3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CALL_MADE);

        rSButtonMaterialIconDos4.setBackground(new java.awt.Color(13, 32, 52));
        rSButtonMaterialIconDos4.setText("SALIDAS");
        rSButtonMaterialIconDos4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CALL_MISSED);

        rSButtonMaterialIconDos5.setBackground(new java.awt.Color(13, 32, 52));
        rSButtonMaterialIconDos5.setText("PROVEDORES");
        rSButtonMaterialIconDos5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NAVIGATION);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        rSButtonMaterialIconDos6.setBackground(new java.awt.Color(204, 0, 0));
        rSButtonMaterialIconDos6.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonMaterialIconDos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconDos6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)))
                                .addComponent(rSButtonMaterialIconDos2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(rSButtonMaterialIconDos3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(rSButtonMaterialIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(rSButtonMaterialIconDos4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(rSButtonMaterialIconDos5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(rSButtonMaterialIconDos6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(rSButtonMaterialIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(rSButtonMaterialIconDos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(rSButtonMaterialIconDos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(rSButtonMaterialIconDos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(rSButtonMaterialIconDos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(rSButtonMaterialIconDos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void rSButtonMaterialIconDos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconDos2ActionPerformed
     vista_catego.show(PanelVista_principal, "categoria");
    }//GEN-LAST:event_rSButtonMaterialIconDos2ActionPerformed

    private void rSButtonMaterialIconDos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconDos6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonMaterialIconDos6ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(dashboard_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVista_principal;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos1;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos2;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos3;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos4;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos5;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos6;
    // End of variables declaration//GEN-END:variables
}
