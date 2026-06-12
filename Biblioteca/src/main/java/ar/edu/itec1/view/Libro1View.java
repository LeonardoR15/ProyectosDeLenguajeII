package ar.edu.itec1.view;

import ar.edu.itec1.service.LibroService;
import ar.edu.itec1.util.ConsoleReader;

public class Libro1View {
    private final LibroService libroService;

    public Libro1View(LibroService libroService) {
        this.libroService = libroService;
    }

    public void agregarLibro(){
        // Pide los datos del libro y delega el guardado al service.
        System.out.println("Ingresar autor del libro:");
        String autor = ConsoleReader.readString();

        System.out.println("Ingresar titulo del libro:");
        String titulo = ConsoleReader.readString();

        System.out.println("Ingresar isbn del libro:");
        String isbn = ConsoleReader.readString();

        this.libroService.agregarLibro(autor, titulo, isbn);

        System.out.println("Libro guardado");
    }
}
