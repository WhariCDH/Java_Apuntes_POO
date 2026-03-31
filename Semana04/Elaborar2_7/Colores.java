package Semana04.Elaborar2_7;

public class Colores {

    private String codUtil;
    private String descripUtil;
    private double precioUni;
    private String marca;
    private int unidadesCaja;
    private int cantidadesVendida;
    private String codOferta;
    private String descripcionOferta;
    private double porcDescuento;

    public void registrar(String codUtil, String descripUtil, double precioUni, String marca, int unidadesCaja,
                        int cantidadesVendida, String codOferta, String descripcionOferta) {
        this.codUtil=codUtil;
        this.descripUtil=descripUtil;
        this.precioUni=precioUni;
        this.marca=marca;
        this.unidadesCaja=unidadesCaja;
        this.cantidadesVendida=cantidadesVendida;
        this.codOferta=codOferta;
        this.descripcionOferta=descripcionOferta;
        
        calcularDescuento();

    }

    private void calcularDescuento() {

        switch (descripcionOferta.toUpperCase()) {
            case "A":
                porcDescuento=0.05;
                break;
            case "B":
                porcDescuento=0.10;
                break;
            case "C":
                porcDescuento=0.15;
                break;
            default:
                porcDescuento=0;
        }
    }

    public double devolverMontoVentaTotal() {
        double subtotal=precioUni*cantidadesVendida;
        double descuento=subtotal*porcDescuento;

        return subtotal-descuento;
    }

    public String devolverDatoCajaColor() {
        return "\nCodigo Util: " +codUtil+
                "\nDescripción: " +descripUtil+
                "\nMarca: " +marca+ 
                "\nPrecio unitario: " +precioUni+
                "\nUnidades por caja: " +unidadesCaja+
                "\nCantidad Vendida: " +cantidadesVendida+
                "\nCodigo Oferta: " +codOferta+
                "\nDescripción Oferta: " +descripcionOferta+
                "\nPorcentaje Descuento: " +(porcDescuento * 100)+ "%";
    }
}
