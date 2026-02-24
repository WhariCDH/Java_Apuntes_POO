package Semana01.EjercicioPracticar;

public class Paciente {
    
    //Atributos
    private String codigo;
    private String nombre;
    private int edad;
    private String tipoSeguro;

     //Constructor vacio 
    public Paciente(){

    }

    // Getters y Setters
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoSeguro() {
		return this.tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}

    //Metodo para calcular el pago base
    public double calcularPago() {
        double pago=0;

        switch (tipoSeguro) {
            case "A":
                pago=120;
                break;
            case "B":
                pago=100;
                break;
            case "C":
                pago=80;
                break;
        }
        return pago;
    }

    //Metodo para calcular el pago final con descuento
    public double calcularPagoFinal() {
        double pago=calcularPago();

        if (edad > 60){
            pago = pago * 0.9; //10% descuento
        }
        return pago;
    }
}
