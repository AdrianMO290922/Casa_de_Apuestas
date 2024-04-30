/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aplicacion_de_apuestas.frames;

import com.google.gson.Gson;
import com.mycompany.aplicacion_de_apuestas.Carrera;
import com.mycompany.aplicacion_de_apuestas.Corredor;
import com.mycompany.aplicacion_de_apuestas.Usuario;
import com.mycompany.aplicacion_de_apuestas.frames.DBManager.DBManger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author adria
 */
public class Agregar_Corredores extends javax.swing.JFrame {

    ArrayList<Corredor> listRuns = new ArrayList<>();
    ArrayList<Corredor> listRuns2 = new ArrayList<>();
    ArrayList<Carrera> listCarr = new ArrayList<>();
    Usuario usuario;
    Carrera carreraP;
    Corredor corredor;
    DBManger DB = new DBManger();

    public Agregar_Corredores() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Agregar_Corredores(Usuario usuario, Carrera carreraP) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        this.carreraP = carreraP;
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
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        labelAGREGADO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Documents\\Archivos del Proyecto JSON\\Carrer.png")); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionado:");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        labelAGREGADO.setForeground(new java.awt.Color(62, 156, 77));
        labelAGREGADO.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelAGREGADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAGREGADO)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Guardar

        boolean band = false;
   
        for (Corredor run : carreraP.getListRuns()) {
            if (run.getNombre().equals(corredor.getNombre())) {
                band = true;
            }
        }
        if (!band) {
            try {
                //carreraP.getListRuns().add(corredor);
                DB.addRunCarr(carreraP.getId(), corredor.getId());
                listCarr = DB.rellenarC(carreraP.getId());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            labelAGREGADO.setText("Corredor Agregado a la carrera: " + carreraP.getNombre());
        } else {
            labelAGREGADO.setText("El corredor ya fue agregado a " + carreraP.getNombre());
        }
        carreraP.getListRuns().clear();
        try {
            carreraP.setListRuns(DB.runForCar(carreraP.getId()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Salir

        for (Carrera car : listCarr) {
            if (car.getNombre().equals(carreraP.getNombre())) {
                car.setListRuns(carreraP.getListRuns());
            }
        }

        new AdminSitio(usuario).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            /*   BufferedReader br = new BufferedReader(new FileReader("C:/Users/adria/Documents/Archivos del Proyecto JSON/Corredores.json"));
            String lectura = null;
            String resultado = "";
            while ((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(resultado);*/

            listRuns2.clear();
            /* for (int i = 0; i < jsonArray.size(); i++) {
                Corredor corredor = new Gson().fromJson(jsonArray.get(i).toString(), Corredor.class);
                listRuns2.add(corredor);

            }
             */
            listRuns2 = DB.rellenaCorredor();
            System.out.println("Se cargaron las Carrers correctamente");
            for (Corredor run : listRuns2) {
                jComboBox1.addItem(run.getNombre());
            }
            carreraP.setListRuns(DB.runForCar(carreraP.getId()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        /////Carreras/////////////////////////////////////////////////////////////////////////////////////
        try {
            /*BufferedReader br = new BufferedReader(new FileReader("C:/Users/adria/Documents/Archivos del Proyecto JSON/Carreras.json"));
            String lectura = null;
            String resultado = "";
            while ((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(resultado);
             */
            listCarr.clear();

            /*for (int i = 0; i < jsonArray.size(); i++) {
                Carrera carrera = new Gson().fromJson(jsonArray.get(i).toString(), Carrera.class);
                listCarr.add(carrera);

            }*/
            System.out.println("Se cargaron las Carreras correctamente");
            //actualizaCorredores();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        /* try {
            String json = new Gson().toJson(listRuns2);

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/adria/Documents/Archivos del Proyecto JSON/Corredores.json", false));
            bw.write(json);
            bw.close();
            System.out.println("Se guardaron los Runs correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /////////////////////////////////////////////Carreras/////////////////////////////////////////////////////////////
        try {
            String json = new Gson().toJson(listCarr);

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/adria/Documents/Archivos del Proyecto JSON/Carreras.json", false));
            bw.write(json);
            bw.close();
            System.out.println("Se guardaron las Carrers correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_formWindowClosing

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        labelAGREGADO.setText("");//Hacer validacion de este desmdre
        for (Corredor runs : listRuns2) {
            if (jComboBox1.getSelectedItem().toString().equals(runs.getNombre())) {
                corredor = runs;
                jTextField1.setText(runs.getNombre());
                for (Corredor run2 : carreraP.getListRuns()) {
                if (corredor.getNombre().equals(run2.getNombre())) {
                    labelAGREGADO.setText("El corredor ya fue agregado a " + carreraP.getNombre());
                }
            }
            }
            

        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(Agregar_Corredores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Corredores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Corredores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Corredores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Corredores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelAGREGADO;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
