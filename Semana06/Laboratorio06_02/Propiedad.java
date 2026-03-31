package Semana06.Laboratorio06_02;

public class Propiedad {
    protected double precioVenta;

    public Propiedad(double precioVenta) {
        this.precioVenta=precioVenta;
    }

    public double calcularComision() {
        return precioVenta*0.10;
    }

    public double pagosAdicionales() {
        return 0;
    }

    public double totalInvercion() {
        return precioVenta+pagosAdicionales();
    }
    
}
