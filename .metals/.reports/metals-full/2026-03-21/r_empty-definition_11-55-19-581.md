error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana09/Laboratorio/MainInmobiliario.java:java/util/Scanner#nextLine().
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana09/Laboratorio/MainInmobiliario.java
empty definition using pc, found symbol in pc: java/util/Scanner#nextLine().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1011
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana09/Laboratorio/MainInmobiliario.java
text:
```scala
package Semana09.Laboratorio;

import java.util.ArrayList;
import java.util.Scanner;

public class MainInmobiliario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Venta<? extends Inmuebre>> lista=new ArrayList<>();
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
                    sc.n@@extLine();

                    System.out.print("Ubicacion (RESIDENCIA/COMERCIAL/OTROS): ");
                    String ubicacion=sc.nextLine();

                    System.out.print("Cuota inicial: ");
                    double cuotaInicial=sc.nextDouble();
                    
                    Casa c=new Casa(area, ubicacion, cuotaInicial);
                    Venta<Casa> v1=new Venta<Casa>(c);

                    lista.add(v1);
                    
                    break;
                
                case 2:

                    break;

                case 3:

                    break;
                
                case 4:

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

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#nextLine().