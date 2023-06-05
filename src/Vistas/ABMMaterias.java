package Vistas;

import Modelo.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ABMMaterias extends javax.swing.JInternalFrame {


    public ABMMaterias() {
        initComponents();
        mostrandoMateriasV2();
        mostrandoTodasMateriasV3();
        mostrarMateriasV4();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpMaterias = new javax.swing.JTabbedPane();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png"));
        Image image = icon.getImage();
        jpNuevaMateria = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        btnMateriaNuevaGuardar = new javax.swing.JButton();
        btnMateriaNuevaLimpiar = new javax.swing.JButton();
        jtMateriaNuevaNueva = new javax.swing.JTextField();
        jtMateriaNuevaAnio = new javax.swing.JTextField();
        jpBajaMateria = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jcbMateriaBajaListaHab = new javax.swing.JComboBox<>();
        btnMateriaBajaEliminar = new javax.swing.JButton();
        jtMateriaBajaAnio = new javax.swing.JTextField();
        jtMateriaBajaNombre = new javax.swing.JTextField();
        jpActualizarDatosMateria = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jtMateriaUpAnio = new javax.swing.JTextField();
        jcbMateriaUpMaterias = new javax.swing.JComboBox<>();
        jtMateriaUpNombre = new javax.swing.JTextField();
        jcbMateriaUpEstado = new javax.swing.JComboBox<>();
        btnMateriaUp = new javax.swing.JButton();
        jpAltaMateria = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jcbMateriaAltaListaNoHab = new javax.swing.JComboBox<>();
        jtMateriaAltaNombre = new javax.swing.JTextField();
        jtMateriaAltaAnio = new javax.swing.JTextField();
        btnMateriaAltaHabilitar = new javax.swing.JButton();
        btnCerrarmaterias = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        btnMateriaNuevaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnMateriaNuevaGuardar.setText("Guardar");
        btnMateriaNuevaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaNuevaGuardarActionPerformed(evt);
            }
        });

        btnMateriaNuevaLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/escoba (1).png"))); // NOI18N
        btnMateriaNuevaLimpiar.setText("Limpiar");
        btnMateriaNuevaLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaNuevaLimpiarActionPerformed(evt);
            }
        });

        jtMateriaNuevaNueva.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jtMateriaNuevaAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("AÑO"));

        javax.swing.GroupLayout jpNuevaMateriaLayout = new javax.swing.GroupLayout(jpNuevaMateria);
        jpNuevaMateria.setLayout(jpNuevaMateriaLayout);
        jpNuevaMateriaLayout.setHorizontalGroup(
            jpNuevaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevaMateriaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jpNuevaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtMateriaNuevaAnio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtMateriaNuevaNueva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(btnMateriaNuevaGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMateriaNuevaLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jpNuevaMateriaLayout.setVerticalGroup(
            jpNuevaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevaMateriaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jtMateriaNuevaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMateriaNuevaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnMateriaNuevaGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnMateriaNuevaLimpiar)
                .addGap(32, 32, 32))
        );

        jtpMaterias.addTab("Nueva Materia", jpNuevaMateria);

        jcbMateriaBajaListaHab.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE MATERIAS"));
        jcbMateriaBajaListaHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriaBajaListaHabActionPerformed(evt);
            }
        });

        btnMateriaBajaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        btnMateriaBajaEliminar.setText("Borrar Registro");
        btnMateriaBajaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaBajaEliminarActionPerformed(evt);
            }
        });

        jtMateriaBajaAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("AÑO"));

        jtMateriaBajaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        javax.swing.GroupLayout jpBajaMateriaLayout = new javax.swing.GroupLayout(jpBajaMateria);
        jpBajaMateria.setLayout(jpBajaMateriaLayout);
        jpBajaMateriaLayout.setHorizontalGroup(
            jpBajaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jpBajaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                        .addComponent(jtMateriaBajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                        .addComponent(jcbMateriaBajaListaHab, 0, 553, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                        .addGroup(jpBajaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMateriaBajaEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtMateriaBajaAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpBajaMateriaLayout.setVerticalGroup(
            jpBajaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaMateriaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jcbMateriaBajaListaHab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMateriaBajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtMateriaBajaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnMateriaBajaEliminar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jtpMaterias.addTab("Baja de Materia", jpBajaMateria);

        jtMateriaUpAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("AÑO"));

        jcbMateriaUpMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE MATERIAS"));
        jcbMateriaUpMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriaUpMateriasActionPerformed(evt);
            }
        });

        jtMateriaUpNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jcbMateriaUpEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HABILITADO", "DESHABILITADO" }));
        jcbMateriaUpEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTADO"));

        btnMateriaUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/recargar.png"))); // NOI18N
        btnMateriaUp.setText("Actualizar Registro");
        btnMateriaUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpActualizarDatosMateriaLayout = new javax.swing.GroupLayout(jpActualizarDatosMateria);
        jpActualizarDatosMateria.setLayout(jpActualizarDatosMateriaLayout);
        jpActualizarDatosMateriaLayout.setHorizontalGroup(
            jpActualizarDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActualizarDatosMateriaLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jpActualizarDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpActualizarDatosMateriaLayout.createSequentialGroup()
                        .addComponent(jcbMateriaUpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpActualizarDatosMateriaLayout.createSequentialGroup()
                        .addComponent(jcbMateriaUpMaterias, 0, 553, Short.MAX_VALUE)
                        .addGap(126, 126, 126))
                    .addGroup(jpActualizarDatosMateriaLayout.createSequentialGroup()
                        .addGroup(jpActualizarDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtMateriaUpAnio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtMateriaUpNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMateriaUp, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpActualizarDatosMateriaLayout.setVerticalGroup(
            jpActualizarDatosMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActualizarDatosMateriaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jcbMateriaUpMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtMateriaUpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtMateriaUpAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbMateriaUpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnMateriaUp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpMaterias.addTab("Actualizar datos", jpActualizarDatosMateria);

        jcbMateriaAltaListaNoHab.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE MATERIAS"));
        jcbMateriaAltaListaNoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriaAltaListaNoHabActionPerformed(evt);
            }
        });

        jtMateriaAltaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        jtMateriaAltaAnio.setBorder(javax.swing.BorderFactory.createTitledBorder("AÑO"));

        btnMateriaAltaHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/habilitar.png"))); // NOI18N
        btnMateriaAltaHabilitar.setText("Habilitar Materia");
        btnMateriaAltaHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaAltaHabilitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAltaMateriaLayout = new javax.swing.GroupLayout(jpAltaMateria);
        jpAltaMateria.setLayout(jpAltaMateriaLayout);
        jpAltaMateriaLayout.setHorizontalGroup(
            jpAltaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jpAltaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                        .addComponent(jtMateriaAltaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                        .addComponent(jcbMateriaAltaListaNoHab, 0, 553, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                        .addGroup(jpAltaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMateriaAltaHabilitar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtMateriaAltaAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpAltaMateriaLayout.setVerticalGroup(
            jpAltaMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaMateriaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jcbMateriaAltaListaNoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMateriaAltaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtMateriaAltaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnMateriaAltaHabilitar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jtpMaterias.addTab("Alta de Materia", jpAltaMateria);

        btnCerrarmaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrarmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarmateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpMaterias)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrarmaterias))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCerrarmaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpMaterias)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMateriaNuevaLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaNuevaLimpiarActionPerformed
        jtMateriaNuevaNueva.setText("");
        jtMateriaNuevaAnio.setText("");
       
        
    }//GEN-LAST:event_btnMateriaNuevaLimpiarActionPerformed
    //Solapa 4 - Alta de Materia -> Da de alta una materia 
    private void btnMateriaAltaHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaAltaHabilitarActionPerformed
        // TODO add your handling code here:
         

        List <Materia> arrayMateriasD =  Menu.materiaEscritorio.listarDeshabilitadas();
        int posicion = jcbMateriaAltaListaNoHab.getSelectedIndex();
        int idMateria = arrayMateriasD.get(posicion).getId_materia();
        Menu.materiaEscritorio.habilitarMateria(idMateria);
        mostrarMateriasV4();
        
    }//GEN-LAST:event_btnMateriaAltaHabilitarActionPerformed

    //Solapa 2 - Baja Materia -> Da de baja una materia 
    private void btnMateriaBajaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaBajaEliminarActionPerformed
        // TODO add your handling code here:
      
        List <Materia> arrayMateriasH =  Menu.materiaEscritorio.listarHabilitadas();
        int posicion = jcbMateriaBajaListaHab.getSelectedIndex();
        int idMateria = arrayMateriasH.get(posicion).getId_materia();
        Menu.materiaEscritorio.deshabilitarMateria(idMateria);
         mostrandoMateriasV2();
     
      
    }//GEN-LAST:event_btnMateriaBajaEliminarActionPerformed

    private void btnCerrarmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarmateriasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarmateriasActionPerformed
     //Solapa 3 - Actualizar Materia -> Actualiza una materia 
    private void btnMateriaUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaUpActionPerformed
        // TODO add your handling code here:
        List <Materia> arrayMaterias =  Menu.materiaEscritorio.listarTodasLasMaterias();
        int posicion = -1;
        posicion= jcbMateriaUpMaterias.getSelectedIndex();
       
        String nombre = jtMateriaUpNombre.getText();
        String year = jtMateriaUpAnio.getText();
        int posicionEstado = jcbMateriaUpEstado.getSelectedIndex();
        
     
        if (!year.isEmpty()) {
            int yearParceado = Integer.parseInt(year);
        if (!nombre.isEmpty()) {
            
            if(posicionEstado == 0) {
            Materia materiaActualizada = new Materia(nombre, yearParceado,true );
            Menu.materiaEscritorio.actualizarMateria(materiaActualizada);
            
            }else{
            
            Materia materiaActualizada = new Materia(nombre, yearParceado,false );
            Menu.materiaEscritorio.actualizarMateria(materiaActualizada);}
                            
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            //jtNombre1.requestFocus(); 
        }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un año", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            //jtApellido1.requestFocus(); 
        }
                                                  

        
    }//GEN-LAST:event_btnMateriaUpActionPerformed

    
    //GUARDANDO MATERIA VISTA NUEVA MATERIA V1------------------------------------------------
    private void btnMateriaNuevaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaNuevaGuardarActionPerformed
        // TODO add your handling code here:
        
        String materia = jtMateriaNuevaNueva.getText();
        String year= jtMateriaNuevaAnio.getText();
        
        if (!materia.isEmpty()) {
        if (!year.isEmpty()) {
            
            int yearParceado= Integer.parseInt(year);

            Materia nuevaMateria = new Materia(materia,yearParceado, true);
            
            Menu.materiaEscritorio.guardarMateria(nuevaMateria);
           // Menu.materiaEscritorio.actualizarMateria(nuevaMateria);
           
                        
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un año", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            } 
    }//GEN-LAST:event_btnMateriaNuevaGuardarActionPerformed

    //Solapa 2 - Baja Materia -> Cargar Datos del furmulario Items ComboBox
    private void jcbMateriaBajaListaHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaBajaListaHabActionPerformed
        // TODO add your handling code here:
        List <Materia> arrayMateriasB =  Menu.materiaEscritorio.listarHabilitadas();
        int posicion = -1;
        posicion= jcbMateriaBajaListaHab.getSelectedIndex();
      
        if (posicion > -1 ) {
            jtMateriaBajaNombre.setText(arrayMateriasB.get(posicion).getNombre());
            jtMateriaBajaAnio.setText(arrayMateriasB.get(posicion).getAnio() + "");
            btnMateriaBajaEliminar.setEnabled(true);
        }   
    }//GEN-LAST:event_jcbMateriaBajaListaHabActionPerformed

    private void mostrandoMateriasV2() {
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        jcbMateriaBajaListaHab.removeAllItems();
        List <Materia> arrayMaterias =  Menu.materiaEscritorio.listarHabilitadas();
        
        for (Materia alumno : arrayMaterias) {
            jcbMateriaBajaListaHab.addItem(alumno);
        }



    }


     private void mostrandoTodasMateriasV3() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       jcbMateriaUpMaterias.removeAllItems();
       List <Materia> arrayMaterias =  Menu.materiaEscritorio.listarTodasLasMaterias();
        
        for (Materia alumno : arrayMaterias) {
            jcbMateriaUpMaterias.addItem(alumno);
        }
    
     }

