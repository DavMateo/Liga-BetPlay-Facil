/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.betplayfacil;

// Importando las dependencias y/o archivos necesarios
import java.util.Hashtable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import com.betplay.betplayfacil.model.entity.Team;
import com.betplay.betplayfacil.model.entity.Player;


/**
 *
 * @author mateo
 */
public class Controller {
    // Definiendo los atributos necesarios
    public Hashtable<String, Team> equipos = new Hashtable<>();  //Nueva Hashtable de equipos
    
    
    // Definiendo las instancias necesarias
    Team equipoInfo = new Team();
    
    
    // Definiendo los constructores de la clase
    public Controller() {
        
    }
    
    
    // Definiendo los getter y setter para equipos
    public Hashtable<String, Team> getEquiposHash() {
       return equipos;
    }
    public void setEquiposHash(String nombreEquipo) {
        this.equipos.put(nombreEquipo, new Team());
    }
    
    
    
    // MÉTODOS PARA LA CLASE "viewTeam"
    // Método para validad la confirmación (Y/N) del usuario
    public int validarConfirmacion(String confirmacion, String entradaUser, int op) {
        if(confirmacion == "y" || confirmacion == "s") {
            // Agrega información a alguno de los atributos dependiendo del número en "op"
            if(op == 1) {
                equipoInfo.setNombre(entradaUser);
            } else if(op == 2) {
                equipoInfo.setCiudad(entradaUser);
            }
            
            System.out.println("\n\n¡La información se ha guardado con éxito!");
            
            // Valor de retorno indicando un True
            return 1;
            
        } else if(confirmacion == "n") {
            System.out.println("Descartando cambios...");
            
            // Valor de retorno indicando un Continue
            return 0;
        }
        
        
        // Valor de retorno por defecto (Inutilizable)
        return 2;
    }
    
    // Método para validar el conteo de errores
    public int validarCountErr(int countError) {
        if(countError >= 0 && countError <= 5) {
            System.out.println(MessageFormat.format(
                "Le quedan {0} intentos. Inténtelo de nuevo.",
                    countError - 5
            ));
            return 1;
            
        } else if(countError == 5) {
            System.out.println("Inténtelo de nuevo más tarde. Saliendo del programa...");
            return 0;
        }
        
        return 2;
    }
    
    
    
    // MÉTODOS PARA LA CLASE "viewPlayer"
    // Método para obtener toda la información de un jugador
    public List<Object> obtenerInfoJugador() {
        // Definiendo las variables necesarias
        List<Object> lstInfoPersonClass = new ArrayList<>();
        Player jugador = new Player();
        
        
        // Agregando información a la lista anteriormente creada
        lstInfoPersonClass.add(jugador.getId());
        lstInfoPersonClass.add(jugador.getNombre());
        lstInfoPersonClass.add(jugador.getApellido());
        lstInfoPersonClass.add(jugador.getEdad());
        lstInfoPersonClass.add(jugador.getDorsal());
        lstInfoPersonClass.add(jugador.getPosicion());
        
        
        // Retornando la información guardada en la lista
        return lstInfoPersonClass;
    }
}
