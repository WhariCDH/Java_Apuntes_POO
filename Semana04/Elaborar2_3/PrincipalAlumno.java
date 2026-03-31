package Semana04.Elaborar2_3;

public class PrincipalAlumno {

    public static void main(String[] args) {
        
        Alumno alum=new Alumno();

        System.out.println("INGRESO DE DATOS DEL ALUMNO");
        alum.Registrar();
        System.out.println();
        System.out.println("REPORTE DE DATOS DEL ALUMNO");
        alum.Mostrar();
    }
    
}
