package Java.Estudiantes;

public class Curso {
    private int id;
    private String nombre;
    private double calificacion;

    public Curso(int id, String nombre, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
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

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