//Solapa 3 - Actualizar Materia -> Cargar Datos del furmulario Items ComboBox
    private void jcbMateriaUpMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaUpMateriasActionPerformed
        // TODO add your handling code here:
        List <Materia> arrayTodasMaterias =  Menu.materiaEscritorio.listarTodasLasMaterias();
        int posicion = -1;
        posicion= jcbMateriaUpMaterias.getSelectedIndex();
        boolean estado = arrayTodasMaterias.get(posicion).getEstado();
        if (posicion > -1 ) {
            jtMateriaUpNombre.setText(arrayTodasMaterias.get(posicion).getNombre());
            jtMateriaUpAnio.setText(arrayTodasMaterias.get(posicion).getAnio() + "");
           
            if(estado == false){
                jcbMateriaUpEstado.setSelectedIndex(1);
            } else{
                jcbMateriaUpEstado.setSelectedIndex(0) ;
            }
            
            
        }else if (posicion == -1){
            JOptionPane.showMessageDialog(null, "No se encuentran materia para dar de alta", "",JOptionPane.WARNING_MESSAGE); 
        }
        
        
        
        
        
    }//GEN-LAST:event_jcbMateriaUpMateriasActionPerformed

    
    //Solapa 4 - Alta de Materia -> Cargar Datos del furmulario Items ComboBox
    private void jcbMateriaAltaListaNoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriaAltaListaNoHabActionPerformed
        // TODO add your handling code here:.
        
        List <Materia> arrayMateriasD =  Menu.materiaEscritorio.listarDeshabilitadas();
        int posicion =jcbMateriaAltaListaNoHab.getSelectedIndex();
      
       
            jtMateriaAltaNombre.setText(arrayMateriasD.get(posicion).getNombre());
            jtMateriaAltaAnio.setText(arrayMateriasD.get(posicion).getAnio() + "");
          
         
        
        
        
        
    }//GEN-LAST:event_jcbMateriaAltaListaNoHabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarmaterias;
    private javax.swing.JButton btnMateriaAltaHabilitar;
    private javax.swing.JButton btnMateriaBajaEliminar;
    private javax.swing.JButton btnMateriaNuevaGuardar;
    private javax.swing.JButton btnMateriaNuevaLimpiar;
    private javax.swing.JButton btnMateriaUp;
    private javax.swing.JComboBox<Materia> jcbMateriaAltaListaNoHab;
    private javax.swing.JComboBox<Materia> jcbMateriaBajaListaHab;
    private javax.swing.JComboBox<String> jcbMateriaUpEstado;
    private javax.swing.JComboBox<Materia> jcbMateriaUpMaterias;
    private javax.swing.JPanel jpActualizarDatosMateria;
    private javax.swing.JPanel jpAltaMateria;
    private javax.swing.JPanel jpBajaMateria;
    private javax.swing.JPanel jpNuevaMateria;
    private javax.swing.JTextField jtMateriaAltaAnio;
    private javax.swing.JTextField jtMateriaAltaNombre;
    private javax.swing.JTextField jtMateriaBajaAnio;
    private javax.swing.JTextField jtMateriaBajaNombre;
    private javax.swing.JTextField jtMateriaNuevaAnio;
    private javax.swing.JTextField jtMateriaNuevaNueva;
    private javax.swing.JTextField jtMateriaUpAnio;
    private javax.swing.JTextField jtMateriaUpNombre;
    private javax.swing.JTabbedPane jtpMaterias;
    // End of variables declaration//GEN-END:variables

    private void mostrarMateriasV4() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        jcbMateriaAltaListaNoHab.removeAllItems();
        List <Materia> arrayMateriasD =  Menu.materiaEscritorio.listarDeshabilitadas();
        
        for (Materia materias : arrayMateriasD) {
            jcbMateriaAltaListaNoHab.addItem(materias);
        }
    
    }

    

   
}


    
    
    

