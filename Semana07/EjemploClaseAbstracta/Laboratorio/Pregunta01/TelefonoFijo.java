package Semana07.EjemploClaseAbstracta.Laboratorio.Pregunta01;

public class TelefonoFijo extends ServicioTelefonico {
    private String tipo;
    private boolean mantenimiento;

    public TelefonoFijo(int minuto, String tipo, boolean mantenimiento) {
        super(minuto);
        this.tipo=tipo;
        this.mantenimiento=mantenimiento;
    }

    @Override
    public double calcularPago() {

        double tarifa=0;

        switch (tipo) {
            case "RESIDENCIAL":
                tarifa=0.10;
                break;
            case "COMERCIAL":
                tarifa=0.20;
                break;
            case "INDUSTRIAL":
                tarifa=0.25;
                break;
        }

        double pago=minuto*tarifa;

        pago=pago+15;

        if (mantenimiento) {
            pago=pago+5;
            
        }
        return pago;
    }
    
}
