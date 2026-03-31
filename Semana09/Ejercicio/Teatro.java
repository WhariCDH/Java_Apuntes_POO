package Semana09.Ejercicio;

public class Teatro extends Espectaculo {
    private String lugar;

    public Teatro(String lugar, boolean preferencial) {
        super(preferencial);
        this.lugar=lugar;
    }

    @Override
    public double calcularPrecioBase() {
        
        if (lugar.equalsIgnoreCase("descampado")) {
            return 36;
        } else {
            return 42;
        }
    }
    
}
