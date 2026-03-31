package Semana07.EjemploClaseAbstracta.Ejemplo;

import java.util.Scanner;

public class MainAlumno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        boolean ingles;  //"ingles y entrada" fuera por que se usa en case 1 y 2
        String entrada;

        do {
            System.out.println("\n*****ALUMNOS*****");
            System.out.println("1. Alumno regular");
            System.out.println("2. Alumno credito");
            System.out.println("3. Salir del programa");
            System.out.print("Escoja una opción: ");
            opcion=sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    boolean seguro;
                    String categoria;

                    System.out.println("\n*****ALUMNO REGULAR*****");
                    System.out.print("Nombre: ");
                    String nombre=sc.nextLine();

                    while (true) {
                        System.out.print("Lleva ingles? (SI/NO): ");
                        entrada=sc.nextLine().toLowerCase();
                        
                        if (entrada.equals("si")) {
                            ingles=true;
                            break;
                        }

                        if (entrada.equals("no")) {
                            ingles=false;
                            break;
                        }
                        System.out.println("Opcion invalida.");                       
                    }

                    while (true) {
                        System.out.print("Categoria (A/B/C): ");
                        categoria=sc.nextLine().toLowerCase();

                        if (categoria.equals("a") || categoria.equals("b") || categoria.equals("c")) {
                            break;
                        }
                        System.out.println("Categoria invalidad, use (A/B/C). ");

                        
                    }
                
                    while (true) {
                        System.out.print("Lleva seguro? (SI/NO): ");
                        entrada=sc.nextLine().toLowerCase();
                        
                        if (entrada.equals("si")) {
                            seguro=true;
                            break;
                        }

                        if (entrada.equals("no")) {
                            seguro=false;
                            break;
                        }
                        System.out.println("Opcion invalida.");                       
                    }

                    AlumnoRegular ar;          //Uso de polimorfismo
                    ar=new AlumnoRegular(nombre, ingles, categoria, seguro);
                    System.out.println("Pago total: " +ar.calcularPago());
                    break;

                case 2:

                    System.out.println("\n*****ALUMNO CREDITO*****");
                    System.out.print("Nombre: ");
                    nombre=sc.nextLine();

                    while (true) {
                        System.out.print("Lleva ingles? (SI/NO): ");
                        entrada=sc.nextLine().toLowerCase();
                        
                        if (entrada.equals("si")) {
                            ingles=true;
                            break;
                        }

                        if (entrada.equals("no")) {
                            ingles=false;
                            break;
                        }
                        System.out.println("Opcion invalida.");                       
                    }

                    System.out.print("Credito: ");
                    int credito=sc.nextInt();
                    sc.nextLine();

                    AlumnoCredito ac;
                    ac=new AlumnoCredito(nombre, ingles, credito);
                    System.out.println("Pago total: " +ac.calcularPago());
                    break;
                
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalidad");
                    break;
            }

        } while (opcion != 3);
        sc.close();
    }
}
