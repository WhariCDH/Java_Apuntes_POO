package Semana08Practica.Practica02;

public class Camion extends Vehiculo {

    private double toneladasCarga;

    public Camion(String placa, String marca, int anioFabricacion, double toneladasCarga) {
        super(placa, marca, anioFabricacion);
        this.toneladasCarga=toneladasCarga;
    }

    @Override
    public double calcularPeaje() {
        return peajeCamion;
    }

    @Override
    public double calcularSeguro() {
        return seguroBase+(toneladasCarga*20);
    }

    @Override
    public double calcularImpuesto() {
        return calcularSeguro()*impuestoCamion;
    }
    
}
