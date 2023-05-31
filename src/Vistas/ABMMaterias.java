package Vistas;

import Modelo.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ABMMaterias extends javax.swing.JInternalFrame {


    public ABMMaterias() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        labelNombre = new javax.swing.JLabel();
        labelAnio = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        labelTitulo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        labelNombre.setText("Nombre:");

        labelAnio.setText("Año:");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado:");

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Dado de baja" }));

        labelTitulo.setText("Ficha de Modificacion de Materias");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAnio)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(72, 72, 72)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtAnio)
                            .addComponent(jcEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelNombre)
                        .addGap(65, 65, 65)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(544, 544, 544)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnGuardar)
                .addGap(399, 399, 399)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelTitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAnio)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(190, 347, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnCerrar))
                        .addGap(174, 174, 174))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        try {

            String estado_parceado = "";

            String nombre = jtNombre.getText();
            String year = jtAnio.getText();
            int estado = jcEstado.getSelectedIndex(), yearParceado;
            boolean estados = false;
            yearParceado = Integer.parseInt(year);

            if (!nombre.isEmpty()) {
                estado_parceado = estado + "";

                if (!year.isEmpty()) {
                    if (!estado_parceado.isEmpty()) {

                        Materia materias = new Materia(nombre, yearParceado, estados);

                        if (estado == 1) {
                            //ArrayList<Materia> arrayMateriasD = (ArrayList<Materia>) Menu.materiaEscritorio.listarDeshabilitadas();
                            ArrayList<Materia> arrayMateriasA = (ArrayList<Materia>) Menu.materiaEscritorio.listarHabilitadas();
                            if (arrayMateriasA.size() > 0) {
                                for (int n = 0; n < arrayMateriasA.size(); n++) {
                                    if (nombre.equals(arrayMateriasA.get(n).getNombre())) {
                                        int id = arrayMateriasA.get(n).getId_materia();
                                        Menu.materiaEscritorio.buscarMateria(id);
                                        Menu.materiaEscritorio.actualizarMateria(materias);
                                        Menu.materiaEscritorio.listarDeshabilitadas().add(materias);
                                        Menu.materiaEscritorio.deshabilitarMateria(id);

                                    }
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "No hay materias dadas de baja ", "", JOptionPane.INFORMATION_MESSAGE);
                            }

                        }

                        if (estado == 0) {
                            ArrayList<Materia> arrayMateriasD = (ArrayList<Materia>) Menu.materiaEscritorio.listarDeshabilitadas();

                            if (arrayMateriasD.size() > 0) {
                                for (int m = 0; m < arrayMateriasD.size(); m++) {
                                    if (nombre.equals(arrayMateriasD.get(m).getNombre())) {
                                        int id = arrayMateriasD.get(m).getId_materia();
                                        Menu.materiaEscritorio.buscarMateria(id);
                                        Menu.materiaEscritorio.actualizarMateria(materias);
                                        Menu.materiaEscritorio.listarHabilitadas().add(materias);
                                        Menu.materiaEscritorio.habilitarMateria(id);
                                    }

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay materias activas ", "", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Debe ingresar una opcion");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un año");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
            }

        } catch (Exception atrapa) {

            JOptionPane.showMessageDialog(this, "Datos incorrectos");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        jtNombre.setText("");
        jtAnio.setText("");
        jcEstado.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JLabel labelAnio;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
