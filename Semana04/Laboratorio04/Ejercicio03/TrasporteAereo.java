package Semana04.Laboratorio04.Ejercicio03;

public class TrasporteAereo extends Encomienda {

    public void registroTrasporteAereo(double peso, boolean domicilio) {
        registroEncomienda(peso, domicilio);
    }

    public double calcularPrecioTrasporteAereo() {
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

        //50% más por trasporte aereo
        precio=precio+(precio*0.50);
        //Por impuestos
        precio=precio+1.85;
        //Aumento por trasporte en un domicilio
        precio=precio+10.00;

        return precio;
    }

    
}
