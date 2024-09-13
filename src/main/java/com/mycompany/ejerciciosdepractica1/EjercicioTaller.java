package com.mycompany.ejerciciosdepractica1;

import java.util.Scanner;
import java.util.Random;

public class EjercicioTaller {
    // Isabella Charry Moreno
    // Codigo 20241220186

    public static void main(String[] args) {

        int totalCamiones = 100;
        double camiones[][] = new double[totalCamiones][6];
        
        // Si es true se llena automaticamente la matriz, si es false se llena manual los datos
        
        boolean llenarDatos = false;
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < camiones.length; i++) {

            if (i > 0 && llenarDatos == false) {
                System.out.println("Desea continuar ingresando datos? Presiona 1 si desea continuar o 2 si desea finalizar:");
                double continuar = sc.nextInt();

                if (continuar == 2) {
                    break;
                }
            }

            System.out.println("Ingresando datos camion " + (i + 1));

            for (int j = 0; j < camiones[i].length; j++) {

                switch (j) {
                    case 0:

                        double tipoServicio = 0;

                        if (llenarDatos) {
                            tipoServicio = random.nextInt(2) + 1;
                            camiones[i][j] = tipoServicio;
                        } else {
                            while (tipoServicio != 1.0 && tipoServicio != 2.0) {
                                System.out.println("Ingrese el tipo de servicio: 1. Cargue , 2. Descargue");
                                tipoServicio = sc.nextDouble();
                                camiones[i][j] = tipoServicio;

                                if (tipoServicio != 1.0 && tipoServicio != 2.0) {
                                    System.out.println("El valor ingresado es invalido");
                                }
                            }
                        }

                        break;
                    case 1:

                        double tipoProducto = 0;

                        if (llenarDatos) {
                            tipoProducto = random.nextInt(2) + 1;
                            camiones[i][j] = tipoProducto;
                        } else {

                            while (tipoProducto != 1.0 && tipoProducto != 2.0) {
                                System.out.println("Ingrese el tipo de producto: 1. Perecedero , 2. No perecedero");
                                tipoProducto = sc.nextDouble();
                                camiones[i][j] = tipoProducto;

                                if (tipoProducto != 1.0 && tipoProducto != 2.0) {
                                    System.out.println("El valor ingresado es invalido");
                                }
                            }

                        }

                        break;
                    case 2:

                        double pesoTransportado;

                        if (llenarDatos) {
                            // Genera un dato aleatorio entre 1 y 50 toneladas
                            pesoTransportado = (double) random.nextInt(50) + 1;
                            camiones[i][j] = pesoTransportado;
                        } else {
                            System.out.println("Ingrese el peso transportado en toneladas:");
                            pesoTransportado = sc.nextDouble();
                            camiones[i][j] = pesoTransportado;
                        }

                        break;
                    case 3:

                        double tiempoPermanencia = 0;
                        if (llenarDatos) {
                            // Genera un dato aleatorio entre 1 y 24 horas                            
                            tiempoPermanencia = (double) random.nextInt(24) + 1;
                            camiones[i][j] = tiempoPermanencia;
                        } else {
                            System.out.println("Ingrese el tiempo de permanencia:");
                            tiempoPermanencia = sc.nextDouble();
                            camiones[i][j] = tiempoPermanencia;
                        }

                        break;
                    case 4:
                        double largoCamion = 0;

                        if (llenarDatos) {                            
                            // Genera un dato aleatorio entre 1 y 12 metros                            
                            largoCamion = (double) random.nextInt(12) + 1;
                            camiones[i][j] = largoCamion;                      
                            
                        } else {
                            System.out.println("Ingrese el largo del camion:");
                            largoCamion = sc.nextDouble();
                            camiones[i][j] = largoCamion;
                        }

                        break;

                    case 5:
                        // Calcular costo del parqueadero

                        double costoParqueadero = 0;

                        if (camiones[i][0] == 2) {

                            // Calculo parqueadero descargue
                            if (camiones[i][2] < 8) {

                                if (camiones[i][1] == 1) {

                                    costoParqueadero = 15000 * camiones[i][2];

                                } else {
                                    costoParqueadero = 60000;
                                }

                            } else {

                                if (camiones[i][1] == 1) {
                                    costoParqueadero = 9000 * camiones[i][2];
                                } else {

                                    if (camiones[i][2] <= 10) {
                                        costoParqueadero = 60000;
                                    } else {

                                        double toneladasExceso = camiones[i][2] - 10;

                                        costoParqueadero = 60000 + (toneladasExceso * 7000);

                                    }

                                }

                            }

                        } else {

                            // Calculo parqueadero cargue
                            if (camiones[i][3] > 2) {
                                tiempoPermanencia = camiones[i][3];
                                largoCamion = camiones[i][4];
                                costoParqueadero = (tiempoPermanencia - 2) * 4000;

                                if (largoCamion > 4) {
                                    double porcentaje = costoParqueadero * 0.25;
                                    costoParqueadero = costoParqueadero + porcentaje;
                                }
                            }

                        }

                        camiones[i][j] = costoParqueadero;

                        break;
                }

            }
        }

        // Informe
        double sumaCostoParqueaderoCargue = 0;
        double sumaCostoParqueaderoDescargue = 0;
        double promedioCostoParqueaderoCargue = 0;
        double promedioCostoParqueaderoDescargue = 0;
        double totalCamionesCargue = 0;
        double totalCamionesDescargue = 0;
        double sumaCostoParqueaderoPerecederos = 0;
        double totalVehiculosMenosPermanencia = 0;

        for (int i = 0; i < camiones.length; i++) {
            
            // Si la primera columna de la matriz es 0, continua con el siguiente ya que es un dato vacio

            if (camiones[i][0] == 0) {
                continue;
            }

            // Calculo de costo parqueadero para los tipos de servicio
            if (camiones[i][0] == 1) {
                totalCamionesCargue = totalCamionesCargue + 1;
                sumaCostoParqueaderoCargue = sumaCostoParqueaderoCargue + camiones[i][5];
            } else {
                totalCamionesDescargue = totalCamionesDescargue + 1;
                sumaCostoParqueaderoDescargue = sumaCostoParqueaderoDescargue + camiones[i][5];
            }

            // Calculo costo para vehiculos que descargaron productos perecederos
            if (camiones[i][1] == 1) {
                sumaCostoParqueaderoPerecederos = sumaCostoParqueaderoPerecederos + camiones[i][5];
            }

            if (camiones[i][3] < 2) {
                totalVehiculosMenosPermanencia = totalVehiculosMenosPermanencia + 1;
            }

        }

        promedioCostoParqueaderoCargue = sumaCostoParqueaderoCargue / totalCamionesCargue;
        promedioCostoParqueaderoDescargue = sumaCostoParqueaderoDescargue / totalCamionesDescargue;

        System.out.println("INFORME:");

        System.out.println("El promedio del costo de parqueadero para camiones de cargue es: " + promedioCostoParqueaderoCargue);
        System.out.println("El promedio del costo de parqueadero para camiones de descargue es: " + promedioCostoParqueaderoDescargue);

        System.out.println("Total de vehiculos de cargue: " + totalCamionesCargue);
        System.out.println("Costo total de parqueadero: " + sumaCostoParqueaderoCargue);

        System.out.println("Total de vehiculos de descargue : " + totalCamionesDescargue);
        System.out.println("Costo total de parqueadero: " + sumaCostoParqueaderoDescargue);

        System.out.println("Total de vehiculos con menos de dos horas de permanencia : " + totalVehiculosMenosPermanencia);

    }
}