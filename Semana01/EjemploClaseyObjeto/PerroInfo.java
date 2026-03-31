package Semana01.EjemploClaseyObjeto;

public class PerroInfo {

    public static void main(String[] args) {
        Perro Miko=new Perro();

        Miko.caminar();  //Ejecutara el metodo caminar de la clase Perro

        System.out.println(Miko.nombre);
        System.out.println(Miko.colorPelo);
        
        Miko.nombre="Miko";
        System.out.println(Miko.nombre);
    }
    
}
