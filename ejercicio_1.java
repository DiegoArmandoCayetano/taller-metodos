/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_1 {
   
    private double precio;
    private double descuento;

    public ejercicio_1(double precio, double descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }

    public double calcularPrecioConDescuento() {
        double precioConDescuento = precio - (precio * descuento / 100);
        return precioConDescuento;
    }

    public static void main(String[] args) {
        ejercicio_1 producto = new ejercicio_1(300, 20);
        double precioFinal = producto.calcularPrecioConDescuento();
        System.out.println("El precio final con descuento es de: " + precioFinal);
    }
    

}
