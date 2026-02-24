package Semana01.ConstructorVacio;

public class Main {
    public static void main(String[] args) {
        
        //Usando costructor con párametros
        Empleado emp1=new Empleado("Ana", "Lopez", 1200);

        //Usando constructor vacío + setters
        Empleado emp2=new Empleado();
        emp2.setNombre("Luis");
        emp2.setApellido("Gomez");
        emp2.setSueldo(1500);

        emp1.mostrarDatos();
        System.out.println("***************");
        emp2.mostrarDatos();
    }
    
}
