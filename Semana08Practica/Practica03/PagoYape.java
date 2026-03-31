package Semana08Practica.Practica03;

public class PagoYape extends Pago {

    private int numeroCelular;

    public PagoYape(String codigoPago, double monto, int numeroCelular) {
        super(codigoPago, monto);
        this.numeroCelular=numeroCelular;
    }

    //GETTERS Y SETTERS DEL NUEVO ATRIBUTO
    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    //LLAMANDO A LOS METODOS ABSTRACTOS
    @Override
    public double calcularComision() {
        return comisionYape;
    }

    @Override
    public double calcularImpuesto() {
        return calcularComision()*impuestoGeneral;
    }

    
    
}
