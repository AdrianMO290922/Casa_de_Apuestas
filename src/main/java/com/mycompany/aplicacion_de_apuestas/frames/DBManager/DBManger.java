/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion_de_apuestas.frames.DBManager;

import com.mycompany.aplicacion_de_apuestas.Carrera;
import com.mycompany.aplicacion_de_apuestas.Corredor;
import com.mycompany.aplicacion_de_apuestas.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public int addRun(String name, String lastName, int bornYear, double peso, double altura, int quienSoy, int carrerasG) throws Exception {
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

    public int addCarrer(String name) throws Exception {
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

        while (rs.next()) {
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

    public ArrayList<Carrera> rellenarC(int id_carrera) throws Exception {
        ArrayList<Carrera> listCar = new ArrayList<>();
        ArrayList<Corredor> listRuns  =new ArrayList<>();

        String sqlCarr = "SELECT * FROM carrera";
        open();
        PreparedStatement ps = connection.prepareStatement(sqlCarr);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Carrera car = new Carrera();
            car.setId(rs.getInt("id"));
            car.setNombre(rs.getString("nombre"));
            car.setMontoApostado(rs.getDouble("monto_apostado"));
            car.setGanancia(rs.getDouble("ganancia"));
            car.setDisponible(rs.getBoolean("disponible"));
            car.setFinalizada(rs.getBoolean("finalizada"));
            //car.getGanador().setId(rs.getInt("id_ganador"));
            listCar.add(car);
        }

        String sqlRuns = "SELECT Corredor.* FROM Corredor JOIN Carrera_Corredor ON Corredor.id = Carrera_Corredor.id_Corredor WHERE Carrera_Corredor.id_Carrera = ?";
        ps = connection.prepareStatement(sqlRuns);
        ps.setInt(1, id_carrera);
        rs = ps.executeQuery();
          while (rs.next()) {
              Corredor run = new Corredor();
              run.setId(rs.getInt("id"));
              run.setNombre(rs.getString("nombre"));
              run.setApellido(rs.getString("apellido"));
              run.setBornDay(rs.getInt("bornYear"));
              run.setPeso(rs.getDouble("peso"));
              run.setAltura(rs.getDouble("altura"));
              run.setQuienSoy(rs.getInt("quien_soy"));
              run.setCarrerasG(rs.getInt("carreras_G"));
              run.setaFavor(rs.getInt("aFavor"));
              listRuns.add(run);
                }
        
        
        
        for (Carrera carreraP : listCar) {
            if (carreraP.getId() == id_carrera) {
              carreraP.setListRuns(listRuns);
            }
        }
        close();
        return listCar;

    }
    public ArrayList<Corredor> runForCar(int id_carrera) throws Exception{
        String sqlRuns = "SELECT Corredor.* FROM Corredor JOIN Carrera_Corredor ON Corredor.id = Carrera_Corredor.id_Corredor WHERE Carrera_Corredor.id_Carrera = ?";
        open();
        PreparedStatement ps = connection.prepareStatement(sqlRuns);
        ArrayList<Corredor> listRuns  =new ArrayList<>();
        ps.setInt(1, id_carrera);
        ResultSet rs = ps.executeQuery();
          while (rs.next()) {
              Corredor run = new Corredor();
              run.setId(rs.getInt("id"));
              run.setNombre(rs.getString("nombre"));
              run.setApellido(rs.getString("apellido"));
              run.setBornDay(rs.getInt("bornYear"));
              run.setPeso(rs.getDouble("peso"));
              run.setAltura(rs.getDouble("altura"));
              run.setQuienSoy(rs.getInt("quien_soy"));
              run.setCarrerasG(rs.getInt("carreras_G"));
              run.setaFavor(rs.getInt("aFavor"));
              listRuns.add(run);
                }
        close();
        return listRuns;
    }
    public ArrayList<Corredor> rellenaCorredor() throws Exception{
        String sql = "SELECT * FROM corredor";
        open();
        ArrayList<Corredor> listRuns = new ArrayList<>();
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Corredor run = new Corredor();
            run.setId(rs.getInt("id"));
              run.setNombre(rs.getString("nombre"));
              run.setApellido(rs.getString("apellido"));
              run.setBornDay(rs.getInt("bornYear"));
              run.setPeso(rs.getDouble("peso"));
              run.setAltura(rs.getDouble("altura"));
              run.setQuienSoy(rs.getInt("quien_soy"));
              run.setCarrerasG(rs.getInt("carreras_G"));
              run.setaFavor(rs.getInt("aFavor"));
              listRuns.add(run);
        }
        close();
        return listRuns;
    }
    public void addRunCarr(int id_carrera, int id_corredor) throws Exception{
        String sql = "INSERT INTO carrera_corredor (id_Carrera,id_Corredor) VALUES(?,?)";
        open();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id_carrera);
        ps.setInt(2, id_corredor);
        ps.executeUpdate();
        close();
    }

}//fin de clase
