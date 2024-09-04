package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        //Isabella Charry Moreno
        //codigo: 20241220186

        //Ejercicio4
        double precioAparato;
        String marcaAparato;
        double total = 0;
        double iva;
        double descuentoNossy = 0;
        double descuento500 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del aparato:");
        precioAparato = scanner.nextDouble();

        System.out.print("Ingrese la marca de su aparto:");
        marcaAparato = scanner.next();

        if (precioAparato >= 500) {
            System.out.println("Se de dara un descuento del 10% en su compra");
            descuento500 = precioAparato * 0.1;
        }
        
        if (marcaAparato.equals("NOSSY")) {
            System.out.println("Se de dara un descuento del 5% en su compra por la marca NOSSY");
            descuentoNossy = precioAparato * 0.05;         
        }
        
        iva = 0.19 * precioAparato;      
        
        total = precioAparato + iva - descuentoNossy - descuento500;
        
        System.out.println("Total a pagar: " + total);
    }

}
