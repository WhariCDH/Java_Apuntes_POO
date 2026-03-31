package Semana07.EjemploClaseAbstracta.Laboratorio.Pregunta01;

import java.util.Scanner;

public class MainServicioTelefonico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        ServicioTelefonico s = null;   // ⭐ POLIMORFISMO

        do {

            System.out.println("\n***** SERVICIO TELEFONICO *****");
            System.out.println("1. Telefono Fijo");
            System.out.println("2. Telefono Celular");
            System.out.println("3. Salir");
            System.out.print("Seleccione opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1: {

                    System.out.println("\n***** TELEFONO FIJO *****");

                    System.out.print("Minutos consumidos: ");
                    int minutos = sc.nextInt();
                    sc.nextLine();

                    String tipo;

                    while (true) {

                        System.out.print("Tipo (Residencial / Comercial / Industrial): ");
                        tipo = sc.nextLine().toLowerCase();

                        if (tipo.equals("residencial") ||
                            tipo.equals("comercial") ||
                            tipo.equals("industrial")) {
                            break;
                        }

                        System.out.println("Tipo invalido.");
                    }

                    boolean mantenimiento;
                    String entrada;

                    while (true) {

                        System.out.print("Solicita mantenimiento? (SI/NO): ");
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

                    s = new TelefonoFijo(minutos, tipo, mantenimiento);

                    System.out.println("Pago final: S/ " + s.calcularPago());

                    break;
                }

                case 2: {

                    System.out.println("\n***** TELEFONO CELULAR *****");

                    System.out.print("Minutos consumidos: ");
                    int minutos = sc.nextInt();
                    sc.nextLine();

                    boolean internet;
                    String entrada;

                    while (true) {

                        System.out.print("Tiene servicio de internet? (SI/NO): ");
                        entrada = sc.nextLine().toLowerCase();

                        if (entrada.equals("si")) {
                            internet = true;
                            break;
                        }

                        if (entrada.equals("no")) {
                            internet = false;
                            break;
                        }

                        System.out.println("Opcion invalida.");
                    }

                    s = new TelefonoCelular(minutos, internet);

                    System.out.println("Pago final: S/ " + s.calcularPago());

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