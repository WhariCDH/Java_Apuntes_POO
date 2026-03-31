package Semana09.Laboratorio;

public class Departamento extends Inmueble {

    private boolean cochera;
    private int nivel;

    public Departamento(double area, boolean cochera, int nivel) {
        super(area);
        this.cochera=cochera;
        this.nivel=nivel;
    }

    @Override
    public double calcularPrecio() {

        double precio=area*PRECIO_DEPARTAMENTO;

        precio=precio-(precio*0.015);

        if (cochera) {
            if (nivel == 1) {
                precio=precio+40000;
            } else if (nivel == 2) {
                precio=precio+35000;
            } else {
                precio=precio+30000;
            }
        }

        return precio;
    }
    
}
