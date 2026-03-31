package Semana01.LaboratorioEjercicio;

import java.util.Scanner;

public class MainEntrada {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese su ubicación (Palco/Platea/Vip): ");
        String ubicacion=sc.nextLine();
        System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
        int cantidad=sc.nextInt();

        Entrada e=new Entrada(ubicacion, cantidad);

        System.out.println("\n*****Menu*****");
        System.out.println("El precio del boleto es: " +e.obtenerPrecio());
        System.out.println("La cantidad de boletos comprados son: " +cantidad);
        System.out.println("Hay un descuento del: " +(+e.obtenerDescuento() *100)+ "% si se compra mas de 6 boletos.");
        System.out.println("El precio total es de: S/" +e.obtenerMontoFinal());
        sc.close();
    }
    
}
