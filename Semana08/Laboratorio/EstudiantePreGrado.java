package Semana08.Laboratorio;

public class EstudiantePreGrado extends Estudiante {

    private double promedioPonderado;
    private String colegioProcedencia;
    private static int contador;

    public EstudiantePreGrado(String codigo, String nombres, int semestreIngreso, String condicionSocial,
        double promedioPonderado, String colegioProcedencia) {

        super(codigo, nombres, semestreIngreso, condicionSocial);

        this.promedioPonderado = promedioPonderado;
        this.colegioProcedencia = colegioProcedencia;

        contador++;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public double pagoParcial() {

        if (colegioProcedencia.equalsIgnoreCase("estatal")){
            return pensionEstatal;
        } else {
            return pensionParticular;
        }
    }

    @Override
    public double descuento() {

        double pago = pagoParcial();

        if (promedioPonderado < 13) {
            return pago * porcentaje1;
        } else {
            return pago * porcentaje2;
        }
    }
}
