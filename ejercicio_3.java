/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_3 {
     private static final double TIPO_CAMBIO = 1.33250;

    public static double dolaresAEuros(double dolares) {
        return dolares / TIPO_CAMBIO;
    }

    public static void main(String[] args) {
        double dolares = 100; // Cambiar a la cantidad de dólares que se desee convertir
        double euros = dolaresAEuros(dolares);
        System.out.println(dolares + " dólares equivalen a " + euros + " euros.");
    }
}
