package Java.Estudiantes;

public class Main {
    public static void main(String[] args) {
        Instituto instituto = new Instituto();

        Estudiante estudiante1 = new Estudiante(1, "Ana López", "Pérez", 20);
        Estudiante estudiante2 = new Estudiante(2, "Juan Pérez", "García", 22);

        Profesor profesor1 = new Profesor(1, "Dr. Carlos García");
        Profesor profesor2 = new Profesor(2, "Dra. María Gómez");

        Curso curso1 = new Curso(1, "Matemáticas", 90.0);
        Curso curso2 = new Curso(2, "Historia", 85.0);
        Curso curso3 = new Curso(3, "Ciencias", 95.0);

        instituto.registrarEstudiante(estudiante1);
        instituto.registrarEstudiante(estudiante2);

        instituto.registrarProfesor(profesor1);
        instituto.registrarProfesor(profesor2);

        profesor1.asignarCurso(estudiante1, curso1);
        profesor1.asignarCurso(estudiante2, curso2);
        profesor2.asignarCurso(estudiante1, curso3);

        instituto.mostrarCalificaciones();
    }
}
