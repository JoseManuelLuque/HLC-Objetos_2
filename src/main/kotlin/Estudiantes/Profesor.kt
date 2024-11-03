package Estudiantes

data class Profesor(val id: Int, val nombre: String) {
    fun asignarCurso(estudiante: Estudiante, curso: Curso) {
        estudiante.agregarCurso(curso)
        println("Curso ${curso.nombre} asignado a ${estudiante.nombre}")
    }
}
