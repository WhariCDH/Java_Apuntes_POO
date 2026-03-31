package Semana09.Ejercicio;

public abstract class Espectaculo implements ValorTickets{
    protected boolean preferencial;

    //CONSTRUCTOR
    public Espectaculo(boolean preferencial) {
        this.preferencial=preferencial;
    }

    //METODO ABSTRACTA
    public abstract double calcularPrecioBase();
    
    //METODO NORMAL
    public double calcularPrecioFinal() {

        double precio=calcularPrecioBase();

        if (preferencial) {
            precio=precio+EXTRA_PREFERENCIAL;
        }

        precio=precio+(precio*IMPUESTO);

        return precio;

    }

}
