package Semana01.ConstructorPorDefecto;
public class Empleado {

    // Atributos
    private String nombre;
    private String apellido;
    private double sueldo;

    // Constructor por defecto (asigna valores)
    public Empleado() {
        this.nombre = "Carlos";
        this.apellido = "Perez";
        this.sueldo = 1500.00;
    }

    // Constructor con parámetros
    public Empleado(String nombre, String apellido, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sueldo: " + sueldo);
    }
}