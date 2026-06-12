package ar.edu.itec1.service;

import ar.edu.itec1.entity.Libro;
import ar.edu.itec1.repository.LibroRepository;

import java.util.List;

public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public void agregarLibro(String autor, String titulo, String isbn){
        // El service arma el objeto Libro y se lo pasa al repositorio.
        Libro libro = new Libro(autor, titulo, isbn);
        this.libroRepository.agregarLibro(libro);
    }

    public boolean eliminarLibro(String isbn) {
        return this.libroRepository.quitarLibroPorIsbn(isbn);
    }

    public List<Libro> getLibros() {
        return this.libroRepository.getLibros();
    }

    public List<Libro> buscarPorAutor(String autor) {
        return this.libroRepository.buscarPorAutor(autor);
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        return this.libroRepository.buscarPorTitulo(titulo);
    }

    public List<Libro> buscarPorIsbn(String isbn) {
        return this.libroRepository.buscarPorIsbn(isbn);
    }
}
