package Semana08.Laboratorio;

//1) Construya una interface de nombre Valores que permita manejar las siguientes constantes: 
//PensionEstatal = 560, PensionParticular = 650, Porcentaje1 = 0, 
//Porcentaje2 = 0.08, DescuentoCondicion1 = 0.15, DescuentoCondicion2 = 0.20, 
//PensionBachiller = 1200, PensionTitulado = 130. 

//La interface "Valores" permitira que todas las clases puedan usar esos valores
public interface Valores {

    double pensionEstatal=560;
    double pensionParticular=650;

    double porcentaje1=0;
    double porcentaje2=0.08;

    double descuentoCondicion1=0.15;
    double descuentoCondicion2=0.20;

    double pensionBachiller=1200;
    double pensionTitulado=1300;
    
}
