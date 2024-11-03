package Java.Tareas;

public class Tarea {
    private int id;
    private String nombre;
    private boolean completada;

    public Tarea(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarCompletada() {
        this.completada = true;
        System.out.println("Tarea '" + nombre + "' marcada como completada.");
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", completada=" + completada +
                '}';
    }
}
