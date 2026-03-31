package Semana08Practica.Practica03;

import java.util.Scanner;

public class MainPago {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n===== SISTEMA PAGOS =====");
            System.out.println("1 Registrar Pago Tarjeta");
            System.out.println("2 Registrar Pago Yape");
            System.out.println("3 Registrar Transferencia");
            System.out.println("4 Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Codigo Pago: ");
                    String cod = sc.nextLine();

                    System.out.print("Monto: ");
                    double monto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Banco: ");
                    String banco = sc.nextLine();

                    System.out.print("Regla: ");
                    String regla = sc.nextLine();


                    PagoTarjeta pt = new PagoTarjeta(cod, monto, banco, regla);

                    System.out.println("Monto Final: " + pt.montoFinal());

                    break;

                case 2:

                    System.out.print("Codigo Pago: ");
                    cod = sc.nextLine();

                    System.out.print("Monto: ");
                    monto = sc.nextDouble();

                    System.out.print("Numero Celular: ");
                    int cel = sc.nextInt();
                    sc.nextLine();

                    PagoYape py = new PagoYape(cod, monto, cel);

                    System.out.println("Monto Final: " + py.montoFinal());

                    break;

                case 3:

                    System.out.print("Codigo Pago: ");
                    cod = sc.nextLine();

                    System.out.print("Monto: ");
                    monto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Cuenta Destino: ");
                    String cuenta = sc.nextLine();

                    PagoTransferencia pte=new PagoTransferencia(cod, monto, cuenta);

                    System.out.println("Monto Final: " + pte.montoFinal());

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