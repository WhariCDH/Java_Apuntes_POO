error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/MainCliente.java:java/lang/String#
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/MainCliente.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 858
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/MainCliente.java
text:
```scala
package Semana11.Ejercicio.Fase01;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Cliente> lista=new ArrayList<>();

        int op;

        do{
            System.out.println("\n******BANCO BCP******");
            System.out.println("1. Registrar");
            System.out.println("2. Retirar");
            System.out.println("3. Reporte");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion");
            op=sc.nextInt();
            sc.nextLine();

            switch(op){

                case 1:
                    System.out.print("\n*****REGISTRO*****");
                    System.out.print("Numero cuenta: ");
                    S@@tring num = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();

                    System.out.print("Tipo cuenta: ");
                    String tipo = sc.nextLine();

                    System.out.print("Moneda: ");
                    String mon = sc.nextLine();

                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();

                    Cliente c=new Cliente(num,nom,tipo,mon,saldo);

                    lista.add(c);

                    break;

                case 2:
                    
                    System.out.print("Numero cuenta: ");
                    num=sc.nextLine();

                    boolean encontrado = false;

                    for(Cliente cli : lista){

                        if(cli.getNumeroCuenta().equals(num)){   //Se guarda en get el "numeroCuenta "

                            System.out.print("Monto retiro: ");
                            double monto = sc.nextDouble();
                            sc.nextLine();

                            cli.retirar(monto);

                            System.out.println("Saldo actual: " +cli.getSaldo());

                            encontrado = true;
                        }
                    }

                    if(!encontrado){
                        System.out.println("Cuenta no encontrada");
                    }

                    break;

                case 3:

                    for(Cliente cli : lista){
                        cli.mostrar();
                    }

                    break;

            }

        }while(op != 4);
        sc.close();

    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#