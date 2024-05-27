/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.Anfitrion;
import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;

/**
 *
 * @author Miguel
 */
public class VerObjetos extends javax.swing.JPanel {

    /**
     * Creates new form verObjetos
     */
    public VerObjetos() {
        
        initComponents();
        
        if (BaseDatos.user.getTipo() == 0){
            pintarLista(BaseDatos.verObjetos);
        }
        else if(BaseDatos.user.getTipo() == 2){
            pintarLista(BaseDatos.verObjetos, BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        BaseDatos.verObjetos = null;
        
        if (BaseDatos.user.getTipo() == 0){
            GestorVentanas.cambioVentana("VerObjetos", "PaginaAdministrador");
        }
        else{
            GestorVentanas.cambioVentana("VerObjetos", "AjustesUsuario");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public void pintarLista(String tipo){
        ListaObjetos listaObjetos = new ListaObjetos(tipo);
        this.jScrollPane1.setViewportView(listaObjetos);
        jScrollPane1.revalidate();
        jScrollPane1.repaint();
    }
    
    public void pintarLista(String tipo, Anfitrion anfitrion){
        ListaObjetos listaObjetos = new ListaObjetos(tipo, BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()));
        this.jScrollPane1.setViewportView(listaObjetos);
        jScrollPane1.revalidate();
        jScrollPane1.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
