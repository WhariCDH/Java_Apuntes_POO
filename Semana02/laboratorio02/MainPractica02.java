package Semana02.laboratorio02;

import java.util.Scanner;

public class MainPractica02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre=sc.nextLine();
        System.out.print("Ingrese su nota del examen Parcial: ");
        double exparcial=sc.nextDouble();
        System.out.print("Ingrese su nota del examen Final: ");
        double exfinal=sc.nextDouble();
        System.out.print("Ingrese su Practica 1: ");
        double prac1=sc.nextDouble();
        System.out.print("Ingrese su Practica 2: ");
        double prac2=sc.nextDouble();
        System.out.print("Ingrese su Practica 3: ");
        double prac3=sc.nextDouble();

        Practica p=new Practica(nombre, exparcial, exfinal, prac1, prac2, prac3);

        System.out.println("\n*****Nota*****");
        System.out.println("El Alumno " +nombre);
        System.out.println("Nota de su pracial es de " +exparcial);
        System.out.println("Nota de su examen final es de " +exfinal);
        System.out.println("Nota de sus practicas son (" +prac1+ "/" +prac2+ "/" +prac3+ ").");
        System.out.println("Su promedio final es: " +p.promedioFinal());
        System.out.println("Su calificación es " +p.calificacion());

        sc.close();
    }
    
}
