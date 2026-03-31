package Semana06.Areas;

public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;

    }

    // ⭐ SOBRESCRITURA (polimorfismo con herencia)
    @Override
    public double calcularArea() {
        double s=(lado1+lado2+lado3)/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    // ⭐ SOBRECARGA (otra forma de calcular área)
    public double calcularArea(double lado1, double lado2, double angulo) {
        return 0.5*lado1*lado2* Math.sin(Math.toRadians(angulo));

    }
    // ⭐ Otra sobrecarga
    public double calcularAreaBaseAltura(double base, double altura) {
        return (base * altura) / 2;
    }
    
}
