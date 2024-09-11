/*
Escribir un programa que pida dos números al usuario, y los guarde en dos variables enteras (a y b).
Posteriormente intercambia el valor de ambas variables (a valdrá lo que vale b, y b valdrá lo que vale
a), y muestra ambos valores antes y después del cambio
 */
package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio1a3 {

    //Isabella Charry Moreno
    // Codigo: 20241220186
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a");
        a = scanner.nextInt();
        System.out.println("Ingrese el numero b");
        b = scanner.nextInt();

        System.out.println("Valores antes a : " + a + " y b: " + b);
        a = b;
        b = a;
        System.out.println("Valores despues a : " + a + " y b: " + b);
    }

}
