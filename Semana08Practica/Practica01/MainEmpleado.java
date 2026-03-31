package Semana08Practica.Practica01;

import java.util.Scanner;

public class MainEmpleado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n===== SISTEMA EMPLEADOS =====");
            System.out.println("1 Registrar Administrativo");
            System.out.println("2 Registrar Operario");
            System.out.println("3 Registrar Gerente");
            System.out.println("4 Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Codigo: ");
                    String cod = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();

                    System.out.print("Años de servicio: ");
                    int anios = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Area: ");
                    String area = sc.nextLine();

                    EmpleadoAdministrativo ea=new EmpleadoAdministrativo(cod, nom, anios, area);

                    System.out.println("Sueldo Final: " +ea.sueldoFinal());

                    break;

                case 2:

                    System.out.print("Codigo: ");
                    cod = sc.nextLine();

                    System.out.print("Nombre: ");
                    nom = sc.nextLine();

                    System.out.print("Años de servicio: ");
                    anios = sc.nextInt();

                    System.out.print("Horas extras: ");
                    int horas = sc.nextInt();
                    sc.nextLine();

                    EmpleadoOperario eo=new EmpleadoOperario(cod, nom, anios, horas);

                    System.out.println("Sueldo Final: " +eo.sueldoFinal());

                    break;

                case 3:

                    System.out.print("Codigo: ");
                    cod = sc.nextLine();

                    System.out.print("Nombre: ");
                    nom = sc.nextLine();

                    System.out.print("Años de servicio: ");
                    anios = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Departamento: ");
                    String dep = sc.nextLine();

                    EmpleadoGerente eg=new EmpleadoGerente(cod, nom, anios, dep);

                    System.out.println("Sueldo Final: " +eg.sueldoFinal());

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");

            }

        } while (opcion != 4);

        sc.close();
    }
}