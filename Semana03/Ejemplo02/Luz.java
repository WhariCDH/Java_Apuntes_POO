package Semana03.Ejemplo02;

public class Luz extends Servicio {

    private String tipo;
    private double consumo;

    public Luz (String tipo, double consumo) {
        super(3.30);
        this.tipo=tipo;
        this.consumo=consumo;
    }
    
    //Tipo de servicio y tarifa
    public double tarifaKW() {
        if (tipo.equalsIgnoreCase("MonoFasico")) {
            return 6;
        }
        else {
            return 9;
        }
    }

    //Calcular pago
    public double calcularPago() {
        double total=cargoFijo+(consumo*tarifaKW());

        //pago por alumbrado 2%
        total=total+(total*0.02);

        return total;

    }
    
}
