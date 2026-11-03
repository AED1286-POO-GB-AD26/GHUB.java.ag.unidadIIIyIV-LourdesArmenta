package gestionBiblioteca;
public abstract class Publicacion {
    private String idEjemplar;
    private String titulo;
    private int anio;
    public Publicacion(){

    }
    public Publicacion(String idEjemplar, String titulo, int anio) {
        this.idEjemplar =idEjemplar;
        this.titulo = titulo;
        this.anio = anio;
    }
    public String getIdEjemplar() {
        return idEjemplar;
    }
    public void setIdEjemplar(String idEjemplar) {
        this.idEjemplar = idEjemplar;
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
    public abstract String devolverDatos();
}
