/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_2 {
     private double lado1;
    private double lado2;

    public ejercicio_2(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    public double calcularArea() {
        return lado1 * lado2;
    }

    public static void main(String[] args) {
        ejercicio_2 rectangulo = new ejercicio_2(5, 10);
        String tipoCalculo = "area"; // Cambiar a "perimetro" para calcular el perímetro
        double resultado;

        if (tipoCalculo.equals("area")) {
            resultado = rectangulo.calcularArea();
            System.out.println("El área del rectángulo es: " + resultado);
        } else if (tipoCalculo.equals("perimetro")) {
            resultado = rectangulo.calcularPerimetro();
            System.out.println("El perímetro del rectángulo es: " + resultado);
        } else {
            System.out.println("Tipo de cálculo no válido");
        }
    }
}
