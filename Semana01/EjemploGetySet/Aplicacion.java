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
        s.close();
    }
    
}
