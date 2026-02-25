error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/LaboratorioEjercicio/MainObrero.java:java/lang/System#out.
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/LaboratorioEjercicio/MainObrero.java
empty definition using pc, found symbol in pc: java/lang/System#out.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 885
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
        System.out.print("Ingrese el producto (Tejas/Losetas): ");
        String producto=sc.nextLine();
        System.out.print("Ingrese las unidades producidas: ");
        int unidades=sc.nextInt();

        //Crear Objeto
        Obrero ob=new Obrero(categoria, producto, unidades);

        //Mostrar resultado
        System.out.print("\n*****Boleta*****");
        System.out.println("Su cateria es: " +categoria);
        System.out.println("El producto que ingreso es: " +producto);
        System.out.println("Las unidades producidas son: " +unidades);
        System.@@out.println();
    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#out.