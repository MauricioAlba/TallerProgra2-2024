/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import Mysql.Mysql;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samue
 */
public class layout_reserva extends javax.swing.JFrame {
    
    Connection conn;
    Statement sent;
    /**
     * Creates new form layout_reserva
     */
    public layout_reserva() {
        initComponents();
        initListeners();
        iniciarComponentes();
        initColors();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfIdUsuario = new javax.swing.JTextField();
        jdtDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jcbHora = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbHoraSalida = new javax.swing.JComboBox<>();
        jtfSalaId = new javax.swing.JTextField();
        jtfSalaName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservation = new javax.swing.JTextArea();
        jbtnGuardar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva"));

        jLabel1.setText("Usuario");

        jLabel2.setText("Fecha");

        jLabel3.setText("Periodo");

        jcbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:45", "8:15", "9:45", "11:15", "12:45", "14:15", "15:45", "17:15", "18:45", "19:15", "21:45" }));
        jcbHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHoraActionPerformed(evt);
            }
        });

        jLabel4.setText("Sala");

        jcbHoraSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:15", "9:45", "11:15", "12:45", "14:15", "15:45", "17:15", "18:45", "19:15", "21:45", "23:15" }));
        jcbHoraSalida.setFocusable(false);

        jLabel11.setText("Observation");

        jtaObservation.setColumns(20);
        jtaObservation.setRows(5);
        jScrollPane1.setViewportView(jtaObservation);

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnModificar.setText("Modificar");

        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtfSalaId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfSalaName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jcbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jcbHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCancelar)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jdtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfSalaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSalaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnModificar)
                    .addComponent(jbtnNuevo)
                    .addComponent(jbtnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // TODO add your handling code here:
      
               
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jcbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHoraActionPerformed

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
            java.util.logging.Logger.getLogger(layout_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layout_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layout_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layout_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layout_reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JComboBox<String> jcbHora;
    private javax.swing.JComboBox<String> jcbHoraSalida;
    private com.toedter.calendar.JDateChooser jdtDate;
    private javax.swing.JTextArea jtaObservation;
    private javax.swing.JTextField jtfIdUsuario;
    private javax.swing.JTextField jtfSalaId;
    private javax.swing.JTextField jtfSalaName;
    // End of variables declaration//GEN-END:variables
 private void iniciarComponentes() {
    setResizable(false);
        
        try{
        conn = Mysql.conectar();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());       
        } 
        
         addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                    panel_salas.registrobooleanTrue();
                    dispose(); 
                }
        });
         
         setLocationRelativeTo(null);
    }
 private void initListeners(){
     jcbHora.addActionListener((ActionEvent e) -> {
         int selectedIndex = jcbHora.getSelectedIndex();
         jcbHoraSalida.setSelectedIndex(selectedIndex);
     });
     
     jcbHoraSalida.addActionListener((ActionEvent e) -> {
         jcbHora.setSelectedIndex(jcbHoraSalida.getSelectedIndex());
     });
     
     jtfIdUsuario.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        if(jtfIdUsuario.getText().isEmpty()){
        } else {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            jdtDate.requestFocusInWindow();
        }
        }}
    });
 }

private void Limpiar(){
     jtaObservation.setText("");
       jdtDate.cleanup();
       jtfSalaId.setText("");
       jtfSalaName.setText("");
}
 private void guardar(){
    if (jdtDate.getDate() == null || jtfSalaId.getText().isEmpty() || jcbHora.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(rootPane, "Llena todos los campos");
        return;  // Salimos de la función si faltan campos por llenar
    }
    
    boolean exist = false;
    PreparedStatement status = null;
    ResultSet result = null;
    
    try {
        String consulta = """
                            SELECT 1 
                            FROM reservation 
                            WHERE check_in = ? 
                            AND id_room = ? 
                            AND `date` = ?;
                          """;
        
        status = conn.prepareStatement(consulta);
        status.setString(1, jcbHora.getSelectedItem().toString());  // No usar '?'
        status.setString(2, jtfSalaId.getText());
        status.setDate(3, new java.sql.Date(jdtDate.getDate().getTime()));  // Correcta conversión a java.sql.Date
        
        result = status.executeQuery();
        
        if (result.next()) {
            exist = true;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
    }
    
    if (exist) {
        JOptionPane.showMessageDialog(rootPane, "Ya hay una reservación en ese horario");
    } else {
        try {
            String sql = "INSERT INTO reservation (check_in, check_out, id_user, id_room, observation, date) " +
                         "VALUES (?, ?, ?, ?, ?, ?)";
            
            java.sql.Date sqlDate = new java.sql.Date(jdtDate.getDate().getTime());
            
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, jcbHora.getSelectedItem().toString());
            ps.setString(2, jcbHoraSalida.getSelectedItem().toString());
            ps.setString(3, jtfIdUsuario.getText());
            ps.setString(4, jtfSalaId.getText());
            ps.setString(5, jtaObservation.getText());
            ps.setDate(6, sqlDate);

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
        Limpiar();
    }
}

    
    
   
    
    private void initColors(){
         Color red = new java.awt.Color(175, 27, 35, 1);
        Color letter = new java.awt.Color(255,255,255);
        Color blue = new java.awt.Color(0,25,60);
        //003166
        
        //Panels
        
        
        //buttons
        jbtnNuevo.setBackground(red);
        
        jbtnCancelar.setBackground(red);
        
        jbtnGuardar.setBackground(red);
        
        jbtnModificar.setBackground(red);
        
        //jbtnBuscar.setBackground(red);
        
        jbtnNuevo.setForeground(letter);
        
        jbtnCancelar.setForeground(letter);
        
        jbtnGuardar.setForeground(letter);
     
        jbtnModificar.setForeground(letter);
        
        //jbtnBuscar.setForeground(letter);
        
        //Tables
        
        
        //TExtField  
    }
}
