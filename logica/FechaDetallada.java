package logica;
//FECHA DERIVADA
public class FechaDetallada extends Fecha{
    //campo
    //algo pendiente de explicar
    private static  String meses[]= {"Enero","Febrero","Marzo",
                            "Abril","Mayo","Junio",
                            "Julio","Agosto","Septiembre",
                            "Octubre","Noviembre","Diciembre"};
    //constructores
    public FechaDetallada(){
        super();
    }
    public FechaDetallada(int dia,int mes,int anio){
        super(dia,mes,anio);

    }
    @Override 
    public String toString(){
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();

    }

    
    
}
