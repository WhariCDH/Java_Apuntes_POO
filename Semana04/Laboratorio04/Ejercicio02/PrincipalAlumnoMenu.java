package Semana04.Laboratorio04.Ejercicio02;

import java.util.Scanner;

public class PrincipalAlumnoMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("*****TIPO DE ALUMNO*****");
        System.out.println("1. Alumno Regular");
        System.out.println("2. Alumno Credito");
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

        String nombre;
        String entrada;
        boolean ingles;

        switch (opcion) {

            case 1:

                System.out.println("\n*****ALUMNO REGULAR*****");
                System.out.print("Nombre del alumno: ");
                nombre = sc.nextLine();

                while (true) {
                    System.out.print("Lleva ingles (SI/NO): ");
                    entrada = sc.nextLine().toLowerCase();

                    if (entrada.equals("si")) {
                        ingles = true;
                        break;
                    } else if (entrada.equals("no")) {
                        ingles = false;
                        break;
                    }

                    System.out.println("Respuesta inválida. Solo SI o NO.");
                }

                String categoria;

                while (true) {
                    System.out.print("Categoria (A/B/C): ");
                    categoria = sc.nextLine().toLowerCase();

                    if (categoria.equals("a") || categoria.equals("b") || categoria.equals("c")) {
                        break;
                    }

                    System.out.println("Categoria invalida, use A/B/C.");
                }

                boolean seguro;

                while (true) {
                    System.out.print("Lleva seguro (SI/NO): ");
                    entrada = sc.nextLine().toLowerCase();

                    if (entrada.equals("si")) {
                        seguro = true;
                        break;
                    } else if (entrada.equals("no")) {
                        seguro = false;
                        break;
                    }

                    System.out.println("Respuesta inválida.");
                }

                AlumnoRegular a = new AlumnoRegular();
                a.registroAlumnoRegular(nombre, ingles, categoria, seguro);

                System.out.println("Pago mensual: " + a.pagoBaseAR());

                break;

            case 2:

                System.out.println("\n*****ALUMNO CREDITO*****");
                System.out.print("Nombre del alumno: ");
                nombre = sc.nextLine();

                while (true) {
                    System.out.print("Lleva ingles (SI/NO): ");
                    entrada = sc.nextLine().toLowerCase();

                    if (entrada.equals("si")) {
                        ingles = true;
                        break;
                    } else if (entrada.equals("no")) {
                        ingles = false;
                        break;
                    }

                    System.out.println("Respuesta inválida.");
                }

                System.out.print("Numero de creditos: ");
                int credito = sc.nextInt();

                AlumnoCredito ac = new AlumnoCredito();
                ac.registroAlumnoCredito(nombre, ingles, credito);

                System.out.println("Pago mensual: " + ac.calcularPagoAC());

                break;

            default:
                System.out.println("Opcion invalida.");

        }

        sc.close();
    }
}