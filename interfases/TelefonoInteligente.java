package interfases;

public class TelefonoInteligente implements Telefono,Camara {
    @Override
    public void hacerLlamadas() {
        System.out.println("El telefono inteligente puede hacer llamadas");    
    }
    @Override
    public void tomarFotos() {
        System.out.println("El telegono inteligente puede tomar fotos");  
    }
}
