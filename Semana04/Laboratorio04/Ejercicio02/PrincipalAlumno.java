package Semana04.Laboratorio04.Ejercicio02;

import java.util.Scanner;

public class PrincipalAlumno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String categoria;
        boolean ingles;
        String entrada;
        boolean seguro;

        System.out.println("\n*****ALUMNO REGULAR*****");
        System.out.print("Nombre del alumno: ");
        String nombre=sc.nextLine();

        while (true) {
            System.out.print("Lleva ingles (SI/NO): ");
            entrada=sc.nextLine().toLowerCase();

            if (entrada.equals("si")) {
                ingles=true;
                break;
            }
            else if (entrada.equals("no")) {
                ingles=false;
                break;
            }
            System.out.println("Respuesta inválida. Solo SI o NO.");
            
        }

        while (true) {
            System.out.print("Categoria (A/B/C): ");
            categoria=sc.nextLine().toLowerCase();

            if (categoria.equals("a") || categoria.equals("b") || categoria.equals("c")) {
                break;  
            }
            System.out.println("Categoria invalidad, porfavor use (A/B/C).");
        }
        
        while (true) {
            System.out.print("Lleva seguro (SI/NO): ");
            entrada=sc.nextLine().toLowerCase();

            if (entrada.equals("si")) {
                seguro=true;
                break;
            }
            else if (entrada.equals("no")) {
                seguro=false;
                break;
            }
            System.out.println("Respuesta inválida. Solo SI o NO.");
            
        }
    

        AlumnoRegular a=new AlumnoRegular();
        a.registroAlumnoRegular(nombre, ingles, categoria, seguro);

        System.out.println("Pago mensual del alumno regular: " +a.pagoBaseAR());



        System.out.println("\n*****ALUMNO CREDITO*****");
        System.out.print("Nombre del alumno: ");
        nombre=sc.nextLine();

        while (true) {
            System.out.print("Lleva ingles (SI/NO): ");
            entrada=sc.nextLine().toLowerCase();

            if (entrada.equals("si")) {
                ingles=true;
                break;
            }
            else if (entrada.equals("no")) {
                ingles=false;
                break;
            }
            System.out.println("Respuesta inválida. Solo SI o NO.");
            
        }

        System.out.print("Numero de credito: ");
        int credito=sc.nextInt();

        AlumnoCredito ac=new AlumnoCredito();
        ac.registroAlumnoCredito(nombre, ingles, credito);

        System.out.println("Pago mensual del alumno credito: " +ac.calcularPagoAC());

        sc.close();
    }
    
}
