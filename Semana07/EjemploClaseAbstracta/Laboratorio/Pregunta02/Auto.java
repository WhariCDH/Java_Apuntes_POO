package Semana07.EjemploClaseAbstracta.Laboratorio.Pregunta02;

public abstract class Auto {

    protected String tipo;
    protected String seguro;

    public Auto(String tipo, String seguro) {
        this.tipo=tipo;
        this.seguro=seguro;
    }

    public double incrementoSeguro(double precio) {

        switch (seguro.toLowerCase()) {
            case "todo":
                return precio*0.20;
            case "robo":
                return precio*0.15;
            case "accidente":
                return precio*0.10;
            default:
                return 0;  //en caso no se acepte un seguro
        }
    }

    public abstract double calcularPrecio();
}
