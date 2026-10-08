package miPrincipal;
import logica.Persona;
import logica.Alumno;
import logica.Empleado;
import logica.Publicacion;
import logica.Revista;
import logica.Libro;
import java.time.LocalDate;

public class Principal {
    
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("DEMOSTRACIÓN DE HERENCIA DE CLASE BASE PERSONA");
        System.out.println("==============================================");

        Persona p1 = new Persona();
        System.out.println("Nombre de p1:"+p1.getNombre());
        System.out.println("Edad de p1:"+p1.getEdad());
        System.out.println();

        Persona p2 = new Persona("Luisa Calderon",50);
        System.out.println("Nombre de p2:"+p2.getNombre());
        System.out.println("Edad de p2:"+p2.getEdad());
        System.out.println();

        p1.setNombre("Luisito Comunica");
        p1.setEdad(35);
        System.out.println("Nombre de p1 MODIFICADO:"+p1.getNombre());
        System.out.println("Edad de p1 MODIFICADO:"+p1.getEdad());
        System.out.println();

        Alumno a1 = new Alumno();
        System.out.println("Nombre de a1:"+a1.getNombre());
        System.out.println("Edad de a1:"+a1.getEdad());
        System.out.println("Matriculo de a1:"+a1.getMatricula());
        System.out.println();

        Alumno a2 = new Alumno("Carlos Altamirano",18,"20260001");
        System.out.println("Nombre de a2:"+a2.getNombre());
        System.out.println("Edad de a2:"+a2.getEdad());
        System.out.println("Matriculo de a2:"+a2.getMatricula());
        System.out.println();

        a1.setNombre("Helena Garro");
        a1.setEdad(18);
        a1.setMatricula("20260002");
        System.out.println("Nombre de a1 MODIFICADO:"+a1.getNombre());
        System.out.println("Edad de a1 MODIFICADO:"+a1.getEdad());
        System.out.println("Matriculo de a1 MODIFICADO:"+a1.getMatricula());
        System.out.println();

        Empleado e1 = new Empleado();
        System.out.println("Nombre de e1:"+e1.getNombre());
        System.out.println("Edad de e1:"+e1.getEdad());
        System.out.println("Salario de e1:"+e1.getSalario());
        System.out.println();

        Empleado e2 = new Empleado("Juan Perez",40,25000.00);
        System.out.println("Nombre de e2:"+e2.getNombre());
        System.out.println("Edad de e2:"+e2.getEdad());
        System.out.println("Salario de e2:"+e2.getSalario());
        System.out.println();

        //DEMOSTRACIÓN DE CODIGO SOBREESCRITO///
        System.out.println("Persona 1:"+p1.mostrarDatos());
        System.out.println("Persona 2:"+p2.mostrarDatos());
        System.out.println("Persona 3:"+a1.mostrarDatos());
        System.out.println("Persona 4:"+a2.mostrarDatos());
        System.out.println("Persona 5:"+e1.mostrarDatos());
        System.out.println("Persona 6:"+e2.mostrarDatos());
        System.out.println();
        //DEMOSTRACION DEL METODO toString
        int a = 5;
        System.out.println("Numero: "+a);
        System.out.println("Persona 1:"+p1.toString());
        System.out.println("Persona 2:"+p2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(e1);
        System.out.println(e2.toString());
        System.out.println();

        //DEMOSTRACION DE LA JERARQUIA DE CLASES PUBLICACION:LIBRO Y REVISTA
        System.out.println("=================================================================================");
        System.out.println("DEMOSTRACIÓN DE HERENCIA DE CLASE BASE PUBLICACION Y LAS DERIVADA:REVISTA Y LIBRO");
        System.out.println("=================================================================================");
        LocalDate fec1 = LocalDate.of(2009,8,2);
        Publicacion pub1 = new Publicacion("Alfaguara",fec1);
        Libro lib1 = new Libro(pub1.getEditorial(),pub1.getFechaPub(),"ISBN-1","Monica Lavin","Yo, la Peor");
        Revista rev1 = new Revista("National Geographic",LocalDate.of(2020,12,1),"Animales Nocturnos","Trimestral");
        System.out.println(pub1);
        System.out.println(lib1);
        System.out.println("Editorial:"+rev1.getEditorial()+" "+
                        rev1.getFechaPub()+" "+rev1);














        
    }
}