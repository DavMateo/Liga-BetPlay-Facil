/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.betplayfacil.view;

// Importando las dependencias y/o archivos necesarios
import java.util.Scanner;
import java.text.MessageFormat;
import com.betplay.betplayfacil.Controller;
import com.betplay.betplayfacil.manejoErrores.errConfirmacion;
import com.betplay.betplayfacil.manejoErrores.errOpNoEncontrada;
import com.betplay.betplayfacil.model.entity.Team;


/**
 *
 * @author mateo
 */
public class viewTeam {
    // Definiendo las variables necesarias
    public static Controller controlador = new Controller();
    
    
    // Creando constructores necesarios para la clase actual
    public viewTeam() {
        
    }
    
    
    // Creación de una función sin valores de retorno
    public static void start() {
        // Definiendo las instancias necesarias de la función
        Scanner scanner = new Scanner(System.in);
        int cantError = 0;
        
        try {
            // Bucle while infinito para la selección de una opción del menú
            while(true) {
                System.out.println("\n\n=====================");
                System.out.println("==== MENÚ EQUIPO ====");
                System.out.println("=====================");
                
                System.out.println("1. Crear Equipo");
                System.out.println("2. Actualizar Equipo");
                System.out.println("3. Buscar Equipo");
                System.out.println("4. Eliminar Equipo");
                System.out.println("5. Listar todos los Equipos");
                System.out.println("6. Salir");

                // Pedir al usuario por la elección de una opción
                System.out.print("Elija una opción: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  //Limpiar buffer


                // Condicional según la opción elegida por el usuario
                switch(choice) {
                    case 1:
                            viewTeam.submenuCrear();
                        break;

                    case 2:

                        break;

                    case 3:
                            Team eq = new Team();  //Creando instancia de la clase "Team"
                            String codigoE = "001";

                            /**
                             * Obtiene el nombre del equipo según el valor de la variable
                             * "codigoE" pasado al getter presente en "controlador" y lo
                             * almacena en la variable "eq" para luego imprimirla en consola.
                             */

                            eq = controlador.equipos.get(codigoE);
                            System.out.println("Mi equipo " + eq.getNombre());
                        break;

                    case 4:

                        break;

                    case 5:

                        break;

                    case 6:
                            // Salir del programa
                            scanner.close();
                            System.exit(0);
                        break;

                    default:
                        throw new errOpNoEncontrada(choice, 6);
                }
            }
        } catch(errOpNoEncontrada e) {
            cantError++;
            
            // Aumentar en +1 el contador de la variable y verificar si no ha superado la cuenta máxima de errores permitidos
            if(cantError <= 5) {
                System.out.println(MessageFormat.format(
                    "Por practicidad, te quedan {0} intentos, si alcanzas esos intentos el programa forzará la salida automáticamente", 
                    cantError - 5
                ));
            } else if(cantError == 5) { 
                System.out.println("Inténtelo de nuevo más tarde. Saliendo del programa..."); 
                System.exit(0);  // Saliendo del programa

            } else {
                System.out.println("Fatal error: Ha ocurrido un error interno. Inténtelo de nuevo");
                System.out.println("Saliendo del programa...");
                System.exit(0);  // Saliendo del programa
            }
            
        } finally {
            
        }
    }
    
    
    
    
    // Submenú para crear el equipo
    public static void submenuCrear() {
        // Definiendo las instancias necesarias
        Scanner sc = new Scanner(System.in);
        Team equipoInfo = new Team();
        
        // Imprimiendo las opciones del menu
        System.out.println("\n\n==== OPCIONES EQUIPO ====");
        
        System.out.println("1. Nombre y Ciudad del equipo");
        System.out.println("2. Administrar jugadores");
        System.out.println("3. Administrar entrenadores");
        System.out.println("4. Administrar doctores");
        System.out.println("5. Regresar");
        
        
        // Pedir al usuario por la elección de una opción
        System.out.print("Elija una opción: ");
        int opUser = sc.nextInt();
        sc.nextLine();  //Limpiar buffer
        
        
        // Condicional con las opciones disponibles
        switch(opUser) {
            case 1:
                try {
                    // Pide el ingreso del nombre y ciudad de origen del equipo
                    System.out.print("\n\nIngrese el nombre del equipo: ");
                    String nombreEquipo = sc.nextLine();
                    
                    System.out.print("Ingrese la ciudad de origen del equipo: ");
                    String ciudadEquipo = sc.nextLine();
                    System.out.println("\n¡La información se ha guardado con éxito!\n");
                    
                    
                    // Agregando información al hashtable y a Team
                    equipoInfo.setNombre(nombreEquipo);
                    equipoInfo.setCiudad(ciudadEquipo);
                    controlador.equipos.put(nombreEquipo, equipoInfo);
                    
                    
                    // Mostrando los resultados en consola
                    System.out.println("\nInformación Agregada:");
                    System.out.println(MessageFormat.format(
                        "Nombre del equipo: {0}\nCiudad de origen: {1}",
                        equipoInfo.getNombre(), equipoInfo.getCiudad()
                    ));

                } catch(java.util.NoSuchElementException e) {
                    System.out.println(e.getMessage());
                    System.out.println("La dependencia 'Scanner' ha sido cerrada y no acepta ninguna entrada de usuario.");

                    System.exit(0);
                    break;
                }
                break;
                
                
            case 2:
                
        }
    }
}