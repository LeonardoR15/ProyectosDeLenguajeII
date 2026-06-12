package ar.edu.itec1.repository;

import ar.edu.itec1.entity.Libro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibroRepository {
    List<Libro> libros;

    public LibroRepository() {
        this.libros = new ArrayList<>();

        init();
    }

    public List<Libro> getLibros() {
        return libros;
    }
    public void agregarLibro(Libro libro) {
        // Guarda el libro en la lista interna del repositorio.
        this.libros.add(libro);
    }
    public boolean quitarLibroPorIsbn(String isbn) {
        // Recorre la lista hasta encontrar el isbn y eliminarlo.
        Iterator<Libro> iterator = this.libros.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getIsbn().equals(isbn)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Libro> buscarPorAutor(String autor) {
        // Busca todos los libros que coinciden con el autor ingresado.
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        // Busca todos los libros que coinciden con el titulo ingresado.
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> buscarPorIsbn(String isbn) {
        // Busca el libro que coincide exactamente con el isbn.
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }




    private void init() {
        // Datos iniciales para probar el programa al arrancar.
        Libro libro1 = new Libro("Valentino G", "Campu Nueva", "1");
        Libro libro2 = new Libro("Lucas G", "panama", "2");
        Libro libro3 = new Libro("Axel A", "Lunes no trabajo", "3");
        Libro libro4 = new Libro("Enrique L", "La moto", "4");
        Libro libro5 = new Libro("Pablo G", "Caida del cabello", "5");

        this.libros.add(libro1);
        this.libros.add(libro2);
        this.libros.add(libro3);
        this.libros.add(libro4);
        this.libros.add(libro5);


    }

}
