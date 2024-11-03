package Java.Estudiantes;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private List<Curso> cursos;

    public Estudiante(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cursos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public double calificacionPromedio() {
        return cursos.stream().mapToDouble(Curso::getCalificacion).average().orElse(0.0);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", cursos=" + cursos +
                '}';
    }
}
