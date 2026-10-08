package logica;

import java.time.LocalDate;

public class Revista extends Publicacion{
    //atributos
    private String nombre; 
    private String periodicidad;
    //constructores
    public Revista() {
        super();
    }
    
    public Revista(String editorial, LocalDate fechaPub,  String nombre, String periodicidad) {
        super(editorial, fechaPub);
        this.nombre = nombre;
        this.periodicidad = periodicidad;
    }
    //UTILIZAR OTRO CONSTRUCTOR
    //getter
    public String getNombre() {
        return nombre;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }
    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista [nombre=" + nombre + ", periodicidad=" + periodicidad + "]";
    }
    
    
}