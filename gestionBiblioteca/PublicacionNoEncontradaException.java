package gestionBiblioteca;

/**
 * Excepción utilizada cuando se intenta buscar o eliminar una publicación
 * cuyo id de ejemplar no existe en la biblioteca.
 *
 * Permite informar al usuario de forma clara qué operación no pudo completarse.
 */
public class PublicacionNoEncontradaException extends Exception {
    public PublicacionNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}
