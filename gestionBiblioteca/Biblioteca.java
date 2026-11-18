package gestionBiblioteca;
import genericidad.MiColeccion;
import java.util.ArrayList;
/*
NOTA: Agregue MiColeccion
 */

public class Biblioteca{
    private final MiColeccion<Publicacion> publicaciones;
    // Código anterior:
    // private final ArrayList<Publicacion> publicaciones;

    public Biblioteca(){
        publicaciones = new MiColeccion<>();
        // Código anterior: publicaciones = new ArrayList<>();
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
        publicaciones.agregar(publicacion);
        // Código anterior: publicaciones.add(publicacion);
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
        int indice = buscarIndicePublicacionPorIdEjemplar(idEjemplar);
        if (indice >= 0) {
            return publicaciones.obtener(indice);
        }
        return null;

        /*
         * Código anterior con ArrayList:
         * for (int i = 0; i < publicaciones.size(); i++) {
         *     if (publicaciones.get(i).getIdEjemplar().equals(idEjemplar)) {
         *         return publicaciones.get(i);
         *     }
         * }
         * return null;
         */
    }

    public ArrayList<Publicacion> consultarTodasLasPublicaciones() {
        ArrayList<Publicacion> resultado = new ArrayList<>();
        for (int i = 0; i < publicaciones.tamaño(); i++) {
            resultado.add(publicaciones.obtener(i));
        }
        return resultado;
        // Código anterior: return publicaciones;
    }

    public void eliminarPublicacion(String idEjemplar) {
        int indice = buscarIndicePublicacionPorIdEjemplar(idEjemplar);
        if (indice >= 0) {
            publicaciones.eliminar(indice);
        }
        // Código anterior:
        // Publicacion publicacion = buscarPublicacionPorIdEjemplar(idEjemplar);
        // if (publicacion != null) {
        //     publicaciones.remove(publicacion);
        // }
    }

    private int buscarIndicePublicacionPorIdEjemplar(String idEjemplar) {
        for (int i = 0; i < publicaciones.tamaño(); i++) {
            if (publicaciones.obtener(i).getIdEjemplar().equals(idEjemplar)) {
                return i;
            }
        }
        return -1;
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
        for (int i = 0; i < publicaciones.tamaño(); i++) {
            Publicacion publicacion = publicaciones.obtener(i);
            if (publicacion instanceof Libro libro) {
                libros.add(libro);
            }
        }
        /*
         * Código anterior:
         * for (Publicacion publicacion : publicaciones) {
         *     if (publicacion instanceof Libro libro) {
         *         libros.add(libro);
         *     }
         * }
         */
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
            int indice = publicaciones.buscar(libro);
            if (indice >= 0) {
                publicaciones.eliminar(indice);
            }
            // Código anterior: publicaciones.remove(libro);
        }
    }
}