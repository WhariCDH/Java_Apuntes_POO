package Semana08Practica.Practica01;

public class EmpleadoAdministrativo extends Empleado {

    private String area;

    public EmpleadoAdministrativo(String codigo, String nombre, int aniosServicio, String area) {
        super(codigo, nombre, aniosServicio);
        this.area=area;
    }

    //area = RRHH / Contabilidad / Logística
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override 
    public double calcularSueldoBase() {
            return sueldoBaseAdministrativo;
    }
    
    @Override
    public double calcularBonificacion() {
        if (getAniosServicio() > 5) {
            return 200;
        } else {
            return 0;
        }
    }
    
    @Override
    public double calcularDescuento() {
        
        return calcularSueldoBase()*descuentoAFP;


    }


    
}
