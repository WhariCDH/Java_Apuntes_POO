error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/MainCliente.java:Semana11/Ejercicio/Fase01/Cliente#mostrar().
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/MainCliente.java
empty definition using pc, found symbol in pc: Semana11/Ejercicio/Fase01/Cliente#mostrar().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 2725
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
            System.out.print("Elija una opcion: ");
            op=sc.nextInt();
            sc.nextLine();

            switch(op){

                case 1:
                    System.out.println("\n*****REGISTRO*****");
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

                    Cliente c=new Cliente(num,nom,tipo,mon,saldo);

                    lista.add(c);

                    break;

                case 2:
                    System.out.println("\n*****RETIRO*****");
                    System.out.print("Numero cuenta: ");
                    num=sc.nextLine();

                    boolean encontrado = false;  //Si no se encontro numero de cuenta regresa al menu

                    for(Cliente cli : lista){

                        if(cli.getNumeroCuenta().equals(num)){   //Busca en get los numeros de cuenta que se guardo de forma privada

                            System.out.print("Monto retiro: ");
                            double m = sc.nextDouble();
                            sc.nextLine();  //Limpia buffo

                            cli.retirar(m);

                            System.out.println("Saldo actual: " +cli.getSaldo());

                            encontrado = true; //Solo si se encontro se deja retirar
                        }
                    }

                    if(!encontrado){
                        System.out.println("Cuenta no encontrada");
                    }
                    
                    break;

                case 3:
                    System.out.println("\n*****REPORTE*****");
                    for(Cliente cli : lista){
                        cli.m@@ostrar();
                    }

                    break;

                case 4: 
                    System.out.println("Saliendo del sistema bancario.....");
                    default:
                        System.out.println("Opcion invalidad.");
                    break;

            }

        }while(op != 4);
        sc.close();

    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: Semana11/Ejercicio/Fase01/Cliente#mostrar().