package Semana06.Laboratorio06_01;

public class Obrero extends Trabajador {

    private String categoria;
    private int hora;
    private int anios;
    private double porcentajeDesenpeño;

    public Obrero(String nombre, String categoria, int hora, int anios, double porcentajeDesenpeño) {
        super(nombre);
        this.categoria=categoria;
        this.hora=hora;
        this.anios=anios;
        this.porcentajeDesenpeño=porcentajeDesenpeño;
    }

    public double tarifaHora() {
        switch (categoria.toUpperCase()) {
            case "A":
                return 45.00;
            case "B":
                return 41.50;
            case "C":
                return 36.70;
            default:
                return 0;
        }
    }

    public double bonificacionServicio(double sueldo) {
        if (anios >=6 && anios <=12) {
            return sueldo*0.10;
        }
        else if (anios >=13) {
            return sueldo*0.15;
        }
        return 0;
    }

    //SobreCarga, usamos el mismo public
    //calcular desempeño/100
    //calcular el bonnus extra de 10% y finalizamos cerrando con return
    public double bonificacionDesempeno(double sueldo) {
        return sueldo*porcentajeDesenpeño/100;
    }
    public double bonificacionDesempeno(double sueldo, boolean extra) {
        if (extra) {
            return sueldo*0.10;
        }
        return 0;
    }

    //Sobre excritura
    @Override
    public double calcularSueldo() {

        double sueldo=hora*tarifaHora();

        sueldo=sueldo+bonificacionServicio(sueldo);
        sueldo=sueldo+bonificacionDesempeno(sueldo);
        sueldo=sueldo+bonificacionDesempeno(sueldo, true);

        return sueldo;
    }
}
