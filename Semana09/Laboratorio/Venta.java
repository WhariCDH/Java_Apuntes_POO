package Semana09.Laboratorio;

public class Venta<T extends Inmueble> {

    private T inmueble;

    public Venta(T inmueble) {
        this.inmueble=inmueble;
    }

    public void mostrarPrecio() {                 //"void" mostramos
        System.out.println("Precio final: " +inmueble.calcularPrecio());
    }

    public double obtenerPrecio() {
        return inmueble.calcularPrecio();
    }
    
}
