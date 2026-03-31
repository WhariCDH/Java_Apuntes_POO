package Semana01.LaboratorioEjercicio;

public class Obrero {
    private String categoria;
    private String producto;
    private int unidades;

    //Constructores
    public Obrero (String categoria, String producto, int unidades) {
        this.categoria=categoria;
        this.producto=producto;
        this.unidades=unidades;
    }

    //Obtener tarifa segun tabla
    public double obtenerTarifa() {
        switch (categoria.toUpperCase()) {
            case "A":
                if (producto.equalsIgnoreCase("Tejas")) return 2.50;
                else return 2.00;
                
            case "B":
                if (producto.equalsIgnoreCase("Tejas")) return 2.00;
                else return 1.50;

            case "C":
                if (producto.equalsIgnoreCase("Tejas")) return 1.50;
                else return 1.00;
        
            default:
                return 0;
        }
    }

    //Pago base
    public double calcularPagoBase() {
        return obtenerTarifa()*unidades;
    }

    //Bonificación según tabla
    public double calcularBonificación() {
        if (unidades <= 250) {
            return 0;
        }
        else if (unidades <= 500){
            return 50;

        }
        else if (unidades <=1000) {
            return 100;
        }
        else {
            return 150;
        }
    }

    //Pago final con descuento del 7%
    public double calcularPagoFinal() {
        double total=calcularPagoBase()+calcularBonificación();
        double descuento=total*0.07;
        return total-descuento;

    }
    
}
