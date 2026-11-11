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
import java.util.ArrayList;

import logica.Estado;
import logica.DiaSemana;
import logica.Solicitud;

import logica.Animal;
import logica.Perro;
import logica.Gato;
import logica.Pajaro;
import interfases.CriterioEdad;
import interfases.CriterioEstNombre;
import interfases.CriterioEstProm;
import interfases.Estudiante;
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

        System.out.println("==================================");
        System.out.println("    DEMOSTRACION DE ARRAYLIST     ");
        System.out.println("==================================");
        ArrayList<String> lista_nombres = new ArrayList<String>();
        //inserto elementos
        lista_nombres.add("Ana");
        lista_nombres.add("Luis");
        lista_nombres.add("Carlos");
        //recupero los elementos
        System.out.println(lista_nombres.get(2));
        System.out.println(lista_nombres.get(1));
        System.out.println(lista_nombres.get(0));

        //Recorro todos los elementos de la coleccion
        System.out.println();
        for(int i=0;i<lista_nombres.size();i++){
            System.out.println(lista_nombres.get(i));
        }
        System.out.println();

        ArrayList<String> lista_frutas = new ArrayList<>();
        lista_frutas.add("manzana");
        lista_frutas.add("banana");
        lista_frutas.add("naranja");
        for(int i=0;i<lista_frutas.size();i++){
            System.out.println(lista_frutas.get(i));
        }
        lista_frutas.add(1,"fresa");
        System.out.println("Recorrido después de insertar fresa en la posion 1:");
        for(int i=0;i<lista_frutas.size();i++){
            System.out.println(lista_frutas.get(i));
        }
        String fruta= lista_frutas.get(2);
        System.out.println("El elemento que se encuentra en la posicion 2 ="+fruta);

        int cantidad = lista_frutas.size();
        System.out.println("El tamaño de la lista de frutas="+cantidad);

        //set se utiliza para reemplazar elementos
        lista_frutas.set(0,"Pera");
        System.out.println("Lista de frutas después de reemplazar la posicion 0:");
        for(int i=0;i<lista_frutas.size();i++){
            System.out.println(lista_frutas.get(i));
        }
        System.out.println(lista_frutas.toString());
        lista_frutas.remove(1);
        System.out.println(lista_frutas);
        lista_frutas.remove("banana");
        System.out.println(lista_frutas);
        if (lista_frutas.remove("berry"))
            System.out.println("Elemento eliminado");
        else{
            System.out.println("No se encontro el elemento");
        }
        System.out.println(lista_frutas);
        //System.out.println(lista_frutas.get(2));
        int pos= lista_frutas.indexOf("naranja");
        System.out.println("La posicion de naranja = "+pos);
        pos= lista_frutas.indexOf("Naranja");
        System.out.println("La posicion de Naranja = "+pos);
        boolean encontrado = lista_frutas.contains("naranja");
        System.out.println(encontrado);
        encontrado = lista_frutas.contains("fresa");
        System.out.println(encontrado);
        if(lista_frutas.isEmpty())
            System.out.println("La lista esta vacia");
        else
            System.out.println("La lista NO ESTA VACIA");
        lista_frutas.clear();
        if(lista_frutas.isEmpty())
            System.out.println("La lista esta vacia");
        else
            System.out.println("La lista NO ESTA VACIA");

        System.out.println("==================================");
        System.out.println("    DEMOSTRACION DE ENUM          ");
        System.out.println("==================================");
        //forma 1 utlizando enum
        Estado estado = Estado.ACEPTADA;
        System.out.println("El estado = "+estado);
        //forma 2 utilizando String
        String estado1 = "PEENDIENTE";
        System.out.println("El estado = "+estado1);

        DiaSemana dia = DiaSemana.MIERCOLES;
        if(dia==DiaSemana.MIERCOLES){
            System.out.println("Estoy a mitad de la semana");
        }
        System.out.println("Dia de la semana:"+dia);
        System.out.println("Dia de la semana:"+dia.name());
        System.out.println("Dia de la semana:"+dia.ordinal());
        dia = DiaSemana.VIERNES;
        System.out.println("Dia de la semana:"+dia.ordinal());
        DiaSemana arreglo_dias[] = DiaSemana.values();
        //recorro el arreglo de dias de la semana
        for(int i=0;i<arreglo_dias.length;i++){
            System.out.println("Dia :"+i+":"+arreglo_dias[i].name());
        }
        System.out.println("Recorro el arreglo utilizando iteradores:");
        for(DiaSemana d:arreglo_dias){
            System.out.println("Dia: "+d.name());
        }
        switch (dia) {
            case LUNES:
                System.out.println("Hola, hoy es Lunes");
                break;
            case MARTES:
                 System.out.println("Hola, hoy es Martes");
                 break;
            case MIERCOLES:
                 System.out.println("Hola, hoy es Miercoles");
                 break;
            case JUEVES:
                 System.out.println("Hola, hoy es Jueves");
                 break;
            case VIERNES:
                 System.out.println("Hola, hoy es Viernes");
                 break;
            case SABADO:
                 System.out.println("Hola, hoy es Sábado");
                 break;
            case DOMINGO:
                 System.out.println("Hola, hoy es Domingo");
                 break;
            default:
                System.out.println("Incorrecto!!!");
                break;
        }
        dia = DiaSemana.MARTES;
        Estado edo1 = Estado.EN_REVISION;
        switch (edo1) {
            case ACEPTADA:
                System.out.println("Solicitua aceptada....");
                break;
            case EN_REVISION:
                System.out.println("Solicitud en revisión....");
                break;
            case RECHAZADA:
                System.out.println("Solicitua rechazada....");
                break;
            case RECIBIDA:
                System.out.println("Solicitua recibida....");
                break;
            default:
                break;
        }

        Estado lista_estados[] = Estado.values();
        System.out.println("Recorro los valores de estados:");
        for(Estado ele: lista_estados){
            System.out.println(ele);
        }
        Solicitud sol = new Solicitud(125,"Solicitud de Empleo",
                        "Juan Lopez",Estado.RECIBIDA);
        System.out.println(sol);
        sol.setEstado(Estado.EN_REVISION);
        System.out.println(sol);
        sol.setEstado(Estado.ACEPTADA);
        System.out.println(sol);
        edo1 = sol.getEstado();

        switch (edo1) {
            case ACEPTADA:
                System.out.println("Solicitua aceptada....");
                break;
            case EN_REVISION:
                System.out.println("Solicitud en revisión....");
                break;
            case RECHAZADA:
                System.out.println("Solicitua rechazada....");
                break;
            case RECIBIDA:
                System.out.println("Solicitua recibida....");
                break;
            default:
                break;
        }
        System.out.println("=====================================");
        System.out.println("    DEMOSTRACION DE POLIMORFISMO     ");
        System.out.println("=====================================");
        //crear un arreglo de animales
        Gato gato = new Gato();
        Pajaro pajaro = new Pajaro();
        Perro perro = new Perro();
        Animal [] arreglo_animales ={perro,gato,pajaro};
        Animal [] arreglo_animales2= {new Gato(),new Pajaro(),new Perro()};
        //recorrer el arreglo de aninales 1}
        System.out.println("Recorro el primer arreglo de animales:");
        for(int i=0;i<arreglo_animales.length;i++){
            arreglo_animales[i].hacerSonido();
        }
        //recorrer el arreglo de aninales 2
        System.out.println("Recorro el segundo arreglo de animales:");
        for(int i=0;i<arreglo_animales2.length;i++){
            arreglo_animales2[i].hacerSonido();
        }
        ArrayList<Animal> lista_animales = new ArrayList<Animal>();
        lista_animales.add(perro);
        lista_animales.add(gato);
        lista_animales.add(pajaro);
        System.out.println("Recorro la arrayList de animales usando indices:");
        for(int i=0;i<lista_animales.size();i++){
            lista_animales.get(i).hacerSonido();

        }
        System.out.println("Recorro la arrayList de animales usando iteradores:");
        for(Animal an:lista_animales){
            an.hacerSonido();

        }
        //Animal animal = new Animal(); error no se puede instanciar proque ahora animal es abtracta
        //animal.hacerSonido();
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        Animal animal3 = new Pajaro();
        animal1.hacerSonido();
        animal2.hacerSonido();
        animal3.hacerSonido();
        animal1.moverse();
        Animal animal4 = new Perro("Mila");
        animal4.hacerSonido();
        animal4.dormir();
        animal2.setNombre("Preciosa");
        animal2.dormir();
        //ejemplo de variable polimorfica
        Animal animal5 = new Perro("Chocolate");
        animal5.hacerSonido();
        animal5 = new Gato("Alejandrita");
        animal5.hacerSonido();
        animal5 = new Pajaro("Piolin");
        animal5.hacerSonido();

        Animal animal6 = new Gato("Tiki");
        animal6 = new Perro();

        //Ejemplo de uso de Interfases

        interfases.Animal perro3 = new interfases.Perro();
        perro3.hacerSonido();
        perro3.moverse();
        

        interfases.Animal gato3 = new interfases.Gato();
        gato3.hacerSonido();
        gato3.moverse();

        perro3 = gato3; //esto es posible porque perro3 es una variable polimorfica

        interfases.Perro perro4 = new interfases.Perro();
        perro4.hacerSonido();
        perro4.moverse();

        interfases.Gato gato4 = new interfases.Gato();
        gato4.hacerSonido();
        gato4.moverse();

        //perro4=gato4; //esto no es posible proque perro4 NO ES una variable ´polimorfica

        interfases.Cachorro conejito1 = new interfases.Conejito();
        conejito1.hacerSonido();
        conejito1.moverse();
        conejito1.jugar();

        interfases.Conejito conejito2 = new interfases.Conejito();
        conejito2.hacerSonido();
        conejito2.moverse();
        conejito2.jugar();

        //uso de interfase Comparables
        String nombre1 = "Zulema";
        String nombre2 = "Zulema";
        if(nombre1.compareTo(nombre2)>0){
            System.out.println(nombre1+" es mayor que "+nombre2);
        }else if(nombre1.compareTo(nombre2)<0){
            System.out.println(nombre2+ " es mayor que "+nombre1);
        }else{
            System.out.println(nombre1 + " es igual que "+nombre2);
        }
        //comparar dos estudiantes
        Estudiante est1 = new Estudiante("Juan",18,85.5);
        Estudiante est2 = new Estudiante("Juan",18,95.0);
        if(est1.compareTo(est2)>0){
            System.out.println(est1.getNombre()+" en base al nombre es Mayor que "+
                est2.getNombre());
        }else if(est1.compareTo(est2)<0){
            System.out.println(est2.getNombre()+" en base al nombre es Mayor que "+
                est1.getNombre());

        }else{
            System.out.println(est1.getNombre()+" en base al nombre  es igual que "+
                est2.getNombre());

        }
        //definimo, ordenamos y mostramos un array de estudiantes
        Estudiante arr[]={new Estudiante("Juan",20,85.0),
                          new Estudiante("Pedro",18,75.5),
                          new Estudiante("Alberto",19,70.0)
                        };
        interfases.Util.ordenar(arr);
        //mostrar el arreglo ordenado
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }
        Estudiante arr2[]={new Estudiante("Juan",20,85.0),
                          new Estudiante("Pedro",18,75.5),
                          new Estudiante("Alberto",19,70.0)
                        };
        interfases.Util.ordenar(arr2,new CriterioEstNombre());
        System.out.println("Ordenamos en base a nombre");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i].toString());
        }
        interfases.Util.ordenar(arr2,new CriterioEstProm());
        System.out.println("Ordenamos en base a promedio");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i].toString());
        }
        interfases.Util.ordenar(arr2,new CriterioEdad());
        System.out.println("Ordenamos en base a Edad");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i].toString());
        }


       








    }
}