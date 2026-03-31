package Semana08.Ejemplo02;

import java.util.Scanner;

public class MainEnvio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Transporte t = null;   // ⭐ POLIMORFISMO CON INTERFACE

        do {

            System.out.println("\n***** ENCOMIENDAS *****");
            System.out.println("1. Envio Terrestre");
            System.out.println("2. Envio Aereo");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();

                    System.out.print("Distancia: ");
                    double distancia = sc.nextDouble();

                    System.out.print("Envio a domicilio (true/false): ");
                    boolean dom = sc.nextBoolean();

                    t = new EnvioTerrestre(peso, distancia, dom);

                    System.out.println("Total a pagar: " + t.calcularEnvio());

                    break;

                case 2:

                    System.out.print("Peso: ");
                    peso = sc.nextDouble();

                    System.out.print("Seguro (true/false): ");
                    boolean seg = sc.nextBoolean();

                    System.out.print("Envio a domicilio (true/false): ");
                    dom = sc.nextBoolean();

                    t = new EnvioAereo(peso, seg, dom);

                    System.out.println("Total a pagar: " + t.calcularEnvio());

                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);
        sc.close();
    }
}