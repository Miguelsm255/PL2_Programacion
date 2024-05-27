/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import bonilladesande.pl2_bonilla_desande_23_24.BibliotecaExcepciones;
import bonilladesande.pl2_bonilla_desande_23_24.Factura;
import bonilladesande.pl2_bonilla_desande_23_24.Particular;
import bonilladesande.pl2_bonilla_desande_23_24.Reserva;
import bonilladesande.pl2_bonilla_desande_23_24.TextPrompt;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class ReservarInmueble extends javax.swing.JFrame {

    /**
     * Creates new form ReservarInmueble
     */
    /*EL PRECIO FINAL SE INICIA COMO ALGO OCULTO, YA QUE NO SE PUEDE SABER HASTA
    QUE NO SE ESTABLEZCAN EL NÚMERO DE DÍAS QUE DURARÁ LA RESERVA. ADEMÁS DE ESO, NECESITAMOS
    LOS NOMBRES DEL PARTICULAR QUE COMPRA EL INMUEBLE Y EL DEL PROPIO INMUEBLE. TAMBIÉN
    SE AÑADIERON PLACEHOLDERS PARA GARANTIZAR QUE LAS FECHAS SE INTRODUCEN EN EL FORMATO CORRECTO.*/
    public ReservarInmueble() {
        TextPrompt fechainicioplace = new TextPrompt("dd/mm/yyyy", fechaInicioString);
        TextPrompt fechafinplace = new TextPrompt("dd/mm/yyyy", fechaFinString);
        initComponents();
        PreciodelaReserva.setVisible(false);
        PrecioFinalReserva.setVisible(false);
        LabelParticular.setText(BaseDatos.user.getNombre());
        InmuebleCompra.setText(BaseDatos.inmuebleSeleccionado.getTitulo());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        InmuebleCompra = new javax.swing.JLabel();
        LabelParticular = new javax.swing.JLabel();
        PreciodelaReserva = new javax.swing.JLabel();
        PrecioFinalReserva = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        SeConfirmanLasFechas = new javax.swing.JButton();
        fechaInicioString = new javax.swing.JTextField();
        ReservaButton = new javax.swing.JButton();
        fechaFinString = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Particular que realiza la compra:");

        jLabel2.setText("Inmueble que compra:");

        jLabel4.setText("Fecha de inicio de reserva:");

        jLabel5.setText("Fecha de fin de reserva:");

        jLabel3.setText("Precio de la reserva:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Precio total de la reserva:");

        PrecioFinalReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Salir.setText("Cancelar");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        SeConfirmanLasFechas.setText("Confirmar Fechas");
        SeConfirmanLasFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeConfirmanLasFechasActionPerformed(evt);
            }
        });

        ReservaButton.setText("Reservar");
        ReservaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReservaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrecioFinalReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PreciodelaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SeConfirmanLasFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fechaFinString, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fechaInicioString, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InmuebleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InmuebleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fechaInicioString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fechaFinString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(SeConfirmanLasFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PreciodelaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioFinalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReservaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //SI SE PRESIONA EL BOTÓN SALIR, SE SALE DE LA APLICACIÓN.
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed
    //ESTE MÉTODO SIRVE PARA ASEGURARSE DE QUE LAS FECHAS INTRODUCIDAS SON CORRECTAS.
    private void SeConfirmanLasFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeConfirmanLasFechasActionPerformed
        try {
            String fechaInicioIntroducida = fechaInicioString.getText();
            String fechaFinIntroducida = fechaFinString.getText();
            //SE UTILIZA SPLIT PARA SEPARAR LAS FECHAS POR EL SLASH.
            String[] fechaInicioSplit = fechaInicioIntroducida.split("/");
            String[] fechaFinSplit = fechaFinIntroducida.split("/");

            LocalDate ahora = LocalDate.now();
            //SE HACEN VARIABLES DE FECHAS CON LOS DATOS OBTENIDOS MEDIANTE EL SPLIT.
            LocalDate inicio = LocalDate.of(Integer.parseInt(fechaInicioSplit[2]), Integer.parseInt(fechaInicioSplit[1]), Integer.parseInt(fechaInicioSplit[0]));
            LocalDate fin = LocalDate.of(Integer.parseInt(fechaFinSplit[2]), Integer.parseInt(fechaFinSplit[1]), Integer.parseInt(fechaFinSplit[0]));

            //COMPRUEBA SI LAS FECHAS SON VÁLIDAS.
            if (inicio.isBefore(ahora) || fin.isBefore(ahora)) {
                throw new BibliotecaExcepciones.FechaMenor("Las fechas no pueden ser menores que la fecha actual.");
            }
            if (fin.isBefore(inicio)) {
                throw new BibliotecaExcepciones.FechaFinMenorInicio("La fecha de fin de reserva no puede ser menor que la de inicio.");
            }

            //CALCULA LA CANTIDAD DE DÍAS.
            long dias = ChronoUnit.DAYS.between(inicio, fin);
            double precionoche = BaseDatos.inmuebleSeleccionado.getPrecioNoche();
            double preciofinal;

            //CALCULA EL PRECIO FINAL, AÑADIENDO, EN CASO DE SER VIP, UN 10% DE DESCUENTO.
            if (BaseDatos.user.isVip()) {
                preciofinal = precionoche * dias * 0.9;
            } else {
                preciofinal = precionoche * dias;
            }

            //MUESTRA EL PRECIO FINAL EN EL CAMPO CIRRESPONDIENTE.
            PrecioFinalReserva.setText(String.valueOf(preciofinal));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Alguno de los formatos numéricos es erróneo.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "El campo de las fechas es erróneo.");}
            catch (BibliotecaExcepciones.FechaMenor | BibliotecaExcepciones.FechaFinMenorInicio e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_SeConfirmanLasFechasActionPerformed

    //UNA VEZ SE PRESIONA EL BOTÓN DE RESERVAR, SE LLEVAN A CABO UNA SERIE DE PROCESOS.
    private void ReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservaButtonActionPerformed

        //Particular particularcompra = new Particular(BaseDatos.user.isVip(), BaseDatos.user.getTarjeta(), BaseDatos.user.getDni(), BaseDatos.user.getNombre(), BaseDatos.user.getCorreo(), BaseDatos.user.getClave(), BaseDatos.user.getTelefono());
        /*CREA UN OBJETO PARTICULAR (EL ÚNICO TIPO DE USUARIO QUE PUEDE COMPRAR UN INMUEBLE), Y TAMBIÉN CREA FECHAS DE 
    MANERA SIMILAR AL CÓMO LO HACÍA EN EL APARTADO ANTERIOR.*/
        Particular particularcompra = BaseDatos.particulares.get(BaseDatos.user.getPosicionArrayList());
        String fechaInicioIntroducida = fechaInicioString.getText();
        String fechaFinIntroducida = fechaFinString.getText();
        String[] fechaInicioSplit = fechaInicioIntroducida.split("/");
        String[] fechaFinSplit = fechaFinIntroducida.split("/");
        LocalDate inicio = LocalDate.of(Integer.parseInt(fechaInicioSplit[2]), Integer.parseInt(fechaInicioSplit[1]), Integer.parseInt(fechaInicioSplit[0]));
        LocalDate fin = LocalDate.of(Integer.parseInt(fechaFinSplit[2]), Integer.parseInt(fechaFinSplit[1]), Integer.parseInt(fechaFinSplit[0]));
        long dias = ChronoUnit.DAYS.between(inicio, fin);

        //CONOCIENDO EL PRECIO POR NOCHE DEL OBJETO SELECCIONADO, SE PUEDE CALCULAR EL PRECIO FINAL Y TRAS ESTO APLICARLE EL DESCUENTO.
        double precionoche = BaseDatos.inmuebleSeleccionado.getPrecioNoche();
        double preciofinal = precionoche * dias;
        if (BaseDatos.user.isVip()) {
            preciofinal *= 0.9;
        }

        //SE LE AÑADE LA RESERVA Y SE INTENTA IMPRIMIR LA FACTURA CON LA FUNCIÓN "imprimirFactura", la cual se encuentra en "Factura".
        try {
            Reserva.anadirReserva(particularcompra, BaseDatos.inmuebleSeleccionado, inicio, fin, preciofinal);
            Factura.imprimirFactura(particularcompra, BaseDatos.inmuebleSeleccionado, inicio, fin, preciofinal);
            JOptionPane.showMessageDialog(this, "Reserva completada correctamente.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error durante la impresión de la factura.");
        }


    }//GEN-LAST:event_ReservaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReservarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InmuebleCompra;
    private javax.swing.JLabel LabelParticular;
    private javax.swing.JLabel PrecioFinalReserva;
    private javax.swing.JLabel PreciodelaReserva;
    private javax.swing.JButton ReservaButton;
    private javax.swing.JButton Salir;
    private javax.swing.JButton SeConfirmanLasFechas;
    private javax.swing.JTextField fechaFinString;
    private javax.swing.JTextField fechaInicioString;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
