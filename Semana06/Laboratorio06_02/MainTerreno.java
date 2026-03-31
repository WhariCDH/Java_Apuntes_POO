package Semana06.Laboratorio06_02;

import java.util.Scanner;

public class MainTerreno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Precio casa: ");
        double precio = sc.nextDouble();

        Casa c = new Casa(precio);

        System.out.println("\n*****VENTA DE CASA*****");
        System.out.println("Comision vendedor: " + c.calcularComision());
        System.out.println("Total inversion: " + c.totalInvercion());

        Departamento  d=new Departamento(precio);

        System.out.println("\n*****VENTA DE DEPARTAMENTO*****");
        System.out.println("Comision vendedor: " + d.calcularComision());
        System.out.println("Total inversion: " + d.totalInvercion());

        Terreno t=new Terreno(precio);

        System.out.println("\n*****VENTA DE TERRENO*****");
        System.out.println("Comision vendedor: " + t.calcularComision());
        System.out.println("Total inversion: " + t.totalInvercion());

        sc.close();
    }
    
}
