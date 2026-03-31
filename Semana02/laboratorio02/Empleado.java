package Semana02.laboratorio02;

public class Empleado {

    private String empleado;
    private String categoria;
    private int hora;
    private int anoDeServicio;

    public Empleado() {

    }
    
    public Empleado(String empleado, String categoria, int hora, int anoDeServicio){
        this.empleado=empleado;
        this.categoria=categoria;
        this.hora=hora;
        this.anoDeServicio=anoDeServicio;
    }

    //Metodo para calcular categoria 
    public double sueldoBase() {
        switch (categoria) {
            case "A":
                return 33.50;
            case "B":
                return 29.80;
            case "C":
                return 25.70;
            default:
                return 0;
        }
    }

    //Metodo para calcular añoDeServicio
    public double bonificacionAnoServicio() {
        if (anoDeServicio <= 3) {
            return 0;    
        }
        else if (anoDeServicio <= 10) {
            return 0.10;
        }
        else if (anoDeServicio <= 17) {
            return 0.20;
        }
        else {
            return 0.30;
        }

    }

    //Clacular sueldo final
    public double sueldoFinal() {
        double sueldoBaseTotal=sueldoBase()*hora;
        double total=sueldoBaseTotal+(sueldoBaseTotal*bonificacionAnoServicio());
        return total;

    }
    
}
