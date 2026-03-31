package Semana04.Laboratorio04.Ejercicio01;

public class Docente extends Empleado{

    private String categoria;
    private int hora;

    public void registroDocente(String nombre, boolean sindicato, String categoria, int hora) {
        registrarEmpleado(nombre, sindicato);
        this.categoria=categoria;
        this.hora=hora;
    }

    public double tarifaHora() {

        switch (categoria.toLowerCase()) {  //"toLowerCase" convierte todo a minuscula 
            case "principal":
                return 35;
            case "auxiliar":
                return 30;
            case "contratado":
                return 25;
            default:
                return 0;
        }

    }

    public double calcularSueldoDocente() {

        double sueldo=hora*tarifaHora();

        if (hora > 80) {
            sueldo=sueldo+(sueldo*0.10);  
        }
        sueldo=sueldo-descuentoSindicato();


        return sueldo;
    }

    
}
