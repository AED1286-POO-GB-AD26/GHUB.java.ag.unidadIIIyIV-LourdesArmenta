package gestionBiblioteca;
import java.util.ArrayList;

public class Biblioteca{
    private final ArrayList<Publicacion> publicaciones;

    public Biblioteca(){
        publicaciones = new ArrayList<>();
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
    
    public Publicacion buscarPublicacionPorIdEjemplar(String idEjemplar) {
        
        for(int i=0;i<publicaciones.size();i++){
            if (publicaciones.get(i).getIdEjemplar().equals(idEjemplar)){
                return publicaciones.get(i);
            }
        }
        return null;
        
       //EL CODIGO COMENTADO ES LO MISMO QUE EL CODIGO DEBAJO
       /* 

        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getIdEjemplar().equals(idEjemplar)) {
                return publicacion;
            }
        }
        return null;
        */
    }

    public ArrayList<Publicacion> consultarTodasLasPublicaciones() {
        return publicaciones;
    }



    public void eliminarPublicacion(String idEjemplar) {
        Publicacion publicacion = buscarPublicacionPorIdEjemplar(idEjemplar);
        if (publicacion != null) {
            publicaciones.remove(publicacion);
        }
    }
    ///AQUI ME QUEDE EN MI GRUPO DE 10 A 11

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