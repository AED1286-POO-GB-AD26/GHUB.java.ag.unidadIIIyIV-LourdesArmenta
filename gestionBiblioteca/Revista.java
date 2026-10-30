package gestionBiblioteca;

public class Revista extends Publicacion{
    private String periodicidad;
    private String issn;

    public Revista() {
        super();
        this.periodicidad = "No Definida";
        this.issn = "NA";
    }

    public Revista(String titulo, int anio, String periodicidad) {
        super(titulo, anio);
        this.periodicidad = periodicidad;
        this.issn = "NA";
    }

    public Revista(String idEjemplar, String issn, String titulo, int anio, String periodicidad) {
        super(idEjemplar, titulo, anio);
        this.issn = issn;
        this.periodicidad = periodicidad;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
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

    @Override
    public String devolverDatos() {
        return getIdEjemplar() + " - ISSN: " + issn + " - " + getTitulo() + " ("
                + getAnio() + ") - " + periodicidad;
    }
}
