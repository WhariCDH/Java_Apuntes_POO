package Semana03.Ejemplo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1. Luz");
        System.out.println("2. Agua");
        System.out.print("Seleccione servicio: ");
        int op=sc.nextInt();

        if (op==1) {
            sc.nextLine(); //Limpiamos buffo

            System.out.print("Tipo de servicio (Monofasico/Trifaico): ");
            String tipo=sc.nextLine();
            System.out.print("Consumo en KW: ");
            double kw=sc.nextDouble();

            Luz l=new Luz(tipo, kw);

            System.out.println("Monto a pagar luz: S/" +l.calcularPago());
     
        }
        else if (op==2) {
            sc.nextLine();

            System.out.print("Consumo de agua en metro m3: ");
            double consumo=sc.nextDouble();

            Agua a=new Agua(consumo);

            System.out.print("Monto a pagar agua: S/" +a.calcularPago());
            
        }
        sc.close();
    }
    
}
