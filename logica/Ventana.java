package logica;
//clase Base
public class Ventana{
    public void copiar(Ventana v){
        System.out.println("Estoy en el método copiar de un argumento de la clase Ventana");

    }
    public void copiar(String p, int x, int y){
        System.out.println("Estoy en el método copiar de tres argumentos de la clase Ventana");
        for(int i= x;i<y;i++){
            System.out.print(p+" ");
        }
        System.out.println();

    }
    protected void copiar(String cadena){
        System.out.println("Estoy en el método copiar de la clase Ventada con"+
            " un parámetro tipo cadena"
        );
    }
   


}