package Integrador;

public class EstudianteServicio {
    Estudiante nuevoEstudiante = new Estudiante();
    public void crearEstudiante(String nombre, double nota){
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setNota(nota);
    }
}
