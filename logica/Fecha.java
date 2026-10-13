package logica;
//CLASE BASE
public class Fecha{
    //atributos
    private int anio;
    private int mes;
    private int dia;
    //constructores
    public Fecha(){
        this.anio =1900;
        this.dia = 1;
        this.mes = 1;

    }
    public Fecha(int dia,int mes,int anio){
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }
    //getter
    public int getAnio(){
        return anio;
    }
    public int getMes(){
        return mes;
    }
    public int getDia(){
        return dia;
    }
    //setter
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    @Override 
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }

    @Override
    public boolean equals(Object o){
        Fecha f = (Fecha)o; //cast 
        if(this.anio == f.getAnio() && this.mes == f.getMes() && this.dia == f.getDia()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 400 == 0) ||
               (anio % 4 == 0 && anio % 100 != 0);
    }


    
}
