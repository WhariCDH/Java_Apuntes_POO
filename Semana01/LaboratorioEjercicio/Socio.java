package Semana01.LaboratorioEjercicio;

public class Socio {
    private String categoria;
    private int anios;

    //Constructor 
    public Socio (String categoria, int anios) {
        this.categoria=categoria;
        this.anios=anios;
    }

    //Obtener pago base
    public double obtenerPagoBase() {
        switch (categoria.toUpperCase()) {
            case "A":
                return 150;
            case "B":
                return 130;
            case "C":
                return 110;
            default:
                return 0;
        }
    }

    //Obtener descuento
    public double obtenerDescuento() {
        switch (categoria.toUpperCase()) {
            case "A":
                return 0.10;
            case "B":
                return 0.08;
            case "C":
                return 0.05;
            default:
                return 0;
        }
    }

    //Clacular pago final
    public double obtenerPagoFinal() {
        double pago=obtenerPagoBase();

        if (anios > 20) {
            pago=pago-(pago*obtenerDescuento());
        }
        return pago;
    }


}
