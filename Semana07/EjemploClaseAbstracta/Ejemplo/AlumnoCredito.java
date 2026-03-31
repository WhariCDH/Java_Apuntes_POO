package Semana07.EjemploClaseAbstracta.Ejemplo;

public class AlumnoCredito extends Alumno{

    private int creditos;

    public AlumnoCredito(String nombre, boolean ingles, int creditos) {
        super(nombre, ingles);
        this.creditos=creditos;
    }

    @Override
    public double calcularPago() {

        double pago=creditos*45.10;

        if (creditos > 10) {
            pago=pago+18;
        }

        if (ingles) {
            pago=pago+75.20;
            
        }
        return pago;

    }
    
}
