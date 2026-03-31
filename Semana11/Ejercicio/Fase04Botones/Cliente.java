package Semana11.Ejercicio.Fase04Botones;

public class Cliente {

    private String numeroCuenta;
    private String nombre;
    private double saldo;

    public Cliente(String numeroCuenta, String nombre, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
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

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }

    @Override
    public String toString() {
        return numeroCuenta + " - " + nombre + " - Saldo: " + saldo;
    }
}