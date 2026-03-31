package Semana04.Elaborar2_8;

public class ReproductorDVD extends Producto{

    private String marca;
    private String modelo;
    private double porcentajeDscto;

    public void registroReproductorDVD(String codProd, String nombProd, double costoProd, 
                                        String marca, String modelo, double porcentajeDscto) {

        registroProducto(codProd, nombProd, costoProd);
        this.marca=marca;
        this.modelo=modelo;
        this.porcentajeDscto=porcentajeDscto;
    }

    public double devolverPrecioVentaReprod() {
        double descuento=costoProd*porcentajeDscto/100;
        return costoProd-descuento;
    }

    public String devolverDatosReprod() {
        return devolverDatosProd()+
                "\nMarca: " +marca+
                "\nModelo: " +modelo+
                "\nPorcentaje de descuento: " +porcentajeDscto+ "%";

    }
    
}
