error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/EjemploGetySet/Aplicacion.java:java/util/Scanner#
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/EjemploGetySet/Aplicacion.java
empty definition using pc, found symbol in pc: java/util/Scanner#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 664
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana01/EjemploGetySet/Aplicacion.java
text:
```scala
package Semana01.EjemploGetySet;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        //Crear objetos
        Scanner s=new Scanner(System.in);
        Empleado e=new Empleado();

        //Llamar a los métodos setters
        System.out.println("Ingresar nombre: ");
        e.setNombre(s.nextLine());
        System.out.println("Ingrese edad: ");
        e.setEdad(s.nextInt());

        //Llamar a los métodos getters
        System.out.println("Los datos ingresados son: ");
        System.out.println("Nombres "+e.getNombre());
        System.out.println("Edad "+e.getEdad());
        @@Scanner.close();

    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#