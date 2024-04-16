
package com.mycompany.aplicacion_de_apuestas;

import java.util.ArrayList;


public class Casa_Apuestas {
    private double gananciasTotales;
    private  ArrayList<Carrera> listCarreras = new ArrayList<>();;

    public Casa_Apuestas() {
    }

    public Casa_Apuestas(double gananciasTotales) {
        this.gananciasTotales = gananciasTotales;
    }

    public double getGananciasTotales() {
        return gananciasTotales;
    }

    public void setGananciasTotales(double gananciasTotales) {
        this.gananciasTotales = gananciasTotales;
    }

 

    public ArrayList<Carrera> getListCarreras() {
        return listCarreras;
    }

    public void setListCarreras(ArrayList<Carrera> listCarreras) {
        this.listCarreras = listCarreras;
    }
    


    
}
