package Kotlin.Estudiantes

data class Estudiante(val id: Int, val nombre: String) {
    val cursos = mutableListOf<Curso>()
    fun agregarCurso(curso: Curso) {
        cursos.add(curso)
    }
    fun calificacionPromedio(): Double {
        return cursos.map { it.calificacion }.average()
    }
}
