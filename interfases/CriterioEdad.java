package interfases;

public class CriterioEdad extends Criterio<Estudiante>{

    @Override
    public int comparar(Estudiante a, Estudiante b) {
        
        return a.getEdad()-b.getEdad();
    }
    
    
}
