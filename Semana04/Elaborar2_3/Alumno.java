package Semana04.Elaborar2_3;

public class Alumno {
    private String nombre;
    private int codigo;

    public void Registrar() {
        System.out.print("Ingrese codigo: ");
        this.codigo=Integer.parseInt(LeerCadena.lectura());
        System.out.print("Ingrese nombre: ");
        this.nombre=LeerCadena.lectura();
    }

    public void Mostrar() {
        System.out.println("El codigo es: " +codigo);
        System.out.println("El nombre es: " +nombre);

    }
    
}
