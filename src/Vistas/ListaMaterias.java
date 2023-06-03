package Vistas;

import Modelo.Materia;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaMaterias extends javax.swing.JInternalFrame {
    
    public ListaMaterias() {
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
        btnCerrar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        jpEstadoMaterias = new javax.swing.JPanel();
        jrbMateriasActivas = new javax.swing.JRadioButton();
        jrbMateriasNoActivas = new javax.swing.JRadioButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 53, 40));

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N
        labelTitulo.setText("Ficha mostrar todas las materias");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "YEAR", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 750, 260));

        jpEstadoMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de las materias"));
        jpEstadoMaterias.setBackground(new Color(0,0,0,0));

        jrbMateriasActivas.setText("Activas");
        jrbMateriasActivas.setBackground(new Color(0,0,0,0));

        jrbMateriasNoActivas.setText("No Activas");
        jrbMateriasNoActivas.setBackground(new Color(0,0,0,0));

        javax.swing.GroupLayout jpEstadoMateriasLayout = new javax.swing.GroupLayout(jpEstadoMaterias);
        jpEstadoMaterias.setLayout(jpEstadoMateriasLayout);
        jpEstadoMateriasLayout.setHorizontalGroup(
            jpEstadoMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoMateriasLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jrbMateriasActivas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jrbMateriasNoActivas)
                .addGap(147, 147, 147))
        );
        jpEstadoMateriasLayout.setVerticalGroup(
            jpEstadoMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEstadoMateriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpEstadoMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateriasActivas)
                    .addComponent(jrbMateriasNoActivas))
                .addContainerGap())
        );

        jPanel1.add(jpEstadoMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 570, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpEstadoMaterias;
    private javax.swing.JRadioButton jrbMateriasActivas;
    private javax.swing.JRadioButton jrbMateriasNoActivas;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables
}
