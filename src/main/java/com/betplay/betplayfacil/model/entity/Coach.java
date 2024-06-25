/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.betplayfacil.model.entity;

/**
 *
 * @author mateo
 */
public class Coach extends Person {
    // Definición de atributos
    private int idFederacion;
    
    
    // Constructor e inicialización de la clase Coach y de la clase padre "Person"
    public Coach() {
        super();
    }
    
    
    // Constructor con argumentos obligatorios
    public Coach(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
    // Constructor que agrega información tanto a la clase Person como a la clase actual
    public Coach(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);  //Definición de información a la superclase "Person"
        this.idFederacion = idFederacion;
    }
    
    
    // Declarando los métodos Getter y Setter de la clase actual "Coach"
    public int getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
}
