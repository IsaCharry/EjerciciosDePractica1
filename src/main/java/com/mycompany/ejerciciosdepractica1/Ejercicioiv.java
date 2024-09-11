package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicioiv {

    //Isabella Charry Moreno
    // Codigo: 20241220186
    public static void main(String[] args) {
        int numero1, numero2, totalsuma;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el primer número");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el segundo número");
        numero2 = scanner.nextInt();
        totalsuma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es = " + totalsuma);
    }

}
