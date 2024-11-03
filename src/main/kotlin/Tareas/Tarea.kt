package Tareas

data class Tarea(val id: Int, val nombre: String, var completada: Boolean = false) {
    fun marcarCompletada() {
        completada = true
        println("Tarea '$nombre' marcada como completada.")
    }
}
