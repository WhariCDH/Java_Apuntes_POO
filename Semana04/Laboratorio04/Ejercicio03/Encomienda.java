package Semana04.Laboratorio04.Ejercicio03;

public class Encomienda {

    protected double peso;
    protected boolean domicilio;

    public void registroEncomienda(double peso, boolean domicilio) {
        this.peso=peso;
        this.domicilio=domicilio;
    }

    public double pagoAdicionalDomicilio() {
        if (domicilio) {
            return 10.00;
        }
        return 0;
    }
    
}
