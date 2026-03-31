package Semana08.Ejemplo01;

import java.util.Scanner;

public class MainCliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n***** SERVICIOS *****");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Salir");
            System.out.print("Seleccione opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    String resp;

                    do {

                        System.out.println("\n***** REGISTRO CLIENTE *****");

                        String tipoTelefono;

                        while (true) {

                            System.out.print("Tipo telefono (basico/medio/completo/plus): ");
                            tipoTelefono = sc.nextLine().toLowerCase();

                            if (tipoTelefono.equals("basico") ||
                                tipoTelefono.equals("medio") ||
                                tipoTelefono.equals("completo") ||
                                tipoTelefono.equals("plus")) {
                                break;
                            }

                            System.out.println("Tipo invalido.");
                        }

                        boolean cableClasico;
                        String entrada;

                        while (true) {

                            System.out.print("Tiene cable clasico? (SI/NO): ");
                            entrada = sc.nextLine().toLowerCase();

                            if (entrada.equals("si")) {
                                cableClasico = true;
                                break;
                            }

                            if (entrada.equals("no")) {
                                cableClasico = false;
                                break;
                            }

                            System.out.println("Opcion invalida.");
                        }

                        Cliente c = new Cliente(tipoTelefono, cableClasico);

                        System.out.println("\nPago telefono: S/ " + c.pagoTelefono());
                        System.out.println("Pago cable: S/ " + c.pagoCable());
                        System.out.println("TOTAL MENSUAL: S/ " + c.pagoTotal());

                        System.out.print("\nRegistrar otro cliente? (SI/NO): ");
                        resp = sc.nextLine().toUpperCase();

                    } while (resp.equals("SI"));

                    break;

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");

            }

        } while (opcion != 2);

        sc.close();
    }
}