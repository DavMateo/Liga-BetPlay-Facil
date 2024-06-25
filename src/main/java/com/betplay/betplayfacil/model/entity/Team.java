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
public class Team {
    // Definiendo los atributos necesarios
    private String nombre;
    private String ciudad;
    private List<Player> lstJugadores;
    private List<Coach> lstEntrenadores;
    private List<Doctor> lstMasajistas;
    
    
    // Definiendo los constructores de la clase
    public Team() {
        lstEntrenadores = new ArrayList<Coach>();
        lstJugadores = new ArrayList<Player>();
        lstMasajistas = new ArrayList<Doctor>();
    }
    
    
    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    // Definiendo los getter y setter de "ciudad"
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    // Definiendo los getter y setter de "lstJugadores"
    public List<Player> getLstJugadores() {
        return lstJugadores;
    }
    public void setLstJugadores(Player player) {
        this.lstJugadores.add(player);
    }
    
    
    // Definiendo los getter y setter de "lstEntrenadores"
    public List<Coach> getLstEntrenadores() {
        return lstEntrenadores;
    }
    public void setLstEntrenadores(Coach coach) {
        this.lstEntrenadores.add(coach);
    }
    
    
    // Definiendo los getter y setter de "lstMasajistas"
    public List<Doctor> getLstMasajistas() {
        return lstMasajistas;
    }
    public void setLstMasajistas(Doctor doctor) {
        this.lstMasajistas.add(doctor);
    }
}
