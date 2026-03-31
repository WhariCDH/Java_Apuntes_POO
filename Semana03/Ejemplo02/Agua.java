package Semana03.Ejemplo02;

public class Agua extends Servicio{

    private double consumo;

    public Agua (double consumo) {
        super(2.50);
        this.consumo=consumo;
    }

    public double calcularPago() {
        double total=cargoFijo+(consumo*0.75);

        return total;

    }
    
}
