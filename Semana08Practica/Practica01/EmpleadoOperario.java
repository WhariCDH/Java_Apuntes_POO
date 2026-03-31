package Semana08Practica.Practica01;

public class EmpleadoOperario extends Empleado {

    private int horasExtras;

    public EmpleadoOperario(String codigo, String nombre, int aniosServicio, int horasExtras) {

        super(codigo, nombre, aniosServicio);
        this.horasExtras=horasExtras;
    }

    @Override
    public double calcularSueldoBase() {
        return sueldoBaseOperario;
    }

    @Override
    public double calcularBonificacion() {
        return horasExtras*20;
    }

    @Override
    public double calcularDescuento() {
        return calcularSueldoBase()*descuentoRenta;
    }
}
