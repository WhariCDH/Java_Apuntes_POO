package Semana04.Laboratorio04.Ejercicio02;

public class AlumnoRegular extends Alumno {

    private String categoria;
    private boolean seguro;

    public void registroAlumnoRegular(String nombre, boolean ingles, String categoria, boolean seguro) {
        registroAlumno(nombre, ingles);
        this.categoria=categoria;
        this.seguro=seguro;
    }

    public double pagoBaseAR() {
        switch (categoria.toUpperCase()) {
            case "A":
                return 790.40;
            case "B":
                return 650.80;
            case "C":
                return 580.20;
            default:
                return 0;
        }
    }

    public double calcularPagoAR() {

        double pago=pagoBaseAR();

        if (seguro) {
            pago=pago+(pago*0.02);

        }
        pago=pago-pagoIngles();
        return pago;
    }


    
}
