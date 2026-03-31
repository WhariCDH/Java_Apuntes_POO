package Semana03.Ejemplo01;

public class Casa extends Vivienda{

    private String ubicacion;
    private boolean amoblada;

    public Casa(double area, String ubicacion, boolean amoblada) {
        super(area);
        this.ubicacion=ubicacion;
        this.amoblada=amoblada;
    }

    public double calcularArquiler() {
        double precio=precioBase();

        if (ubicacion.equalsIgnoreCase("Avenida")) {
            precio=precio+(precio*0.60);
        }
        else if (ubicacion.equalsIgnoreCase("Jiron")) {
            precio=precio+(precio*0.50);
        }
        else if (ubicacion.equalsIgnoreCase("Pasaje")) {
            precio=precio+(precio*0.30);
            
        }

        if (amoblada) {
            precio=precio+(precio*0.30);
        }
        return precio;

    }
    
}
