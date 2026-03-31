package Semana02;

import java.util.Scanner;

public class MainPasajero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese el precio base: ");
        double pb=sc.nextDouble();
        System.out.print("Ingrese el peso del equipaje: ");
        double ps=sc.nextDouble();
        System.out.print("¿Desea refrigerio? (True/False): ");
        boolean rf=sc.nextBoolean();

        //Uso de constructor sobrecargado
        Pasajero p=new Pasajero(pb, ps, rf);

        System.out.println("\n*****Boleta******");
        System.out.println("Pago final: " +p.calcularPagoFinal());
        sc.close();

    }
    
}
