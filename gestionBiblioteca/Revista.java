package gestionBiblioteca;
public class Revista extends Publicacion{
    private String periodicidad;
    private String issn;
    private Estado estado;
    public Revista() {
        super();
        this.periodicidad = "No Definida";
        this.issn = "NA";
        this.estado = Estado.DISPONIBLE;
    }
    public Revista(String idEjemplar, String issn, String titulo, int anio, String periodicidad, Estado estado) {
        super(idEjemplar, titulo, anio);
        this.issn = issn;
        this.periodicidad = periodicidad;
        this.estado = estado;
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
    public Estado getEstado(){
        return estado;
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    @Override
    public int calcularTiempoPrestano() {
        return 7;
    }
    @Override
    public String devolverDatos() {
        return getIdEjemplar() + " - ISSN: " + issn + " - " + getTitulo() + " ("
                + getAnio() + ") - " + periodicidad+ "Estado: "+estado;
    }
}
