package logica;
public class DeVapor extends Barco{
    public DeVapor(){
        System.out.println("Se crea la parte del barco de vapor");
    }
    public String saludo(String saludo){
        return "Hola, soy un deVapor y te mando el saludo:"+saludo;
    }

}
