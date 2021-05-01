package Ppal;

import SistemaEstudiante.OrdenPorNotas;
import SistemaEstudiante.OrdenPorNota;
import SistemaEstudiante.Estudiante;
import java.util.*;

public class Ppal {

    public static void main(String[] args) {

        List<Estudiante> listado = new ArrayList(); // crea la coleccion
        
        Estudiante Miguel = new Estudiante("Miguel", "Daza", "621","Hombre","Regular", 4.5);
        Estudiante Kailen = new Estudiante("Kailen", "Lizarazo", "644","Mujer","Condicional", 4.6);
        Estudiante Thiago = new Estudiante("Thiago", "Dali", "365","Hombre","Condicional",4.8);
        
        // adiciona elementos a la coleccion 
        GestionColeccion.addElemento(listado, Miguel);
        GestionColeccion.addElemento(listado, Kailen);
        GestionColeccion.addElemento(listado, Thiago);
        
        System.out.println("*Algoritmos y Programacion III ** ");
        GestionColeccion.imprimirElementos(listado);
        
        System.out.println("**Estudiantes: Nombre - Condicion ** ");
        GestionColeccion.imprimirElement(listado);
        
        System.out.println("**Orden por notas (mayor a menor)** ");
        GestionColeccion.ordenarColeccion(listado, new OrdenPorNotas());
        
        System.out.println("**Orden por notas (menor a mayor)** ");
        GestionColeccion.ordenarColeccion(listado, new OrdenPorNota());
        
        System.out.println("**Estudiantes: Nombre-Apellido ** ");
        GestionColeccion.imprimirElementoss(listado);   
    }
}
