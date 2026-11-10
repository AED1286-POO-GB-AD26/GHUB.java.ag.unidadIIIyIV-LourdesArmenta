package interfases;

public class Estudiante implements Comparable<Estudiante>{
    //Atributos
    private String nombre;
    private int edad;
    private double promedio;
    //constrctor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    @Override 
    public int compareTo(Estudiante otro){
        /* 
        int dif = this.edad-otro.edad;//18-15 = 3 // 15-18 = -3 //18-18=0
        return dif;
        */
       if (this.nombre.compareTo(otro.nombre)>0){
          return 1;
       }else if(this.nombre.compareTo(otro.nombre)<0){
          return -1;
       }else{
          return 0;
       }
    }
    //getter
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getPromedio() {
        return promedio;
    }
    

    
}
