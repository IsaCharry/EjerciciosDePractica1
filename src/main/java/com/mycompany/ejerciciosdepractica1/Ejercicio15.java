package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        //Isabella Charry Moreno
        //codigo: 20241220186
        //Ejercicio 15
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de nacimientos: ");
        int nacimientos = scanner.nextInt();
        int contador = 0;
        int sexoM = 0;
        int sexoF = 0;
        do {
            contador = contador + 1;
            System.out.println("Ingrese el nombre del bebe");
            String nombre = scanner.next();
            
            System.out.println("Ingrese el sexo del bebe");
            String sexo = scanner.next();
            
            if(sexo.equals("M")){
                sexoM = sexoM + 1;
            }else{
                sexoF = sexoF + 1;
            }               
            
            
        } while (contador < nacimientos);
        
        System.out.println("Total de bebes M: "+ sexoM);
        System.out.println("Total de bebes F: "+ sexoF);

    }
}
