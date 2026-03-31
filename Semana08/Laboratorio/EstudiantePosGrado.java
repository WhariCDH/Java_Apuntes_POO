package Semana08.Laboratorio;

public class EstudiantePosGrado extends Estudiante implements Descuentos {

    private String gradoAcademico;
    private static int contador;

    public EstudiantePosGrado(String codigo, String nombres, int semestreIngreso, String condicionSocial,
            String gradoAcademico) {

        super(codigo, nombres, semestreIngreso, condicionSocial);

        this.gradoAcademico = gradoAcademico;

        contador++;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public double pagoParcial() {

        if (gradoAcademico.equalsIgnoreCase("bachiller"))
            return pensionBachiller;
        else
            return pensionTitulado;
    }

    @Override
    public double descuentoCondicion() {

        if (getCondicionSocial().equalsIgnoreCase("bombero activo"))
            return pagoParcial() * descuentoCondicion1;

        else if (getCondicionSocial().equalsIgnoreCase("licenciado de fuerzas armadas"))
            return pagoParcial() * descuentoCondicion2;

        else
            return 0;
    }

    @Override
    public double descuento() {

        double descuentoTotal = 50;   //descuento fijo 

        descuentoTotal=descuentoTotal+descuentoCondicion();

        return descuentoTotal;
    }
}