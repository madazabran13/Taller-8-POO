
package SistemaEstudiante;
import java.util.Comparator;

public class OrdenPorNotas implements Comparator<Estudiante> {
    
    //De mayor a menor
    @Override
    public int compare(Estudiante t, Estudiante t1) {
        if(t.getNota()<t1.getNota()) return 1;
        else if(t.getNota()>t1.getNota()) return -1;
        else return 0; 
    }
}
