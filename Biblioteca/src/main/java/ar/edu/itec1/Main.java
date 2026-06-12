package ar.edu.itec1;

import ar.edu.itec1.util.ConsoleReader;
import ar.edu.itec1.view.MenuView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*LibroRepository libroRepository = new LibroRepository();
        System.out.println("Listado de Libros");

        for (Libro libro : libroRepository.getLibros())
        {System.out.println("Titulo: " + libro.getTitulo() + " | Autor: " + libro.getAutor() + " | ISBN: " + libro.getIsbn());
        } // termina for
        System.out.println(libroRepository.getLibros().size());
        Libro nuevo = new Libro("Leonardo", "Subida del cabello", "6");
        libroRepository.agregarLibro(nuevo);
        System.out.println(libroRepository.getLibros().size());

        Libro libroARemover = libroRepository.getLibros().get(1);
        libroRepository.quitarLibro(libroARemover);
        System.out.println(libroRepository.getLibros().size());*/


        /*System.out.println("Ingresar Titulo del libro ");
        String titulo = ConsoleReader.readString();

        System.out.println("Ingresar autor del libro ");
        String autor = ConsoleReader.readString();

        System.out.println("Ingresar isbn del libro ");
        Integer isbn = ConsoleReader.readInteger();

        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(isbn);*/

        MenuView menu = new MenuView();
    }

}