package Semana02.laboratorio02;

public class MainPractica {
    public static void main(String[] args) {

        Practica p=new Practica("Daniel", 14, 15, 20, 15, 20);

        System.out.println("Alumno: Daniel");
        System.out.println("Promedio final: " +p.promedioFinal());
        System.out.println("Calificación: " +p.calificacion());
        
    }
    
}
