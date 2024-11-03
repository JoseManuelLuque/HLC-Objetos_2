package Java.Estudiantes;

public class Profesor {
    private int id;
    private String nombre;

    public Profesor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void asignarCurso(Estudiante estudiante, Curso curso) {
        estudiante.agregarCurso(curso);
        System.out.println("Curso " + curso.getNombre() + " asignado a " + estudiante.getNombre());
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
