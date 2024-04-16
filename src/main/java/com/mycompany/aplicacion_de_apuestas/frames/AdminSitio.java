/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aplicacion_de_apuestas.frames;

import com.google.gson.Gson;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.mycompany.aplicacion_de_apuestas.Carrera;
import com.mycompany.aplicacion_de_apuestas.Corredor;
import com.mycompany.aplicacion_de_apuestas.Personas;
import com.mycompany.aplicacion_de_apuestas.Usuario;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author adria
 */
public class AdminSitio extends javax.swing.JFrame {

    private GridLayout grid = new GridLayout(1, 1);
    // ArrayList<Personas> listPersonas = new ArrayList<>();
    ArrayList<Corredor> listRuns = new ArrayList<>();
    ArrayList<Corredor> listRuns2 = new ArrayList<>();
    ArrayList<Carrera> listCarr = new ArrayList<>();
    Carrera carreraP;
    Usuario usuario;
    Random r = new Random();

    public AdminSitio() {
        initComponents();
        jPanel1.setLayout(grid);
        setLocationRelativeTo(null);
    }

    public AdminSitio(Usuario usuario) {
        initComponents();
        jPanel1.setLayout(grid);
        setLocationRelativeTo(null);
        this.usuario = usuario;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnRCorredor = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        labelAddCount = new javax.swing.JLabel();
        labelSesion = new javax.swing.JLabel();
        labelBienvenida = new javax.swing.JLabel();
        labelInicial = new org.edisoncor.gui.label.LabelRound();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarC = new javax.swing.JButton();
        boxCarreras = new javax.swing.JComboBox<>();
        btnInicio = new javax.swing.JButton();
        btnFinaliza = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        btnRCorredor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRCorredor.setText("Registrar Corredor");
        btnRCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCorredorActionPerformed(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHistorial.setText("Historial Carreras");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        labelAddCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAddCount.setForeground(new java.awt.Color(255, 59, 59));
        labelAddCount.setText("¿Agregar otra cuenta?");
        labelAddCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddCountMouseClicked(evt);
            }
        });

        labelSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSesion.setForeground(new java.awt.Color(255, 59, 59));
        labelSesion.setText("Cerrar sesion");
        labelSesion.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        labelSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSesionMouseClicked(evt);
            }
        });

        labelBienvenida.setBackground(new java.awt.Color(196, 12, 6));
        labelBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        labelBienvenida.setText("jLabel1");

        labelInicial.setBackground(new java.awt.Color(0, 0, 0));
        labelInicial.setText("labelRound1");
        labelInicial.setAnchoDeBorde(2.0F);
        labelInicial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Corredor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Carreras Ganadas");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Apuestas");

        btnAgregarC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarC.setText("Agregar Carrera");
        btnAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCActionPerformed(evt);
            }
        });

        boxCarreras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxCarrerasItemStateChanged(evt);
            }
        });

        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInicio.setText("Iniciar");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnFinaliza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinaliza.setText("Finalizar");
        btnFinaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Agregar Corredor");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAddCount, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel4)
                                .addGap(25, 25, 25))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRCorredor))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addComponent(boxCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnFinaliza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBienvenida)
                    .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarC)
                    .addComponent(boxCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicio)
                    .addComponent(btnHistorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinaliza)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRCorredor)
                        .addComponent(jButton1)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddCount)
                    .addComponent(labelSesion)
                    .addComponent(labelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelAddCountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddCountMouseClicked
        new Registro(1).setVisible(true);
        guardarData();
        dispose();
    }//GEN-LAST:event_labelAddCountMouseClicked

    private void btnRCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCorredorActionPerformed
        
            new Registro_Corredor(usuario).setVisible(true);
            actualizaCorredores();
            guardarData();
            dispose();
        
    }//GEN-LAST:event_btnRCorredorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labelBienvenida.setText("Bienvenido " + usuario.getNombre());
        labelInicial.setText(usuario.getNombre().charAt(0) + "");
        boxCarreras.removeAllItems();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/adria/Documents/Archivos del Proyecto JSON/Corredores.json"));
            String lectura = null;
            String resultado = "";
            while ((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(resultado);

            listRuns2.clear();
            for (int i = 0; i < jsonArray.size(); i++) {
                Corredor corredor = new Gson().fromJson(jsonArray.get(i).toString(), Corredor.class);
                listRuns2.add(corredor);

            }

            System.out.println("Se cargaron las Carrers correctamente");
            actualizaCorredores();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /////Carreras/////////////////////////////////////////////////////////////////////////////////////
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/adria/Documents/Archivos del Proyecto JSON/Carreras.json"));
            String lectura = null;
            String resultado = "";
            while ((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(resultado);

            listCarr.clear();
            
            for (int i = 0; i < jsonArray.size(); i++) {
                Carrera carrera = new Gson().fromJson(jsonArray.get(i).toString(), Carrera.class);
                listCarr.add(carrera);

            }
            
            System.out.println("Se cargaron las Carreras correctamente");
            //actualizaCorredores();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Carrera carrera : listCarr) {
            //boxCarreras.addItem(String.valueOf(carrera.getId()));
            boxCarreras.addItem(carrera.getNombre());
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
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
        }
    }//GEN-LAST:event_formWindowClosing

    private void labelSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSesionMouseClicked
        guardarData();
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelSesionMouseClicked

    private void btnAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCActionPerformed

        guardarData();
        new Registro_Carrera(usuario).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarCActionPerformed

    private void boxCarrerasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxCarrerasItemStateChanged
        for (Carrera carrera : listCarr) {
            if (boxCarreras.getSelectedItem().toString().equals(carrera.getNombre())) {
                listRuns = carrera.getListRuns();
                carreraP = carrera;
                actualizaCorredores();
            }
        }
        if (carreraP.isDisponible()) {
            btnInicio.setBackground(new Color(62,156,77));
            btnFinaliza.setBackground(new Color(85,88,90));
        } else if (carreraP.isFinalizada()) {
            btnInicio.setBackground(new Color(85,88,90));
            btnFinaliza.setBackground(new Color(191,12,6));
        } else {
            btnInicio.setBackground(new Color(85,88,90));
            btnFinaliza.setBackground(new Color(85,88,90));
        }
    }//GEN-LAST:event_boxCarrerasItemStateChanged

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        carreraP.setDisponible(true);
        carreraP.setFinalizada(false);
        btnInicio.setBackground(new Color(62,156,77));
        btnFinaliza.setBackground(new Color(85,88,90));

    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnFinalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizaActionPerformed
        carreraP.setDisponible(false);
        carreraP.setFinalizada(true);
        btnFinaliza.setBackground(new Color(191,12,6));
        btnInicio.setBackground(new Color(85,88,90));
        int ganador = r.nextInt(carreraP.getListRuns().size()) + 1;
        double cantP;
        for (Corredor corredor : carreraP.getListRuns()) {
            if (carreraP.getListRuns().indexOf(corredor) + 1 == ganador) {
                for(Corredor can:listRuns2){
                    if(corredor.getNombre().equals(can.getNombre())){
                        can.setCarrerasG(can.getCarrerasG()+1);
                        break;
                    }
                }
                carreraP.setGanador(corredor);
                cantP = (double) corredor.getaFavor();
                JOptionPane.showMessageDialog(null, "!GANADOR!\n" + "Corredor: " + corredor.getNombre() + " " + corredor.getApellido());
                for (Usuario user : carreraP.getListUsers()) {
                    if (user.getIdApuesta() == ganador) {
                        user.setDinero(((carreraP.getMontoApostado()) - (carreraP.getGanancia())) / cantP);
                        JOptionPane.showMessageDialog(null, "El usuario: " + user.getNombre() + "\n" + "Gano: " + user.getDinero());
                    }

                }
            }

        }


    }//GEN-LAST:event_btnFinalizaActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // Historial de Ganancias
        try {
            ///Descaraga de Pdf
            PdfDocument pdf = new PdfDocument(new PdfWriter(new File("C:/Users/adria/Documents/Archivos del Proyecto JSON/Ganancias.pdf")));
            Document doc = new Document(pdf);
            Paragraph parrafo = new Paragraph("------------------------------------------------------ Historial ------------------------------------------------------");
            parrafo.setBold();
            doc.add(parrafo);
            for (Carrera carrera : listCarr) {
                if (carrera.isFinalizada()) {
                    parrafo = new Paragraph("------------------------- Carrrera " + carrera.getNombre() + "----");
                    parrafo.setBold();
                    doc.add(parrafo);

                    parrafo = new Paragraph("--Usuarios Ganadores:--");
                    parrafo.setBold();
                    doc.add(parrafo);
                    for (Usuario user : carrera.getListUsers()) {
                        if (user.getDinero() > 0) {
                            doc.add(new Paragraph("Usuario Ganador : " + user.getNombre()));
                            doc.add(new Paragraph("Dinero ganado: " + user.getDinero()));
                        }

                    }
                    parrafo = new Paragraph("--------------------------------");
                    parrafo.setBold();
                    doc.add(parrafo);
                    doc.add(new Paragraph("Monto Apostado: " + carrera.getMontoApostado()));
                    doc.add(new Paragraph("Ganancia de la Carrera: " + carrera.getGanancia()));

                    parrafo = new Paragraph("--------------------------------------------------------------------------------------------------------------------------------");
                    parrafo.setBold();
                    doc.add(parrafo);
                }

            }

            doc.close();
            pdf.close();

            JOptionPane.showMessageDialog(null, "Historial dscargad en PDF en la carpeta del Proyecto");
            File path = new File("C:/Users/adria/Documents/Archivos del Proyecto JSON/Ganancias.pdf");
            Desktop.getDesktop().open(path);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Registro_Apuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Descargado en Excel
        try {
            File csv = new File("C:/Users/adria/Documents/Archivos del Proyecto JSON/Historial.csv");
            FileWriter excel = new FileWriter(csv);
            excel.append("HISTORIAL DE CARRERAS,\n");
            for (Carrera carrera : listCarr) {
                excel.append("CARRERA:" + carrera.getNombre() + ",\n");
                if (carrera.isFinalizada()) {
                    for (int i = 0; i < 7; i++) {

                        switch (i) {

                            case 0:
                                excel.append("--Usuarios--,\n");
                                for (Usuario user : carrera.getListUsers()) {
                                    if (user.getDinero() > 0) {
                                        excel.append("Usuario Ganador:, " + user.getNombre() + "\n");
                                        excel.append("Dinero ganado:, " + user.getDinero() + "\n");
                                    }
                                }
                                break;
                            case 2:
                                excel.append("Monto Apostado:," + carrera.getMontoApostado() + "\n");
                                break;
                            case 3:
                                excel.append("Ganancia de la carrera:," + carrera.getGanancia() + "\n");
                                break;

                            default:
                                System.out.println("Hubo un porblema con los case");
                        }
                    }
                }
            }
            excel.close();
            JOptionPane.showMessageDialog(null, "Ficha dscargada en CSV en la carpeta del Proyecto");
            File path = new File("C:/Users/adria/Documents/Archivos del Proyecto JSON/Historial.csv");
            Desktop.getDesktop().open(path);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnHistorialActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Nuevo frame para agregar a todos los participantes
        guardarData();
        new Agregar_Corredores(usuario,carreraP).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void guardarData() {
        try {
            String json = new Gson().toJson(listRuns2);

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/adria/Documents/Archivos del Proyecto JSON/Corredores.json", false));
            bw.write(json);
            bw.close();
            System.out.println("Se guardaron los Runs correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ///////////////////////////Carreras/////////////////////////////////////
        try {
            String json = new Gson().toJson(listCarr);

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/adria/Documents/Archivos del Proyecto JSON/Carreras.json", false));
            bw.write(json);
            bw.close();
            System.out.println("Se guardaron las carreras correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizaCorredores() {
        jPanel1.removeAll();
        grid.setRows(listRuns.size());
        for (Corredor corredor : listRuns) {
            //PanelCategoria panelCat = new PanelCategoria(cat, listCategoria); 
            PanelCorredor panelCo = new PanelCorredor(corredor, listRuns);
            jPanel1.add(panelCo);
            //jPanel1.add(panelCat);
        }
        jPanel1.updateUI();
    }

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
            java.util.logging.Logger.getLogger(AdminSitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSitio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCarreras;
    private javax.swing.JButton btnAgregarC;
    private javax.swing.JButton btnFinaliza;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRCorredor;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAddCount;
    private javax.swing.JLabel labelBienvenida;
    private org.edisoncor.gui.label.LabelRound labelInicial;
    private javax.swing.JLabel labelSesion;
    // End of variables declaration//GEN-END:variables
}