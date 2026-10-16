package logica;
//clase BASE
public class Barco{
    public Barco(){
        System.out.println("\tSe crea la parte de un Barco");
    }
    public String saludo(String saludo){
        return "Hola, soy un Barco y te mando el saludo:"+saludo;
    }

}