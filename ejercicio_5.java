/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_5 {
  public static int convertirASegundos(int dias, int horas, int minutos) {
        int segundosDias = dias * 24 * 60 * 60;
        int segundosHoras = horas * 60 * 60;
        int segundosMinutos = minutos * 60;
        
        int segundosTotales = segundosDias + segundosHoras + segundosMinutos;
        return segundosTotales;
    }

    public static void main(String[] args) {
        int dias = 2;
        int horas = 5;
        int minutos = 30;

        int segundosTotales = convertirASegundos(dias, horas, minutos);
        System.out.println("El total de segundos es: " + segundosTotales);
    }   
}
