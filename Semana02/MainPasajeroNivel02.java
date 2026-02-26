package Semana02;

import java.util.Scanner;

public class MainPasajeroNivel02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese precio base: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese peso: ");
        double peso = sc.nextDouble();

        sc.nextLine(); // limpiar buffer

        System.out.print("¿Desea refrigerio? (si/no): ");
        String opcion = sc.nextLine();

        boolean refrigerio = opcion.equalsIgnoreCase("si");

        // VALIDACIONES
        if (precio <= 0 || peso < 0) {
            System.out.println("Datos inválidos");
            return;
        }

        PasajeroNivel02 p = new PasajeroNivel02(precio, peso, refrigerio);

        System.out.println("\n***** BOLETA *****");
        System.out.println("Precio base: " + p.getPrecioBase());
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Refrigerio: " + p.isRefrigerio());
        System.out.println("Pago final: S/. " + p.calcularPagoFinal());

        sc.close();
    }
}