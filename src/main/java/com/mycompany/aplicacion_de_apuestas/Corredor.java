
package com.mycompany.aplicacion_de_apuestas;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="corredor")
public class Corredor implements Serializable{
        private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "peso")
    private double peso;
    @Column(name = "altura")
    private double altura;
    @Column(name = "bornYear")
    private int bornDay;
    @Column(name = "carreras_G")
    private int carrerasG;
    @Column(name = "quien_soy")
    private int quienSoy;
    @Column(name = "aFavor")
    private int aFavor;

    public Corredor() {
    }



    public Corredor( int id,String nombre, String apellido,int quienSoy,double peso, double altura, int bornDay,int carrerasG,int aFavor) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.quienSoy = quienSoy;
        this.peso = peso;
        this.altura = altura;
        this.carrerasG = carrerasG;
        this.bornDay = bornDay;
        this.aFavor = aFavor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Corredor other = (Corredor) obj;
        return this.id == other.id;
    }
    
    
    
}
