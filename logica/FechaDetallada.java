package logica;

import java.util.Arrays;

//FECHA DERIVADA
public class FechaDetallada extends Fecha{
    //campo
    //algo pendiente de explicar
    protected final static  String meses[]= {"Enero","Febrero","Marzo",
                            "Abril","Mayo","Junio",
                            "Julio","Agosto","Septiembre",
                            "Octubre","Noviembre","Diciembre"};
    
    private  static int cant = 0;
    //constructores
    public FechaDetallada(){
        super();
        cant++;
    }
    public FechaDetallada(int dia,int mes,int anio){
        super(dia,mes,anio);
        cant++;

    }
    public static int getCant(){
        return cant;
    }
    public  static String getMeses(){
        return Arrays.toString(meses);

    }
    @Override 
    public String toString(){
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();

    }

    
    
}
