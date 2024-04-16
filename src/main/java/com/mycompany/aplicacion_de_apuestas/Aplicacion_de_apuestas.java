/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion_de_apuestas;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.aplicacion_de_apuestas.frames.Login;
import javax.swing.UIManager;

/**
 *
 * @author adria
 */
public class Aplicacion_de_apuestas {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
        }
        Usuario admin = new Usuario("Adrian","Martinez Ortiz","admin1","123",100,1);
        //new Login(admin).setVisible(true);
        new Login().setVisible(true);
    }
}
