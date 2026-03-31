package Semana04.Laboratorio04.Ejercicio01;

import java.util.Scanner;

public class PrincEmpleado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean sindicato;
        String entrada;
        String categoria;

        System.out.println("=====Docente=====");
        System.out.print("Nombre: ");
        String nombre=sc.nextLine();
        while (true) {
            System.out.print("Pertenece al sindicato (SI/NO): ");
            entrada = sc.nextLine().toLowerCase();

            if (entrada.equals("si")) {
                sindicato = true;
                break;
            }
            else if (entrada.equals("no")) {
                sindicato = false;
                break;
            }

            System.out.println("Respuesta inválida. Solo SI o NO.");
        }

        while (true) {
            System.out.print("Categoria (Principal/Auxiliar/Contratado): ");
            categoria=sc.nextLine().toLowerCase();

            if (categoria.equals("principal") || categoria.equals("auxiliar") || categoria.equals("contratado")) {
                break;
            }
            System.out.println("La categoria es invalidad, solo se acepta (Principal/Auxiliar/Contratado).");
            
        }

        System.out.print("Horas trabajadas: ");
        int hora=sc.nextInt();

        Docente d=new Docente();
        d.registroDocente(nombre, sindicato, categoria, hora);

        System.out.println("Sueldo final del docente: S/" +d.calcularSueldoDocente());

        System.out.print("\n=====Administración=====");
        sc.nextLine();
        System.out.println();
        System.out.print("Nombre: ");
        nombre=sc.nextLine();
        System.out.print("Pertenece al sindicato (true/false):");
        sindicato=sc.nextBoolean();
        sc.nextLine();
        System.out.print("Año de servicio: ");
        int anios=sc.nextInt();
        
        Administrativo a=new Administrativo();
        a.registroAdministrativo(nombre, sindicato, anios);

        System.out.println("Sueldo final Administrativo: " +a.calculaSueldoAdministración());

        sc.close();
    }
    
}
