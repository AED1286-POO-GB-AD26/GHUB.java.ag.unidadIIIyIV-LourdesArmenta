package logica;
public class Velero extends Barco{
    public Velero(){
        System.out.println(" se crea la parte del barco de Velero");
    }
    public String saludo(String saludo){
        return "Hola, soy un Velero y te mando el saludo:"+saludo;
    }

}