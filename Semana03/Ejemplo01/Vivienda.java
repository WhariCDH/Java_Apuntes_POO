package Semana03.Ejemplo01;

public class Vivienda {

    protected double area;

    public Vivienda(double area) {
        this.area=area;
    }

    public double precioBase() {
        if (area >= 1 && area <= 100) {
            return 200;
        }
        else if (area <= 200) {
            return 270;
        }
        else {
            return 310;
        }
    }
    
}
