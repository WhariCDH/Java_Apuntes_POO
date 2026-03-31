package Semana07.EjemploClaseAbstracta.Laboratorio.Pregunta02;

public class AutoUsado extends Auto{

    private int anios;
    private boolean mantenimiento;

    public AutoUsado(String tipo, String seguro, int anios, boolean mantenimiento) {
        super(tipo, seguro);
        this.anios=anios;
        this.mantenimiento=mantenimiento;

    }

    @Override
    public double calcularPrecio() {

        double precio=0;

        if (anios >= 1990 && anios <= 2000) {

            switch (tipo.toLowerCase()) {
            case "sedan":
                precio=7000;
                break;
            case "camioneta":
                precio=14000;
                break;
            case "minivan":
                precio=20000;
                break;
            }
            
        }else if (anios <= 2005) {
            
            switch (tipo.toLowerCase()) {
            case "sedan":
                precio=9000;
                break;
            case "camioneta":
                precio=16000;
                break;
            case "minivan":
                precio=23000;
                break;
            }
            
        } else {
            
            switch (tipo.toLowerCase()) {
            case "sedan":
                precio=11000;
                break;
            case "camioneta":
                precio=18000;
                break;
            case "minivan":
                precio=25000;
                break;
            }
            
        }

        if (mantenimiento) {
            precio=precio+(precio*0.10);
        }

        precio=precio+incrementoSeguro(precio);

        return precio;
    }
    
}
