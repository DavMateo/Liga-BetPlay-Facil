/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.betplay.betplayfacil;

// Importando las dependencias y/o archivos necesarios
import com.betplay.betplayfacil.view.viewCoach;
import com.betplay.betplayfacil.view.viewDoctor;
import com.betplay.betplayfacil.view.viewPlayer;
import com.betplay.betplayfacil.view.viewTeam;
import java.util.Scanner;


/**
 *
 * @author mateo
 */
public class BetplayFacil {

    public static void main(String[] args) {
        // Creando las instancias necesarias
        Scanner sc = new Scanner(System.in);
        
        
        // Creando menú de inicio del programa
        System.out.println("1. Administrar Equipos");
        System.out.println("2. Administrar Jugadores");
        System.out.println("3. Administrar Masajista");
        System.out.println("4. Administrar Entrenador");
        System.out.println("5. Salir");
        
        System.out.print("Seleccione una opcion: ");
        int opcionUsuario = sc.nextInt();
        sc.nextLine();
        
        
        
        /**
         * NOTA ACLARATORIA: La instancia "Scanner" no debe ser cerrada cuando
         * desde una clase se llama a otra clase y ambas necesitan el ingreso de
         * información por parte del usuario mediante teclado. El cerrar la 
         * instancia en la clase que contiene el llamado hacia la segunda clase
         * hace que no permita el ingreso de información aún cuando en la 
         * segunda clase tiene abierta la instancia de "Scanner" y funcionando.
         */
        
        
        
        // Actuando según la opción elegida por el usuario
        switch(opcionUsuario) {
            case 1:
                viewTeam teamVista = new viewTeam();
                teamVista.start();
                
                break;
            
            case 2:
                viewPlayer playerVista = new viewPlayer();
                playerVista.start();
                
                break;
            
            case 3:
                viewDoctor doctorVista = new viewDoctor();
                doctorVista.start();
                
                break;
            
            case 4:
                viewCoach coachVista = new viewCoach();
                coachVista.start();
                
                break;
            
            case 5:
                System.exit(0);  // Saliendo del programa
                break;
        }
    }
}