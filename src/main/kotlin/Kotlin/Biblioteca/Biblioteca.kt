package Kotlin.Biblioteca

class Biblioteca {
    private val libros = mutableListOf<Libro>()
    private val usuarios = mutableListOf<Usuario>()
    private val prestamos = mutableMapOf<Int, Int>() // Map<LibroID, UsuarioID>

    fun agregarLibro(libro: Libro) {
        libros.add(libro)
        println("Libro agregado: $libro")
    }

    fun registrarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
        println("Usuario registrado: $usuario")
    }

    fun prestarLibro(libroId: Int, usuarioId: Int) {
        val libro = libros.find { it.id == libroId }
        val usuario = usuarios.find { it.id == usuarioId }

        if (libro == null) {
            println("El libro con ID $libroId no existe.")
            return
        }
        if (usuario == null) {
            println("El usuario con ID $usuarioId no existe.")
            return
        }
        if (libro.prestado) {
            println("El libro '${libro.titulo}' ya está prestado.")
            return
        }

        libro.prestado = true
        prestamos[libroId] = usuarioId
        println("Libro '${libro.titulo}' prestado a ${usuario.nombre}.")
    }

    fun devolverLibro(libroId: Int) {
        val libro = libros.find { it.id == libroId }

        if (libro == null) {
            println("El libro con ID $libroId no existe.")
            return
        }
        if (!libro.prestado) {
            println("El libro '${libro.titulo}' no estaba prestado.")
            return
        }

        libro.prestado = false
        prestamos.remove(libroId)
        println("Libro '${libro.titulo}' devuelto.")
    }

    fun mostrarPrestamos() {
        prestamos.forEach { (libroId, usuarioId) ->
            val libro = libros.find { it.id == libroId }
            val usuario = usuarios.find { it.id == usuarioId }
            if (libro != null && usuario != null) {
                println("Libro '${libro.titulo}' prestado a ${usuario.nombre}.")
            }
        }
    }
}
