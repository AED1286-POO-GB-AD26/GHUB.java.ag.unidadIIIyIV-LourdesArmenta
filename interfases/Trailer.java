package interfases;

public class Trailer extends  VehiculoAbstracto{
    public Trailer(String matricula){
        super(matricula);
    }
    public void conducir(){
        System.out.println("El trailer se esta conducioendo");
    }

    
}
