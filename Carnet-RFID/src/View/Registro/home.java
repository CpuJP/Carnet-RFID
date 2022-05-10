/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Registro;

import Model.Registrar;
import View.Administrador.*;
import View.Prestamo.*;
import View.Laboratorio.*;
import View.SalaComputo.*;
import View.Ingreso.*;

public class home extends javax.swing.JFrame {

    Registrar rg;
    public static PrestamosMain frnPrestamos;
    public static MenuAdministrador frnAdministrador;
    public static LaboratorioMain frnLaboratorio;
    public static home frnHome;
    public static SalaComputoMain frnSalaComputo;
    public static IngresoMain frnIngreso;

    public home() {
        initComponents();
    }
    
    public home(Registrar rg){
        initComponents();
        setLocationRelativeTo(null);
        this.rg = rg;
        jLabel_nombre.setText(rg.getNombre());
        jLabel_Rol.setText(rg.getNombre_tipo());
        Integer rol = rg.getTipo_id();
        switch (rol) {
            case 1:
                jMenu_Ingreso.setVisible(false);
                jMenu_Laboratorio.setVisible(false);
                jMenu_Prestamos.setVisible(false);
                jMenu_SalaComputo.setVisible(false);
                break;
            case 2:
                jMenu_Administrador.setVisible(false);
                jMenu_Ingreso.setVisible(false);
                jMenu_Laboratorio.setVisible(false);
                jMenu_SalaComputo.setVisible(false);
                break;
            case 3:
                jMenu_Administrador.setVisible(false);
                jMenu_Ingreso.setVisible(false);
                jMenu_Prestamos.setVisible(false);
                jMenu_SalaComputo.setVisible(false);
                break;
            case 4:
                jMenu_Administrador.setVisible(false);
                jMenu_Ingreso.setVisible(false);
                jMenu_Laboratorio.setVisible(false);
                jMenu_Prestamos.setVisible(false);
                break;
            case 5:
                jMenu_Administrador.setVisible(false);
                jMenu_Laboratorio.setVisible(false);
                jMenu_Prestamos.setVisible(false);
                jMenu_SalaComputo.setVisible(false);
                break;
            default:
                throw new AssertionError();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_Rol = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_activaropciones = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Administrador = new javax.swing.JMenu();
        jMenu_Prestamos = new javax.swing.JMenu();
        jMenu_Laboratorio = new javax.swing.JMenu();
        jMenu_SalaComputo = new javax.swing.JMenu();
        jMenu_Ingreso = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel_Rol.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_activaropciones.setText("Activar opciones");
        jButton_activaropciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_activaropcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton_activaropciones)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_activaropciones, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu_Administrador.setText("Administrador");
        jMenuBar1.add(jMenu_Administrador);

        jMenu_Prestamos.setText("Prestamos");
        jMenuBar1.add(jMenu_Prestamos);

        jMenu_Laboratorio.setText("Laboratorio");
        jMenuBar1.add(jMenu_Laboratorio);

        jMenu_SalaComputo.setText("SalaComputo");
        jMenuBar1.add(jMenu_SalaComputo);

        jMenu_Ingreso.setText("Ingreso");
        jMenuBar1.add(jMenu_Ingreso);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton_activaropcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_activaropcionesActionPerformed
        // TODO add your handling code here:
        Integer rol = rg.getTipo_id();
        switch (rol) {
            case 1:
                if (frnAdministrador == null) {
                    frnAdministrador = new MenuAdministrador(null, false);
                    frnAdministrador.setVisible(true);
                }
                break;
            case 2:
                if (frnPrestamos == null) {
                    frnPrestamos = new PrestamosMain();
                    frnPrestamos.setVisible(true);
                }
                break;
            case 3:
                if (frnLaboratorio == null) {
                    frnLaboratorio = new LaboratorioMain();
                    frnLaboratorio.setVisible(true);
                }
                break;
            case 4:
                if (frnSalaComputo == null) {
                    frnSalaComputo = new SalaComputoMain();
                    frnSalaComputo.setVisible(true);
                }
                break;
            case 5:
                if (frnIngreso == null) {
                    frnIngreso = new IngresoMain();
                    frnIngreso.setVisible(true);
                }
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jButton_activaropcionesActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        home.frnHome = null;
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_activaropciones;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel_Rol;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenu_Administrador;
    private javax.swing.JMenu jMenu_Ingreso;
    private javax.swing.JMenu jMenu_Laboratorio;
    private javax.swing.JMenu jMenu_Prestamos;
    private javax.swing.JMenu jMenu_SalaComputo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}
