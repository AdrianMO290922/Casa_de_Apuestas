/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion_de_apuestas;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "cuenta")
    private String cuenta;
    @Lob
    @Column(name = "password")
    private String password;
    @Column(name = "dinero")
    private double dinero;
    @Column(name = "quien_soy")
    private int quienSoy;
    public Usuario() {
    }

    public Usuario(int id,String nombre, String apellido, String cuenta, String password,double dinero,int quienSoy) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.password = password;
        this.dinero = dinero;
        this.quienSoy = quienSoy;
        
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
