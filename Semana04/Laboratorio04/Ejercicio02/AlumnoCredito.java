package Semana04.Laboratorio04.Ejercicio02;

public class AlumnoCredito extends Alumno {

    private int credito;

    public void registroAlumnoCredito(String nombre, boolean ingles, int credito) {
        registroAlumno(nombre, ingles);
        this.credito=credito;
        
    }

    public double calcularPagoAC() {
        double pago=credito*45.10;

        if (credito >=10) {
            pago=pago+18.00;
        }
        pago=pago+pagoIngles();
        return pago;
    }
       
}
