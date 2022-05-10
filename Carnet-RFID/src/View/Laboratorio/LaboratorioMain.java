/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Laboratorio;

import Controller.LaboratorioController;
import Controller.PersonalUniversidadController;
import Controller.RfidNfcController;
import Model.Laboratorio;
import Model.PersonalUniversidad;
import Model.RfidNfc;
import View.Registro.home;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jp-co
 */
public class LaboratorioMain extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public LaboratorioMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Salir = new javax.swing.JButton();
        jButton_Ingresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_IdRFID = new javax.swing.JTextField();
        jLabel_ValidacionAcceso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_FechaHoraActual = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_MensajeIngreso = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_Salir.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Salir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton_Salir.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Salir.setText("SALIR");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jButton_Ingresar.setBackground(new java.awt.Color(102, 255, 102));
        jButton_Ingresar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton_Ingresar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Ingresar.setText("INGRESAR");
        jButton_Ingresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel2.setText("ID Carnet RFID");

        jTextField_IdRFID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField_IdRFID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_IdRFID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_ValidacionAcceso.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel_ValidacionAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ValidacionAcceso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha y Hora:");

        jLabel_FechaHoraActual.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel_FechaHoraActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FechaHoraActual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_IdRFID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2)
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_FechaHoraActual, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(jLabel_ValidacionAcceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_IdRFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ValidacionAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_FechaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel1.setText("LABORATORIO UDEC");

        jLabel_MensajeIngreso.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel_MensajeIngreso.setForeground(new java.awt.Color(0, 0, 153));
        jLabel_MensajeIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MensajeIngreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Lista Ingresados");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_MensajeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MensajeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        jLabel_FechaHoraActual.setText("");
        jLabel_MensajeIngreso.setText("");
        jLabel_ValidacionAcceso.setText("");
        
        RfidNfcController rficC = new RfidNfcController();
        LaboratorioController lc = new LaboratorioController();
        String idRFID = jTextField_IdRFID.getText();
        try {
            RfidNfc rfidM = rficC.getIdPersonaByRfidNfc(idRFID);
            if (rfidM.getIdCarnet() == null) {
                jLabel_MensajeIngreso.setText("El carnet no pertenece a ninguna persona registrada en la Universidad");
                jTextField_IdRFID.setText("");
                jLabel_ValidacionAcceso.setText("SALIDA DENEGADA");
                
            }else{
                //Mostrar mensaje de bienvenida al laboratorio
                String idpersona = rfidM.getIdCarnet();
                PersonalUniversidadController puc = new PersonalUniversidadController();
                PersonalUniversidad pu = puc.getFullNameById(idpersona);
                String primerNombre = pu.getPrimerNombre();
                String primerApellido = pu.getPrimerApellido();                
                
                //Registrar datos
                /*Date fechaHoraIngreso = jLabel_ActualizarFechaHora.getText();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                String fechaHora = dateFormat.format(fechaHoraIngreso);*/
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String fechaHora = dtf.format(LocalDateTime.now());
                jLabel_FechaHoraActual.setText(fechaHora);
                jLabel_ValidacionAcceso.setText("SALIDA CONCEDIDA");
                jLabel_MensajeIngreso.setText("Vuelve pronto "+primerNombre+" "+primerApellido+".");
                
                Laboratorio lb = new Laboratorio(null,fechaHora,idpersona,idRFID);
                lc.saveLaboratorioSalida(lb);   
                
                jTextField_IdRFID.setText("");               
            }
        } catch (Exception e) {
        }    
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        jLabel_FechaHoraActual.setText("");
        jLabel_MensajeIngreso.setText("");
        jLabel_ValidacionAcceso.setText("");
        
        RfidNfcController rficC = new RfidNfcController();
        LaboratorioController lc = new LaboratorioController();
        String idRFID = jTextField_IdRFID.getText();
        try {
            RfidNfc rfidM = rficC.getIdPersonaByRfidNfc(idRFID);
            if (rfidM.getIdCarnet() == null) {
                jLabel_MensajeIngreso.setText("El carnet no pertenece a ninguna persona registrada en la Universidad");
                jTextField_IdRFID.setText("");
                jLabel_ValidacionAcceso.setText("ACCESO DENEGADO");
                
            }else{
                //Mostrar mensaje de bienvenida al laboratorio
                String idpersona = rfidM.getIdCarnet();
                PersonalUniversidadController puc = new PersonalUniversidadController();
                PersonalUniversidad pu = puc.getFullNameById(idpersona);
                String primerNombre = pu.getPrimerNombre();
                String primerApellido = pu.getPrimerApellido();                
                
                //Registrar datos
                /*Date fechaHoraIngreso = jLabel_ActualizarFechaHora.getText();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                String fechaHora = dateFormat.format(fechaHoraIngreso);*/
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String fechaHora = dtf.format(LocalDateTime.now());
                jLabel_FechaHoraActual.setText(fechaHora);
                jLabel_ValidacionAcceso.setText("ACCESO CONCEDIDO");
                jLabel_MensajeIngreso.setText("Bienvenido "+primerNombre+" "+primerApellido+".");
                
                Laboratorio lb = new Laboratorio(fechaHora,null,idpersona,idRFID);
                lc.saveLaboratorioIngreso(lb);   
                
                jTextField_IdRFID.setText("");               
            }
        } catch (Exception e) {
        }    
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaIngresados li = new ListaIngresados(null, true);
        li.setVisible(true);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        home.frnLaboratorio = null;
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(LaboratorioMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaboratorioMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaboratorioMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaboratorioMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaboratorioMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_FechaHoraActual;
    private javax.swing.JLabel jLabel_MensajeIngreso;
    private javax.swing.JLabel jLabel_ValidacionAcceso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_IdRFID;
    // End of variables declaration//GEN-END:variables
}
