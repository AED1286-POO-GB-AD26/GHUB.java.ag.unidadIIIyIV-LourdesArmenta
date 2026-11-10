package interfases;

public class Perro implements Animal{

    @Override
    public void hacerSonido() {
       System.out.println("El Perro hace gua gua");
        
    }

    @Override
    public void moverse() {
        System.out.println("El Perro se mueve");  
    }  
}
