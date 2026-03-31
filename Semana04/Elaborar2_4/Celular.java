package Semana04.Elaborar2_4;

import java.util.Scanner;

public class Celular {
    private String marca;
    private String modelo;
    private int numSerie;

    public void Registrar() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese la marca del celular: ");
        marca=sc.nextLine();
        System.out.print("Ingrese modelo: ");
        modelo=sc.nextLine();
        System.out.print("Ingrese numero de serie: ");
        numSerie=sc.nextInt();
        
    }

    public void Mostrar() {
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Numero de serie: " +numSerie);

    }
    
}
