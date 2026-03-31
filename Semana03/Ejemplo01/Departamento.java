package Semana03.Ejemplo01;

public class Departamento extends Vivienda{

    private boolean cochera;
    private int piso;

    public Departamento(double area, boolean cochera, int piso) {
        super(area);
        this.cochera=cochera;
        this.piso=piso;
    }

    public double calcularAlquiler() {
        double precio=precioBase();

        if (cochera) {
            precio=precio+35;
        }
        //Descuento si tiene cochera apartir del tercer piso a arriba 
        if (piso > 3) {
            precio=precio-(precio*0.03);
            
        }
        return precio;

    }


    
}
