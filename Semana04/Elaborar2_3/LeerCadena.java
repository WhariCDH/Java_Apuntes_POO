package Semana04.Elaborar2_3;

//programa usando BufferedReader 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerCadena {

    public static String lectura() {
        String cadena=null;  //Aca se guarda lo que el usuario escriba 
        try{    //Esto se usa porque BufferedReader puede lanzar errores de entrada/salida.
            BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
            //"System.in" Es la entrada del teclado, "InputStreamReader" InputStreamReader
            //"BufferedReader" Permite leer líneas completas de texto
            cadena=dato.readLine(); //"readLine()" leer una línea de texto del teclado
           }
        catch(IOException e) {  //Si ocurre un error al leer, el programa no se detiene.

        }
        return cadena; //Esto envía el texto leído de vuelta al método que lo llamó.
    }
    
}
