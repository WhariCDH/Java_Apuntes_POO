package Semana04.Laboratorio04.Ejercicio01;

public class Empleado {

    protected String nombre;
    protected boolean sindicato;

    public void registrarEmpleado(String nombre, boolean sindicato) {
        this.nombre=nombre;
        this.sindicato=sindicato; 
    }

    public double descuentoSindicato() {
        if (sindicato) {
            return 18.50;
        }
        return 0;
    }

    public String devolverDatoEmpleado() {
        return "Nombre: " +nombre+
                "\nPertenece al sindicato: " +sindicato;
    }
    
}
