error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/MainCliente.java:java/lang/System#out.
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/MainCliente.java
empty definition using pc, found symbol in pc: java/lang/System#out.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 472
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/MainCliente.java
text:
```scala
package Semana11.Ejercicio.Fase01;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> lista = new ArrayList<>();

        int op;

        do{

            System.out.println("\n1 Registrar");
            System.out.println("2 Retirar");
            System.out.println("3 Reporte");
            System.@@out.println("4 Salir");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){

                case 1:

                    System.out.print("Numero cuenta: ");
                    String num = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();

                    System.out.print("Tipo cuenta: ");
                    String tipo = sc.nextLine();

                    System.out.print("Moneda: ");
                    String mon = sc.nextLine();

                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();

                    Cliente c = new Cliente(num,nom,tipo,mon,saldo);

                    lista.add(c);

                    break;

                case 2:

                    System.out.print("Numero cuenta: ");
                    num = sc.nextLine();

                    boolean encontrado = false;

                    for(Cliente cli : lista){

                        if(cli.getNumeroCuenta().equals(num)){

                            System.out.print("Monto retiro: ");
                            double monto = sc.nextDouble();
                            sc.nextLine();

                            cli.retirar(monto);

                            System.out.println("Saldo actual: "
                                    + cli.getSaldo());

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

empty definition using pc, found symbol in pc: java/lang/System#out.