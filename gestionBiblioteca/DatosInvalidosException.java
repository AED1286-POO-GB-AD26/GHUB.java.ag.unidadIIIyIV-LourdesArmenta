package gestionBiblioteca;

/**
 * Excepción utilizada cuando los datos proporcionados para una publicación
 * están incompletos o no tienen valores válidos.
 *
 * Hereda de RuntimeException porque el error depende de la entrada del usuario
 * y el menú debe poder capturar el problema sin detener el programa.
 */
public class DatosInvalidosException extends Exception {
    public DatosInvalidosException(String mensaje) {
        super(mensaje);
    }
}
