package miPrincipal;
import logica.Persona;
import logica.Alumno;
import logica.Empleado;

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














        
    }
}