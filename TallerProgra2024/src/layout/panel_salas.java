/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package layout;

import javax.swing.JFrame;

/**
 *
 * @author samue
 */
public class panel_salas extends javax.swing.JPanel {
    private static boolean salas = true;
    private static boolean registro = true;
    layout_registro r;
    layout_salas s;
    /**
     * Creates new form paneSalas
     */
    public panel_salas() {
        initComponents();
        iniciarComponentes();
    }
    
    public static void salasbooleanTrue(){
        salas = true;
    }
    
    public static void registrobooleanTrue(){
        registro = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        imgAgregar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        imgSalas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(520, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        txtTitulo.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Gestión De Laboratorios");
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 340, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/inicio/Rectangle 71.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar Sala");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 90, 30));

        imgAgregar.setBackground(new java.awt.Color(255, 255, 255));
        imgAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/inicio/nuevaSala.png"))); // NOI18N
        imgAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgAgregarMousePressed(evt);
            }
        });
        jPanel1.add(imgAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 90, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ver Salas");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 90, 20));

        imgSalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/inicio/verSalas.png"))); // NOI18N
        imgSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgSalasMousePressed(evt);
            }
        });
        jPanel2.add(imgSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void imgAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAgregarMousePressed
        // TODO add your handling code here:
        if(registro){
            
            if(!salas){
                s.toFront();
            }
            
        r = new layout_registro();
        r.setVisible(true);
        registro = false;
            
        } else if (r.isShowing()){
        r.toFront();
        }
        if(r.getExtendedState() == JFrame.ICONIFIED){
            r.setExtendedState(JFrame.NORMAL);
        }
    }//GEN-LAST:event_imgAgregarMousePressed
    
    
    
    private void imgSalasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSalasMousePressed
        // TODO add your handling code here:
        if(salas){
            
            if(!registro){
                r.toFront();
            }
            
        s = new layout_salas();
        s.setVisible(true);
        salas = false;
        
        } else if(s.isShowing()){ 
        s.toFront();
        } 
         if(s.getExtendedState() == JFrame.ICONIFIED){
            s.setExtendedState(JFrame.NORMAL);
        }
        
    }//GEN-LAST:event_imgSalasMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgAgregar;
    private javax.swing.JLabel imgSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void iniciarComponentes() {
       
    }
}