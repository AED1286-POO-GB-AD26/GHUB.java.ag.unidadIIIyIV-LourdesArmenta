package gestionBiblioteca;
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
                    buscarLibroPorId();
                    break;
                case 3:
                    consultarTodosLosLibros();
                    break;
                case 4:
                    registrarDevolucion();
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
        System.out.println("2. Buscar libro por Id Ejemplar");
        System.out.println("3. Consultar todos los libros");
        System.out.println("4. Eliminar libro");
        System.out.println("0. Salir");
    }
    private String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    private int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un número entero.");
            scanner.next();
            System.out.print(mensaje);
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
    public void eliminarLibro(){

    }

}
