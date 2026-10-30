package gestionBiblioteca;
public class Principal{
    public static void main(String args[]){
        Menu menu = new Menu();
        menu.iniciar();
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
        Libro lista[]= bib1.consultarTodosLosLibros();
        for (int i=0;i<lista.length;i++){
            System.out.println("Libro:"+lista[i].getIdEjemplar()+" "+lista[i].getIsbn()+
                " "+lista[i].getTitulo()+" "+lista[i].getAutor());
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