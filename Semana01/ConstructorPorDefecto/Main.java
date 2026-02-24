package Semana01.ConstructorPorDefecto;
public class Main {
    public static void main(String[] args) {

        // Usando constructor por defecto
        Empleado emp1 = new Empleado();

        // Usando constructor con parámetros
        Empleado emp2 = new Empleado("Ana", "Lopez", 3000);

        Empleado emp3 = new Empleado();

        emp1.mostrarDatos();
        System.out.println("-----");
        emp2.mostrarDatos();
        System.out.println("-----");
        emp3.mostrarDatos();
    }
}