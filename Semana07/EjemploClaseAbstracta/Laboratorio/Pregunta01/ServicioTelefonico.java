package Semana07.EjemploClaseAbstracta.Laboratorio.Pregunta01;

public abstract class ServicioTelefonico {

    protected int minuto;

    public ServicioTelefonico(int minuto) {
        this.minuto=minuto;
    }

    public abstract double calcularPago();
    
}
