package logica;

public class Gato extends Animal{
    //constructores
    public Gato(){
        super();

    }
    public Gato(String nombre){
        super(nombre);
    }
    @Override 
    public void hacerSonido(){
        System.out.println("el Gato "+super.getNombre()+" hace miau miau");
    }
    
}
