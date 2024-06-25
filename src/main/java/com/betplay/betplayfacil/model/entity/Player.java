/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.betplayfacil.model.entity;

// Importando las dependencias y/o archivos necesarios
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mateo
 */
public class Player extends Person {
    // Definiendo los atributos necesarios
    private int dorsal;
    private String posicion;
    private ArrayList<String> jugadores = new ArrayList<>();
    
    
    // Constructor e inicialización de la clase Coach y de la clase padre "Person"
    public Player() {
        super();
    }
    
    // Constructores de la clase "Player"
    public Player(int dorsal, String posicion) {
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    public Player(int id, String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    
    // Definiendo los getter y setter del atributo "dorsal"
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
    // Definiendo los getter y setter del atributo "posicion"
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}