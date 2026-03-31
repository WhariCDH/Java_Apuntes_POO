package Semana09.Laboratorio;

public abstract class Inmueble implements ValoresInmobiliaria {

    protected double area;

    public Inmueble(double area) {
        this.area=area;
    }
    
    //Metodo abstracta
    public abstract double calcularPrecio();
    

}
