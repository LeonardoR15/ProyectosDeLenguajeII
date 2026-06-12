package ar.edu.itec1.repository;

import ar.edu.itec1.entity.Libro;

import java.util.ArrayList;
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
        this.libros.add(libro);
    }
    public void quitarLibro(Libro libro) {
        this.libros.remove(libro);
    }




    private void init() {
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


