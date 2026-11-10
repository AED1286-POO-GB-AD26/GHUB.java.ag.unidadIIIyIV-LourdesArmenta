package interfases;

public class Conejito implements Cachorro{
    @Override
    public void jugar() {
       System.out.println("El Conejito juega");   
    }
    @Override
    public void hacerSonido() {
        System.out.println("El Conejito hace squik squik");   
    }
    @Override
    public void moverse() {
        System.out.println("El Conejito se mueve");   
    }
}
