package Semana08Practica.Practica03;

public class PagoTransferencia extends Pago {

    private String cuentaDestino;

    public PagoTransferencia(String codigoPago, double monto, String cuentaDestino) {
        super(codigoPago, monto);
        this.cuentaDestino=cuentaDestino;
    }

    //GETTERS Y  SETTERS DE LOS ATRIBUTOS ADICIONALES
    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    //LLAMANDO A LOS METODOS ABSTRACTOS
    @Override
    public double calcularComision() {
        return comisionTransferencia;
    }

    @Override
    public double calcularImpuesto() {
        return calcularComision()*impuestoGeneral;
    }
    
}