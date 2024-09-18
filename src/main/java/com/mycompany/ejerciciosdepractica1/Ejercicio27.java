package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        String nombreEmpleado;
        String sueldo;
        String departamento;
        int totalEmpleados = 3;
        int totalEmpleadosFinanzas = 0;
        int totalEmpleadosSistemas = 0;
        int totalEmpleadosProducción = 0;
        int totalEmpleadosVentas = 0;
        int totalEmpleadosMantenimiento = 0;
        int totalEmpleadosMayorSueldo = 0;

        String empleados[][] = new String[totalEmpleados][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese su nombre");
            nombreEmpleado = scanner.next();
            empleados[i][0] = nombreEmpleado;

            System.out.println("Ingrese el sueldo");
            sueldo = scanner.next();
            empleados[i][1] = sueldo;

            System.out.println("Ingrese el departamento");
            departamento = scanner.next();
            empleados[i][2] = departamento;

        }

        for (int i = 0; i < empleados.length; i++) {

            String departamentoEmpleado = empleados[i][2];

            switch (departamentoEmpleado) {
                case "Finanzas":
                    totalEmpleadosFinanzas++;
                    break;
                case "Sistemas":
                    totalEmpleadosSistemas++;
                    break;
                case "producción":
                    totalEmpleadosProducción++;
                    break;
                case "Ventas":
                    totalEmpleadosVentas++;
                    break;
                case "Mantenimiento":
                    totalEmpleadosMantenimiento++; 
                    break;
            }
            
            double sueldoEmpleado = Double.parseDouble(empleados[i][1]);

            if (sueldoEmpleado > 8000) {
                totalEmpleadosMayorSueldo++;
            }

        }
        
        System.out.println("INFORME: ");
        
        System.out.println("Total empleados finanzas: " + totalEmpleadosFinanzas );
        System.out.println("Total empleados sistemas: " + totalEmpleadosSistemas);
        System.out.println("Total empleados producción: "  + totalEmpleadosProducción );
        System.out.println("Total empleados ventas: " + totalEmpleadosVentas);
        System.out.println("Total empleados mantenimiento: " + totalEmpleadosMantenimiento);
        System.out.println("Total empleados que ganan mas de 8000: " +  totalEmpleadosMayorSueldo);
  
        
        

    }
}
