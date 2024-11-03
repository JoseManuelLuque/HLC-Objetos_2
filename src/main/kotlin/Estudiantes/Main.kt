package Estudiantes

fun main() {
    val instituto = Instituto()

    val estudiante1 = Estudiante(1, "Manolo lopez")
    val estudiante2 = Estudiante(2, "Emilio Luque")

    val profesor1 = Profesor(1, "Carlos García")
    val profesor2 = Profesor(2, "María Gómez")

    val curso1 = Curso(1, "Matemáticas", 90.0)
    val curso2 = Curso(2, "Historia", 85.0)
    val curso3 = Curso(3, "Ciencias", 95.0)

    instituto.registrarEstudiante(estudiante1)
    instituto.registrarEstudiante(estudiante2)

    instituto.registrarProfesor(profesor1)
    instituto.registrarProfesor(profesor2)

    profesor1.asignarCurso(estudiante1, curso1)
    profesor1.asignarCurso(estudiante2, curso2)
    profesor2.asignarCurso(estudiante1, curso3)

    instituto.mostrarCalificaciones()
}
