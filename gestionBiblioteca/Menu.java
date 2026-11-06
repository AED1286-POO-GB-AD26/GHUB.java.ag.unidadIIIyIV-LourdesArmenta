package gestionBiblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final Biblioteca biblioteca;
    private final Scanner scanner;
    public Menu() {
        this.biblioteca = new Biblioteca();
        this.scanner = new Scanner(System.in);
    }
    public void iniciar() {
        boolean salir = false;
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
                    //buscarPublicacionPorId();
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
        scanner.close();
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
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un número entero.");
            scanner.next();
            System.out.print(mensaje);
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); //CONSUME EL ENTER AL INTRODUCIR UN NUMERO POR TECLADO
        return valor;
    }
    public void registrarLibro(){
        String idEjemplar = leerTexto("Id del ejemplar: ");
        String isbn = leerTexto("ISBN: ");
        String titulo = leerTexto("Título: ");
        int anio = leerEntero("Año de publicación: ");
        String autor = leerTexto("Autor: ");

        if (datosIncompletos(idEjemplar, isbn, titulo, autor) || anio < 1) {
            System.out.println("Todos los datos son obligatorios.");
            return;
        }
         
        Libro libro = new Libro(titulo, anio, idEjemplar, isbn, autor, Estado.DISPONIBLE);
        
        if (biblioteca.registrarPublicacion(libro)) {
            System.out.println("Libro registrado correctamente.");
        }else{
            System.out.println("No fue posible registrar el Libro!!");
        }
            
    }

    public void registrarRevista() {
        String idEjemplar = leerTexto("Id del ejemplar: ");
        String issn = leerTexto("ISSN: ");
        String titulo = leerTexto("Título: ");
        int anio = leerEntero("Año de publicación: ");
        String periodicidad = leerTexto("Periodicidad: ");
        
        if (datosIncompletos(idEjemplar, issn, titulo, periodicidad) || anio < 1) {
            System.out.println("Todos los datos son obligatorios.");
            return;
        }

        Revista revista = new Revista(idEjemplar, issn, titulo, anio, periodicidad, Estado.DISPONIBLE);
        
        if (biblioteca.registrarPublicacion(revista)) {
            System.out.println("Revista registrada correctamente.");
        }else{
            System.out.println("No fue posible registra la Revista");
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
        String idEjemplar = leerTexto("Id del ejemplar que desea buscar: ");
        Publicacion publicacion = biblioteca.buscarPublicacionPorIdEjemplar(idEjemplar);
        if (publicacion == null) {
            System.out.println("No se encontró una publicación con el id: " + idEjemplar);
            return;
        }
        System.out.println(publicacion.devolverDatos());
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
        String idEjemplar = leerTexto("Id del ejemplar que desea eliminar: ");
        if (!biblioteca.existePublicacion(idEjemplar)) {
            System.out.println("No se encontró una publicación con el id: " + idEjemplar);
            return;
        }
        biblioteca.eliminarPublicacion(idEjemplar);
        System.out.println("Publicación eliminada correctamente.");
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
