package Semana07.EjemploClaseAbstracta.Ejemplo;

public abstract class Alumno {  //Iniciamos con "public abstract"
    protected String nombre;
    protected boolean ingles;

    public Alumno(String nombre, boolean ingles) {
        this.nombre=nombre;
        this.ingles=ingles;
    }

    public abstract double calcularPago();  //Aca esta lo importante no tiene codigo y obliga a trabajar a las clases hijas
    
}
