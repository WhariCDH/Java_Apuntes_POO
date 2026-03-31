package Semana04.Laboratorio04.Ejercicio01;

public class Administrativo extends Empleado {

    private int anios;

    public void registroAdministrativo(String nombre, boolean sindicato, int anios) {

        registrarEmpleado(nombre, sindicato);
        this.anios=anios;
    }

    //Calcular sueldo de administración
    public double calculaSueldoAdministración() {
        double sueldo=2500;

        if (anios >=7 && anios <=15) {
            sueldo=sueldo+(sueldo*0.10);
        }
        else if(anios >=16) {
            sueldo=sueldo+(sueldo*0.15);
        }
        sueldo=sueldo-descuentoSindicato();

        return sueldo;
    }
}
