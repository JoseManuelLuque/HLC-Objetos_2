package Kotlin.Tareas

fun main() {
    val usuario = Usuario(1, "Ana López")

    val proyecto1 = Proyecto(1, "Proyecto Kotlin")
    val proyecto2 = Proyecto(2, "Proyecto Android")

    val tarea1 = Tarea(1, "Kotlin")
    val tarea2 = Tarea(2, "Desarrollar App")
    val tarea3 = Tarea(3, "Hacer Pruebas")

    usuario.crearProyecto(proyecto1)
    usuario.crearProyecto(proyecto2)

    usuario.agregarTareaAProyecto(1, tarea1)
    usuario.agregarTareaAProyecto(1, tarea2)
    usuario.agregarTareaAProyecto(2, tarea3)

    usuario.mostrarProyectos()

    usuario.marcarTareaCompletada(1, 1)
    usuario.mostrarProyectos()
}
