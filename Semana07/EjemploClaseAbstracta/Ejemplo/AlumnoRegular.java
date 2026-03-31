package Semana07.EjemploClaseAbstracta.Ejemplo;

public class AlumnoRegular extends Alumno{
    private String categoria;
    private boolean seguro;

    public AlumnoRegular(String nombre, boolean ingles, String categoria, boolean seguro) {
        super(nombre, ingles);
        this.categoria=categoria;
        this.seguro=seguro;
    }

    @Override
    public double calcularPago() {
        double pago = 0;

        switch (categoria.toUpperCase()) {
            case "A":
                pago=790.40;
                break;
            case "B":
                pago=650.80;
                break;
            case "C":
                pago=580.20;
                break;
        }
        if (seguro) {   //entra si es TRUE (tiene seguro)
            pago=pago+(pago*0.02); 
        }
        if (ingles) {   //entra si es TRUE (tiene ingles)
            pago=pago+75.20;
        }
        return pago;

    }
    
}
