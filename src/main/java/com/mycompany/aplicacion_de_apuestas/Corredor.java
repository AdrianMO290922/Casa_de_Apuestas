
package com.mycompany.aplicacion_de_apuestas;


public class Corredor extends Personas implements java.io.Serializable{
    private double peso;
    private double altura;
    private int bornDay;
    private int carrerasG;
    private int quienSoy;
    private int aFavor;

    public Corredor() {
    }



    public Corredor( String nombre, String apellido,int quienSoy,double peso, double altura, int bornDay,int carrerasG,int aFavor) {
        super(nombre, apellido);
        this.quienSoy = quienSoy;
        this.peso = peso;
        this.altura = altura;
        this.carrerasG = carrerasG;
        this.bornDay = bornDay;
        this.aFavor = aFavor;
    }

    public int getaFavor() {
        return aFavor;
    }

    public void setaFavor(int aFavor) {
        this.aFavor = aFavor;
    }

    public int getQuienSoy() {
        return quienSoy;
    }

    public void setQuienSoy(int quienSoy) {
        this.quienSoy = quienSoy;
    }

    public int getBornDay() {
        return bornDay;
    }

    public void setBornDay(int bornDay) {
        this.bornDay = bornDay;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCarrerasG() {
        return carrerasG;
    }

    public void setCarrerasG(int carrerasG) {
        this.carrerasG = carrerasG;
    }
    
    
    
}
