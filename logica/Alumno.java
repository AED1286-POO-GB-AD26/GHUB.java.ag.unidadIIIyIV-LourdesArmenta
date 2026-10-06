package logica;
public class Alumno extends Persona{
    //atributos
    private String matricula;
    //constructores
    public Alumno(){
        super();//INVOCA AL CONSTRUCTOR VACIO DEL LA CLASE BASE
        this.matricula = "SIN MATRICULA";

    }
    public Alumno(String nombre, int edad, String matricula){
        super(nombre); //invoca al constructor de la clase base con 2 argumentos
        this.matricula = matricula;


    }
    //getter
    public String getMatricula(){
        return matricula;
    }
    //setter
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    //mostrar datos

}