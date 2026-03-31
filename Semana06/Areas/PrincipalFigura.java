package Semana06.Areas;

import java.util.Scanner;

public class PrincipalFigura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        Figura f;  //Se usa polimorfismo que es el tema de esta clase

        do {

            System.out.println("\n*****ESCOJA LA FIGURA*****");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n*****AREA DEL CUADRADO*****");
                    System.out.print("Lado: ");
                    double lado = sc.nextDouble();

                    f = new Cuadrado(lado);
                    System.out.println("Area: " + f.calcularArea());
                    break;

                case 2:
                    System.out.println("\n*****AREA DEL RECTANGULO*****");
                    System.out.print("Lado 1: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Lado 2: ");
                    double lado2 = sc.nextDouble();

                    f = new Rectangulo(lado1, lado2);
                    System.out.println("Area: " + f.calcularArea());
                    break;

                case 3:

                    System.out.println("\n*****AREA DEL TRIANGULO*****");
                    System.out.println("1. Formula de Heron");
                    System.out.println("2. Dos lados y angulo");
                    System.out.println("3. Base y altura");
                    System.out.print("Seleccione opcion: ");
                    int tipoTriangulo = sc.nextInt();

                    Triangulo t;

                    switch (tipoTriangulo) {

                        case 1:
                            System.out.print("Lado 1: ");
                            lado1 = sc.nextDouble();
                            System.out.print("Lado 2: ");
                            lado2 = sc.nextDouble();
                            System.out.print("Lado 3: ");
                            double lado3 = sc.nextDouble();

                            t = new Triangulo(lado1, lado2, lado3);
                            System.out.println("Area: " + t.calcularArea());
                            break;

                        case 2:
                            System.out.print("Lado 1: ");
                            lado1 = sc.nextDouble();
                            System.out.print("Lado 2: ");
                            lado2 = sc.nextDouble();
                            System.out.print("Angulo: ");
                            double angulo = sc.nextDouble();

                            t = new Triangulo(0, 0, 0);
                            System.out.println("Area: " + t.calcularArea(lado1, lado2, angulo));
                            break;

                        case 3:
                            System.out.print("Base: ");
                            double base = sc.nextDouble();
                            System.out.print("Altura: ");
                            double altura = sc.nextDouble();

                            t = new Triangulo(0, 0, 0);
                            System.out.println("Area: " + t.calcularAreaBaseAltura(base, altura));
                            break;

                        default:
                            System.out.println("Opcion invalida.");
                    }

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}