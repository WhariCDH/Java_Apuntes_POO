package Semana04.Elaborar2_6;

import java.util.Scanner;

public class PrimIndustria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Industria industria = new Industria();
        int opcion;

        do {

            System.out.println("\n***** MENU INDUSTRIAL *****");
            System.out.println("1. Registrar empresa");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Salir");
            System.out.print("Ingrese opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    industria.registrar();
                    break;

                case 2:
                    industria.mostrarDatos();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 3);

        sc.close();
    }
}