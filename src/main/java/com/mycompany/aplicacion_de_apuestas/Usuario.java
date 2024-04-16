/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion_de_apuestas;


public class Usuario extends Personas implements java.io.Serializable{
    private String cuenta;
    private String password;
    private double dinero;
    private int idApuesta;
    private int quienSoy;
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String cuenta, String password,double dinero,int quienSoy) {
        super(nombre, apellido);
        this.cuenta = cuenta;
        this.password = password;
        this.dinero = dinero;
        this.quienSoy = quienSoy;
        this.idApuesta =0;
    }

    public int getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(int idApuesta) {
        this.idApuesta = idApuesta;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getQuienSoy() {
        return quienSoy;
    }

    public void setQuienSoy(int quienSoy) {
        this.quienSoy = quienSoy;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
    
    
}
