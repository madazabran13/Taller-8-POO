package Ppal;
import java.util.*;
import SistemaEstudiante.Estudiante;

public class GestionColeccion {
    
    
    public static void addElemento(List<Estudiante> lista, Estudiante e){
        lista.add(e);
    }
    
    public static void imprimirElementos(List<Estudiante> lista){
        System.out.println("* * Listado * * ");
        System.out.printf("%-20s %-20s %-20s %s%n", "Cedula", "Nombre", "Apellido", "Nota");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Estudiante e : lista) {
            System.out.printf("%-20s %-20s %-20s %.2f%n", 
                              e.getCc(), 
                              e.getNombre(), 
                              e.getApellido(), 
                              e.getNota());
        }
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
    public static void addElementos(List<Estudiante> lista, Estudiante e1){
        lista.add(e1);
    }
    
    public static void imprimirElementoss(List<Estudiante> lista){
        System.out.println("* * Listado * * ");
        System.out.printf(" %-20s %-20s%n","Nombre","Apellido");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Estudiante e1 : lista) {
            System.out.printf("%-20s %-20s%n", e1.getNombre(),e1.getApellido() );
        }
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
    
    public static void ordenarColeccion(List<Estudiante> lista, Comparator orden){
        List<Estudiante> listaOrdenada = new ArrayList(lista);
        if(orden!=null)
            Collections.sort(listaOrdenada, orden);
        else
            Collections.sort(listaOrdenada);
        
        imprimirElementos(listaOrdenada);
    }
  
    public static void ordenarColeccion(List<Estudiante> lista){
        ordenarColeccion(lista, null);
    }
    
    public static void addElement(List<Estudiante> lista, Estudiante e2){
        lista.add(e2);
    }
    
    public static void imprimirElement(List<Estudiante> lista){
        System.out.println("* * Listado * * ");
        System.out.printf("%-20s %-20s%n","Nombre", "Condicion");
        System.out.println("----------------------------------------------------------------------------------------");
       
        for (Estudiante e2 : lista) {
            if (e2.getCondicion() == "Condicional"){
                 System.out.printf("%-20s %-20s%n",  e2.getNombre(),e2.getCondicion());
            }
            
        }
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
}
