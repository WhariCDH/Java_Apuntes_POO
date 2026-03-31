package Semana04.Elaborar2_6;

import java.util.Scanner;

public class Industria {

    private String nombreIndustria;
    private Empresa emp;

    public void registrar() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese nombre de la industria: ");
        nombreIndustria = sc.nextLine();

        System.out.print("Ingrese RUC de la empresa: ");
        int ruc = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese nombre de la empresa: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese produccion total: ");
        float produccion = sc.nextFloat();
        sc.nextLine();

        emp = new Empresa(nombre, ruc, produccion);
    }

    public void mostrarDatos() {

        if (emp == null) {
            System.out.println("Primero debe registrar una empresa.");
            return;
        }

        System.out.println("\nIndustria: " + nombreIndustria);
        System.out.println(emp.consultar());
        System.out.println("Total Produccion: " + emp.devolverProduccion());
    }
}