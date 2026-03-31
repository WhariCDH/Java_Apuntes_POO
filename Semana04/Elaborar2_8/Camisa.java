package Semana04.Elaborar2_8;

public class Camisa extends Producto{
    private String talla;
    private String color;
    private double precioVenta;

    public void registroCamisa(String codProd, String nombProd, double costoProd, String talla,
                                String color, double precioVenta) {
        registroProducto(codProd, nombProd, costoProd);
        this.talla=talla;
        this.color=color;
        this.precioVenta=precioVenta;
    }

    public double devolverPrecioVentaCamisa() {
        return precioVenta;
    }

    public String devolverDatosCamisa() {
        return  devolverDatosProd()+ 
                "\nTalla: " +talla+
                "\nColor: " +color+
                "\nPrecio de Venta: " +precioVenta;
    }
    
}
