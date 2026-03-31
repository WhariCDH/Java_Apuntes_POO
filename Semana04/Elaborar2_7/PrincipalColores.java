package Semana04.Elaborar2_7;

import java.util.Scanner;

public class PrincipalColores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Colores c=new Colores();

        System.out.println("\n******REGISTRO DE CAJA DE COLORES******");

        System.out.println("Codigo util: ");
        String codUtil=sc.nextLine();
        System.out.println("Descripción util: ");
        String descripUtil=sc.nextLine();
        System.out.println("Precio unidad: ");
        double precioUni=sc.nextDouble();
        sc.nextLine();
        System.out.println("Marca: ");
        String marca=sc.nextLine();
        System.out.println("Unidades por Caja: ");
        int unidadesCaja=sc.nextInt();
        System.out.println("Cantidades vendidas: ");
        int cantidadesVendidas=sc.nextInt();
        sc.nextLine();
        System.out.println("Codigo oferta: ");
        String codOferta=sc.nextLine();
        System.out.println("Codigo de oferta (A/B/C): ");
        String descripcionOferta=sc.nextLine();

        c.registrar(codUtil, descripUtil, precioUni, marca, unidadesCaja, cantidadesVendidas, codOferta, descripcionOferta);

        System.out.println("\n******DATOS DE LA VENTA******");
        System.out.println(c.devolverDatoCajaColor());
        System.out.println("El monto de la venta total es " +c.devolverMontoVentaTotal());

        sc.close();

    }
    
}
