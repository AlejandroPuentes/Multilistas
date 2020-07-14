/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Pantallita extends javax.swing.JFrame {

    public JPanel getGraficaListas() {
        return GraficaListas;
    }
    private Multilista multi;
    private Canvitas can;
    
     public Multilista getMulti() {
        return multi;
    }
    public Pantallita() {
        multi = new Multilista(); 
        initComponents();       
        can=new Canvitas(this);
        can.iniciar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        GraficaListas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NombreMateria = new javax.swing.JTextField();
        InAlumMateria = new javax.swing.JTextField();
        NombreAlumno = new javax.swing.JTextField();
        RetMateria = new javax.swing.JTextField();
        btnInserMateria = new javax.swing.JButton();
        btnInsertAlum = new javax.swing.JButton();
        btnRemoveAlum = new javax.swing.JButton();
        btnRemoveMater = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        RetirAlumno = new javax.swing.JTextField();
        RetirMatAlum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GraficaListas.setPreferredSize(new java.awt.Dimension(1800, 1800));

        javax.swing.GroupLayout GraficaListasLayout = new javax.swing.GroupLayout(GraficaListas);
        GraficaListas.setLayout(GraficaListasLayout);
        GraficaListasLayout.setHorizontalGroup(
            GraficaListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1800, Short.MAX_VALUE)
        );
        GraficaListasLayout.setVerticalGroup(
            GraficaListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1800, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(GraficaListas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 584, 200));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ingreso de un curso (Lista horizontal)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, 193, -1));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Ingrese una materia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 274, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Ingreso de alumnos a un curso (Lista vertical)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 347, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Ingrese la materia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Ingrese la Alumno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 425, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Retiro de alumno de la lista");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 246, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Ingrese la materia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 274, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Ingrese el alumno");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 300, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Retirar lista de materias");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 384, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Ingrese la materia");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 419, -1, -1));

        NombreMateria.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(NombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 86, -1));

        InAlumMateria.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(InAlumMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 81, -1));

        NombreAlumno.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(NombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 113, -1));

        RetMateria.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(RetMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 416, 87, -1));

        btnInserMateria.setText("Insertar Materia");
        btnInserMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 302, -1, -1));

        btnInsertAlum.setText("Insertar Alumno");
        btnInsertAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertAlumActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        btnRemoveAlum.setText("ReritarAlumno");
        btnRemoveAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAlumActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 343, -1, -1));

        btnRemoveMater.setText("Retirar Materia");
        btnRemoveMater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveMaterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveMater, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 454, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        RetirAlumno.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(RetirAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 100, -1));

        RetirMatAlum.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(RetirMatAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 90, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logica/152265-full-size-pure-black-wallpaper-1080x1920-for-mac (1)_1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserMateriaActionPerformed
       int Longitud=14;
       if (NombreMateria.getText().length()<Longitud){ 
            if(NombreMateria.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No SE DEBE DEJAR ESTAPCIO EN BLANCO");
            }else{
                multi.agregarMateria(NombreMateria.getText());
            } 
                                        
       }else{
           JOptionPane.showMessageDialog(null, "MAXIMO 14 CARACTERES");
       }
       NombreMateria.setText(null);
    }//GEN-LAST:event_btnInserMateriaActionPerformed

    private void btnInsertAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAlumActionPerformed
        int Longitud=14;
       if (InAlumMateria.getText().length()<Longitud){ 
            if(NombreAlumno.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "No SE DEBE DEJAR ESTAPCIO EN BLANCO");
            }else{
                multi.AgregarEstudiante(InAlumMateria.getText(), NombreAlumno.getText());
            } 
                                        
       }else{
           JOptionPane.showMessageDialog(null, "MAXIMO 14 CARACTERES");
       }
       NombreAlumno.setText(null);
       InAlumMateria.setText(null);
    }//GEN-LAST:event_btnInsertAlumActionPerformed

    private void btnRemoveAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAlumActionPerformed
        multi.QuitarEstudiante(RetirMatAlum.getText(), RetirAlumno.getText());
        RetirMatAlum.setText(null);
        RetirAlumno.setText(null);
    }//GEN-LAST:event_btnRemoveAlumActionPerformed

    private void btnRemoveMaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveMaterActionPerformed
        multi.QuitarMateria(RetMateria.getText());
        RetMateria.setText(null);
    }//GEN-LAST:event_btnRemoveMaterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    
    

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
            java.util.logging.Logger.getLogger(Pantallita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantallita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantallita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantallita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantallita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraficaListas;
    private javax.swing.JTextField InAlumMateria;
    private javax.swing.JTextField NombreAlumno;
    private javax.swing.JTextField NombreMateria;
    private javax.swing.JTextField RetMateria;
    private javax.swing.JTextField RetirAlumno;
    private javax.swing.JTextField RetirMatAlum;
    private javax.swing.JButton btnInserMateria;
    private javax.swing.JButton btnInsertAlum;
    private javax.swing.JButton btnRemoveAlum;
    private javax.swing.JButton btnRemoveMater;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
