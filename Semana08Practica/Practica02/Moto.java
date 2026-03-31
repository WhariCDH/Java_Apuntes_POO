package Semana08Practica.Practica02;

public class Moto extends Vehiculo {

    private double cilindrada;

    public Moto(String placa, String marca, int anioFabricacion, double cilindrada) {
        super(placa, marca, anioFabricacion);
        this.cilindrada=cilindrada;
    }
    
    //GETTERES Y SETTERS
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularPeaje() {
        return peajeMoto;
    }

    @Override
    public double calcularSeguro() {
        if (getCilindrada() > 250) {
            return seguroBase+30;
        } else {
            return seguroBase;
        }
        }

    @Override
    public double calcularImpuesto() {
        return calcularSeguro()*impuestoMoto;
    }
    
}
