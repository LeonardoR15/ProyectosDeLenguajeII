package ar.edu.itec1.view;

import ar.edu.itec1.entity.Libro;
import ar.edu.itec1.service.LibroService;
import ar.edu.itec1.util.ConsoleReader;

public class Libro2View {
    private final LibroService libroService;

    public Libro2View(LibroService libroService) {
        this.libroService = libroService;
    }

    public void eliminarLibro(){
        // Muestra los libros disponibles antes de pedir el isbn a borrar.
        System.out.println("Libros disponibles:");
        System.out.println("ISBN | Autor | Titulo");
        for (Libro libro : this.libroService.getLibros()) {
            System.out.println(libro.getIsbn() + " | " + libro.getAutor() + " | " + libro.getTitulo());
        }

        System.out.println("Ingresar isbn del libro a eliminar:");
        String isbn = ConsoleReader.readString();

        boolean eliminado = this.libroService.eliminarLibro(isbn);

        if (eliminado) {
            System.out.println("Libro eliminado");
            System.out.println("Mostrando lista de libros actualizada");
            for (Libro libro : this.libroService.getLibros()) {
                System.out.println(libro.getIsbn() + " | " + libro.getAutor() + " | " + libro.getTitulo());
            }
        } else {
            System.out.println("No se encontro un libro con ese isbn");
        }
    }
}
