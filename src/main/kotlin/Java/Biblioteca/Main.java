package Java.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro(1, "Hola", "Josema");
        Libro libro2 = new Libro(2, "Adios", "Chemi");

        Usuario usuario1 = new Usuario(1, "Jose Manuel");
        Usuario usuario2 = new Usuario(2, "Paco");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        biblioteca.prestarLibro(1, 1);
        biblioteca.prestarLibro(2, 2);

        biblioteca.mostrarPrestamos();

        biblioteca.devolverLibro(1);
        biblioteca.devolverLibro(2);
    }
}
