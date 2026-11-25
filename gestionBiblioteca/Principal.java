package gestionBiblioteca;
public class Principal{
    public static void main(String args[]){
        try {
            Menu menu = new Menu();
            menu.iniciar();
        } catch (Exception e) {
            // Captura un error no previsto para evitar que el programa termine sin un mensaje.
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        /* 
        Biblioteca bib1 = new Biblioteca();
        Libro lib1 = new Libro("1","ISBN-1","El llano en llamas","Juan Rulfo");
        Libro lib2 = new Libro("2","ISBN-2","Rayuela","Julio Cortazar");
        Libro lib3 = new Libro("3","ISBN-3","Yo, la Peor","Monica Lavin");
        bib1.registrarLibro(lib1);
        bib1.registrarLibro(lib2);
        bib1.registrarLibro(lib3);
        bib1.registrarLibro("4","ISBN-4","Harry Potter","Joanne Rowllin");
        bib1.registrarLibro("4","ISBN-5","El Señor de los Anillos","John Ronald Reuel");
        java.util.ArrayList<Libro> lista = bib1.consultarTodosLosLibros();
        for (Libro libro : lista) {
            System.out.println("Libro:" + libro.getIdEjemplar() + " " + libro.getIsbn() +
                " " + libro.getTitulo() + " " + libro.getAutor());
        }
        Libro libro = bib1.buscarLibroPorIdEjemplar("3");
        if(libro != null){
            System.out.println(libro.devolverDatos());
        }else{
            System.out.println("Libro con idEjemplar = 3 no existe");
        }
        libro = bib1.buscarLibroPorIdEjemplar("5");
        if(libro != null){
            System.out.println(libro.devolverDatos());
        }else{
            System.out.println("Libro con idEjemplar = 5 no existe");
        }
        if(bib1.existeLibro(lib3.getIdEjemplar())){
            System.out.println("Si existe el libro y es:"+lib3.devolverDatos());

        }
    */
        
    }
}