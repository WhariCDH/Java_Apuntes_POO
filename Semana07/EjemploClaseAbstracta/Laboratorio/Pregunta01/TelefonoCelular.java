package Semana07.EjemploClaseAbstracta.Laboratorio.Pregunta01;

public class TelefonoCelular extends ServicioTelefonico {

    private boolean internet;

    public TelefonoCelular(int minuto, boolean internet) {
        super(minuto);
        this.internet=internet;
    }

    @Override
    public double calcularPago() {

        double pago=minuto*0.20;

        if (internet) {
            pago=pago+13.50;
        }
        return pago;
    }
}
