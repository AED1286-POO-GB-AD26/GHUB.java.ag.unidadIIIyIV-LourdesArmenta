package gestionBiblioteca;
import java.util.ArrayList;

public class Biblioteca{
    private final ArrayList<Publicacion> publicaciones;

    public Biblioteca(){
        publicaciones = new ArrayList<>();
    }

    // Metodo publico delegado: crea el objeto Libro y delega el registro en la
    // sobrecarga que recibe el objeto completo.
    public void registrarLibro(String titulo, int anio, String idEjemplar, String isbn, 
        String autor, Estado estado) {
        registrarLibro(new Libro(titulo, anio,  idEjemplar,  isbn,  autor,  estado));
    }

    // Punto comun de registro para las distintas formas publicas de recibir un libro.
    public void registrarLibro(Libro libro) {
        registrarPublicacion(libro);
    }

    public boolean registrarRevista(String idEjemplar, String issn, String titulo, int anio, 
        String periodicidad, Estado estado) {
        return registrarPublicacion(new Revista(idEjemplar, issn, titulo, anio, periodicidad, estado));
    }

    public boolean registrarPublicacion(Publicacion publicacion) {
        if (!datosValidos(publicacion)) {
            System.out.println("No se puede registrar una publicación con datos incompletos.");
            return false;
        }
        if (existePublicacion(publicacion.getIdEjemplar())) {
            System.out.println("Ya existe un ejemplar con el id: " + publicacion.getIdEjemplar());
            return false;
        }
        publicaciones.add(publicacion);
        return true;
    }

    private boolean estaVacio(String texto) {
        return texto == null || texto.isBlank();
    }

    private boolean datosValidos(Publicacion publicacion) {
        if (publicacion == null || estaVacio(publicacion.getIdEjemplar())
                || estaVacio(publicacion.getTitulo())) {
            return false;
        }
        if (publicacion instanceof Libro libro) {
            return !estaVacio(libro.getIsbn()) && !estaVacio(libro.getAutor());
        }
        if (publicacion instanceof Revista revista) {
            return !estaVacio(revista.getIssn()) && !estaVacio(revista.getPeriodicidad());
        }
        return false;
    }

    public boolean existePublicacion(String idEjemplar) {
        return buscarPublicacionPorIdEjemplar(idEjemplar) != null;
    }
    ///AQUI ME QUEDE EN LA EXPLICACION///////////////
    public Publicacion buscarPublicacionPorIdEjemplar(String idEjemplar) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getIdEjemplar().equals(idEjemplar)) {
                return publicacion;
            }
        }
        return null;
    }

    public ArrayList<Publicacion> consultarTodasLasPublicaciones() {
        return new ArrayList<>(publicaciones);
    }

    public void eliminarPublicacion(String idEjemplar) {
        Publicacion publicacion = buscarPublicacionPorIdEjemplar(idEjemplar);
        if (publicacion != null) {
            publicaciones.remove(publicacion);
        }
    }

    public boolean existeLibro(String idEjemplar) {
        return buscarLibroPorIdEjemplar(idEjemplar) != null;
    }

    public Libro buscarLibroPorIdEjemplar(String idEjemplar) {
        Publicacion publicacion = buscarPublicacionPorIdEjemplar(idEjemplar);
        if (publicacion instanceof Libro libro) {
            return libro;
        }
        return null;
    }

    public ArrayList<Libro> consultarTodosLosLibros() {
        ArrayList<Libro> libros = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Libro libro) {
                libros.add(libro);
            }
        }
        return libros;
    }

    public void eliminarLibro(String idEjemplar) {
        eliminarLibroInterno(buscarLibroPorIdEjemplar(idEjemplar));
    }

    public void eliminarLibro(Libro libro) {
        eliminarLibroInterno(libro);
    }

    private void eliminarLibroInterno(Libro libro) {
        if (libro != null) {
            publicaciones.remove(libro);
        }
    }
}