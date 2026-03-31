package Semana11.Ejercicio.Fase01;

public class Cliente {

    private String numeroCuenta;
    private String nombre;
    private String tipoCuenta;
    private String moneda;
    private double saldo;

    public Cliente(String numeroCuenta, String nombre, String tipoCuenta, String moneda, double saldo){

        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.moneda = moneda;
        this.saldo = saldo;
    }
    
    //"GETTER" Leer atributos privados desde fuera de la clase
    public String getNumeroCuenta() {  //En este caso el atributo NumeroCuenta
        return numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //Clase void para llamar y mostrar
    public void retirar(double monto){   //"retirar(double monto)" cuando llamemos en el menu con "m" se entendera que es monto y definira si hay retiro o no 

        if(monto <= saldo){
            saldo=saldo-monto;
            System.out.println("Retiro exitoso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrar(){

        System.out.println(numeroCuenta + " | " + nombre + " | " + tipoCuenta + " | " + moneda + " | " + saldo);
    }
}