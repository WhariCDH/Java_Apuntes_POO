package Semana03.Ejemplo01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipo;
        double area;

        System.out.println("1. Departamento");
        System.out.println("2. Casa");
        System.out.print("Seleccione tipo de vivienda: ");
        tipo = sc.nextInt();

        System.out.print("Ingrese el area de la vivienda: ");
        area = sc.nextDouble();

        if (tipo == 1) {

            int cochera;
            int piso;

            System.out.print("Tiene cochera? (1=Si / 0=No): ");
            cochera = sc.nextInt();

            System.out.print("Ingrese el piso: ");
            piso = sc.nextInt();

            Departamento d = new Departamento(area, cochera == 1, piso);

            System.out.println("Precio final del alquiler: $" + d.calcularAlquiler());

        } 
        else if (tipo == 2) {

            sc.nextLine();
            String ubicacion;
            int amoblada;

            System.out.print("Ingrese ubicacion (Avenida/Jiron/Pasaje): ");
            ubicacion = sc.nextLine();

            System.out.print("Es amoblada? (1=Si / 0=No): ");
            amoblada = sc.nextInt();

            Casa c = new Casa(area, ubicacion, amoblada == 1);

            System.out.println("Precio final del alquiler: $" + c.calcularArquiler());

        }

        sc.close();
    }

}
