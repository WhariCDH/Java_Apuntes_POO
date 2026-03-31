package Semana08.Laboratorio;

import java.util.Scanner;

public class MainEstudiante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n***** SISTEMA ESTUDIANTES *****");
            System.out.println("1 Registrar Pregrado");
            System.out.println("2 Registrar Posgrado");
            System.out.println("3 Mostrar contadores");
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

                    System.out.print("Semestre ingreso: ");
                    int sem = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Condicion social: ");
                    String cond = sc.nextLine();

                    System.out.print("Promedio: ");
                    double prom = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Colegio (estatal/particular): ");
                    String col = sc.nextLine();

                    EstudiantePreGrado ep =
                            new EstudiantePreGrado(cod, nom, sem, cond, prom, col);

                    System.out.println("Pago final: " + ep.pagoFinal());

                    break;

                case 2:

                    System.out.print("Codigo: ");
                    cod = sc.nextLine();

                    System.out.print("Nombre: ");
                    nom = sc.nextLine();

                    System.out.print("Semestre ingreso: ");
                    sem = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Condicion social: ");
                    cond = sc.nextLine();

                    System.out.print("Grado (bachiller/titulado): ");
                    String gra = sc.nextLine();

                    EstudiantePosGrado pos =
                            new EstudiantePosGrado(cod, nom, sem, cond, gra);

                    System.out.println("Pago final: " + pos.pagoFinal());

                    break;

                case 3:

                    System.out.println("Pregrado registrados: " +EstudiantePreGrado.getContador());

                    System.out.println("Posgrado registrados: " +EstudiantePosGrado.getContador());

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