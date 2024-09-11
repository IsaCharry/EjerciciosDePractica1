/*
El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
un saldo superior a los U$20.000 no pedirá ningún préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
• U$5.000 para equipo de computo
• U$2.000 para mobiliario
=7.000
• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.
 */
package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;

public class Ejercicio5 {

    //Isabella Charry Moreno
    // Codigo: 20241220186
    public static void main(String[] args) {
        double capital, saldo = 0, prestamo = 0, insumos, incentivos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de su capital");
        capital = scanner.nextDouble();

        if (capital < 0) {
            System.out.println("Su saldo es negativo");
            prestamo = (capital * -1) + 10000;
            saldo = 10000;
        } else if (capital > 0 && capital < 20000) {
            prestamo = 20000 - capital;
            System.out.println("Su saldo es positivo");
            saldo = 20000;
        } else {
            saldo = capital;
        }
        double computo = 5000, mobiliario = 2000, saldoTemporal;
        saldoTemporal = saldo - computo - mobiliario;

        insumos = saldoTemporal / 2;
        incentivos = saldoTemporal / 2;

        System.out.println("Se destinaron: " + insumos + "para insumos y: " + incentivos + " para incentivos ");

        if (prestamo > 0) {
            System.out.println("Se realizo un prestamo por: " + prestamo);
        }

    }

}
