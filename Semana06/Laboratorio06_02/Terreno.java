package Semana06.Laboratorio06_02;

public class Terreno extends Propiedad {

    public Terreno(double precioVenta) {
        super(precioVenta);
    }

    @Override
    public double pagosAdicionales() {
        return 55.80;

    }
    
}
