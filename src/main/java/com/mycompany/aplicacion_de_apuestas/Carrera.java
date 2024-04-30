package com.mycompany.aplicacion_de_apuestas;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name ="carrera")
public class Carrera implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    private Corredor ganador;
    @Column(name = "monto_apostado")
    private double montoApostado;
    @Column(name = "ganancia")
    private double ganancia;
    @Column(name = "disponible")
    private boolean disponible;
    @Column(name = "finalizada")
    private boolean finalizada;
    private  ArrayList<Corredor> listRuns = new ArrayList<>();
    private ArrayList<Usuario> listUsers = new ArrayList<>();

    public Carrera() {
    }

    public Carrera(int id, String nombre, Corredor ganador, double montoApostado, double ganancia) {
        this.id = id;
        this.nombre = nombre;
        this.ganador = ganador;
        this.montoApostado = montoApostado;
        this.ganancia = ganancia;
        this.disponible = false;
        this.finalizada = false;
        
    }

   
    public Carrera(String nombre,int id){
        this.nombre = nombre;
        this.id = id;
        this.disponible = false;
        this.finalizada = false;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Corredor getGanador() {
        return ganador;
    }

    public void setGanador(Corredor ganador) {
        this.ganador = ganador;
    }

    public double getMontoApostado() {
        return montoApostado;
    }

    public void setMontoApostado(double montoApostado) {
        this.montoApostado = montoApostado;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public ArrayList<Corredor> getListRuns() {
        return listRuns;
    }

    public void setListRuns(ArrayList<Corredor> listRuns) {
        this.listRuns = listRuns;
    }

    public ArrayList<Usuario> getListUsers() {
        return listUsers;
    }

    public void setListUsers(ArrayList<Usuario> listUsers) {
        this.listUsers = listUsers;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + "nombre=" + nombre+ ", ganador=" + ganador + ", montoApostado=" + montoApostado + ", ganancia=" + ganancia + ", listRuns=" + listRuns + ", listUsers=" + listUsers + '}';
    }
    
    
    
}
