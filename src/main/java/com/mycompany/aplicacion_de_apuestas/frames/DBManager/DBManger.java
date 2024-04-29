/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion_de_apuestas.frames.DBManager;

import com.mycompany.aplicacion_de_apuestas.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class DBManger {

    private String db = "casa_de_apuestas";
    private String user = "root";
    private String password = "290922Diaespecial#";
    private Connection connection;
    private Statement stm;

    public DBManger() {
    }

    private void open() throws Exception {//le delega la excepcion en donde se invoca, esto porque romperoa el modelo mandando un jompine
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, user, password);
        stm = connection.createStatement();
        System.out.println("Conexion exitosa");
    }

    private void close() throws Exception {
        stm.close();
        connection.close();
    }

    public Usuario findU(String usr, String pass) throws Exception {
        String sql = "SELECT * FROM usuario WHERE cuenta=? AND password=SHA1(?)";
        Usuario usuario = null;
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, usr);
        ps.setString(2, pass);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            usuario = new Usuario();
            usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setNombre(rs.getString("nombre"));
            usuario.setApellido(rs.getString("apellido"));
            usuario.setCuenta(rs.getString("cuenta"));
            usuario.setPassword(rs.getString("password"));
            usuario.setQuienSoy(rs.getInt("quien_soy"));
            usuario.setDinero(rs.getDouble("dinero"));
        }

        close();
        return usuario;
    }

    public int addUser(String name, String lastName, String cuenta, String pass, int quienSoy) throws Exception {
        int resultados = 0;
        int d = 0;
        String sql = "INSERT INTO usuario(nombre,apellido,cuenta,password,quien_soy,dinero) VALUES(?,?,?,SHA1(?),?,?)";
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, lastName);
        ps.setString(3, cuenta);
        ps.setString(4, pass);
        ps.setInt(5, quienSoy);
        ps.setInt(6, d);
        resultados = ps.executeUpdate();
        close();
        return resultados;
    }
     public int addRun(String name, String lastName, int bornYear, double peso, double altura, int quienSoy, int carrerasG ) throws Exception {
        int resultados = 0;
        int d = 0;
        String sql = "INSERT INTO corredor (nombre, apellido, bornYear, peso, altura, quien_soy, carreras_G) VALUES(?,?,?,?,?,?,?)";
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, lastName);
        ps.setInt(3, bornYear);
        ps.setDouble(4, peso);
        ps.setDouble(5, altura);
        ps.setInt(6, quienSoy);
        ps.setInt(7, carrerasG);
        resultados = ps.executeUpdate();
        close();
        return resultados;
    }
     public int addCarrer(String name)throws Exception{
         int resultados = 0;
         String sql = "INSERT INTO carrera (nombre, monto_apostado, ganancia, disponible, finalizada)VALUES (?,?, ?,?, ?)";
          open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setDouble(2, 0.0);
        ps.setDouble(3, 0.0);
        ps.setBoolean(4, false);
        ps.setBoolean(5, false);
        resultados = ps.executeUpdate();
        close();
         return resultados;
     }

    public ArrayList<Usuario> rellenarU() throws Exception {
        String sql = "SELECT * FROM usuario";
        Usuario usuario = null;
        ArrayList<Usuario> listUsers = new ArrayList<>();
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setNombre(rs.getString("nombre"));
            usuario.setApellido(rs.getString("apellido"));
            usuario.setCuenta(rs.getString("cuenta"));
            usuario.setPassword(rs.getString("password"));
            usuario.setQuienSoy(rs.getInt("quien_soy"));
            usuario.setDinero(rs.getDouble("dinero"));
            listUsers.add(usuario);
        }

        close();
        return listUsers;
    }

}//fin de clase
