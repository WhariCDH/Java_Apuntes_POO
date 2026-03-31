package Semana09.Ejercicio;

public class Venta<T extends Espectaculo> {  //"<T extends Espectaculo>" Solo acepta objetos que hereden de Espectaculo

    private T ticket;

    public Venta(T ticket) {
        this.ticket = ticket;
    }

    public void mostrarVenta(){

        System.out.println("Precio final ticket: " + ticket.calcularPrecioFinal());
    }

    public double obtenerTotal(){   //suma el total de las ventas que se guardo en la lista
        return ticket.calcularPrecioFinal();
    }
}