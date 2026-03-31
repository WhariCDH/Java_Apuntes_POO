package Semana04.Elaborar2_5;

import java.util.Scanner;

public class Boleta {
    private String nombreCliente;
    private int numBoleta;
    private int cantidad;
    private double precio;
    private double montoTotal;

    public void Registrar() {

        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombreCliente=sc.nextLine();
        System.out.print("Ingrese numero de boleta: ");
        numBoleta=sc.nextInt();
        System.out.print("Ingrese cantidad: ");
        cantidad=sc.nextInt();
        System.out.print("Ingrese precio: ");
        precio=sc.nextDouble();

        montoTotal=cantidad*precio;

    }

    public void Mostrar() {
        System.out.println("\n******BOLETA DE VENTA******");
        System.out.println("Cliente: " +nombreCliente);
        System.out.println("Numero de boleta: " +numBoleta);
        System.out.println("Cantidad: " +cantidad);
        System.out.println("Precio: " +precio);
        System.out.println("Monto total: " +montoTotal);
    }
    
}
