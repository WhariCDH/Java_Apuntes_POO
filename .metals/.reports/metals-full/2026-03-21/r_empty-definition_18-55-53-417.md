error id: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/Cliente.java:java/io/PrintStream#println(+8).
file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/Cliente.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 884
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/POO/Semana11/Ejercicio/Fase01/Cliente.java
text:
```scala
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

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //Clase void para llamar y mostrar
    public void retirar(double monto){
        if(monto <= saldo){
            saldo -= monto;
            System.out.println@@("Retiro exitoso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrar(){

        System.out.println(numeroCuenta + " | " + nombre + " | " + tipoCuenta + " | " + moneda + " | " + saldo);
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).