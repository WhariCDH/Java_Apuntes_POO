package Semana08Practica.Practica03;

public abstract class Pago implements ValoresPago {

    private String codigoPago;
    private double monto;

    //CONSTRUCTORES
    public Pago(String codigoPago, double monto) {
        this.codigoPago=codigoPago;
        this.monto=monto;
    }

    //GETTERS Y SETTERS
    public String getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(String codigoPago) {
        this.codigoPago = codigoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    //METODOS ABSTRACTOS
    public abstract double calcularComision();
    public abstract double calcularImpuesto();

    //METODO NORMAL
    public double montoFinal() {
        return monto+calcularComision()+calcularImpuesto();
    }
    
}
