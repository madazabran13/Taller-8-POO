package SistemaEstudiante;

import java.util.Comparator;

public class OrdenPorCondicion implements Comparator<Estudiante> {
    
    @Override
    public int compare(Estudiante t, Estudiante t1) {
        return t.getCondicion().compareTo(t1.getCondicion());
    }
}
