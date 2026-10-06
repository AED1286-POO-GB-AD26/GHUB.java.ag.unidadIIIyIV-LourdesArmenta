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
    //mostrar datos
}