package Semana08Practica.Practica03;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPagoLista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pago> listaPagos = new ArrayList<>();   // ⭐ NUEVO

        int opcion;

        do {

            System.out.println("\n===== SISTEMA PAGOS =====");
            System.out.println("1 Registrar Pago Tarjeta");
            System.out.println("2 Registrar Pago Yape");
            System.out.println("3 Registrar Transferencia");
            System.out.println("4 Mostrar Pagos");
            System.out.println("5 Total Recaudado");
            System.out.println("6 Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Codigo: ");
                    String cod = sc.nextLine();

                    System.out.print("Monto: ");
                    double monto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Banco: ");
                    String banco = sc.nextLine();

                    System.out.print("Regla: ");
                    String regla = sc.nextLine();

                    Pago p1 = new PagoTarjeta(cod, monto, banco, regla);      // ⭐ POLIMORFISMO
                    listaPagos.add(p1);                                       // ⭐ NUEVO

                    break;

                case 2:

                    System.out.print("Codigo: ");
                    cod = sc.nextLine();

                    System.out.print("Monto: ");
                    monto = sc.nextDouble();

                    System.out.print("Celular: ");
                    int cel = sc.nextInt();
                    sc.nextLine();

                    Pago p2 = new PagoYape(cod, monto, cel); // ⭐ POLIMORFISMO
                    listaPagos.add(p2);

                    break;

                case 3:

                    System.out.print("Codigo: ");
                    cod = sc.nextLine();

                    System.out.print("Monto: ");
                    monto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Cuenta: ");
                    String cuenta = sc.nextLine();

                    Pago p3 = new PagoTransferencia(cod, monto, cuenta);
                    listaPagos.add(p3);

                    break;

                case 4:

                    System.out.println("\nLISTA DE PAGOS");
                    for (Pago p : listaPagos) {           // ⭐ NUEVO FOR POLIMORFICO
                        System.out.println(p.getCodigoPago() + " -> Final: " + p.montoFinal());
                    }

                    break;

                case 5:

                    double total = 0;

                    for (Pago p : listaPagos) {           // ⭐ POLIMORFISMO REAL
                        total=total+p.montoFinal();
                    }

                    System.out.println("TOTAL RECAUDADO: " + total);

                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");

            }

        } while (opcion != 6);

        sc.close();
    }
}