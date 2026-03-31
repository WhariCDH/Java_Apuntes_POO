package Semana04.Elaborar2_8;

import java.util.Scanner;

public class PrincipalProducto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReproductorDVD dvd=new ReproductorDVD();
        Camisa cam=new Camisa();

        System.out.println("\n=====REGISTRO DVD=====");
        System.out.print("Codigo: ");
        String codProd=sc.nextLine();
        System.out.print("Nombre: ");
        String nombProd=sc.nextLine();
        System.out.print("Costo: ");
        double costoProd=sc.nextDouble();
        sc.nextLine();
        System.out.print("Marca: ");
        String marca=sc.nextLine();
        System.out.print("Modelo: ");
        String modelo=sc.nextLine();
        System.out.print("Porcentaje de descuento: ");
        double porcentajeDscto=sc.nextDouble();
        sc.nextLine();
        
        dvd.registroReproductorDVD(codProd, nombProd, costoProd, marca, modelo, porcentajeDscto);

        System.out.println("\n=====REGISTRO Camisa=====");
        System.out.print("Codigo: ");
        codProd=sc.nextLine();
        System.out.print("Nombre: ");
        nombProd=sc.nextLine();
        System.out.print("Costo: ");
        costoProd=sc.nextDouble();
        sc.nextLine();
        System.out.print("Talla: ");
        String talla=sc.nextLine();
        System.out.print("Color: ");
        String color=sc.nextLine();
        System.out.print("Precio venta: ");
        double precioVenta=sc.nextDouble();
        sc.nextLine();

        cam.registroCamisa(codProd, nombProd, costoProd, talla, color, precioVenta);

        System.out.println("\n*****DATOS DVD*****");
        System.out.print(dvd.devolverDatosReprod());
        System.out.print("\nEl precio total a pagar es de S/" +dvd.devolverPrecioVentaReprod());

        System.out.println("\n*****DATOS CAMISA*****");
        System.out.print(cam.devolverDatosCamisa());
        System.out.print("\nEl precio total a pagar es de S/" +cam.devolverPrecioVentaCamisa());

    }
    
}
