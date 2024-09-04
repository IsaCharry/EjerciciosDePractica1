package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        //Isabella Charry Moreno
        //codigo: 20241220186
        //Ejercicio 13
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el genero del ganador: ");
        String genero = scanner.next();

        if (genero.equals("hombre") || genero.equals("mujer")) {

            System.out.println("Ingrese el numero de la bolita: ");
            int bolita = scanner.nextInt();

            if (genero.equals("hombre")) {
                switch (bolita) {
                    case 1:
                        System.out.println("Ha ganado un desodorante");
                        break;
                    case 2:
                        System.out.println("Ha ganado un six-pack de cerveza");
                        break;

                    case 3:
                        System.out.println("Ha ganado una camiseta");
                        break;

                    case 4:
                        System.out.println("Ha ganado una pantaloneta");
                        break;

                    case 5:
                        System.out.println("Ha ganado una sudadera");
                        break;
                    default:
                        System.out.println("No existe un premio para esta bolita");
                }
            } else {
                
                switch (bolita) {
                    case 1:
                        System.out.println("Ha ganado una loción");
                        break;
                    case 2:
                        System.out.println("Ha ganado un bikini");
                        break;
                    case 3:
                        System.out.println("Ha ganado una crema para la cara");
                        break;
                    case 4:
                        System.out.println("Ha ganado una plancha para el cabello");
                        break;
                    case 5:
                        System.out.println("Ha ganado un esmalte de uñas");
                        break;
                    default:
                        System.out.println("No existe un premio para esta bolita");
                }
            }
        } else {

            System.out.println("El genero ingresado no es valido");
        }

    }
}
