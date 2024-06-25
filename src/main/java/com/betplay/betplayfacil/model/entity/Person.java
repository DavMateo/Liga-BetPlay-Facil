/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.betplayfacil.model.entity;

/**
 *
 * @author mateo
 */
public class Person {
    // Definiendo los atributos necesarios
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    
    // Definiendo los constructores de la clase
    public Person() {
        
    }
    
    public Person(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    // Definiendo los getter y setter de "id"
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    // Definiendo los getter y setter de "apellido"
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    // Definiendo los getter y setter de "edad"
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
