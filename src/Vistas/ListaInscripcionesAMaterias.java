package Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
public class ListaInscripcionesAMaterias extends javax.swing.JInternalFrame {


    public ListaInscripcionesAMaterias() {
        initComponents();
        botonTransparente(btnCerrar);
    }


    void botonTransparente(javax.swing.JButton b){
        b.setFocusPainted(false);
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo_para_formularios_transversal.png"));
        Image image = icon.getImage();
        jpFondo = new javax.swing.JPanel(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jcMaterias = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        jpEstado = new javax.swing.JPanel();
        jrbNoInscriptos = new javax.swing.JRadioButton();
        jrbInscriptos = new javax.swing.JRadioButton();

        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMostrar);

        jpFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 219, 730, 230));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N
        jLabel2.setText("Ficha Mostrar Todos los Alumnos inscripto a una Materia");
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jcMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("MATERIA"));
        jpFondo.add(jcMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 475, 51));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jpFondo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 45, 38));

        jpEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de los alumnos"));
        jpEstado.setBackground(new Color(0,0,0,0));

        jrbNoInscriptos.setText("No Inscriptos");
        jrbNoInscriptos.setBackground(new Color(0,0,0,0));

        jrbInscriptos.setText("Inscriptos");
        jrbInscriptos.setBackground(new Color(0,0,0,0));

        javax.swing.GroupLayout jpEstadoLayout = new javax.swing.GroupLayout(jpEstado);
        jpEstado.setLayout(jpEstadoLayout);
        jpEstadoLayout.setHorizontalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEstadoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jrbInscriptos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jrbNoInscriptos)
                .addGap(70, 70, 70))
        );
        jpEstadoLayout.setVerticalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbNoInscriptos)
                    .addComponent(jrbInscriptos))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpFondo.add(jpEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 470, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcMaterias;
    private javax.swing.JPanel jpEstado;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JRadioButton jrbInscriptos;
    private javax.swing.JRadioButton jrbNoInscriptos;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables
}
