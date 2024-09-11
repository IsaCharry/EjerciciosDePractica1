package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class EjercicioCalculoNotas {

    //Isabella Charry Moreno
    // Codigo: 20241220186
    public static void main(String[] args) {
        int n = 2;
        int notas[][] = new int[n][3];
        System.out.println(notas.length);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las notas del estudiante " + (i + 1));

            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1));
                notas[i][j] = scanner.nextInt();
            }

        }

        double notadefinitivaAritmetica[] = new double[n];
        double ponderados[] = {0.25, 0.3, 0.45};
        double notadefinitivaPonderado[] = new double[n];

        // Promedios
        for (int i = 0; i < notas.length; i++) {
            double sumaNota = 0, sumaNotaPonderado = 0;
            for (int j = 0; j < notas[i].length; j++) {
                sumaNota = sumaNota + notas[i][j];
                sumaNotaPonderado = sumaNotaPonderado + (notas[i][j] * ponderados[j]);
            }

            notadefinitivaAritmetica[i] = sumaNota / 3;
            notadefinitivaPonderado[i] = sumaNotaPonderado;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("La nota definitiva con promedio aritmetico del estudiante " + (i + 1) + " es " + notadefinitivaAritmetica[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("La nota definitiva con promedio ponderado del estudiante " + (i + 1) + " es " + notadefinitivaPonderado[i]);
        }

    }
}
