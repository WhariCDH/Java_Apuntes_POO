package Semana01.EjemploGetySet;

public class Empleado {
    String Nombre;
    String Puesto;
    int DNI;
    int Sueldo;
    int Edad;

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getPuesto() {
		return this.Puesto;
	}

	public void setPuesto(String Puesto) {
		this.Puesto = Puesto;
	}

	public int getDNI() {
		return this.DNI;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}

	public int getSueldo() {
		return this.Sueldo;
	}

	public void setSueldo(int Sueldo) {
		this.Sueldo = Sueldo;
	}

	public int getEdad() {
		return this.Edad;
	}

	public void setEdad(int Edad) {
		this.Edad = Edad;
	}

    
}
