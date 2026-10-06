package logica;
public class Persona{
    //atrubutos
    private String nombre;
    private int edad;
    //constructores
    public Persona(){
        this.nombre = "Sin Definir";
        this.edad = -1;

    }
    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = -1;
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //getter
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    //setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    //mostrar datos
}