package Semana02.laboratorio02;

import java.util.Scanner;

public class MainSeguro {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tipo;
        int consulta;

        while (true) {
            System.out.print("Ingrese su tipo de seguro (A/B/C): ");
            tipo=sc.nextLine().toUpperCase();

            if (tipo.equals("A") || tipo.equals("B") || tipo.equals("C")) {
                break;
            }
            System.out.println("Tipo de seguro inválido, Solo se acepta A, B y C.");     
        }

        while (true) {
            System.out.print("Ingrese su número de consultas realizadas: ");
            consulta=sc.nextInt();

            if (consulta >= 0 && consulta <= 20) {
                break;
            }
            System.out.println("Las consultas no pueden pasar de 20 por paciente.");
        }

        Seguro s=new Seguro(tipo, consulta);

        System.out.println("\n******Seguro de salud******");
        System.out.println("Tipo de seguro: " +tipo);
        System.out.println("Numero de consultas permitidas: " +s.consultasPermitidas());
        System.out.println("Numero de consultas realizadas: " +consulta);
        System.out.println("El precio base: S/" +s.precioBase());
        System.out.println("El pago adicional: S/" +s.pagoAdicional());
        System.out.println("Monto final a pagar: S/" +s.montoFinal());
        
        sc.close();
    }
    
}
