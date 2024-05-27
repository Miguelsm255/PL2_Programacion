package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaBNB extends javax.swing.JFrame {

    public JavaBNB() {
        initComponents();    
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Llamar a la función guardarDatos al cerrar la ventana
                BaseDatos.guardarDatosAnfitriones(BaseDatos.anfitriones);
                BaseDatos.guardarDatosInmuebles(BaseDatos.inmuebles);
                BaseDatos.guardarDatosParticulares(BaseDatos.particulares);
                BaseDatos.guardarDatosReservas(BaseDatos.reservas);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tituloLabelPaginaPrincipal = new javax.swing.JLabel();
        frameJavaBNB = new javax.swing.JScrollPane();
        usuarioJavaBNBboton = new javax.swing.JButton();
        fotoLabelJavaBNB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLabelPaginaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tituloLabelPaginaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabelPaginaPrincipal.setText("JavaBNB");
        tituloLabelPaginaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloLabelPaginaPrincipalMouseClicked(evt);
            }
        });

        frameJavaBNB.setBorder(null);
        frameJavaBNB.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        frameJavaBNB.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        usuarioJavaBNBboton.setText("Usuario");
        usuarioJavaBNBboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioJavaBNBbotonActionPerformed(evt);
            }
        });

        fotoLabelJavaBNB.setText("FOTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(tituloLabelPaginaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usuarioJavaBNBboton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotoLabelJavaBNB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameJavaBNB, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloLabelPaginaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioJavaBNBboton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(fotoLabelJavaBNB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameJavaBNB, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioJavaBNBbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioJavaBNBbotonActionPerformed
        
        GestorVentanas.cambioVentana("JavaBNB", "AjustesUsuario");
    }//GEN-LAST:event_usuarioJavaBNBbotonActionPerformed

    private void tituloLabelPaginaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloLabelPaginaPrincipalMouseClicked
        // TODO add your handling code here:
        GestorVentanas.cambioVentana("", "PaginaPrincipal");
    }//GEN-LAST:event_tituloLabelPaginaPrincipalMouseClicked

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
            java.util.logging.Logger.getLogger(JavaBNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaBNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaBNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaBNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaBNB().setVisible(true);
            }
        });    
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel fotoLabelJavaBNB;
    public javax.swing.JScrollPane frameJavaBNB;
    public javax.swing.JLabel tituloLabelPaginaPrincipal;
    public javax.swing.JButton usuarioJavaBNBboton;
    // End of variables declaration//GEN-END:variables
}
