package Java.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario);
    }

    public void prestarLibro(int libroId, int usuarioId) {
        Libro libro = libros.stream().filter(l -> l.getId() == libroId).findFirst().orElse(null);
        Usuario usuario = usuarios.stream().filter(u -> u.getId() == usuarioId).findFirst().orElse(null);

        if (libro == null) {
            System.out.println("El libro con ID " + libroId + " no existe.");
            return;
        }
        if (usuario == null) {
            System.out.println("El usuario con ID " + usuarioId + " no existe.");
            return;
        }
        if (libro.isPrestado()) {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está prestado.");
            return;
        }

        libro.setPrestado(true);
        System.out.println("Libro '" + libro.getTitulo() + "' prestado a " + usuario.getNombre() + ".");
    }

    public void devolverLibro(int libroId) {
        Libro libro = libros.stream().filter(l -> l.getId() == libroId).findFirst().orElse(null);

        if (libro == null) {
            System.out.println("El libro con ID " + libroId + " no existe.");
            return;
        }
        if (!libro.isPrestado()) {
            System.out.println("El libro '" + libro.getTitulo() + "' no estaba prestado.");
            return;
        }

        libro.setPrestado(false);
        System.out.println("Libro '" + libro.getTitulo() + "' devuelto.");
    }

    public void mostrarPrestamos() {
        libros.stream().filter(Libro::isPrestado).forEach(libro -> {
            System.out.println("Libro '" + libro.getTitulo() + "' está prestado.");
        });
    }
}
