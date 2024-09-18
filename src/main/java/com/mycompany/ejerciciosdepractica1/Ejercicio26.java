package com.mycompany.ejerciciosdepractica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        int totalAlumnos = 2;
        int totalAlumnosBachillerato = 0;
        int totalAlumnosProfesionales = 0;
        int totalAlumnosMaestria = 0;
        int totalAlumnosSistemas = 0;

        String alumnos[][] = new String[totalAlumnos][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el numero del control: ");
            String numerodelcontrol = scanner.next();
            alumnos[i][0] = numerodelcontrol;

            System.out.println("Ingrese el nivel");
            String nivel = scanner.next();
            alumnos[i][1] = nivel;

            System.out.println("Ingrese la especialidad");
            String especialidad = scanner.next();
            alumnos[i][2] = especialidad;

        }

        for (int i = 0; i < alumnos.length; i++) {
            String nivel = alumnos[i][1];

            switch (nivel) {
                case "bachillerato":
                    totalAlumnosBachillerato++;
                    break;
                case "profesional":
                    totalAlumnosProfesionales++;
                    break;
                case "maestria":
                    totalAlumnosMaestria++;
                   break;
            }
            
            if (alumnos[i][2].equals("sistemas")){
             totalAlumnosSistemas++; 
            }

        }
        
        System.out.println("INFORME: ");
        System.out.println("Total alumnos de bachillerato " + totalAlumnosBachillerato);
        System.out.println("Total alumnos de profesional " + totalAlumnosProfesionales);
        System.out.println("Total alumnos de maestria " +totalAlumnosMaestria);
        System.out.println("Total alumnos de sistemas " + totalAlumnosSistemas);
    }

}
