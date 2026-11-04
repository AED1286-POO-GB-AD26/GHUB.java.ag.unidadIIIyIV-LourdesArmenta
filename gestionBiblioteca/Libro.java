package gestionBiblioteca;
public class Libro extends Publicacion{
    private String isbn;
    private String autor;
    private Estado estado;
    public Libro() {
        super();
        isbn = "NA";
        autor = "Desconocido";
        estado = Estado.DISPONIBLE;
    }
    public Libro(String titulo, int anio, String idEjemplar, String isbn, String autor, Estado estado) {
        super(idEjemplar, titulo, anio);
        this.isbn = isbn;
        this.autor = autor;
        this.estado = estado;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAutor() {
        return autor;
    }
    public boolean estarDisponible() {
        return estado == Estado.DISPONIBLE;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    @Override 
    public String devolverDatos() {
        return getIdEjemplar() + " - ISBN: " + isbn + " - " + getTitulo() + " ("
                + getAnio() + ", " + autor + ") - " + estado;
    }
    @Override
    public int calcularTiempoPrestano() {
        return 30;
    }
}