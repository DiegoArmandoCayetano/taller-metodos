/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_6 {
    public static double[] convertirDesdeSegundos(double segundos, String tipo) {
        double[] resultado = new double[3]; // Índice 0: días, Índice 1: horas, Índice 2: minutos

        if (tipo.equals("dias")) {
            resultado[0] = segundos / (24 * 60 * 60); // Segundos en un día
        } else if (tipo.equals("horas")) {
            resultado[1] = segundos / (60 * 60); // Segundos en una hora
        } else if (tipo.equals("minutos")) {
            resultado[2] = segundos / 60; // Segundos en un minuto
        } else {
            System.out.println("Tipo de conversión no válido");
        }

        return resultado;
    }

    public static void main(String[] args) {
        double segundos = 86400; // Cambiar al número de segundos deseado
        String tipo = "dias"; // Cambiar al tipo de conversión deseado: "dias", "horas" o "minutos"

        double[] resultado = convertirDesdeSegundos(segundos, tipo);

        if (tipo.equals("dias")) {
            System.out.println(segundos + " segundos equivalen a " + resultado[0] + " días.");
        } else if (tipo.equals("horas")) {
            System.out.println(segundos + " segundos equivalen a " + resultado[1] + " horas.");
        } else if (tipo.equals("minutos")) {
            System.out.println(segundos + " segundos equivalen a " + resultado[2] + " minutos.");
        }
    }
}
