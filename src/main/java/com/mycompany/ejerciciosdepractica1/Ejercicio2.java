package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
       //Isabella Charry Moreno
       // Codigo: 20241220186
        
       // Ejercicio 2    
       int numllantas, totaldelacompra, preciodecadallanta;
       Scanner scanner = new Scanner(System.in);

       System.out.print("Ingrese el numero de llantas que desea adquirir: ");
       numllantas=scanner.nextInt();
       if (numllantas<=0) {
           System.out.println("El valor ingresado no es valido");
       }
       else{          

          if (numllantas<5 ){
             preciodecadallanta=100;

             System.out.println("Usted debe pagar por cada llanta un valor de:" +preciodecadallanta);
             totaldelacompra=preciodecadallanta*numllantas;
             System.out.println("Usted debe pagar por el total de la compra un valor de: " + totaldelacompra);
          }

          if (numllantas >= 5 && numllantas <=10){
              preciodecadallanta=75;
              System.out.println("Usted debe pagar por cada llanta un valor de:"+preciodecadallanta);
              totaldelacompra=preciodecadallanta*numllantas;
              System.out.println("Usted debe pagar por el total de la compra un valor de: " + totaldelacompra);
          }

          if (numllantas >10){
              preciodecadallanta=50;
              System.out.println("Usted debe pagar por cada llanta un valor de:"+preciodecadallanta);
              totaldelacompra=preciodecadallanta*numllantas;
              System.out.println("Usted debe pagar por el total de la compra un valor de:"+ totaldelacompra);
          }        

       } 
        
    }
    
}
