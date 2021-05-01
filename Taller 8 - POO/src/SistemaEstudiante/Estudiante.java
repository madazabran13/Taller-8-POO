package SistemaEstudiante;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre, apellido, cc, sexo, condicion;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String cc) {
        this.cc = cc;
    }

    public Estudiante(String nombre, String apellido, String cc, String sexo, String condicion, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.sexo = sexo;
        this.condicion = condicion;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", cc=" + cc + 
                ", sexo=" + sexo + ", condicion=" + condicion + ", nota=" + nota + '}';
    }

    @Override
    public int compareTo(Estudiante e) {
        return this.apellido.compareTo(e.apellido);
        
    }
    
    
}
