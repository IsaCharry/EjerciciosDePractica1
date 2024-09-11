package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio1a1 {

    //Isabella Charry Moreno
    // Codigo: 20241220186
    public static void main(String[] args) {

        int radio;
        double area, pi = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el radio del circulo");
        radio = scanner.nextInt();

        area = 2 * pi * radio;

        System.out.println("El area de su circulo es de: " + area);
    }
}
