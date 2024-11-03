package Java.Tareas;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private int id;
    private String nombre;
    private List<Tarea> tareas;

    public Proyecto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea '" + tarea.getNombre() + "' agregada al proyecto '" + nombre + "'.");
    }

    public void mostrarTareas() {
        System.out.println("Tareas del proyecto '" + nombre + "':");
        for (Tarea tarea : tareas) {
            System.out.println(tarea.getNombre() + " - " + (tarea.isCompletada() ? "Completada" : "Pendiente"));
        }
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
