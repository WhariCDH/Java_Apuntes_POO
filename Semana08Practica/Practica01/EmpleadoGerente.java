package Semana08Practica.Practica01;

public class EmpleadoGerente extends Empleado {

    private String departamento;

    public EmpleadoGerente(String codigo, String nombre, int aniosServicio, String departamento) {
        super(codigo, nombre, aniosServicio);
        this.departamento=departamento;
    }

    //departamento
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSueldoBase() {
        double sueldo=2500;       //Puede ser tambien mas corto (return 2500;)
        return sueldo;

    }

    @Override
    public double calcularBonificacion() {
        return bonoGerente;
    }

    @Override
    public double calcularDescuento() {
        return calcularSueldoBase()*(descuentoAFP+descuentoRenta);

    }
    
}
