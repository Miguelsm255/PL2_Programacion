package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.*;
import java.awt.Color;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabelLogin = new javax.swing.JLabel();
        emailLabelLogin = new javax.swing.JLabel();
        claveLabelLogin = new javax.swing.JLabel();
        emailFieldLogin = new javax.swing.JTextField();
        iniciarSesionButtonLogin = new javax.swing.JButton();
        crearCuentaButtonLogin = new javax.swing.JLabel();
        claveFieldLogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLabelLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tituloLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabelLogin.setText("JavaBNB");

        emailLabelLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLabelLogin.setText("E-mail:");

        claveLabelLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        claveLabelLogin.setText("Clave:");

        emailFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldLoginActionPerformed(evt);
            }
        });

        iniciarSesionButtonLogin.setText("Iniciar Sesión");
        iniciarSesionButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionButtonLoginActionPerformed(evt);
            }
        });

        crearCuentaButtonLogin.setText("No tienes cuenta? Regístrate aquí.");
        crearCuentaButtonLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                crearCuentaButtonLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                crearCuentaButtonLoginFocusLost(evt);
            }
        });
        crearCuentaButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCuentaButtonLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(tituloLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crearCuentaButtonLogin)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(claveLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailFieldLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(claveFieldLogin))))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iniciarSesionButtonLogin)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(tituloLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(iniciarSesionButtonLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crearCuentaButtonLogin)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldLoginActionPerformed

    private void iniciarSesionButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionButtonLoginActionPerformed
        
        char[] passwordChars = claveFieldLogin.getPassword();
        String password = new String(passwordChars);
        String email = emailFieldLogin.getText();
        
        System.out.println(email);
        System.out.println(password);
        
        UserLoged user = bonilladesande.pl2_bonilla_desande_23_24.Login.login(email, password);
       
        // SI LA INFORMACIÓN NO ES CORRECTA
        if (user.getTipo() == -1){
            // MOSTRAR LABEL DE "CORREO O CONTRASEÑA INCORRECTOS"
            user = null;
        }
        // SI ES ADMINISTRADOR
        else if(user.getTipo() == 0){
            GestorVentanas.cambioVentana("Login", "PaginaAdministrador");
        }
        // SI LA INFORMACIÓN SI ES CORRECTA
        else{
            GestorVentanas.cambioVentana("Login", "PaginaPrincipal");
        }
    }//GEN-LAST:event_iniciarSesionButtonLoginActionPerformed

    private void crearCuentaButtonLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_crearCuentaButtonLoginFocusGained
        // TODO add your handling code here:
        crearCuentaButtonLogin.setForeground(new Color(81, 186, 255)); //Azul claro
    }//GEN-LAST:event_crearCuentaButtonLoginFocusGained

    private void crearCuentaButtonLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_crearCuentaButtonLoginFocusLost
        // TODO add your handling code here:
        crearCuentaButtonLogin.setForeground(new Color(53, 53, 239)); //Azul oscuro
    }//GEN-LAST:event_crearCuentaButtonLoginFocusLost

    private void crearCuentaButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaButtonLoginMouseClicked
        
        //ABRIR VENTANA DE CREAR CUENTA      
        GestorVentanas.cambioVentana("Login", "CrearCuenta");
    }//GEN-LAST:event_crearCuentaButtonLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField claveFieldLogin;
    private javax.swing.JLabel claveLabelLogin;
    private javax.swing.JLabel crearCuentaButtonLogin;
    private javax.swing.JTextField emailFieldLogin;
    private javax.swing.JLabel emailLabelLogin;
    private javax.swing.JButton iniciarSesionButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tituloLabelLogin;
    // End of variables declaration//GEN-END:variables
}
