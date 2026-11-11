package interfases;

public class CriterioEstProm extends Criterio<Estudiante>{

    @Override
    public int comparar(Estudiante a, Estudiante b) {
       double diff = a.getPromedio() - b.getPromedio();
       return diff>0 ? 1 : diff<0? -1: 0;

    }
    
    
}
