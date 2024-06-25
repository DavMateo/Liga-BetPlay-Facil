/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.betplayfacil.model.entity;

/**
 *
 * @author mateo
 */
public class Doctor extends Person {
    // Definiendo los atributos
    private String titulo;
    private int expYear;
    
    
    // Creando los constructores de la clase
    public Doctor() {
        super();
    }
    
    public Doctor(String titulo, int expYear) {
        this.titulo = titulo;
        this.expYear = expYear;
    }
    
    public Doctor(int id, String nombre, String apellido, int edad, String titulo, int expYear) {
        super(id, nombre, apellido, edad);  //Definición de información a la superclase "Person"
        this.titulo = titulo;
        this.expYear = expYear;
    }
    
    
    // Definiendo los getter y setter de titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    // Definiendo los getter y setter de expYear
    public int getExpYear() {
        return expYear;
    }
    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }
}