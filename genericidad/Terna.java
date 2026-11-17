package genericidad;

public class Terna <T>{
    //atributos
    private T p1;
    private T p2;
    private T p3;
    //constructor
    public Terna(){
        p1 = null;
        p2 = null;
        p3 = null;
    }
    public Terna(T p1, T p2, T p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    //getter
    public T get(int i){
        if(i<1 || i>3){
            System.out.println("Posición incorrecta");
            return null;
        }
        if(i==1)
            return p1;
        
        if(i==2)
            return p2;
        
        if(i==3)
            return p3;
        return null;
        
    }
    //setter
    public void set(T valor, int i){
        if(i<1 || i>3){
            System.out.println("Posición incorrecta");
            return;
        }
        if(i==1)
            p1=valor;
        
        if(i==2)
            p2=valor;
        
        if(i==3)
            p3=valor;

    }
    @Override 
    public String toString(){
        return "Terna: "+p1+", "+p2+", "+p3;
    }

    
}
