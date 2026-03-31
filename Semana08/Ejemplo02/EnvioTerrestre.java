package Semana08.Ejemplo02;

public class EnvioTerrestre implements Transporte {

    private double peso;
    private double distancia;
    private boolean domicilio;

    public EnvioTerrestre(double peso, double distancia, boolean domicilio) {
        this.peso=peso;
        this.distancia=distancia;
        this.domicilio=domicilio;
    }

    @Override
    public double calcularEnvio() {

        double precio=0;

        if (peso<=1000) {
            precio=5;
        }else if (peso<=3500) {
            precio=7.5;
        }else if (peso<=5000) {
            precio=12;
        }else {
            precio=25;
        }

        if (domicilio) {
            precio=precio+(distancia*3.50);
        }

        return precio;

    }
}
