error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana09/Laboratorio/MainInmobiliario.java:java/io/PrintStream#println(+8).
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana09/Laboratorio/MainInmobiliario.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 579
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
            System.out.p@@rintln("4. Precio total");
            System.out.println("Escoja una opcion: ");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                
                case 2:

                    break;

                case 3:

                    break;
                
                case 4:

                    default:

                    break;
            }
            
        } while (opcion != 4);
        sc.close();
    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).