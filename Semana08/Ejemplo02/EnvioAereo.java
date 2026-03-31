package Semana08.Ejemplo02;

public class EnvioAereo implements Transporte {

    private double peso;
    private boolean seguro;
    private boolean domicilio;

    public EnvioAereo(double peso, boolean seguro, boolean domicilio) {
        this.peso=peso;
        this.seguro=seguro;
        this.domicilio=domicilio;
    }

    @Override
    public double calcularEnvio() {

        double precio=0;

        if (peso <= 1000) {
            precio=12;
        } else if (peso <=3500) {
            precio=19;
        } else if (peso <=5000) {
            precio=28;
        } else {
            precio=40;
        }

        //Impuesto
        precio=precio+8;

        if (seguro) {
            precio=precio+12;
        }

        if (domicilio) {
            precio=precio+(peso*3.50);
        }

        return precio;

    }
    
}
