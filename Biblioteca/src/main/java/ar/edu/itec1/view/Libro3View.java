package ar.edu.itec1.view;

import ar.edu.itec1.entity.Libro;
import ar.edu.itec1.service.LibroService;
import ar.edu.itec1.util.ConsoleReader;

import java.util.List;

public class Libro3View {
    private final LibroService libroService;

    public Libro3View(LibroService libroService) {
        this.libroService = libroService;
    }

    public void buscarLibro() {
        // El usuario elige el criterio de busqueda y luego ve los resultados.
        System.out.println("Buscar por:");
        System.out.println("1. Autor");
        System.out.println("2. Titulo");
        System.out.println("3. ISBN");

        Integer opcion = ConsoleReader.readInteger();
        String valorBusqueda;
        List<Libro> resultados;

        switch (opcion) {
            case 1:
                System.out.println("Ingresar autor:");
                valorBusqueda = ConsoleReader.readString();
                resultados = this.libroService.buscarPorAutor(valorBusqueda);
                mostrarResultados(resultados);
                break;
            case 2:
                System.out.println("Ingresar titulo:");
                valorBusqueda = ConsoleReader.readString();
                resultados = this.libroService.buscarPorTitulo(valorBusqueda);
                mostrarResultados(resultados);
                break;
            case 3:
                System.out.println("Ingresar isbn:");
                valorBusqueda = ConsoleReader.readString();
                resultados = this.libroService.buscarPorIsbn(valorBusqueda);
                mostrarResultados(resultados);
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }

    private void mostrarResultados(List<Libro> resultados) {
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron libros");
            return;
        }

        for (Libro libro : resultados) {
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("");
        }
    }
}
