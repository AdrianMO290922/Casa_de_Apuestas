package com.mycompany.aplicacion_de_apuestas;

import java.util.ArrayList;

public class Carrera {

    private int id;
    private String nombre;
    private Corredor ganador;
    private double montoApostado;
    private double ganancia;
    private boolean disponible;
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
        return "Carrera{" + "id=" + id + ", ganador=" + ganador + ", montoApostado=" + montoApostado + ", ganancia=" + ganancia + ", listRuns=" + listRuns + ", listUsers=" + listUsers + '}';
    }
    
    
    
}
