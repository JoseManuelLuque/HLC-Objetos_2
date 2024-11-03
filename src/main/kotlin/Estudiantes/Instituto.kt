package Estudiantes

class Instituto {
    val estudiantes = mutableListOf<Estudiante>()
    val profesores = mutableListOf<Profesor>()

    fun registrarEstudiante(estudiante: Estudiante) {
        estudiantes.add(estudiante)
        println("Estudiante registrado: ${estudiante.nombre}")
    }

    fun registrarProfesor(profesor: Profesor) {
        profesores.add(profesor)
        println("Profesor registrado: ${profesor.nombre}")
    }

    fun mostrarCalificaciones() {
        estudiantes.forEach { estudiante ->
            println("Estudiante: ${estudiante.nombre}, Promedio: ${estudiante.calificacionPromedio()}")
        }
    }
}
