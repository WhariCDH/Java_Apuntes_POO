package Semana06.Laboratorio06_01;

import java.util.Scanner;

public class PrincipalTrabajador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String cat;

        do {
            System.out.println("\n***** REGISTRO TRABAJADORES *****");
            System.out.println("1. Registro de Obrero");
            System.out.println("2. Salir del programa");
            System.out.println("Escoga una opción: ");
            opcion=sc.nextInt();
            sc.nextLine();  //limpiar buffo

            switch (opcion) {
                case 1:

                String resp;

                do{

                    System.out.println("***** REGISTRO DE OBRERO *****");
        
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    while (true) {
                        System.out.print("Categoria (A/B/C): ");
                        cat = sc.nextLine().toLowerCase();

                        if (cat.equals("a") || cat.equals("b") || cat.equals("c")) {
                            break;                            
                        }
                        System.out.println("Solo se acepta la categoria (A/B/C). ");
                        
                    }

                    System.out.print("Horas trabajadas: ");
                    int h = sc.nextInt();

                    System.out.print("Años de servicio: ");
                    int anios = sc.nextInt();

                    System.out.print("Porcentaje desempeño: ");
                    double porc = sc.nextDouble();
                    sc.nextLine();

                    Obrero o = new Obrero(nombre, cat, h, anios, porc);

                    System.out.println("\n***** RESULTADO *****");
                    System.out.println("Sueldo final: S/ " + o.calcularSueldo());  

                    System.out.print("\nDesea registrar otro Obrero (SI/NO): ");
                    resp=sc.nextLine().toUpperCase();

                } while (resp.equals("SI"));

                break;

                case 2:
                    System.out.println("Saliendo del programa....");
                    break;

            default:
                System.out.println("Opción invalida.");
            }

        } while (opcion != 2);
        sc.close();
    }
}