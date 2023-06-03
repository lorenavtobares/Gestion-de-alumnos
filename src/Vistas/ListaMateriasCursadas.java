
package Vistas;
import Modelo.Alumno;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class ListaMateriasCursadas extends javax.swing.JInternalFrame {


    public ListaMateriasCursadas() {
        initComponents();
        cargandoAlumnos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        jcAlumnos = new javax.swing.JComboBox<>();
        labelTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jpEstadoAlumnos = new javax.swing.JPanel();
        jrbInscriptos = new javax.swing.JRadioButton();
        jrbNoInscriptos = new javax.swing.JRadioButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 184, 754, 210));

        jcAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder("Alumno"));
        jPanel1.add(jcAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 48, 600, 51));

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N
        labelTitulo.setText("Ficha Mostrar Todas las Materias Inscripto un Alumno");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 12, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 50, 30));

        jpEstadoAlumnos.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de los alumnos"));
        jpEstadoAlumnos.setBackground(new Color(0,0,0,0));

        jrbInscriptos.setText("Inscriptos");
        jrbInscriptos.setBackground(new Color(0,0,0,0));

        jrbNoInscriptos.setText("No Inscriptos");
        jrbNoInscriptos.setBackground(new Color(0,0,0,0));

        javax.swing.GroupLayout jpEstadoAlumnosLayout = new javax.swing.GroupLayout(jpEstadoAlumnos);
        jpEstadoAlumnos.setLayout(jpEstadoAlumnosLayout);
        jpEstadoAlumnosLayout.setHorizontalGroup(
            jpEstadoAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoAlumnosLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jrbInscriptos)
                .addGap(122, 122, 122)
                .addComponent(jrbNoInscriptos)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jpEstadoAlumnosLayout.setVerticalGroup(
            jpEstadoAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEstadoAlumnosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpEstadoAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscriptos)
                    .addComponent(jrbNoInscriptos))
                .addContainerGap())
        );

        jPanel1.add(jpEstadoAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 600, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cargandoAlumnos() {
        
         jcAlumnos.removeAllItems();
        ArrayList <Alumno> arrayAlumnos = (ArrayList<Alumno>) Menu.alumnoEscritorio.listarTodosAlumnos();
        for (Alumno alumno : arrayAlumnos) {
            jcAlumnos.addItem(alumno);
        } 
    
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Alumno> jcAlumnos;
    private javax.swing.JPanel jpEstadoAlumnos;
    private javax.swing.JRadioButton jrbInscriptos;
    private javax.swing.JRadioButton jrbNoInscriptos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables

    
}
