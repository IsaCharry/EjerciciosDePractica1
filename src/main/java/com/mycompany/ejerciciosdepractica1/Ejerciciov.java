package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejerciciov {

    //Isabella Charry Moreno
    // Codigo: 20241220186
    public static void main(String[] args) {
        String nombre;
        int edad;

        System.out.println("Dime tu nombre");
        Scanner scanner = new Scanner(System.in);
        nombre = scanner.next();
        System.out.println("Dime tu edad");
        Scanner scannerint = new Scanner(System.in);
        edad = scannerint.nextInt();
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años ");
    }
}
