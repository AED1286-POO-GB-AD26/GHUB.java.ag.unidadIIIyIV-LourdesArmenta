package gestionBiblioteca;
import java.util.ArrayList;
import java.util.Scanner;
// Se lanza cuando el usuario introduce texto u otro tipo distinto del entero solicitado.
import java.util.InputMismatchException;
// Se lanza cuando Scanner intenta leer, pero ya no existe entrada disponible (por ejemplo, fin de consola).
import java.util.NoSuchElementException;

public class Menu {
    private final Biblioteca biblioteca;
    private final Scanner scanner;
    public Menu() {
        this.biblioteca = new Biblioteca();
        this.scanner = new Scanner(System.in);
    }
    public void iniciar() {
        boolean salir = false;
        try {
            while (!salir) {
                mostrarOpciones();
                int opcion = leerEntero("Seleccione una opción: ");
                switch (opcion) {
                    case 1:
                        registrarLibro();
                        break;
                    case 2:
                        registrarRevista();
                        break;
                    case 3:
                        consultarTodasLasPublicaciones();
                        break;
                    case 4:
                        buscarPublicacionPorId();
                        break;
                    case 5:
                        eliminarPublicacion();
                        break;
                    case 0:
                        salir = true;
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción inválida, intente de nuevo.");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("No se recibió más entrada. El programa finalizará.");
        } finally {
            scanner.close();
        }
    }
    private void mostrarOpciones() {
        System.out.println("\n===== MENÚ BIBLIOTECA =====");
        System.out.println("1. Registrar libro");
        System.out.println("2. Registrar revista");
        System.out.println("3. Consultar publicaciones");
        System.out.println("4. Buscar publicación por ID de ejemplar");
        System.out.println("5. Eliminar publicación");
        System.out.println("0. Salir");
    }
    private String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }
    private int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int valor = scanner.nextInt();
                scanner.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                // Esta excepción ocurre si el usuario escribe texto donde se espera un entero.
                System.out.println("Error: debe ingresar un número entero.");
                scanner.nextLine();
            }
        }
    }
    public void registrarLibro(){
        try {
            String idEjemplar = leerTexto("Id del ejemplar: ");
            String isbn = leerTexto("ISBN: ");
            String titulo = leerTexto("Título: ");
            int anio = leerEntero("Año de publicación: ");
            String autor = leerTexto("Autor: ");

            if (datosIncompletos(idEjemplar, isbn, titulo, autor) || anio < 1) {
                // Se convierte el dato inválido en una excepción para manejarlo de forma uniforme.
                throw new DatosInvalidosException("Todos los datos son obligatorios y el año debe ser mayor que cero.");
            }

            Libro libro = new Libro(titulo, anio, idEjemplar, isbn, autor, Estado.DISPONIBLE);

            if (biblioteca.registrarPublicacion(libro)) {
                System.out.println("Libro registrado correctamente.");
            } else {
                System.out.println("No fue posible registrar el Libro.");
            }
        } catch (DatosInvalidosException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void registrarRevista() {
        try {
            String idEjemplar = leerTexto("Id del ejemplar: ");
            String issn = leerTexto("ISSN: ");
            String titulo = leerTexto("Título: ");
            int anio = leerEntero("Año de publicación: ");
            String periodicidad = leerTexto("Periodicidad: ");

            if (datosIncompletos(idEjemplar, issn, titulo, periodicidad) || anio < 1) {
                // Se informa al menú cuándo faltan datos o el año no es válido.
                throw new DatosInvalidosException("Todos los datos son obligatorios y el año debe ser mayor que cero.");
            }

            Revista revista = new Revista(idEjemplar, issn, titulo, anio, periodicidad, Estado.DISPONIBLE);

            if (biblioteca.registrarPublicacion(revista)) {
                System.out.println("Revista registrada correctamente.");
            } else {
                System.out.println("No fue posible registrar la Revista.");
            }
        } catch (DatosInvalidosException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private boolean datosIncompletos(String... datos) {
        for (String dato : datos) {
            if (dato.isBlank()) {
                return true;
            }
        }
        return false;
    }

    

    public void buscarPublicacionPorId() {
        try {
            String idEjemplar = leerTexto("Id del ejemplar que desea buscar: ");
            if (idEjemplar.isBlank()) {
                throw new DatosInvalidosException("El id del ejemplar no puede estar vacío.");
            }
            Publicacion publicacion = biblioteca.buscarPublicacionPorIdEjemplar(idEjemplar);
            if (publicacion == null) {
                // Una búsqueda sin resultados se presenta como un error esperado, no como un fallo general.
                throw new PublicacionNoEncontradaException(
                        "No se encontró una publicación con el id: " + idEjemplar);
            }
            System.out.println(publicacion.devolverDatos());
        } catch (DatosInvalidosException | PublicacionNoEncontradaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void consultarTodasLasPublicaciones() {
        ArrayList<Publicacion> publicaciones = biblioteca.consultarTodasLasPublicaciones();
        if (publicaciones.isEmpty()) {
            System.out.println("No hay publicaciones registradas.");
            return;
        }
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion.devolverDatos());
        }
    }

    public void eliminarPublicacion() {
        try {
            String idEjemplar = leerTexto("Id del ejemplar que desea eliminar: ");
            if (idEjemplar.isBlank()) {
                throw new DatosInvalidosException("El id del ejemplar no puede estar vacío.");
            }
            if (!biblioteca.existePublicacion(idEjemplar)) {
                // Evita que la operación de eliminación continúe con un id inexistente.
                throw new PublicacionNoEncontradaException(
                        "No se encontró una publicación con el id: " + idEjemplar);
            }
            biblioteca.eliminarPublicacion(idEjemplar);
            System.out.println("Publicación eliminada correctamente.");
        } catch (DatosInvalidosException | PublicacionNoEncontradaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void buscarLibroPorId() {
        String idEjemplar = leerTexto("Id del ejemplar que desea buscar: ");
        Libro libro = biblioteca.buscarLibroPorIdEjemplar(idEjemplar);
        if (libro == null) {
            System.out.println("No se encontró un libro con el id: " + idEjemplar);
            return;
        }
        System.out.println(libro.devolverDatos());
    }

    public void consultarTodosLosLibros() {
        ArrayList<Libro> libros = biblioteca.consultarTodosLosLibros();
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (Libro libro : libros) {
            System.out.println(libro.devolverDatos());
        }
    }

    public void eliminarLibro() {
        String idEjemplar = leerTexto("Id del ejemplar que desea eliminar: ");
        if (biblioteca.buscarLibroPorIdEjemplar(idEjemplar) == null) {
            System.out.println("No se encontró un libro con el id: " + idEjemplar);
            return;
        }
        biblioteca.eliminarLibro(idEjemplar);
        System.out.println("Libro eliminado correctamente.");
    }
}
