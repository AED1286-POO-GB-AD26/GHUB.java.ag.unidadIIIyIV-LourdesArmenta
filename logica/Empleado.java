package logica;
public class Empleado extends Persona{
    //atributos
    private double salario;
    //constructores
    public Empleado(){
        super();

    }
    public Empleado(String nombre, int edad, double salario){
        super(nombre,edad);
        this.salario = salario;

    }
    //getter
    public double getSalario(){
        return salario;
    }
    //setter
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    //sobreEscribir mostrarDatos
    @Override 
    public String mostrarDatos(){
        return "Empleado: Nombre"+super.getNombre()+" Edad:"+super.getEdad()+" años "+
        " Salario:"+salario;

    }
     @Override 
    public String toString(){
        return "Empleado Nombre:"+super.getNombre()+" Edad:"+super.getEdad()+" años "+
            " Salario:"+salario;
    }
}