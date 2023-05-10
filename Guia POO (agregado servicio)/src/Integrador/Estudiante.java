package Integrador;

public class Estudiante {
    String nombre;
    Double nota;
    public Estudiante(){
        
    }
    
    public Estudiante(String nombre, Double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Double getNota(){
        return this.nota;
    }
}
