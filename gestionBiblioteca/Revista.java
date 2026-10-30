package gestionBiblioteca;

public class Revista extends Publicacion{
    private String periodicidad;

    public Revista() {
        super();
        this.periodicidad = "No Definida";
    }

    public Revista(String titulo, int anio, String periodicidad) {
        super(titulo, anio);
        this.periodicidad = periodicidad;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public int calcularTiempoPrestano() {
        return 7;
    }
    
    
    
}
