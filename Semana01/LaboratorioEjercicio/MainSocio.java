package Semana01.LaboratorioEjercicio;

import java.util.Scanner;

public class MainSocio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese su categoria (A/B/C): ");
        String categoria=sc.nextLine();
        System.out.print("Ingrese los años como socio: ");
        int anios=sc.nextInt();
        
        Socio s=new Socio(categoria, anios);

        System.out.println("\n*****Menu*****");
        System.out.println("Pago final: S/ " +s.obtenerPagoFinal());
        sc.close();
    }
    
}
