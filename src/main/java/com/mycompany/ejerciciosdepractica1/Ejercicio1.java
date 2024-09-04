package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        //Isabella Charry Moreno
        // Codigo: 20241220186
              
        //Ejercicio 1
        int numequipos, preciosindescuento, preciocomputadora;
        double preciototalcondescuento = 0.0; 
        preciocomputadora= 500;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de computadoras que desea adquirir: ");
        numequipos = scanner.nextInt();
        
        if(numequipos<=0){
            
            System.out.println("El total de equipos ingresados es invalido");
           
        }else{
            
             preciosindescuento = numequipos * preciocomputadora;
        
            if(numequipos<5){
                preciototalcondescuento = preciosindescuento - (preciosindescuento * 0.1);  
            System.out.println("A su compra se le aplico un 10% de descuento");    
            } 

            if(numequipos >= 5){
                preciototalcondescuento = preciosindescuento - (preciosindescuento * 0.2); 
            System.out.println("A su compra se le aplico un 20% de descuento");    
            }

            if(numequipos > 10){
                preciototalcondescuento = preciosindescuento - (preciosindescuento * 0.4);
            System.out.println("A su compra se le aplico un 40% de descuento");    
            }

            System.out.print("El total a pagar es: ");

            System.out.print(preciototalcondescuento);
            
        }      
        
    }    
}
