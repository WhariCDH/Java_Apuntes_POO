package Semana04.Elaborar2_6;

public class Empresa {

    private String nombre;
    private int RUC;
    private float produccionTotal;

    public Empresa(String nombre, int RUC, float produccionTotal) {
        this.nombre = nombre;
        this.RUC = RUC;
        this.produccionTotal = produccionTotal;
    }

    public float devolverProduccion() {  //"floar" almacena datos numericos en decimales, es como double
        return produccionTotal;
    }

    public String consultar() {
        return "RUC: " + RUC +
            "\nNombre: " + nombre +
            "\nProduccion total: " + produccionTotal;
    }
}