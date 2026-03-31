package Semana02.laboratorio02;

public class MainEmpleado {
    public static void main(String[] args) {

        //Crear un objeto
        Empleado e=new Empleado("Marina", "B", 24, 10);

        //Calcular tiempo de servicio
        double sueldo=e.sueldoFinal();

        //Mostrar resultado
        System.out.println("Empleado: Marina");
        System.out.print("Gana un sueldo de " +sueldo);
    }
    
}
