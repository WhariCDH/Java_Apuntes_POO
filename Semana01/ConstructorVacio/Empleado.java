package Semana01.ConstructorVacio;

public class Empleado {

    //Atributos (privado para encarpsulación)
    private String nombre;
    private String apellido;
    private double sueldo;

    //Constructor vacío 
    public Empleado() {

    }

    //Constructor con parámetros
    public Empleado(String nombre, String apellido, double sueldo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldo=sueldo;

    }

    //Metodo get y set (encapsulación)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

    //Metodo para mostrar información 
    public void mostrarDatos() {
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("Sueldo: " +sueldo);
    }


    
}
