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
public class errConfirmacion extends Exception {
    // Creando el constructor con el mensaje de error personalizado
    public errConfirmacion(String opcionIngresada) {
        super(
            MessageFormat.format(
                "Error de digitacion: La opción ingresada no corresponde a las opciones disponibles\n" +
                "Solo se aceptan valores 'Y' o 'N' y usted ingresó: {0}", opcionIngresada
        ));
    }
}