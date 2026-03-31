package Semana04.Laboratorio04.Ejercicio02;

public class Alumno {

    protected String nombre;
    protected boolean ingles;

    public void registroAlumno(String nombre, boolean ingles) {

        this.nombre=nombre;
        this.ingles=ingles;

    }

    public double pagoIngles() {
        if (ingles) {
            return 75.20;
        }
        return 0;
    }

    public String devolverDato() {
        return "\nAlumno: " +nombre+
                "\nLleva ingles: " +ingles;
    }


    
}
