package Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.time.*;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jtpPanel = new javax.swing.JTabbedPane();
        ImageIcon icon = new ImageIcon ( getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png") );
        Image image = icon.getImage();
        jpAltaAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        btnAltaGuardar = new javax.swing.JButton();
        btnAltaLimpiar = new javax.swing.JButton();
        btnAltaCerrar = new javax.swing.JButton();
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        iconDniVerificado = new javax.swing.JLabel();
        iconDniError = new javax.swing.JLabel();
        jpBajaAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        btnDeleteCerrar = new javax.swing.JButton();
        jtDniUp1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jtApellidoUp1 = new javax.swing.JTextField();
        jtNombreUp1 = new javax.swing.JTextField();
        jdFechaNacimientoDelete = new com.toedter.calendar.JDateChooser();
        btnAltaGuardarUp1 = new javax.swing.JButton();
        jpUpdateAlumno = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        btnUpCerrar = new javax.swing.JButton();
        jtDniUp = new javax.swing.JTextField();
        jtApellidoUp = new javax.swing.JTextField();
        jtNombreUp = new javax.swing.JTextField();
        jdFechaNacimientoUp = new com.toedter.calendar.JDateChooser();
        btnAltaGuardarUp = new javax.swing.JButton();
        jcbEstado = new javax.swing.JComboBox<>();
        jcbListaAlumnos1 = new javax.swing.JComboBox<>();

        jLabel4.setText("jLabel4");

        btnAltaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnAltaGuardar.setText("Guardar");
        btnAltaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarActionPerformed(evt);
            }
        });

        btnAltaLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/escoba (1).png"))); // NOI18N
        btnAltaLimpiar.setText("Limpiar");
        btnAltaLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaLimpiarActionPerformed(evt);
            }
        });

        btnAltaCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnAltaCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaCerrarActionPerformed(evt);
            }
        });

        jtDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        jtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jdFechaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        iconDniVerificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/verificado.png"))); // NOI18N

        iconDniError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/VerificadoNO.png"))); // NOI18N

        javax.swing.GroupLayout jpAltaAlumnoLayout = new javax.swing.GroupLayout(jpAltaAlumno);
        jpAltaAlumno.setLayout(jpAltaAlumnoLayout);
        jpAltaAlumnoLayout.setHorizontalGroup(
            jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAltaAlumnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAltaCerrar))
            .addGroup(jpAltaAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtDni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(iconDniVerificado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconDniError)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jpAltaAlumnoLayout.setVerticalGroup(
            jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAltaAlumnoLayout.createSequentialGroup()
                .addComponent(btnAltaCerrar)
                .addGroup(jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaAlumnoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconDniVerificado)
                            .addComponent(iconDniError)))
                    .addGroup(jpAltaAlumnoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnAltaGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAltaLimpiar)
                .addGap(46, 46, 46))
        );

        jtpPanel.addTab("Alta de Alumno", jpAltaAlumno);

        btnDeleteCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnDeleteCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCerrarActionPerformed(evt);
            }
        });

        jtDniUp1.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA ALUMNOS"));

        jtApellidoUp1.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jtNombreUp1.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jdFechaNacimientoDelete.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        btnAltaGuardarUp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        btnAltaGuardarUp1.setText("Borrar Registro");
        btnAltaGuardarUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarUp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBajaAlumnoLayout = new javax.swing.GroupLayout(jpBajaAlumno);
        jpBajaAlumno.setLayout(jpBajaAlumnoLayout);
        jpBajaAlumnoLayout.setHorizontalGroup(
            jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBajaAlumnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeleteCerrar))
            .addGroup(jpBajaAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtApellidoUp1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtNombreUp1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jtDniUp1)
                    .addComponent(jdFechaNacimientoDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaGuardarUp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jpBajaAlumnoLayout.setVerticalGroup(
            jpBajaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBajaAlumnoLayout.createSequentialGroup()
                .addComponent(btnDeleteCerrar)
                .addGap(3, 3, 3)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtDniUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtApellidoUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNombreUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdFechaNacimientoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAltaGuardarUp1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jtpPanel.addTab("Baja de alumno", jpBajaAlumno);

        btnUpCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnUpCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpCerrarActionPerformed(evt);
            }
        });

        jtDniUp.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        jtApellidoUp.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        jtNombreUp.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jdFechaNacimientoUp.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        btnAltaGuardarUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/recargar.png"))); // NOI18N
        btnAltaGuardarUp.setText("Actualizar Registro");
        btnAltaGuardarUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaGuardarUpActionPerformed(evt);
            }
        });

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HABILITADO", "DESHABILITADO" }));
        jcbEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTADO"));

        jcbListaAlumnos1.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA ALUMNOS"));

        javax.swing.GroupLayout jpUpdateAlumnoLayout = new javax.swing.GroupLayout(jpUpdateAlumno);
        jpUpdateAlumno.setLayout(jpUpdateAlumnoLayout);
        jpUpdateAlumnoLayout.setHorizontalGroup(
            jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateAlumnoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtApellidoUp, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                        .addComponent(jtNombreUp, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                        .addComponent(jtDniUp)
                        .addComponent(jdFechaNacimientoUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAltaGuardarUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnUpCerrar))
            .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUpdateAlumnoLayout.createSequentialGroup()
                    .addContainerGap(137, Short.MAX_VALUE)
                    .addComponent(jcbListaAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(95, 95, 95)))
        );
        jpUpdateAlumnoLayout.setVerticalGroup(
            jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUpdateAlumnoLayout.createSequentialGroup()
                .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpCerrar)
                    .addGroup(jpUpdateAlumnoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jtDniUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtApellidoUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtNombreUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jdFechaNacimientoUp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnAltaGuardarUp)
                .addContainerGap())
            .addGroup(jpUpdateAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpUpdateAlumnoLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jcbListaAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(407, Short.MAX_VALUE)))
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

    public void formatoCalendario(){
        //jdFechaNacimiento.setLocale(new Locale("es"));
        //jdFechaNacimiento.setDateFormatString("dd-MM-yyyy");
        
        jdFechaNacimiento.setDate(new Date());
        jdFechaNacimientoUp.setDate(new Date());
        jdFechaNacimientoDelete.setDate(new Date());
        
        jdFechaNacimiento.getJCalendar().setMaxSelectableDate(new Date());
    }
    
    private void btnAltaCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAltaCerrarActionPerformed
     
   
    
    private void btnAltaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarActionPerformed
        String dni = jtDni.getText();
        String apellido = jtApellido.getText();
        String nombre = jtNombre.getText();
        LocalDate fechaNacimiento = jdFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        if (!dni.isEmpty()) {
            iconDniVerificado.setVisible(true);
            iconDniError.setVisible(false);
        if (!apellido.isEmpty()) {
        if (!nombre.isEmpty()) {
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtNombre.requestFocus();
        }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un apellido", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            jtApellido.requestFocus();
        }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            iconDniVerificado.setVisible(false);
            iconDniError.setVisible(true);
            jtDni.requestFocus();
        }
    }//GEN-LAST:event_btnAltaGuardarActionPerformed

    private void btnAltaLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaLimpiarActionPerformed
        jtDni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jdFechaNacimiento.setDate(new Date());
    }//GEN-LAST:event_btnAltaLimpiarActionPerformed

    private void btnUpCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnUpCerrarActionPerformed

    private void btnAltaGuardarUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaGuardarUpActionPerformed

    private void btnDeleteCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDeleteCerrarActionPerformed

    private void btnAltaGuardarUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaGuardarUp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaGuardarUp1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaCerrar;
    private javax.swing.JButton btnAltaGuardar;
    private javax.swing.JButton btnAltaGuardarUp;
    private javax.swing.JButton btnAltaGuardarUp1;
    private javax.swing.JButton btnAltaLimpiar;
    private javax.swing.JButton btnDeleteCerrar;
    private javax.swing.JButton btnUpCerrar;
    private javax.swing.JLabel iconDniError;
    private javax.swing.JLabel iconDniVerificado;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbListaAlumnos1;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoDelete;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoUp;
    private javax.swing.JPanel jpAltaAlumno;
    private javax.swing.JPanel jpBajaAlumno;
    private javax.swing.JPanel jpUpdateAlumno;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtApellidoUp;
    private javax.swing.JTextField jtApellidoUp1;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDniUp;
    private javax.swing.JTextField jtDniUp1;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombreUp;
    private javax.swing.JTextField jtNombreUp1;
    private javax.swing.JTabbedPane jtpPanel;
    // End of variables declaration//GEN-END:variables
}
