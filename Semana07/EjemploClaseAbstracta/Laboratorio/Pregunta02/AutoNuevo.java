package Semana07.EjemploClaseAbstracta.Laboratorio.Pregunta02;

public class AutoNuevo extends Auto {

    private boolean alarma;

    public AutoNuevo(String tipo, String seguro, boolean alarma) {
        super(tipo, seguro);
        this.alarma=alarma;
    }

    @Override
    public double calcularPrecio() {

        double precio=0;

        switch (tipo.toLowerCase()) {
            case "sedan":
                precio=13500;
                break;
            case "camioneta":
                precio=22000;
                break;
            case "minivan":
                precio=30000;
                break;
        }

        if (alarma) {
            precio=precio+340;
        }

        precio=precio+incrementoSeguro(precio);

        return precio;
    }
    
}
