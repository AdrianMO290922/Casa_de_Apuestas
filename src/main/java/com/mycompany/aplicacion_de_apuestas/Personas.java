
package com.mycompany.aplicacion_de_apuestas;

import java.io.Serializable;
import javax.swing.JOptionPane;


public class Personas implements Serializable{

    private String nombre;
    private String apellido;
    
    
    public Personas() {
    }

    public Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        
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



    
    
}
