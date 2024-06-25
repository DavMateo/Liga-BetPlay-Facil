/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.betplay.betplayfacil.manejoErrores;

// Importando las liberías y archivos necesarios
import java.text.MessageFormat;


/**
 *
 * @author mateo
 */
public class errOpNoEncontrada extends Exception {
    // Creando el constructor con el mensaje de error personalizado
    public errOpNoEncontrada(int opcionIngresada, int cantOpciones) {
        super(
            MessageFormat.format(
                "Error: La opción elegida no se encuentra disponible o es inaccesible\n" +
                "Las opciones permitidas son del 1 al {0} y usted ingreso la opción {1}",
                opcionIngresada, cantOpciones
            )
        );
    }
}
