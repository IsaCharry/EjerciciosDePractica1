package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Isabella Charry Moreno
        //codigo: 20241220186
        
        //Ejercicio3
        double totalPrecioManzana = 0;
        double totalPrecioDescuento = 0;
        double numKilosComprados = 0;
        double precioKiloManzana = 300;
        double descuento = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de Kilos que desea comprar:");
        numKilosComprados = scanner.nextDouble();

        if (numKilosComprados > 0 && numKilosComprados <= 2) {
            descuento = 0;

            System.out.printf("Usted recibira un descuento del %f%n %" + descuento * 100);
            totalPrecioManzana = numKilosComprados * precioKiloManzana;
            System.out.println("Usted debe pagar un total de:" + totalPrecioManzana);
        }

        if (numKilosComprados >= 2.01 && numKilosComprados <= 5) {
            totalPrecioManzana = numKilosComprados * precioKiloManzana;
            descuento = totalPrecioManzana * 0.1;
            totalPrecioDescuento = totalPrecioManzana - descuento;
            System.out.println("Usted debe pagar un total de: " + totalPrecioDescuento + " por " + numKilosComprados + "kg de manzanas");
        }
        if (numKilosComprados >= 5.01 && numKilosComprados <= 10) {
            totalPrecioManzana = numKilosComprados * precioKiloManzana;
            descuento = totalPrecioManzana * 0.15;
            totalPrecioDescuento = totalPrecioManzana - descuento;
            System.out.println("Usted debe pagar un total de: " + totalPrecioDescuento + " por " + numKilosComprados + "kg de manzanas");
        }

        if (numKilosComprados >= 10.1) {
            totalPrecioManzana = numKilosComprados * precioKiloManzana;
            descuento = totalPrecioManzana * 0.20;
            totalPrecioDescuento = totalPrecioManzana - descuento;
            System.out.println("Usted debe pagar un total de: " + totalPrecioDescuento + " por " + numKilosComprados + "kg de manzanas");
        }

    }
}
