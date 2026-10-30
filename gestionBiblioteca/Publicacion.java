package gestionBiblioteca;

public abstract class Publicacion {
    private String titulo;
    private int anio;
    public Publicacion(){

    }
    public Publicacion(String titulo, int anio){
        this.titulo = titulo;
        this.anio = anio;

    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public abstract int calcularTiempoPrestano();

    
    
}
