package Kotlin.Tareas

data class Proyecto(val id: Int, val nombre: String) {
    val tareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
        println("Tarea '${tarea.nombre}' agregada al proyecto '$nombre'.")
    }

    fun mostrarTareas() {
        println("Tareas del proyecto '$nombre':")
        tareas.forEach { tarea ->
            println("${tarea.nombre} - ${if (tarea.completada) "Completada" else "Pendiente"}")
        }
    }
}
