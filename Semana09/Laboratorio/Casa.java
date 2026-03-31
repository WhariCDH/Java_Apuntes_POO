package Semana09.Laboratorio;

public class Casa extends Inmueble {

    private String ubicacion;
    private double cuotaInicial;

    public Casa(double area, String ubicacion, double cuotaInicial) {
        super(area);
        this.ubicacion=ubicacion;
        this.cuotaInicial=cuotaInicial;
    }

    @Override
    public double calcularPrecio() {

        double precio=area*PRECIO_CASA;

        if (ubicacion.equalsIgnoreCase("residencia")) {
            precio=precio+(precio*0.10);
        } else if (ubicacion.equalsIgnoreCase("comercial")) {
            precio=precio+(precio*0.12);
        } else {  //No es necesario terminar con else aca ya que se sobre entiende que si no es if o else if es 0.
            System.out.println("Ubicacion sin incremento");  //precio=precio+0
        }

        if (cuotaInicial > precio*0.40) {
            precio=precio-15000;
        }
        return precio;
    }
}
