package Semana08.Laboratorio;

//2. Construya una clase abstracta de nombre Estudiante que tiene los siguientes atributos: 
//código, nombres, semestre de ingreso, condición social (ninguna, bombero activo, 
//licenciado de fuerzas armadas) e incluya sus constructores. 
//Además, construya sus métodos getter y setter (Encapsulamiento) y también declare los métodos abstractos 
//como pago parcial de pensión y descuentos, 
//además construya métodos no abstractos como cálculo del pago final de pensión que será igual a: 
//pago parcial de pensión - descuentos. Implemente esta clase con la interface Valores.

public abstract class Estudiante implements Valores{   

    private String codigo;
    private String nombre;
    private int semestreIngreso;
    private String condicionSocial;

    //CONSTRUCTORES
    public Estudiante(String codigo, String nombre, int semestreIngreso, String condicionSocial) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.semestreIngreso=semestreIngreso;
        this.condicionSocial=condicionSocial;
    }
    
    //GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestreIngreso() {
        return semestreIngreso;
    }

    public void setSemestreIngreso(int semestreIngreso) {
        this.semestreIngreso = semestreIngreso;
    }

    public String getCondicionSocial() {
        return condicionSocial;
    }

    public void setCondicionSocial(String condicionSocial) {
        this.condicionSocial = condicionSocial;
    }

    //METODOS ABSTRACTOS
    public abstract double pagoParcial();

    public abstract double descuento();

    //METODO NORMAL
    public double pagoFinal() {
        return pagoParcial()-descuento();
    }
    
}
