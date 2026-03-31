package Semana02.laboratorio02.GetSetControlMasPunto;

public class Practica {
    private String nombre;
    private double examenParcial;
    private double examenFinal;
    private double practica1;
    private double practica2;
    private double practica3;

    // Constructor con parámetros
    public Practica(String nombre, double examenParcial, double examenFinal, double practica1, double practica2, double practica3) {
        this.nombre = nombre;
        setExamenParcial(examenParcial);
        setExamenFinal(examenFinal);
        setPractica1(practica1);
        setPractica2(practica2);
        setPractica3(practica3);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getExamenParcial() {
        return examenParcial;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public double getPractica1() {
        return practica1;
    }

    public double getPractica2() {
        return practica2;
    }

    public double getPractica3() {
        return practica3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Setters
    public void setExamenParcial(double examenParcial) {
        if (examenParcial >= 0 && examenParcial <=20) {
            this.examenParcial = examenParcial;
        }
        else {
        System.out.println("Error: la nota del parcial debe estar entre 0 y 20");
        }
    }

    public void setExamenFinal(double examenFinal) {
        if (examenFinal >= 0 && examenFinal <= 20) {
            this.examenFinal = examenFinal;
        }
        else {
        System.out.println("Error: la nota del parcial debe estar entre 0 y 20");
        }
    }

    public void setPractica1(double practica1) {
        if (practica1 >= 0 && practica1 <=20) {
            this.practica1 = practica1;
        }
        else {
        System.out.println("Error: la nota del parcial debe estar entre 0 y 20");
        }
    }

    public void setPractica2(double practica2) {
        if (practica2 >= 0 && practica2 <=20) {
            this.practica2 = practica2;
        }
        else {
        System.out.println("Error: la nota del parcial debe estar entre 0 y 20");
        }
    }

    public void setPractica3(double practica3) {
        if (practica3 >= 0 && practica3 <=20) {
            this.practica3 = practica3;
        }
        else {
        System.out.println("Error: la nota del parcial debe estar entre 0 y 20");
        }
    }

    

    // Método para promedio de prácticas
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

        double suma = practica1 + practica2 + practica3 - menor;
        return suma / 2;
    }

    // Promedio final
    public double promedioFinal() {
        return (examenParcial + examenFinal + promedioPracticas()) / 3;
    }

    // Calificación
    public String calificacion() {
        double pro = promedioFinal();

        if (pro <= 10) return "Malo";
        else if (pro <= 13) return "Regular";
        else if (pro <= 17) return "Bueno";
        else return "Excelente";
    }
}