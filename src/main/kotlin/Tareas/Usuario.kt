package Tareas

data class Usuario(val id: Int, val nombre: String) {
    val proyectos = mutableListOf<Proyecto>()

    fun crearProyecto(proyecto: Proyecto) {
        proyectos.add(proyecto)
        println("Proyecto '${proyecto.nombre}' creado por $nombre.")
    }

    fun agregarTareaAProyecto(proyectoId: Int, tarea: Tarea) {
        val proyecto = proyectos.find { it.id == proyectoId }
        if (proyecto != null) {
            proyecto.agregarTarea(tarea)
        } else {
            println("Proyecto con ID $proyectoId no encontrado.")
        }
    }

    fun marcarTareaCompletada(proyectoId: Int, tareaId: Int) {
        val proyecto = proyectos.find { it.id == proyectoId }
        if (proyecto != null) {
            val tarea = proyecto.tareas.find { it.id == tareaId }
            if (tarea != null) {
                tarea.marcarCompletada()
            } else {
                println("Tarea con ID $tareaId no encontrada en el proyecto '${proyecto.nombre}'.")
            }
        } else {
            println("Proyecto con ID $proyectoId no encontrado.")
        }
    }

    fun mostrarProyectos() {
        println("Proyectos de $nombre:")
        proyectos.forEach { proyecto ->
            proyecto.mostrarTareas()
        }
    }
}
