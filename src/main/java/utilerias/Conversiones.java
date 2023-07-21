
package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversiones {
    
    //Definir variable
    private static final String FORMATO_FECHA = "dd-MM";
    
    //Metodo
    public static String format(Date fecha){
        //Recibimos un objeto fecha - Convertimos a un string y Creamos un nuevo objeto de tipo fecha
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        //Regresamos una cadena
        return formateador.format(fecha);
    }
    
    public static String format(String fecha){
        //Recibimos un objeto fecha - Convertimos a un string y Creamos un nuevo objeto de tipo fecha
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        //Regresamos una cadena
        return formateador.format(fecha);
    }
}
