package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio1a2 {

    //Isabella Charry Moreno
    // Codigo: 20241220186
    public static void main(String[] args) {
        double radio, longitud;
        final double PI = Math.PI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de su circulo:");
        radio = scanner.nextDouble();
        longitud = 2 * PI * radio;
        System.out.println("La longitud de su circulo es de: " + longitud);
    }

}
