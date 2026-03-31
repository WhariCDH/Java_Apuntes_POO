package Semana08Practica.Practica03;

public class PagoTarjeta extends Pago {

    private String banco;
    private String reglas;

    public PagoTarjeta(String codigoPago, double monto, String banco, String reglas) {
        super(codigoPago, monto);
        this.banco=banco;
        this.reglas=reglas;
    }
    
    //GETTERS Y  SETTERS DE LOS ATRIBUTOS ADICIONALES
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getReglas() {
        return reglas;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }

    //LLAMANDO A LOS METODOS ABSTRACTOS
    @Override
    public double calcularComision() {
        return comisionTarjeta;
    }

    @Override
    public double calcularImpuesto() {
        return calcularComision()*impuestoGeneral;
    }
    
}
