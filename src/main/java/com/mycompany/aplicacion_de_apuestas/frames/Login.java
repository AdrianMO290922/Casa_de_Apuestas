/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aplicacion_de_apuestas.frames;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mycompany.aplicacion_de_apuestas.Personas;
import com.mycompany.aplicacion_de_apuestas.Usuario;
import com.mycompany.aplicacion_de_apuestas.frames.DBManager.DBManger;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author adria
 */
public class Login extends javax.swing.JFrame {

    
    ArrayList<Usuario> listUsers = new ArrayList<>();
    Usuario user = new Usuario();
    DBManger DB = new DBManger();
    //ArrayList<Personas> listPersonas = new ArrayList<>();

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Login(Usuario use) {
        initComponents();
        setLocationRelativeTo(null);        
       listUsers.add(use);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        txtCuenta = new javax.swing.JTextField();
        btnLogeo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lableRegistro = new javax.swing.JLabel();
        labelVP = new javax.swing.JLabel();
        labelVC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Log in"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelImage1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 0, 0)));
        panelImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\Archivos del Proyecto JSON\\Logo.png")); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        btnLogeo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogeo.setText("Login");
        btnLogeo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogeoMouseEntered(evt);
            }
        });
        btnLogeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogeoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cuenta:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password:");

        lableRegistro.setBackground(new java.awt.Color(153, 153, 153));
        lableRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lableRegistro.setForeground(new java.awt.Color(255, 59, 59));
        lableRegistro.setText("Registrarme");
        lableRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lableRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lableRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lableRegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lableRegistroMousePressed(evt);
            }
        });

        labelVP.setForeground(new java.awt.Color(255, 0, 0));

        labelVC.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogeo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lableRegistro)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(labelVC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelVP)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(btnLogeo)
                .addGap(18, 18, 18)
                .addComponent(lableRegistro)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lableRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableRegistroMouseClicked
        new Registro(2).setVisible(true);
        
        dispose();


    }//GEN-LAST:event_lableRegistroMouseClicked

    private void btnLogeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogeoActionPerformed
        String cuenta = txtCuenta.getText();
        String pass = txtPassword.getText();        
        labelVC.setText("");
        labelVP.setText("");
        int c = 0;
        if(!cuenta.isEmpty() && !pass.isEmpty()){
        try {
            user = DB.find(cuenta, pass);
            if(user != null){
                    if(user.getQuienSoy() == 1){
                        //new AdminSitio(user).setVisible(true);
                        //guardarData();
                        //dispose();
                        JOptionPane.showMessageDialog(null, "Quieres entrar como admin");
                    }else if(user.getQuienSoy() == 2){
                        JOptionPane.showMessageDialog(null, "Quieres entrar como Usuario");
                        //new UserSitio(user).setVisible(true);
                        //guardarData();
                        //dispose(); 
                    }
            }else{
                labelVC.setText("Sin coincidencia *");
                labelVP.setText("Sin coincidencia *");
            }
                
                
            } catch (Exception ex) {
            ex.printStackTrace();
        }    
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese datos completos");
        }
        
        

    }//GEN-LAST:event_btnLogeoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Cuando abre
        
            /*
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/adria/Documents/Archivos del Proyecto JSON/Usuarios.json"));
            String lectura = null;
            String resultado = "";
            while ((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(resultado);

            listUsers.clear();
            for (int i = 0; i < jsonArray.size(); i++) {
                Usuario user = new Gson().fromJson(jsonArray.get(i).toString(), Usuario.class);
                //if(((Usuario)persona).getQuienSoy() == 1 ||((Usuario)persona).getQuienSoy() == 2 ){
                //if(persona instanceof Usuario){
                /*if(user.getQuienSoy() ==)
                    Usuario U = (Usuario)persona;
                listUsers.add(U);
                }*/
              //  listUsers.add(user);

            try {
                
                listUsers = DB.rellenarU();
                
             System.out.println("Se cargaron los Usuarios correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
            
            //actualizaCategorias();
         
        

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Cuando cierra

    }//GEN-LAST:event_formWindowClosing

    private void lableRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableRegistroMousePressed
        //lableRegistro.setB
    }//GEN-LAST:event_lableRegistroMousePressed

    private void lableRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableRegistroMouseEntered
        lableRegistro.setBackground(new Color(85,88,90));
    }//GEN-LAST:event_lableRegistroMouseEntered

    private void lableRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableRegistroMouseExited
        lableRegistro.setBackground(Color.RED);
    }//GEN-LAST:event_lableRegistroMouseExited

    private void btnLogeoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogeoMouseEntered
       
    }//GEN-LAST:event_btnLogeoMouseEntered

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogeo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelVC;
    private javax.swing.JLabel labelVP;
    private javax.swing.JLabel lableRegistro;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
