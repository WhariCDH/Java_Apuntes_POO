package Semana07.EjemploClaseAbstracta.Laboratorio.Pregunta02;

import java.util.Scanner;

public class MainAuto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Auto a = null;   // ⭐ POLIMORFISMO

        do {

            System.out.println("\n***** VENTA DE AUTOS *****");
            System.out.println("1. Auto Nuevo");
            System.out.println("2. Auto Usado");
            System.out.println("3. Salir");
            System.out.print("Seleccione opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1: {

                    System.out.println("\n***** AUTO NUEVO *****");

                    String tipo;

                    while (true) {

                        System.out.print("Tipo (sedan/camioneta/minivan): ");
                        tipo = sc.nextLine().toLowerCase();

                        if (tipo.equals("sedan") || tipo.equals("camioneta") || tipo.equals("minivan")) {
                            break;
                        }

                        System.out.println("Tipo invalido.");
                    }

                    boolean alarma;
                    String entrada;

                    while (true) {

                        System.out.print("Desea alarma? (SI/NO): ");
                        entrada = sc.nextLine().toLowerCase();

                        if (entrada.equals("si")) {
                            alarma = true;
                            break;
                        }

                        if (entrada.equals("no")) {
                            alarma = false;
                            break;
                        }

                        System.out.println("Opcion invalida.");
                    }

                    String seguro;

                    while (true) {

                        System.out.print("Seguro (todo/robo/accidente/ninguno): ");
                        seguro = sc.nextLine().toLowerCase();

                        if (seguro.equals("todo") || seguro.equals("robo") || seguro.equals("accidente") || seguro.equals("ninguno")) {
                            break;
                        }

                        System.out.println("Seguro invalido.");
                    }

                    a = new AutoNuevo(tipo, seguro, alarma);

                    System.out.println("Precio final: $ " + a.calcularPrecio());

                    break;
                }

                case 2: {

                    System.out.println("\n***** AUTO USADO *****");

                    String tipo;

                    while (true) {

                        System.out.print("Tipo (sedan/camioneta/minivan): ");
                        tipo = sc.nextLine().toLowerCase();

                        if (tipo.equals("sedan") ||
                            tipo.equals("camioneta") ||
                            tipo.equals("minivan")) {
                            break;
                        }

                        System.out.println("Tipo invalido.");
                    }

                    System.out.print("Año fabricacion: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    boolean mantenimiento;
                    String entrada;

                    while (true) {

                        System.out.print("Necesita mantenimiento? (SI/NO): ");
                        entrada = sc.nextLine().toLowerCase();

                        if (entrada.equals("si")) {
                            mantenimiento = true;
                            break;
                        }

                        if (entrada.equals("no")) {
                            mantenimiento = false;
                            break;
                        }

                        System.out.println("Opcion invalida.");
                    }

                    String seguro;

                    while (true) {

                        System.out.print("Seguro (todo/robo/accidente/ninguno): ");
                        seguro = sc.nextLine().toLowerCase();

                        if (seguro.equals("todo") || seguro.equals("robo") || seguro.equals("accidente") || seguro.equals("ninguno")) {
                            break;
                        }

                        System.out.println("Seguro invalido.");
                    }

                    a = new AutoUsado(tipo, seguro, anio, mantenimiento);

                    System.out.println("Precio final: $ " + a.calcularPrecio());

                    break;
                }

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}