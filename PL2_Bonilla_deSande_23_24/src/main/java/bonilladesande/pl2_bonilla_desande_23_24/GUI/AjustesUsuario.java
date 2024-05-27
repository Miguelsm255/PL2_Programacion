package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AjustesUsuario extends javax.swing.JPanel {

    /**
     * Creates new form AjustesUsuario
     */
    public AjustesUsuario() {
        initComponents();
        
        if (BaseDatos.user.getTipo()== 1 || BaseDatos.user.getTipo()== 0){
            verInmuebles.setVisible(false);
        }
        
        //String userDir = System.getProperty("user.dir");
        //String ruta = userDir + File.separator + "resources" + File.separator + "Michi.png";
        //perfil.setIcon(setIcono(ruta, perfil));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombreLabelAjustesUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        claveLabelAjustesUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        telefonoLabelAjustesUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        correoLabelAjustesUsuario = new javax.swing.JLabel();
        saludoLabelAjustesUsuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Settings = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fotoUsuarioBoton = new javax.swing.JButton();
        verReservas = new javax.swing.JButton();
        verClave = new javax.swing.JToggleButton();
        verInmuebles = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Nombre de Usuario:");

        nombreLabelAjustesUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        nombreLabelAjustesUsuario.setText("Aquí va el nombre de Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setText("Contraseña Actual: ");

        claveLabelAjustesUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        claveLabelAjustesUsuario.setText("Aquí va la contraseña");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Teléfono Actual:");

        telefonoLabelAjustesUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        telefonoLabelAjustesUsuario.setText("Aquí va el teléfono");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setText("Correo Actual:");

        correoLabelAjustesUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        correoLabelAjustesUsuario.setText("Aquí va el correo");

        saludoLabelAjustesUsuario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        saludoLabelAjustesUsuario.setText("¡Hola, ---------!");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setText("¡Esta es tu página de Usuario!");

        Settings.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Settings.setText("¿Necesitas hacer algún cambio?");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fotoUsuarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoUsuarioBotonActionPerformed(evt);
            }
        });

        verReservas.setText("Mis Reservas");
        verReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReservasActionPerformed(evt);
            }
        });

        verClave.setText("jToggleButton1");
        verClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verClaveActionPerformed(evt);
            }
        });

        verInmuebles.setText("Mis Inmuebles");
        verInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInmueblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fotoUsuarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(claveLabelAjustesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreLabelAjustesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoLabelAjustesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(correoLabelAjustesUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(verClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saludoLabelAjustesUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(verInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saludoLabelAjustesUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoUsuarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreLabelAjustesUsuario))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(claveLabelAjustesUsuario)
                            .addComponent(verClave))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoLabelAjustesUsuario))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoLabelAjustesUsuario))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        GestorVentanas.cambioVentana("AjustesUsuario", "EditarAjustesUsuario");
        
    }//GEN-LAST:event_SettingsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GestorVentanas.cambioVentana("AjustesUsuario", "PaginaPrincipal");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void verReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verReservasActionPerformed

    private void fotoUsuarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoUsuarioBotonActionPerformed
        // TODO add your handling code here:
        GestorVentanas.cambioVentana("", "SubirFoto");
    }//GEN-LAST:event_fotoUsuarioBotonActionPerformed

    private void verClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verClaveActionPerformed

    private void verInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInmueblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verInmueblesActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Settings;
    public javax.swing.JLabel claveLabelAjustesUsuario;
    public javax.swing.JLabel correoLabelAjustesUsuario;
    public javax.swing.JButton fotoUsuarioBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel nombreLabelAjustesUsuario;
    public javax.swing.JLabel saludoLabelAjustesUsuario;
    public javax.swing.JLabel telefonoLabelAjustesUsuario;
    private javax.swing.JToggleButton verClave;
    private javax.swing.JButton verInmuebles;
    private javax.swing.JButton verReservas;
    // End of variables declaration//GEN-END:variables
}
