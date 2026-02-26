error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana02/PasajeroNivel02.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana02/PasajeroNivel02.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 703
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana02/PasajeroNivel02.java
text:
```scala
package Semana02;

public class PasajeroNivel02 {

    private double precioBase;
    private double peso;
    private boolean refrigerio;

    // Constructor
    public PasajeroNivel02 (double precioBase, double peso, boolean refrigerio) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.refrigerio = refrigerio;
    }

    // GETTERS
    public double getPrecioBase() {
        return precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isRefrigerio() {
        return refrigerio;
    }

    // Lógica
    public double obtenerIncremento() {
        if (peso <= 20) return 0;
        else if (peso@@ <= 40) return 0.05;
        else if (peso <= 60) return 0.10;
        else return 0.15;
    }

    public double calcularPagoFinal() {
        double total = precioBase + (precioBase * obtenerIncremento());

        if (refrigerio) {
            total += 35;
        }

        return total;
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 