package Semana09.Ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTicket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Venta<? extends Espectaculo>> lista = new ArrayList<>();

        int opcion;

        do{

            System.out.println("\n******VENTA DE TICKETS******");
            System.out.println("1 Registrar Concierto");
            System.out.println("2 Registrar Teatro");
            System.out.println("3 Mostrar Ventas");
            System.out.println("4 Total");
            System.out.println("5 Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){

                case 1:

                    System.out.print("Numero asiento: ");
                    int asiento = sc.nextInt();

                    System.out.print("Preferencial (true/false): ");
                    boolean pref = sc.nextBoolean();

                    Concierto c = new Concierto(asiento,pref);

                    Venta<Concierto> v1 = new Venta<>(c);

                    lista.add(v1);

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Lugar: ");
                    String lugar = sc.nextLine();

                    System.out.print("Preferencial (true/false): ");
                    pref = sc.nextBoolean();

                    Teatro t = new Teatro(lugar,pref);

                    Venta<Teatro> v2 = new Venta<>(t);

                    lista.add(v2);

                    break;

                case 3:

                    for(Venta<? extends Espectaculo> v : lista){
                        v.mostrarVenta();
                    }

                    break;

                case 4:

                    double total = 0;

                    for(Venta<? extends Espectaculo> v : lista){
                        total=total+v.obtenerTotal();
                    }

                    System.out.println("TOTAL: "+total);

                    break;

            }

        }while(opcion!=5);
        sc.close();

    }
}