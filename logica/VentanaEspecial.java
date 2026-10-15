package logica;
public class VentanaEspecial extends Ventana{
    public void copiar(char c, int veces,int x,int y ){
        System.out.println("estoy en el metodo copia de VentanaEspecial con 4 argumentos");
        for(int i=0;i<veces;i++){
            System.out.print(c);
        }
        System.out.println();

    }
    public void copiar(Ventana v){
        System.out.println("ESTOY SOBREESCRIBIENDO EL METODO COPIAR CON UN ARGUMENTO TIPO VENTANA");

    }
    

}