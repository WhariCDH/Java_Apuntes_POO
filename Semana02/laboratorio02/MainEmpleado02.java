package Semana02.laboratorio02;

import java.util.Scanner;

public class MainEmpleado02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Categoria (A/B/C): ");
        String categoria = sc.nextLine();

        System.out.print("Horas trabajadas: ");
        int horas = sc.nextInt();

        System.out.print("Años de servicio: ");
        int anios = sc.nextInt();

        Empleado emp = new Empleado(nombre, categoria, horas, anios);

        System.out.println("Sueldo final: S/ " + emp.sueldoFinal());
    }
}