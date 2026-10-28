package logica;

public class Solicitud {
    //Atributos
    private String descripcion;
    private int id;
    private String nombre;
    private Estado estadoSolicitud;
    //Métodos
    //Constructor
    public Solicitud(int id, String descripcion, String nombre, Estado estado){
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
        estadoSolicitud = estado;
    }
    //getter
    public int getId(){
        return id;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getNombre(){
        return nombre;
    }
    public Estado getEstado(){
        return estadoSolicitud;
    }
    //setter
    public void setId(int id){
        this.id = id;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEstado(Estado estado){
        estadoSolicitud = estado;
    }

    @Override 
    public String toString(){
        return "Id="+id+" Descripcion="+descripcion+" Nombre="+nombre+" Estado="+estadoSolicitud;
    }

}
