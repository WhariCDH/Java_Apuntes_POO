package Semana06.Laboratorio06_02;

public class Casa extends Propiedad {
    
    public Casa (double precioVenta) {
        super(precioVenta);
    }

    //Sobrescritura
    @Override
    public double calcularComision() {
        return precioVenta*0.15;

    }

    @Override
    public double pagosAdicionales() {
        return precioVenta*0.03+precioVenta*0.025;

    }

    //El ejercicio pide que sobrecarguemos 
    //En una sobrecarga no se coloca @Override
    public double pagosAdicionales(boolean incluyeMuebles) {

        double pago=pagosAdicionales();

        if (incluyeMuebles){ 
            pago=pago+1500;
        }
        return pago;
    }
}
