package Semana04.Elaborar2_8;

public class Producto {

    protected String codProd;
    protected String nombProd;
    protected double costoProd;

    public void registroProducto(String codProd, String nombProd, double costoProd) {
        this.codProd=codProd;
        this.nombProd=nombProd;
        this.costoProd=costoProd;

    }

    public double devolverCostoProd() {
        return costoProd;

    }

    public String devolverDatosProd() {
        return  "\nCodigo: " +codProd+
                "\nNombre del Producto: " +nombProd+
                "\nCosto del producto: " +costoProd;

    }
    
}
