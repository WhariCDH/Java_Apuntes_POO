package Semana08Practica.Practica02;

public class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(String placa, String marca, int anioFabricacion, int numeroPuertas) {
        super(placa, marca, anioFabricacion);
        this.numeroPuertas=numeroPuertas;
    }
    
    //Numero de puertas
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularPeaje() {
        return peajeAuto;
    }

    @Override
    public double calcularSeguro() {
        if (getAnioFabricacion() < 2015) {
            return seguroBase+50;
        } else {
            return seguroBase;
        }
    }

    @Override
    public double calcularImpuesto() {
        return calcularSeguro()*impuestoAuto;
    }
    
}
