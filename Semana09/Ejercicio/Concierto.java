package Semana09.Ejercicio;

public class Concierto extends Espectaculo {
    private int numeroAsiento;

    public Concierto(int numeroAsiento, boolean preferencial) {
        super(preferencial);
        this.numeroAsiento=numeroAsiento;
    }

    @Override
    public double calcularPrecioBase() {

        if (numeroAsiento <= 50) {
            return 250;
        } else if (numeroAsiento <=100) {
            return 170;
        } else {
            return 120;
        }

    }
    
}
