/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_4 {
    private static final double PI = 3.1416;

    public static double calcular(double radio, String tipoCalculo) {
        double resultado = 0;
        if (tipoCalculo.equals("perimetro")) {
            resultado = calcularPerimetroCircunferencia(radio);
        } else if (tipoCalculo.equals("area")) {
            resultado = calcularAreaCirculo(radio);
        } else if (tipoCalculo.equals("volumen")) {
            resultado = calcularVolumenEsfera(radio);
        } else {
            System.out.println("Tipo de cálculo no válido");
        }
        return resultado;
    }

    public static double calcularPerimetroCircunferencia(double radio) {
        return 2 * PI * radio;
    }

    public static double calcularAreaCirculo(double radio) {
        return PI * Math.pow(radio, 2);
    }

    public static double calcularVolumenEsfera(double radio) {
        return (4 * PI * Math.pow(radio, 3)) / 3;
    }

    public static void main(String[] args) {
        double radio = 5; // Cambiar al radio deseado
        String tipoCalculo = "volumen"; // Cambiar al tipo de cálculo deseado: "perimetro", "area" o "volumen"
        double resultado = calcular(radio, tipoCalculo);
        
        if (tipoCalculo.equals("perimetro")) {
            System.out.println("El perímetro de la circunferencia es: " + resultado);
        } else if (tipoCalculo.equals("area")) {
            System.out.println("El área del círculo es: " + resultado);
        } else if (tipoCalculo.equals("volumen")) {
            System.out.println("El volumen de la esfera es: " + resultado);
        }
    }
}
