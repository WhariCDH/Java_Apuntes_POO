package Semana02;

public class Pasajero {
    private double precioBase;
    private double peso;
    private boolean refrigerio;

    //Constructor vacio
    public Pasajero(){

    }

    //Constructor con 2 parametros
    public Pasajero (double precioBase, double peso) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.refrigerio=false;
    }

    //Constructor con 3 parametros 
    public Pasajero (double precioBase, double peso, boolean refrigerio) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.refrigerio=refrigerio;
    }

    //Metodo para incrementar
    public double obtenerIncremento(){
        if (peso <= 20) {
            return 0;
        }
        else if (peso <= 40) {
            return 0.05;
        }
        else if (peso <= 60) {
            return 0.10;
        }
        else {
            return 0.15;
        }
    }

    //Metodo final
    public double calcularPagoFinal(){
        double total=precioBase+(precioBase*obtenerIncremento());

        if (refrigerio) {
            total=total+35;
        }
        return total;
    }
    
}
