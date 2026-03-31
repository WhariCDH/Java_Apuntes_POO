package Semana04.Laboratorio04.Ejercicio03;

public class TrasporteTerrestre extends Encomienda{

    private boolean fragil;

    public void registroTrasporteTerrestre(double peso, boolean domicilio, boolean fragil) {
        registroEncomienda(peso, domicilio);
        this.fragil=fragil;
    }

    public double calcularPrecioTT() {
        double precio;

        if (peso <= 1000) {
            precio=5.00;
        }
        else if (peso <= 3500) {
            precio=7.50;
            
        }
        else if (peso <= 5000) {
            precio=12.00;
        }
        else {
            precio=25.00; 
        }
        
        if (fragil) {
            precio=precio+(precio*0.02);
        }

        precio=precio+pagoAdicionalDomicilio();

        return precio;
    }
}
