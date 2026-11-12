package interfases;

public abstract class VehiculoAbstracto implements Vehiculo{
    //atributo
    private String matricula;
    //constructor
    public VehiculoAbstracto(String matricula){
        this.matricula = matricula;
    }
    //getter
    public String getMatricula(){
        return matricula;
    }
    @Override 
    public void encenderMotor(){
        System.out.println("Motor encendido para la matricula: "+matricula);
    }
    @Override 
    public void apagarMotor(){
        System.out.println("Motor apagado para la matricula: "+matricula);
    }
    public  abstract void conducir();
}
