package Semana06.Laboratorio06_02;

public class Departamento extends Propiedad {

    public Departamento(double precioVenta) {
        super(precioVenta);
    }

    @Override
    public double calcularComision() {
        return precioVenta*0.12;
    }

    @Override
    public double pagosAdicionales() {
        return 22;
    }
}
