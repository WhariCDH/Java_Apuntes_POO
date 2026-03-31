package Semana09.Laboratorio;

import java.util.ArrayList;
import java.util.Scanner;

public class MainInmobiliario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Venta<? extends Inmueble>> lista=new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n*****REGISTRAR CASA*****");
            System.out.println("1. Registrar Casa");
            System.out.println("2. Registrar Departamento");
            System.out.println("3. Mostrar precio");
            System.out.println("4. Precio total");
            System.out.println("5. Salir del programa");
            System.out.println("Escoja una opcion: ");
            opcion=sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n*****REGISTRO DE CASA*****");
                    System.out.print("Area: ");
                    double area=sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Ubicacion (RESIDENCIA/COMERCIAL/OTROS): ");
                    String ubicacion=sc.nextLine();

                    System.out.print("Cuota inicial: ");
                    double cuotaInicial=sc.nextDouble();
                    
                    Casa c=new Casa(area, ubicacion, cuotaInicial);
                    Venta<Casa> v1=new Venta<Casa>(c);

                    lista.add(v1);
                    
                    break;
                
                case 2:
                    System.out.println("\n*****REGISTRO DE DEPARTAMENTO*****");
                    System.out.print("Area: ");
                    area=sc.nextDouble();

                    System.out.print("Tiene cochera (true/false): ");
                    boolean cochera=sc.nextBoolean();

                    System.out.print("Nivel (1/2/3): ");
                    int nivel=sc.nextInt();
                    
                    Departamento d=new Departamento(area, cochera, nivel);
                    Venta<Departamento> v2=new Venta<Departamento>(d);

                    lista.add(v2);

                    break;

                case 3:

                    for(Venta<? extends Inmueble> v : lista) {   //Ya que es una clase generica "Venta" se debe colocar asi 
                        v.mostrarPrecio();                        
                    }

                    break;
                
                case 4:

                    double total=0;

                    for(Venta<? extends Inmueble> v : lista) {
                        total=total+v.obtenerPrecio();
                    }

                    System.out.println("Precio total: " +total);
                    break;
                
                case 5:
                    System.out.println("Saliendo del programa....");
                    default:
                        System.out.print("Opcion invalidad");
                    break;
            }
            
        } while (opcion != 5);
        sc.close();
    }
    
}
