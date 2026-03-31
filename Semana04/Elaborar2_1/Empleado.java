package Semana04.Elaborar2_1;

//Presentar el programa ingresar y mostrar los datos de la clase empreado 

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;

    public void Registrar(String nombre, String apellido, int dni, int edad) {  //"void" debe ser llamado por que no se ejecuta automaticamente 
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.edad=edad;
    }

    public void Mostrar() {
        System.out.println("Su nombre es: " +nombre);
        System.out.println("Su apellido es: " +apellido);
        System.out.println("Su numero de DNI es: " +dni);
        System.out.println("Su edad es: " +edad);
    }
    
}
