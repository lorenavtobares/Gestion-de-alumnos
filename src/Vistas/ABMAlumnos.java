package Vistas;

import Modelo.Alumno;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.time.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ABMAlumnos extends javax.swing.JInternalFrame {

    public ABMAlumnos() {
        initComponents();
        formatoCalendario();
        iconDniVerificado.setVisible(false);
        iconDniError.setVisible(false);
        cargandoAlumnoHabilitadoV2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jtpPanel = new javax.swing.JTabbedPane();
        ImageIcon icon = new ImageIcon ( getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png") );
        Image image = icon.getImage();
        jpNuevoAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        btnAltaGuardar1 = new javax.swing.JButton();
        btnAltaLimpiar1 = new javax.swing.JButton();
        btnAltaCerrar1 = new javax.swing.JButton();
        jtDni1 = new javax.swing.JTextField();
        jtNombre1 = new javax.swing.JTextField();
        jtApellido1 = new javax.swing.JTextField();
        jdFechaNacimiento1 = new com.toedter.calendar.JDateChooser();
        iconDniVerificado = new javax.swing.JLabel();
        iconDniError = new javax.swing.JLabel();
        jpAltaAlumno = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jtApellidoUp2 = new javax.swing.JTextField();
        jtNombreUp2 = new javax.swing.JTextField();
        jdFechaNacimientoDelete2 = new com.toedter.calendar.JDateChooser();
        btnAltaGuardarUp2 = new javax.swing.JButton();
        btnDeleteCerrar2 = new javax.swing.JButton();
        jtDniUp2 = new javax.swing.JTextField();
        jpBajaAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        btnDeleteCerrar3 = new javax.swing.JButton();
        jtDniUp3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jtApellidoUp3 = new javax.swing.JTextField();
        jtNombreUp3 = new javax.swing.JTextField();
        jdFechaNacimientoDelete3 = new com.toedter.calendar.JDateChooser();
        btnAltaGuardarUp3 = new javax.swing.JButton();
        jpUpdateAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        btnUpCerrar4 = new javax.swing.JButton();
        jtDniUp4 = new javax.swing.JTextField();
        jtApellidoUp4 = new javax.swing.JTextField();
        jtNombreUp4 = new javax.swing.JTextField();
        jdFechaNacimientoUp4 = new com.toedter.calendar.JDateChooser();
        btnAltaGuardarUp4 = new javax.swing.JButton();
        jcbEstado4 = new javax.swing.JComboBox<>();
        jcbListaAlumnos4 = new javax.swing.JComboBox<>();

        jLabel4.setText("jLabel4");

        btnAltaGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnAltaGuardar1.setText("Guardar");
        btnAltaGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardar1ActionPerformed(evt);
            }
        });

        btnAltaLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/escoba (1).png"))); // NOI18N
        btnAltaLimpiar1.setText("Limpiar");
        btnAltaLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaLimpiar1ActionPerformed(evt);
            }
        });

        btnAltaCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnAltaCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaCerrar1ActionPerformed(evt);
            }
        });

        jtDni1.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        jtNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jtApellido1.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jdFechaNacimiento1.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        iconDniVerificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/verificado.png"))); // NOI18N

        iconDniError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/VerificadoNO.png"))); // NOI18N

        javax.swing.GroupLayout jpNuevoAlumnoLayout = new javax.swing.GroupLayout(jpNuevoAlumno);
        jpNuevoAlumno.setLayout(jpNuevoAlumnoLayout);
        jpNuevoAlumnoLayout.setHorizontalGroup(
            jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoAlumnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAltaCerrar1))
            .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtApellido1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtNombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtDni1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFechaNacimiento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaGuardar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaLimpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(iconDniVerificado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconDniError)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jpNuevoAlumnoLayout.setVerticalGroup(
            jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoAlumnoLayout.createSequentialGroup()
                .addComponent(btnAltaCerrar1)
                .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpNuevoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconDniVerificado)
                            .addComponent(iconDniError)))
                    .addGroup(jpNuevoAlumnoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdFechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(btnAltaGuardar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAltaLimpiar1)
                .addGap(46, 46, 46))
        );

        jtpPanel.addTab("Nuevo Alumno", jpNuevoAlumno);

        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA ALUMNOS"));

        jtApellidoUp2.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jtNombreUp2.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jdFechaNacimientoDelete2.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        btnAltaGuardarUp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        btnAltaGuardarUp2.setText("Borrar Registro");
        btnAltaGuardarUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarUp2ActionPerformed(evt);
            }
        });

        btnDeleteCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnDeleteCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCerrar2ActionPerformed(evt);
            }
        });

        jtDniUp2.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        javax.swing.GroupLayout jpAltaAlumnoLayout = new javax.swing.GroupLayout(jpAltaAlumno);
        jpAltaAlumno.setLayout(jpAltaAlumnoLayout);
        jpAltaAlumnoLayout.setHorizontalGroup(
            jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAltaAlumnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeleteCerrar2))
            .addGroup(jpAltaAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtApellidoUp2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtNombreUp2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtDniUp2)
                    .addComponent(jdFechaNacimientoDelete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaGuardarUp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jpAltaAlumnoLayout.setVerticalGroup(
            jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAltaAlumnoLayout.createSequentialGroup()
                .addComponent(btnDeleteCerrar2)
                .addGap(3, 3, 3)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtDniUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtApellidoUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNombreUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdFechaNacimientoDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAltaGuardarUp2)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jtpPanel.addTab("Alta de Alumno", jpAltaAlumno);

        btnDeleteCerrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnDeleteCerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCerrar3ActionPerformed(evt);
            }
        });

        jtDniUp3.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA ALUMNOS"));

        jtApellidoUp3.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jtNombreUp3.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jdFechaNacimientoDelete3.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        btnAltaGuardarUp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        btnAltaGuardarUp3.setText("Borrar Registro");
        btnAltaGuardarUp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarUp3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBajaAlumnoLayout = new javax.swing.GroupLayout(jpBajaAlumno);
        jpBajaAlumno.setLayout(jpBajaAlumnoLayout);
        jpBajaAlumnoLayout.setHorizontalGroup(
            jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBajaAlumnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeleteCerrar3))
            .addGroup(jpBajaAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtApellidoUp3, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtNombreUp3, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtDniUp3)
                    .addComponent(jdFechaNacimientoDelete3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaGuardarUp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jpBajaAlumnoLayout.setVerticalGroup(
            jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBajaAlumnoLayout.createSequentialGroup()
                .addComponent(btnDeleteCerrar3)
                .addGap(3, 3, 3)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtDniUp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtApellidoUp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNombreUp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdFechaNacimientoDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAltaGuardarUp3)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jtpPanel.addTab("Baja de alumno", jpBajaAlumno);

        btnUpCerrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnUpCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpCerrar4ActionPerformed(evt);
            }
        });

        jtDniUp4.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        jtApellidoUp4.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jtNombreUp4.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jdFechaNacimientoUp4.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        btnAltaGuardarUp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/recargar.png"))); // NOI18N
        btnAltaGuardarUp4.setText("Actualizar Registro");
        btnAltaGuardarUp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarUp4ActionPerformed(evt);
            }
        });

        jcbEstado4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HABILITADO", "DESHABILITADO" }));
        jcbEstado4.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTADO"));

        jcbListaAlumnos4.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA ALUMNOS"));

        javax.swing.GroupLayout jpUpdateAlumnoLayout = new javax.swing.GroupLayout(jpUpdateAlumno);
        jpUpdateAlumno.setLayout(jpUpdateAlumnoLayout);
        jpUpdateAlumnoLayout.setHorizontalGroup(
            jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jcbEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtApellidoUp4, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addComponent(jtNombreUp4, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addComponent(jtDniUp4)
                            .addComponent(jdFechaNacimientoUp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAltaGuardarUp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jcbListaAlumnos4, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnUpCerrar4))
        );
        jpUpdateAlumnoLayout.setVerticalGroup(
            jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUpdateAlumnoLayout.createSequentialGroup()
                .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpCerrar4)
                    .addGroup(jpUpdateAlumnoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jcbListaAlumnos4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDniUp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtApellidoUp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtNombreUp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jdFechaNacimientoUp4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnAltaGuardarUp4)
                .addContainerGap())
        );

        jtpPanel.addTab("Actualizar Datos Personales", jpUpdateAlumno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCerrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCerrar2ActionPerformed

    private void btnAltaGuardarUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarUp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaGuardarUp2ActionPerformed

    private void btnAltaGuardarUp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarUp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaGuardarUp4ActionPerformed

    private void btnUpCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpCerrar4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnUpCerrar4ActionPerformed

    private void btnAltaGuardarUp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarUp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaGuardarUp3ActionPerformed

    private void btnDeleteCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCerrar3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDeleteCerrar3ActionPerformed

    private void btnAltaCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaCerrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAltaCerrar1ActionPerformed

    private void btnAltaLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaLimpiar1ActionPerformed
        jtDni1.setText("");
        jtApellido1.setText("");
        jtNombre1.setText("");
        jdFechaNacimiento1.setDate(new Date());
    }//GEN-LAST:event_btnAltaLimpiar1ActionPerformed

    private void btnAltaGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardar1ActionPerformed
        String dni = jtDni1.getText();
        int dniParceado = Integer.parseInt(dni);
        String apellido = jtApellido1.getText();
        String nombre = jtNombre1.getText();
        LocalDate fechaNacimiento = jdFechaNacimiento1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (!dni.isEmpty()) {
            iconDniVerificado.setVisible(true);
            iconDniError.setVisible(false);
            if (!apellido.isEmpty()) {
                if (!nombre.isEmpty()) {
                        Alumno estudiante = new Alumno(dniParceado, apellido, nombre, fechaNacimiento, true);
                        
                            Menu.alumnoEscritorio.guardarAlumno(estudiante);
                            Menu.alumnoEscritorio.actualizarAlumno(estudiante);
                        
                }else{
                    JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
                    jtNombre1.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Debe ingresar un apellido", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
                jtApellido1.requestFocus();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            iconDniVerificado.setVisible(false);
            iconDniError.setVisible(true);
            jtDni1.requestFocus();
        }
    }//GEN-LAST:event_btnAltaGuardar1ActionPerformed

    public void formatoCalendario(){
        //jdFechaNacimiento.setLocale(new Locale("es"));
        //jdFechaNacimiento.setDateFormatString("dd-MM-yyyy");
        
        jdFechaNacimiento1.setDate(new Date());
        jdFechaNacimientoUp4.setDate(new Date());
        jdFechaNacimientoDelete3.setDate(new Date());
        
        jdFechaNacimiento1.getJCalendar().setMaxSelectableDate(new Date());
    }
         
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaCerrar1;
    private javax.swing.JButton btnAltaGuardar1;
    private javax.swing.JButton btnAltaGuardarUp2;
    private javax.swing.JButton btnAltaGuardarUp3;
    private javax.swing.JButton btnAltaGuardarUp4;
    private javax.swing.JButton btnAltaLimpiar1;
    private javax.swing.JButton btnDeleteCerrar2;
    private javax.swing.JButton btnDeleteCerrar3;
    private javax.swing.JButton btnUpCerrar4;
    private javax.swing.JLabel iconDniError;
    private javax.swing.JLabel iconDniVerificado;
    private javax.swing.JComboBox<Alumno> jComboBox2;
    private javax.swing.JComboBox<Alumno> jComboBox3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jcbEstado4;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos4;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento1;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoDelete2;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoDelete3;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoUp4;
    private javax.swing.JPanel jpAltaAlumno;
    private javax.swing.JPanel jpBajaAlumno;
    private javax.swing.JPanel jpNuevoAlumno;
    private javax.swing.JPanel jpUpdateAlumno;
    private javax.swing.JTextField jtApellido1;
    private javax.swing.JTextField jtApellidoUp2;
    private javax.swing.JTextField jtApellidoUp3;
    private javax.swing.JTextField jtApellidoUp4;
    private javax.swing.JTextField jtDni1;
    private javax.swing.JTextField jtDniUp2;
    private javax.swing.JTextField jtDniUp3;
    private javax.swing.JTextField jtDniUp4;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JTextField jtNombreUp2;
    private javax.swing.JTextField jtNombreUp3;
    private javax.swing.JTextField jtNombreUp4;
    private javax.swing.JTabbedPane jtpPanel;
    // End of variables declaration//GEN-END:variables

   

    private void cargandoAlumnoHabilitadoV2() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Alumno> arrayAlumnosA = (ArrayList<Alumno>) Menu.alumnoEscritorio.listarHabilitados();
        for (Alumno alumno : arrayAlumnosA) {
            jComboBox2.addItem(alumno);
        }
    
    }
}
