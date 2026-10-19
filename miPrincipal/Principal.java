package miPrincipal;
import logica.Persona;
import logica.Alumno;
import logica.Empleado;
import logica.Publicacion;
import logica.Revista;
import logica.Libro;
import java.time.LocalDate;
import logica.Fecha;
import logica.FechaDetallada;
import logica.Ventana;
import logica.VentanaEspecial;
import logica.Barco;
import logica.DeVapor;
import logica.Velero;
import logica.Carguero;

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

     
        System.out.println("=================================================================================");
        System.out.println("DEMOSTRACIÓN DE HERENCIA DE CLASE BASE FECHA Y LA FECHADETALLADA");
        System.out.println("=================================================================================");
        Fecha f1 = new Fecha(12,10,2026);
        System.out.println(f1.toString());
        Fecha f2 = new Fecha();
        System.out.println(f2);
        f2.setAnio(2026);
        f2.setMes(12);
        f2.setDia(24);
        System.out.println(f2); 
        FechaDetallada f3 = new FechaDetallada(12,10 ,2026);
        System.out.println(f3);

        FechaDetallada f4 = new FechaDetallada();
        System.out.println(f4);

        int b = 5;
        int c = 5;
        System.out.println("b es "+b+ " igual a c es "+c+" ? "+ (b==c));

        String c1 = "hola";
        String c2 = "hola";

        System.out.println("c1 es "+c1+ " igual a c2 es "+c2+" ? "+ (c1.equals(c2)));

        System.out.println("f1 es "+f1+ " igual a f3 es "+f3+" ? "+ (f1.equals(f3)));

        FechaDetallada f5 = new FechaDetallada(1,1,2026);
        FechaDetallada f6 = new FechaDetallada(2,1,2026);
        System.out.println("La fecha:"+f5+" es igual a la fecha;"+f6+" ? "+f5.equals(f6));

        f6.setDia(1);
        System.out.println("La fecha:"+f5+" es igual a la fecha;"+f6+" ? "+f5.equals(f6));

        System.out.println("La fecha f5:"+f5+" es bisiesto? "+Fecha.esBisiesto(f5.getAnio()));
        f5.setAnio(2028);
        System.out.println("La fecha f5:"+f5+" es bisiesto? "+Fecha.esBisiesto(f5.getAnio()));

        /* 
        //DEJA DE FUNCIONA PORQUE AHORA EL METODO getMeses es un método estático, es decir
        //ES UN METODO QUE CORRESPONDE A LA CLASE Y NO A LOS OBJETOS
        String arreglo[]=f6.getMeses();
        System.out.println("Los meses de la fecha:"+f6+" son:");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
            
        }
        System.out.println();
        
        arreglo = f5.getMeses();
        System.out.println("Los meses de la fecha:"+f5+" son:");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
            
        }
        System.out.println();
        */

        System.out.println("Los meses de la fecha detallada son:");
        /* 
        //DEJO DE FUNCIONAR PORQUE AHORA el método getMeses, me retorna
        //una cadena formado por los elementos del arreglo
        String arreglo[] = FechaDetallada.getMeses();
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
            
        }
        System.out.println();
        */
       System.out.println(FechaDetallada.getMeses());
       System.out.println("Cantidad de Fechas Detalladas creada:"+FechaDetallada.getCant());

       System.out.println("================================================");
        System.out.println("DEMOSTRACIÓN DE LA SOBRECARGA EN CLASES DERIVADA");
        System.out.println("===============================================");

        VentanaEspecial mv = new VentanaEspecial();
        Ventana w = new Ventana();

        mv.copiar("*******",10,15);
        mv.copiar(w);
        mv.copiar('+',20,5,10);

        mv.copiar("hola");

        System.out.println("======================================================================");
        System.out.println("DEMOSTRACIÓN DE CONVERSIÓN ENTRE OBJETOS DE CLASE DERIVADA Y CLASE BASE");
        System.out.println("========================================================================");

        Barco barco1 = new Barco();
        System.out.println(barco1.saludo("hi"));
        DeVapor dv1 = new DeVapor();
        System.out.println(dv1.saludo("nameste"));
        Velero v1 = new Velero();
        System.out.println(v1.saludo("kon'nichiwa"));
        Carguero carg1 = new Carguero();
        System.out.println(carg1.saludo("hallo"));
        
        // CONVERSIONES DE TIPO
        barco1 = v1; //conversion automática DE UNA DERVIDA A SU BASE

        barco1 = dv1; //conversion automatica DE UNA DERIVADA A SU BASE

        barco1 = carg1;//conversion automatica de UNA DERVIDA A SU BASEB

        Barco b2;
        DeVapor dv2;
        Carguero carg2 = new Carguero();
        Velero v2 = new Velero();
        b2 = carg2; //conversio automática
        dv2 = carg2; // conversion automatica
        //v2 = carg2; //no se puede convertir porque no esta dentro de su jerarquia
        
        Barco[] arreglo_barcos = new Barco[3];
        DeVapor dv3 = new DeVapor();
        System.out.println();
        Velero v3 = new Velero();
        Carguero carg3 = new Carguero();
        arreglo_barcos[0] = dv3;
        arreglo_barcos[1] = v3;
        arreglo_barcos[2] = carg3;
        for(int i=0;i<arreglo_barcos.length;){
            arreglo_barcos[i++].alarma();
        
        }











        









        
    }
}