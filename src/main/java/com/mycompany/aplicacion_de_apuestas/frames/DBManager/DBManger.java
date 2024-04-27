/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion_de_apuestas.frames.DBManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author adria
 */
public class DBManger {
          private String db = "tap24_b2";
    private String user ="root";
    private String password = "290922Diaespecial#";
    
    
    private Connection connection;
    private Statement stm;

    public DBManger() {
    }
    
    private void open() throws Exception{//le delega la excepcion en donde se invoca, esto porque romperoa el modelo mandando un jompine
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,user,password);
        stm = connection.createStatement();
    }
    private void close() throws Exception{
        stm.close();
        connection.close();
    }
}
