package Kotlin.Biblioteca

fun main() {
    val biblioteca = Biblioteca()

    val libro1 = Libro(1, "Hola", "Josema")
    val libro2 = Libro(2, "Adios", "Chemi")

    val usuario1 = Usuario(1, "Jose Manuel")
    val usuario2 = Usuario(2, "Paco")

    biblioteca.agregarLibro(libro1)
    biblioteca.agregarLibro(libro2)

    biblioteca.registrarUsuario(usuario1)
    biblioteca.registrarUsuario(usuario2)

    biblioteca.prestarLibro(1, 1)
    biblioteca.prestarLibro(2, 2)

    biblioteca.mostrarPrestamos()

    biblioteca.devolverLibro(1)
    biblioteca.devolverLibro(2)
}
