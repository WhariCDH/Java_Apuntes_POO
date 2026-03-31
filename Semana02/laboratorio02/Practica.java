package Semana02.laboratorio02;

public class Practica {
    private String nombre;
    private double examenParcial;
    private double examenFinal;
    private double practica1;
    private double practica2;
    private double practica3;
    
    //El constructor vacio NO inicializa los atributos automáticamente
    //public Practica() {

    //}

    public Practica(String nombre, double examenParcial, double examenFinal, double practica1, double practica2, double practica3) {
        this.nombre=nombre;
        this.examenParcial=examenParcial;
        this.examenFinal=examenFinal;
        this.practica1=practica1;
        this.practica2=practica2;
        this.practica3=practica3;

    }

    //Metodo para obtener promedio de las 2 mejores practicas 
    public double promedioPracticas() {
        double menor;

        if (practica1 <= practica2 && practica1 <= practica3) {
            menor = practica1;
        }
        else if (practica2 <= practica1 && practica2 <= practica3) {
            menor = practica2;
        }
        else {
            menor = practica3;
        }

        double suma=practica1+practica2+practica3-menor;
        return suma/2;
    }

    //Metodo para calcular promedio final
    public double promedioFinal() {
        double promedio=(examenParcial+examenFinal+promedioPracticas())/3;
        return promedio;
    }

    //Metodo para calificar
    public String calificacion() {
        double pro=promedioFinal();

        if (pro <= 10) {
            return "Malo";
        }
        else if (pro <= 13) {
            return "Regular";
        }
        else if (pro <=17) {
            return "Bueno";
        }
        else {
            return "Excelente";
        }
    }
}