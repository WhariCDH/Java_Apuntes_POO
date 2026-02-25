error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/EjercicioSobrecarga/MainPasajero.java:java/util/Scanner#nextDouble().
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/EjercicioSobrecarga/MainPasajero.java
empty definition using pc, found symbol in pc: java/util/Scanner#nextDouble().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 379
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/EjercicioSobrecarga/MainPasajero.java
text:
```scala
package Semana01.EjercicioSobrecarga;

import java.util.Scanner;

public class MainPasajero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese precio base: ");
        double precio=sc.nextDouble();
        System.out.print("Ingrese peso del equipaje en kg: ");
        double peso=sc.nextDoubl@@e();
        System.out.print("¿Desea refrigerio? (true/false): ");
        boolean refrigerio=sc.nextBoolean();

        //Uso del costructor sobrecargado
        Pasajero p=new Pasajero(precio, peso, refrigerio);
        
        System.out.println("\n****Boleta****");
        System.out.println("Monto base: " +precio);
        System.out.println("Peso del equipaje: " +peso+ "Kg.");
        System.out.println("Refrigerio: " +refrigerio);
        System.out.println("Monto del precio final: S/. " +p.CalcularPagoFinal());
        
        sc.close();

    }  
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#nextDouble().