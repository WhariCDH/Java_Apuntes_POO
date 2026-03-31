package Semana01.EjemploClaseyObjeto;

public class Perro {    //clase

    //Atributos
    String nombre;
    String colorPelo;
    int cantidadOjos;

    //metodo que solo ajecutan acciones
    void ladrar(){
        System.out.println("Guau");
    }

    void caminar(){
        System.out.println("Caminando");
    }

    void comer(){
        System.out.println("Subi un Kg");
    }

    //Constructores
    Perro(){
        this.colorPelo="Marron";
    }
    
}
