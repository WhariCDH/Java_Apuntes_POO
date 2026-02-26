package Semana02;

//Comparte Main con Pasajero (POO)

import java.util.ArrayList;
import java.util.Scanner;

public class PasajeroNivel03ArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pasajero> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Registrar pasajero");
            System.out.println("2. Mostrar pago");
            System.out.println("3. Total general");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Precio base: ");
                    double precio=sc.nextDouble();

                    System.out.print("Peso: ");
                    double peso=sc.nextDouble();

                    sc.nextLine();

                    System.out.print("¿Refrigerio? (si/no): ");
                    String op=sc.nextLine();

                    boolean refri=op.equalsIgnoreCase("si");  //Da la opcion de pedir "si" en todo caso se niega

                    Pasajero p=new Pasajero(precio, peso, refri);
                    lista.add(p);

                    System.out.println("Pasajero registrado");
                    break;

                case 2:
                    System.out.println("\n--- LISTA ---");
                    for (Pasajero pas : lista) {
                        System.out.println("Pagos actuales: " + pas.calcularPagoFinal());
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Pasajero pas : lista) {
                        total=total+pas.calcularPagoFinal();
                    }
                    System.out.println("Total general: " +total);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}
