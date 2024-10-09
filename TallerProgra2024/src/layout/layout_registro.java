/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import Mysql.Mysql;
import java.sql.Statement;

import com.sun.net.httpserver.Authenticator;
import java.sql.Connection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author samue
 */
public class layout_registro extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection conn;
    Statement sent;
    /**
     * Creates new form layout_reserva
     */
    public layout_registro() {
        initComponents();
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

        jpRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfIdRoom = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jbtnNuevo = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jtfCapacidad = new javax.swing.JFormattedTextField();
        jbtnModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jpRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jpRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Salas"));
        jpRegistro.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombre: ");

        jtfIdRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdRoomActionPerformed(evt);
            }
        });
        jtfIdRoom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfIdRoomKeyPressed(evt);
            }
        });

        jtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameActionPerformed(evt);
            }
        });
        jtfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNameKeyPressed(evt);
            }
        });

        jLabel3.setText("Descripcion:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jtaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtaDescripcionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        jLabel4.setText("Capacidad:");

        jLabel1.setText("Estado:");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado", "Mantenimiento" }));
        jcbEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbEstadoKeyPressed(evt);
            }
        });

        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jtfCapacidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCapacidadKeyPressed(evt);
            }
        });

        jbtnModificar.setText("Modificar");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jLabel6.setText("Id");

        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbtnNuevo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addComponent(jbtnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnCancelar))
                            .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpRegistroLayout.createSequentialGroup()
                            .addComponent(jtfIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jbtnBuscar)))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addComponent(jbtnGuardar)
                        .addContainerGap(195, Short.MAX_VALUE))))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jbtnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)))
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnNuevo)
                    .addComponent(jbtnModificar))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed

        Guardar();
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed

        Limpiar();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameActionPerformed

    private void jtfIdRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdRoomActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        // TODO add your handling code here:
        Modificar();
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
        Buscar();
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
        panel_salas.registrobooleanTrue();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jtfNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNameKeyPressed
        // TODO add your handling code here:
        if(!jtfName.getText().isEmpty()){
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                jtaDescripcion.requestFocusInWindow();
            }
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            jtaDescripcion.requestFocusInWindow();
        } else if(evt.getKeyCode() == KeyEvent.VK_UP){
            jtfIdRoom.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtfNameKeyPressed

    private void jtaDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaDescripcionKeyPressed
        // TODO add your handling code here:
         if(!jtaDescripcion.getText().isEmpty()){
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                jtfCapacidad.requestFocusInWindow();
            }
        }
         if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            jtfCapacidad.requestFocusInWindow();
        } else if(evt.getKeyCode() == KeyEvent.VK_UP){
            jtfName.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtaDescripcionKeyPressed

    private void jtfCapacidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCapacidadKeyPressed
        // TODO add your handling code here:
        if(!jtfCapacidad.getText().isEmpty()){
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                jcbEstado.showPopup();
                jcbEstado.requestFocusInWindow();
            }
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            jtaDescripcion.requestFocusInWindow();
        } else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            jcbEstado.showPopup();
            jcbEstado.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtfCapacidadKeyPressed

    private void jcbEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbEstadoKeyPressed
        // TODO add your handling code here:
    int aux = jcbEstado.getSelectedIndex();
    int itemCount = jcbEstado.getItemCount(); 
    if(evt.getKeyCode() == KeyEvent.VK_DOWN){
        if(aux < itemCount - 1){
            aux++;  
        } else {
            aux = 0;
        }
        jcbEstado.setSelectedIndex(aux-1);
    } else if(evt.getKeyCode() == KeyEvent.VK_UP){
        if(aux > 0){
            aux--;
            jcbEstado.setSelectedIndex(aux +1);
        } else{
            jcbEstado.hidePopup();
            jtfCapacidad.requestFocusInWindow();
        }
    } 
          if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jtfIdRoom.getText().isBlank()){
                Guardar();
            } else {
                Modificar();
                jtfIdRoom.requestFocusInWindow();
            }
        
        }
        
    }//GEN-LAST:event_jcbEstadoKeyPressed

    private void jtfIdRoomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdRoomKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jtfIdRoom.getText().isBlank()){
                jtfName.requestFocusInWindow();
                Limpiar();
            }else if(!jtfName.getText().isBlank() && !jtfCapacidad.getText().isBlank()){
                jtfName.requestFocusInWindow();
            }else {
            Buscar();
            }
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            jtfName.requestFocusInWindow();
            }
    }//GEN-LAST:event_jtfIdRoomKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(layout_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layout_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layout_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layout_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layout_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JFormattedTextField jtfCapacidad;
    private javax.swing.JTextField jtfIdRoom;
    public javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables

    private void iniciarComponentes() {
        
        setResizable(false);
        
        try{
        conn = Mysql.conectar();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());       
        } 
        
        Llenar();
        
         addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                    panel_salas.registrobooleanTrue();
                    dispose(); 
                }
        });
         
         
         setLocationRelativeTo(null);
    
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
        
        jbtnBuscar.setBackground(red);
        
        jbtnNuevo.setForeground(letter);
        
        jbtnCancelar.setForeground(letter);
        
        jbtnGuardar.setForeground(letter);
     
        jbtnModificar.setForeground(letter);
        
        jbtnBuscar.setForeground(letter);
        
        //Tables
        
        
        //TExtField        
    }
    
    void Llenar(){
       
    }

    private void Limpiar() {
    jtfIdRoom.setText("");
    jtfCapacidad.setText("");
    jtfCapacidad.setValue(null);
    jtfName.setText("");
    jtaDescripcion.setText("");
    jcbEstado.setSelectedIndex(0);
    }
    
   private void Guardar(){
       try {
            String sql = "insert into room (name_room, description, ammount_max, status)"+
            "values(?,?,?,?)";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, jtfName.getText());
            ps.setString(2, jtaDescripcion.getText());
            ps.setString(3, jtfCapacidad.getText());
            ps.setString(4, jcbEstado.getSelectedItem().toString());

            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
        }
        Llenar();
        Limpiar();
   }
   
   private void Buscar(){
   if(jtfIdRoom.getText().isBlank()){
            JOptionPane.showConfirmDialog(rootPane, "Introduzca un Id");
        }else{
            String id = jtfIdRoom.getText();
            PreparedStatement statement = null;
            ResultSet resultSet = null;
            
            try{
            String exist = "SELECT 1 from room WHERE id_room =?";
            statement = conn.prepareStatement(exist);
            statement.setString(1, id);
            
            resultSet = statement.executeQuery();
            
            if(resultSet.next()){
                
                 PreparedStatement status = null;
                 ResultSet setResult = null;
                 
                try{
                    
                    String sql = " SELECT name_room, description, ammount_max, status from room where id_room =?";
                    status = conn.prepareStatement(sql);
                    status.setString(1, id);
                    setResult = status.executeQuery();
                    
                    while(setResult.next()){
                        jtfName.setText(setResult.getString("name_room"));
                        jtaDescripcion.setText(setResult.getString("description"));
                        jtfCapacidad.setText(setResult.getString("ammount_max"));
                        int stat = 0;
                        switch(setResult.getString("status")){
                            case "Disponible" -> stat = 0;
                            case "Ocupado" -> stat = 1;
                            case "Mantenimiento" -> stat = 2;
                        }
                        jcbEstado.setSelectedItem(jcbEstado.getItemAt(stat));
                    }
                }catch(SQLException e){
                    JOptionPane.showConfirmDialog(rootPane, e);
                } finally {
                    try{
                    if (setResult != null) {
                    setResult.close();
                    }
                     if (status != null) {
                    status.close();
                     }
                
            } catch (SQLException e){
                    JOptionPane.showConfirmDialog(rootPane, e);
                }
            }
                
                
            }else {
                JOptionPane.showConfirmDialog(rootPane, "Id inexistente");
            }
            }catch(SQLException e){
                JOptionPane.showConfirmDialog(rootPane, e);
            } finally {
                try{
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                
            } catch (SQLException e){
                    JOptionPane.showConfirmDialog(rootPane, e);
                }
            }
            
           
        }
   }

    private void Modificar() {
    
    try {
            String sql = "update room set name_room=?, description=?, ammount_max=?, status=?"
                    + "where id_room=?";
            
            String dao = jtfIdRoom.getText();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, jtfName.getText());
            ps.setString(2, jtaDescripcion.getText());
            ps.setString(3, jtfCapacidad.getText());
            ps.setString(4, jcbEstado.getSelectedItem().toString());
            ps.setString(5, dao);
            
            int n = ps.executeUpdate();
            
            if(n>0){
                Limpiar();
                Llenar();
                JOptionPane.showMessageDialog(null,"Datos modificados");
            }

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());

        }
    }
    
    
}