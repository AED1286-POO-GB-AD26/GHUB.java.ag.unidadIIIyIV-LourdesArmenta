package principal;
//CLASE BASE
public class Fecha{
    //atributos
    private int anio;
    private int mes;
    private int dia;
    //constructores
    public Fecha(){

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

    
}
