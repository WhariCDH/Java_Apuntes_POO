package Semana04.Laboratorio04.Ejercicio03;

import java.util.Scanner;

public class PrincipalEncomienda {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int opcion;

        System.out.println("*****TIPO DE ENCOMIENDA*****");
        System.out.println("1. Trasporte terrestre");
        System.out.println("2. Trasporte Aereo");
        System.out.println("3. Salir del sistema");
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("***** TRANSPORTE TERRESTRE *****");

                System.out.print("Peso (gr): ");
                double peso = sc.nextDouble();

                System.out.print("Envio a domicilio (true/false): ");
                boolean domicilio = sc.nextBoolean();

                System.out.print("Es fragil (true/false): ");
                boolean fragil = sc.nextBoolean();

                TrasporteTerrestre tt=new TrasporteTerrestre();
                tt.registroTrasporteTerrestre(peso, domicilio, fragil);

                System.out.println("Precio envio terrestre: S/ " + tt.calcularPrecioTT());
                break;
            
            case 2:
                System.out.println("\n***** TRANSPORTE AEREO *****");

                System.out.print("Peso (gr): ");
                peso = sc.nextDouble();

                System.out.print("Envio a domicilio (true/false): ");
                domicilio = sc.nextBoolean();

                TrasporteAereo ta=new TrasporteAereo();
                ta.registroTrasporteAereo(peso, domicilio);

                System.out.println("Precio envio aereo: S/ " + ta.calcularPrecioTrasporteAereo());
                break;
            
            case 3:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opcion invalida.");
        }

        sc.close();
    }
}
