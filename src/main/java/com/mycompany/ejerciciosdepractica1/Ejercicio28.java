package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        int totalVendedores = 3;   
     
        String vendedores[][] = new String[totalVendedores][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Ingrese el numero del vendedor");
            String numVendedor = scanner.next();
            vendedores[i][0] = numVendedor;

            System.out.println("Ingrese el numero de venta");
            String numVenta = scanner.next();
            vendedores[i][1] = numVenta;

            System.out.println("Ingrese la zona de venta");
            String zonaDeVenta = scanner.next();
            vendedores[i][2] = zonaDeVenta;
        }
        
        for (int i = 0; i < vendedores.length; i++) {
            
            String zonaDeVenta = vendedores[i][2];
            double ventaVendedor = Double.parseDouble(vendedores[i][1]);
            double comision = 0;
            
            switch (zonaDeVenta) {
                case "Norte":                    
                    comision = ventaVendedor * 0.2;
                    System.out.println("Comision por zona norte, se le da un 20% de comision: " + comision);                      
                    break;
                case "Sur":
                    comision = ventaVendedor * 0.18;
                    System.out.println("Comision por zona sur, se le da un 18% de comision " + comision);
                    break;
                case "Oriente":
                    comision = ventaVendedor * 0.17;
                    System.out.println("Comision por zona oriente, se le da un 17% de comision " + comision);
                    break;
                case "Poniente":
                    comision = ventaVendedor * 0.21;
                    System.out.println("Comision por zona poniente, se le da un 21% de comision " + comision);
                    break;
                case "Centro":
                    comision= ventaVendedor * 0.15;
                    System.out.println("Comision por zona centro, se le da un 15% de comision " + comision);
                    break;

            }
        
        }
    }
}
