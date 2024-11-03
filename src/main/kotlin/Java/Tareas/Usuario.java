package Java.Tareas;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private List<Proyecto> proyectos;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void crearProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
        System.out.println("Proyecto '" + proyecto.getNombre() + "' creado por " + nombre + ".");
    }

    public void agregarTareaAProyecto(int proyectoId, Tarea tarea) {
        Proyecto proyecto = proyectos.stream().filter(p -> p.getId() == proyectoId).findFirst().orElse(null);
        if (proyecto != null) {
            proyecto.agregarTarea(tarea);
        } else {
            System.out.println("Proyecto con ID " + proyectoId + " no encontrado.");
        }
    }

    public void marcarTareaCompletada(int proyectoId, int tareaId) {
        Proyecto proyecto = proyectos.stream().filter(p -> p.getId() == proyectoId).findFirst().orElse(null);
        if (proyecto != null) {
            Tarea tarea = proyecto.getTareas().stream().filter(t -> t.getId() == tareaId).findFirst().orElse(null);
            if (tarea != null) {
                tarea.marcarCompletada();
            } else {
                System.out.println("Tarea con ID " + tareaId + " no encontrada en el proyecto '" + proyecto.getNombre() + "'.");
            }
        } else {
            System.out.println("Proyecto con ID " + proyectoId + " no encontrado.");
        }
    }

    public void mostrarProyectos() {
        System.out.println("Proyectos de " + nombre + ":");
        proyectos.forEach(Proyecto::mostrarTareas);
    }
}
