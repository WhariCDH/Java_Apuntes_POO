package Semana08.Ejemplo01;

//Inplementa las 2 clases con interface 
public class Cliente implements Telefono, Cable {

    private String tipoTelefono;
    private boolean cableClasico;

    public Cliente(String tipoTelefono, boolean cableClasico) {
        this.tipoTelefono=tipoTelefono;
        this.cableClasico=cableClasico;
    }

    @Override 
    public double pagoTelefono() {

        double pago=renta;

        switch (tipoTelefono.toLowerCase()) {
            case "medio":
                pago=pago+25;
                break;
            case "completo":
                pago=pago+30;
                break;
            case "plus":
                pago=pago+40;
                break;
        }

        return pago;

    }

    @Override
    public double pagoCable() {

        double pago=basico;

        if (!cableClasico) {  //entra si es FALSE (si no tiene cable clasico se paga 40 soles)
            pago=pago+40;
        }

        return pago;

    }

    //Calcular el pago de los ambos servicios
    public double pagoTotal() {
        return pagoTelefono()+pagoCable();
    }
    
}
