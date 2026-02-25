error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/LaboratorioEjercicio/MainObrero.java:java/io/PrintStream#println(+8).
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/LaboratorioEjercicio/MainObrero.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 499
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/LaboratorioEjercicio/MainObrero.java
text:
```scala
package Semana01.LaboratorioEjercicio;

import java.util.Scanner;

public class MainObrero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese la categoría (A/B/C): ");
        String categoria=sc.nextLine();

        // VALIDACIÓN AQUÍ 👇
        if (!categoria.equalsIgnoreCase("A") &&
            !categoria.equalsIgnoreCase("B") &&
            !categoria.equalsIgnoreCase("C")) {

            System.out.pr@@intln("Categoría inválida");
        }

        System.out.print("Ingrese el producto (Tejas/Losetas): ");
        String producto=sc.nextLine();
        System.out.print("Ingrese las unidades producidas: ");
        int unidades=sc.nextInt();

        //Crear Objeto
        Obrero ob=new Obrero(categoria, producto, unidades);

        //Mostrar resultado
        System.out.println("\n*****Boleta*****");
        System.out.println("Su categoría es: " +categoria);
        System.out.println("El producto que ingreso es: " +producto);
        System.out.println("Las unidades producidas son: " +unidades);
        System.out.println("Tarifa: " +ob.obtenerTarifa());
        System.out.println("Pago base: " +ob.calcularPagoBase());
        System.out.println("Bonificación: " +ob.calcularBonificación());
        System.out.println("Pago final: " +ob.calcularPagoFinal());

        sc.close();
    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).