package Semana01.LaboratorioEjercicio;

public class Entrada {
    private String ubicacion;
    private int cantidad;

    public Entrada(String ubicacion, int cantidad) {
        this.ubicacion=ubicacion;
        this.cantidad=cantidad;
    }

    //Precio segun ubicación
    public double obtenerPrecio() {
        switch (ubicacion.toLowerCase()) {
            case "palco":
                return 60;
            case "platea":
                return 80;
            case "vip":
                return 120;
            default:
                return 0;
        }

    }

    //Precio segun el descuento
    public double obtenerDescuento() {
        switch (ubicacion.toLowerCase()) {
            case "palco":
                return 0.05;
            case "platea":
                return 0.07;
            case "vip":
                return 0.10;
            default:
                return 0;
        }
    }

    //Calcular monto final
    public double obtenerMontoFinal() {
        double total=obtenerPrecio()*cantidad;

        if (cantidad > 6) {
            total=total-(total*obtenerDescuento());
        }
        return total;
    }
}
