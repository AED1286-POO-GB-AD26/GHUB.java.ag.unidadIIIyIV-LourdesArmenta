package interfases;

public class Automovil extends VehiculoAbstracto{
    //constructor
    public Automovil(String matricula){
        super(matricula);
    }
    @Override
    public void conducir(){
        System.out.println("El Automovil se esta conduciendo");

    }

    
}
