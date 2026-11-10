package interfases;

public class Gato implements Animal{
    @Override
    public void hacerSonido() {
        System.out.println("El Gato hace miau miau");  
    }
    @Override
    public void moverse() {
        System.out.println("El Gato se mueve");
        
    }
    
}
