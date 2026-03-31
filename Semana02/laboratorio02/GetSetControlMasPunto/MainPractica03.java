package Semana02.laboratorio02.GetSetControlMasPunto;

import java.util.Scanner;

public class MainPractica03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        double exparcial, exfinal, prac1, prac2, prac3;

        // Parcial
        while (true) {
            System.out.print("Ingrese su nota del examen Parcial (0-20): ");
            exparcial = sc.nextDouble();
            if (exparcial >= 0 && exparcial <= 20) 
            break;
            System.out.println("Nota inválida");
        }

        // Final
        while (true) {
            System.out.print("Ingrese su nota del examen Final (0-20): ");
            exfinal = sc.nextDouble();
            if (exfinal >= 0 && exfinal <= 20) break;
            System.out.println("Nota inválida");
        }

        // Practica 1
        while (true) {
            System.out.print("Ingrese su Practica 1 (0-20): ");
            prac1 = sc.nextDouble();
            if (prac1 >= 0 && prac1 <= 20) break;
            System.out.println("Nota inválida");
        }

        // Practica 2
        while (true) {
            System.out.print("Ingrese su Practica 2 (0-20): ");
            prac2 = sc.nextDouble();
            if (prac2 >= 0 && prac2 <= 20) break;
            System.out.println("Nota inválida");
        }

        // Practica 3
        while (true) {
            System.out.print("Ingrese su Practica 3 (0-20): ");
            prac3 = sc.nextDouble();
            if (prac3 >= 0 && prac3 <= 20) break;
            System.out.println("Nota inválida");
        }

        Practica p = new Practica(nombre, exparcial, exfinal, prac1, prac2, prac3);

        System.out.println("\n*****Nota*****");
        System.out.println("Alumno: " + p.getNombre());
        System.out.println("Examen Parcial: " + p.getExamenParcial());
        System.out.println("Examen Final: " + p.getExamenFinal());
        System.out.println("Prácticas: (" + p.getPractica1() + "/" + p.getPractica2() + "/" + p.getPractica3() + ")");
        System.out.println("Promedio final: " + p.promedioFinal());
        System.out.println("Calificación: " + p.calificacion());

        sc.close();
    }
}