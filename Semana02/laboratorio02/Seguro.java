package Semana02.laboratorio02;

public class Seguro {

    private String tipoSeguro;
    private int consulta;

    //Costructor vacio 
    //public Seguro() {

    //}

    //Constructor con parametros
    public Seguro(String tipoSeguro, int consulta) {
        this.tipoSeguro=tipoSeguro;
        this.consulta=consulta;

    }

    //Metodo para obtener precio base
    public double precioBase() {
        switch (tipoSeguro) {
            case "A":
                return 120.00;
            case "B":
                return 100.00;
            case "C":
                return 70.00;
            default:
                return 0.00;
        }
    }

    //Metodo para consultas permitidas 
    public int consultasPermitidas() {
        switch (tipoSeguro) {
            case "A":
                return 8;
            case "B":
                return 6;
            case "C":
                return 4;
            default:
                return 0;
        }
    }

    //Metodo para pagar pago adicional
    public double pagoAdicional() {
        if (consulta > consultasPermitidas()) {
            int extra=consulta-consultasPermitidas();
            return extra*18;
        }
        return 0;
    }

    //Metodo para monto final
    public double montoFinal() {
        return precioBase()+pagoAdicional();

    }
}
