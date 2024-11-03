package Java.Estudiantes;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;

    public Instituto() {
        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante registrado: " + estudiante.getNombre());
    }

    public void registrarProfesor(Profesor profesor) {
        profesores.add(profesor);
        System.out.println("Profesor registrado: " + profesor.getNombre());
    }

    public void mostrarCalificaciones() {
        estudiantes.forEach(estudiante -> {
            System.out.println("Estudiante: " + estudiante.getNombre() + ", Promedio: " + estudiante.calificacionPromedio());
        });
    }

    // Getters y Setters
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
