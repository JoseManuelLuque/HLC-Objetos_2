package Java.Tareas;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Ana López");

        Proyecto proyecto1 = new Proyecto(1, "Proyecto Kotlin");
        Proyecto proyecto2 = new Proyecto(2, "Proyecto Android");

        Tarea tarea1 = new Tarea(1, "Estudiar Kotlin");
        Tarea tarea2 = new Tarea(2, "Desarrollar App");
        Tarea tarea3 = new Tarea(3, "Hacer Pruebas");

        usuario.crearProyecto(proyecto1);
        usuario.crearProyecto(proyecto2);

        usuario.agregarTareaAProyecto(1, tarea1);
        usuario.agregarTareaAProyecto(1, tarea2);
        usuario.agregarTareaAProyecto(2, tarea3);

        usuario.mostrarProyectos();

        usuario.marcarTareaCompletada(1, 1);
        usuario.mostrarProyectos();
    }
}
