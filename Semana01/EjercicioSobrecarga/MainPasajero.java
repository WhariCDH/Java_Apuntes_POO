package Semana01.EjercicioSobrecarga;

import java.util.Scanner;

public class MainPasajero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese precio base: ");
        double precio=sc.nextDouble();
        System.out.print("Ingrese peso del equipaje en kg: ");
        double peso=sc.nextDouble();
        System.out.print("¿Desea refrigerio? (true/false): ");
        boolean refrigerio=sc.nextBoolean();

        //Uso del costructor sobrecargado
        Pasajero p=new Pasajero(precio, peso, refrigerio);
        
        System.out.println("\n****Boleta****");
        System.out.println("Monto base: " +precio);
        System.out.println("Peso del equipaje: " +peso+ "Kg.");
        System.out.println("Refrigerio: " +refrigerio);
        System.out.println("Monto del precio final: S/. " +p.calcularPagoFinal());
        
        sc.close();

    }  
}
