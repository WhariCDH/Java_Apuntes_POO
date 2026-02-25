package Semana01.EjercicioSobrecarga;

public class Pasajero {

    //Atributos
    private double precioBase;
    private double pesoEquipaje;
    private boolean refrigerio;

    //Costructor 1 (Sin refrigerio)
    public Pasajero (double precioBase, double pesoEquipaje) {
        this.precioBase=precioBase;
        this.pesoEquipaje=pesoEquipaje;
        this.refrigerio=false;

    }

    //Costructor 2 (Con refrigerio)
    public Pasajero (double precioBase, double pesoEquipaje, boolean refrigerio) {
        this.precioBase=precioBase;
        this.pesoEquipaje=pesoEquipaje;
        this.refrigerio=refrigerio;

    }

    //Metodo para calcular el incremento 
    public double CalcularIncremento() {
        if (pesoEquipaje <= 20) {
            return 0;
        }
        else if (pesoEquipaje <= 40) {
            return 0.05;
        }
        else if (pesoEquipaje <=60) {
            return 0.10;
        }
        else {
            return 0.15;
        }
    }

    //Metodo para calcular pago final
    public double calcularPagoFinal() {
        double incremento=CalcularIncremento();
        double total=precioBase+(precioBase*incremento);

        if (refrigerio) {
            total=total+35;
        }
        return total;
    }   
}
