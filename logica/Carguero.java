package logica;
public class Carguero extends DeVapor{
    public Carguero(){
        System.out.println("Se crea la parte del barco de Carguero");
    }
    public String saludo(String saludo){
        return "Hola, soy un Carguero y te mando el saludo:"+saludo;
    }

}