package Semana01.EjercicioPracticar;

import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    //Crear el objeto
    Paciente p=new Paciente();

    //Ingresar datos
    System.out.print("Ingrese codigo: ");
    p.setCodigo(sc.nextLine());
    System.out.print("Ingrese su nombre: ");
    p.setNombre(sc.nextLine());
    System.out.print("Ingrese su edad: ");
    p.setEdad(sc.nextInt());
    sc.nextLine(); // 🔥 limpiar buffer
    System.out.print("Ingrese su tipo de seguro (A/B/C): ");
    p.setTipoSeguro(sc.nextLine());

    //Mostrar resultados
    System.out.println("\n*****MENU*****");
    System.out.println("Paciente: " +p.getNombre());
    System.out.println("Pago final: S/. " +p.calcularPagoFinal());
    sc.close();

    }
}
